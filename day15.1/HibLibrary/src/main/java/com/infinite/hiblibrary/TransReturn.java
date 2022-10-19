package com.infinite.hiblibrary;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TransReturn")
public class TransReturn {
	
	@Id
	@Column(name="tid")
	private int tid;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="bookId")
	private int bookId;
	
	@Column(name="toDate")
	private Date toDate;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "TransReturn [tid=" + tid + ", userName=" + userName + ", bookId=" + bookId + ", toDate=" + toDate + "]";
	}
	
	

}
