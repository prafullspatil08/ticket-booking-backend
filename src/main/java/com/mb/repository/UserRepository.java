package com.mb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mb.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	User findUserById(long id);
}
