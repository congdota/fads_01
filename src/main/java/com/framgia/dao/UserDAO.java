package com.framgia.dao;

import java.util.Optional;

import com.framgia.model.User;

public interface UserDAO extends BaseDAO<User, Integer> {

	User findByUsenameAndPassword(String username, String password);

	Optional<User> findByUsername(String username);
}
