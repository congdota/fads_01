package com.framgia.action;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class ManagerUser extends BaseAction {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

	@Override
	public String execute() {

		// Principal principal = ServletActionContext.getRequest().getUserPrincipal();
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		@SuppressWarnings("unchecked")
		Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>) userDetails
				.getAuthorities();
		for (Iterator<SimpleGrantedAuthority> it = authorities.iterator(); it.hasNext();) {
			SimpleGrantedAuthority authority = (SimpleGrantedAuthority) it.next();
			System.out.println("Role: " + authority.getAuthority());
		}

		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
