package com.tistory.devyongsik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tistory.devyongsik.repository.UserRepository;
import com.tistory.devyongsik.repository.entity.User;
import com.tistory.devyongsik.repository.specification.UserSpecifications;

@Service
public class RepositoryUserService implements UserSearchService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<User> searchUser(String searchTerm) {
		return userRepository.findAll(UserSpecifications.nameIsLike(searchTerm));
	}
}
