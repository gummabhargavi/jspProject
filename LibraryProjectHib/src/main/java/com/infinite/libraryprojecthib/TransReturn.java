package com.infinite.libraryprojecthib;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TransReturn")
public class TransReturn {

@Id
@Column(name="userName")
private String userName;

@Column(name="BookId")
private int bookId;

@Column(name="Fromdate")
private Date fromDate;

@Column(name="Todate")
private Date toDate;

@Column(name="tid")
private int tid;



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
public Date getFromDate() {
return fromDate;
}
public void setFromDate(Date fromDate) {
this.fromDate = fromDate;
}
public Date getToDate() {
return toDate;
}
public void setToDate(Date toDate) {
this.toDate = toDate;
}
public int getTid() {
return tid;
}
public void setTid(int tid) {
this.tid = tid;
}


}
