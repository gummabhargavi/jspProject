package com.infinite.libraryprojecthib;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TranBook")
public class TranBook {

@Id
@Column(name="tid")
private int tid;

@Column(name="userName")
private String userName;

@Column(name="bookId")
private int bookId;

@Column(name="fromDate")
private Date fromDate;

public Date getFromDate() {
return fromDate;
}

public void setFromDate(Date fromDate) {
this.fromDate = fromDate;
}

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


}