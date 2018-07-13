package com.framgia.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.CollectionUtils;

import com.framgia.dao.UserDAO;
import com.framgia.model.CustomUser;
import com.framgia.model.User;

public class UserDetailServiceImpl implements UserDetailsService {

	private UserDAO userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optional = userDao.findByUsername(username);
		User user = optional.orElseThrow(
				() -> new UsernameNotFoundException("Không tìm thấy tài khoản " + username + " trong cơ sở dữ liệu"));

		Set<String> roles = getRoles(user);
		List<GrantedAuthority> grantList = grantAuth(roles);

		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;

		UserDetails userDetails = new CustomUser(user.getUsername(), user.getPassword(), enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, grantList, user.getFullname(), user.getId());
		return userDetails;
	}

	private Set<String> getRoles(User user) {
		if (CollectionUtils.isEmpty(user.getUserRoles()))
			return Collections.emptySet();

		Set<String> roles = new HashSet<String>();
		user.getUserRoles().stream().forEach(ur -> {
			roles.add(ur.getRole().getName());
		});

		return roles;
	}

	private List<GrantedAuthority> grantAuth(Set<String> roles) {
		if (CollectionUtils.isEmpty(roles))
			return Collections.emptyList();

		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
		roles.stream().forEach(r -> {
			GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + r);
			grantList.add(authority);
		});
		return grantList;
	}
}
