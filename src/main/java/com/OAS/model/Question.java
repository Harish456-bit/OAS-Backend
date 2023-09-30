package com.OAS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name = "question")
//@NamedQuery( name = "Question.findByQuestionAndResult",
//query = "SELECT e FROM Question e WHERE e.question =  ?1 AND e.result  = ?2")


@NamedQueries({
    @NamedQuery(name="Question.findByQuestionAndResult", query="SELECT e FROM Question e WHERE e.question =  ?1 AND e.result  = ?2"),
    @NamedQuery(name="Question.findByQuestionAndDomain", query="SELECT e FROM Question e WHERE e.domain = ?1"),
    @NamedQuery(name="Question.findByQuestionAndUserResult",query="SELECT e FROM Question e WHERE e.question = ?1 AND e.domain =?2"),

   })  

public class Question{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "question")
	private String question;
	@Column(name = "result")
	private String result;
	@Column(name = "option1")
	private String option1;
	@Column(name = "option2")
	private String option2;
	@Column(name = "option3")
	private String option3;
	@Column(name = "option4")
	private String option4;
	@Column(name = "domain")
	private String domain;
	
	
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int Integer, Integer id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}

	

}
