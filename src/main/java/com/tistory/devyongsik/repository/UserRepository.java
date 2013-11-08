package com.tistory.devyongsik.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tistory.devyongsik.repository.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Page<User> findByUserManagerId(Long userManagerId, Pageable pageable);
	
	List<User> findByUserManagerId(Long userManagerId, Sort sort);
}