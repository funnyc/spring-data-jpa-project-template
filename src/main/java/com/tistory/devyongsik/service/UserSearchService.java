package com.tistory.devyongsik.service;

import java.util.List;

import com.tistory.devyongsik.repository.entity.User;

public interface UserSearchService {

	public List<User> searchUser(String searchTerm);
}
