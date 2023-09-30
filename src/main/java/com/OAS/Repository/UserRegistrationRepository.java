package com.OAS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OAS.model.UserRegistration;
@Repository

public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Integer> {
	 public List<UserRegistration > findByusername(String username , String password);	
}
