package com.infinite.hibcollege;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {
	@Id
	@Column(name="FID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long fID;
	
	@Column(name="StudentName")
	private String studentName;
	
	@Column(name="instructor")
	private String instructor;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="fbValue")
	private String fbValue;

	public long getfID() {
		return fID;
	}

	public void setfID(long fID) {
		this.fID = fID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFbValue() {
		return fbValue;
	}

	public void setFbValue(String fbValue) {
		this.fbValue = fbValue;
	}

	
	
	
		

}
