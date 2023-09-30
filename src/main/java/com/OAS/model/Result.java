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
@Table(name = "Result")
@NamedQueries({
    @NamedQuery(name="Result.findByUserResult",query="SELECT sum(e.marks) FROM Result e WHERE e.username = ?1 AND e.domain =?2 AND e.visit=?3"),
})  
public class Result {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)

	private int id;
	@Column(name = "username")
	private String username;
	@Column(name = "result")
	private String result;
	@Column(name = "question")
	private String question;
	@Column(name = "marks")
	private String marks;
	@Column(name = "domain")
	private String domain;
	@Column(name = "visit")
	private String visit;
	
	public String getVisit() {
		return visit;
	}

	public void setVisit(String visit) {
		this.visit = visit;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getUsername() {
		return username;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
