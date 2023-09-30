package com.OAS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.OAS.Repository.QuestionRepository;
import com.OAS.Repository.ResultRepository;
import com.OAS.model.Question;
import com.OAS.model.Result;
@RestController
public class QuestionController {
	
	@Autowired
	QuestionRepository  questionRepository ;
	
	@Autowired
	ResultRepository  resultRepository;
	
	@PostMapping  (value = "/question")  
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Question> saveQuestion(@RequestBody List<Question> details) {
		return questionRepository.saveAll(details);

}
	@GetMapping (value = "/marks")
	@CrossOrigin(origins = "http://localhost:4200")
	public String Marks(@RequestParam String username, @RequestParam String domain,@RequestParam String visit ) {
		
		String mark = resultRepository.findByUserResult(username, domain,visit);
		return mark;
	}
	
	@PostMapping  (value ="/result")
	@CrossOrigin  (origins ="http://localhost:4200")
	public List<Result>  saveresult(@RequestBody List<Result> details){
		 for (Result entry : details) {
			Question Question = questionRepository.findByQuestionAndUserResult(entry.getQuestion(), entry.getDomain());
			entry.setMarks("0");
			if (entry.getResult().equals(Question.getResult())) {
				entry.setMarks("1");
			}

	      }

		 return resultRepository.saveAll(details);

	}
	@GetMapping  (value = "/domain")
	@CrossOrigin(origins = "http://localhost:4200")
    public List<Question> domain(@RequestParam String domain) {
		return questionRepository.findByQuestionAndDomain(domain);
     }
}