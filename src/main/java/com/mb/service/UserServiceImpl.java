package com.mb.service;

import java.util.List;
import java.util.Objects;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.dao.UserDao;
import com.mb.dto.UserDto;
import com.mb.entity.User;
import com.mb.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(UserDto userDto)
	{
		User user = modelMapper.map(userDto, User.class);
		return userDao.saveUser(user);
	}

	@Override
	public List<User> getUser()
	{

		return userDao.getUser();

	}

	@Override
	public User updateUser(long id, UserDto userDto) {
		User oldUser = userRepository.findById((int) id).get();

		if (Objects.nonNull(userDto.getEmail())
				&& !"".equalsIgnoreCase(
						userDto.getEmail()))
		{
			oldUser.setEmail(
					userDto.getEmail());
		}

		if (Objects.nonNull(userDto.getFirstName())
				&& !"".equals(userDto.getFirstName()))
		{
			oldUser.setFirstName(
					userDto.getFirstName());
		}
		
		if (Objects.nonNull(userDto.getLastName())
				&& !"".equals(userDto.getLastName()))
		{
			oldUser.setLastName(
					userDto.getLastName());
		}
		
		if (Objects.nonNull(userDto.getPassword())
				&& !"".equals(userDto.getPassword()))
		{
			oldUser.setPassword(
					userDto.getPassword());
		}

		return userRepository.save(oldUser);
	}

}
