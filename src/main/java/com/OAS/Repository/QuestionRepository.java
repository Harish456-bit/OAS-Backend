package com.OAS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OAS.model.Question;
@Repository

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	public List<Question > findByQuestionAndResult (String question , String result);
	public List<Question > findByQuestionAndDomain (String domain);
	public Question findByQuestionAndUserResult(String question, String domain);
}