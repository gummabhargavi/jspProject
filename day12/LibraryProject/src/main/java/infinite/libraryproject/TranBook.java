package infinite.libraryproject;

import java.sql.Date;

public class TranBook {
	
	private String userName;
	private int bookId;
	private Date FromDate;
	
	
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
		return FromDate;
	}
	public void setFromDate(Date fromDate) {
		FromDate = fromDate;
	}
	@Override
	public String toString() {
		return "TranBook [userName=" + userName + ", bookId=" + bookId + ", FromDate=" + FromDate + "]";
	}
	public TranBook(String userName, int bookId, Date fromDate) {
		
		this.userName = userName;
		this.bookId = bookId;
		FromDate = fromDate;
	}
	public TranBook() {
		
	}
	

}
