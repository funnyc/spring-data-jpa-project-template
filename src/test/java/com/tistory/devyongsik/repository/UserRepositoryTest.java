package com.tistory.devyongsik.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tistory.devyongsik.repository.entity.User;
import com.tistory.devyongsik.repository.entity.UserManager;
import com.tistory.devyongsik.util.AbstractRepositoryTest;

public class UserRepositoryTest extends AbstractRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void save() {
		User user = new User();
		user.setName("need4spd4");
		
		UserManager userManager = new UserManager();
		userManager.setId(0L);
		
		user.setUserManager(userManager);
		
		User savedUser = userRepository.save(user);
		
		Assert.assertNotNull(savedUser);
	}
	
	@Test
	public void findAll() {

		List<User> users = (List<User>)userRepository.findAll();

		Assert.assertTrue(users.size() > 0);
	}
}
