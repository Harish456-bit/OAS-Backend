package com.OAS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OAS.model.Result;
@Repository

public interface ResultRepository extends JpaRepository<Result, Long> {
	public String findByUserResult(String username, String domain,String visit);

}