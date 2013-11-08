package com.tistory.devyongsik.service;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.data.jpa.domain.Specification;

import com.google.common.collect.Lists;
import com.tistory.devyongsik.repository.UserRepository;
import com.tistory.devyongsik.repository.entity.User;

@RunWith(MockitoJUnitRunner.class)
public class RepositoryUserServiceTest {

	private static final String SEARCH_TERM = "need4spd";
	
	@InjectMocks
	private RepositoryUserService repositoryUserService;
	
	@Mock
	private UserRepository userRepositoryMock;
	
	@SuppressWarnings("unchecked")
	@Test
	public void searchUser() {
		List<User> expected = Lists.newArrayList();
		when(userRepositoryMock.findAll(any(Specification.class))).thenReturn(expected);
		
		List<User> actual = repositoryUserService.searchUser(SEARCH_TERM);
		
		verify(userRepositoryMock, times(1)).findAll(any(Specification.class));
		verifyNoMoreInteractions(userRepositoryMock);
		
		Assert.assertEquals(expected, actual);
	}
}
