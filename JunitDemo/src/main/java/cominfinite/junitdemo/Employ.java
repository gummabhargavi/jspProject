package cominfinite.junitdemo;

import java.util.Date;

public class Employ {
	
	private int empId;
	private String empname;
	private String empMail;
	private String empMobNo;
	private Date empDtJoin;
	private String  empDept;
	private int empManagerId;
	private int empAvailLeaveBal;
	
	
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public String getEmpMail() {
		return empMail;
	}


	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}


	public String getEmpMobNo() {
		return empMobNo;
	}


	public void setEmpMobNo(String empMobNo) {
		this.empMobNo = empMobNo;
	}


	public Date getEmpDtJoin() {
		return empDtJoin;
	}


	public void setEmpDtJoin(Date empDtJoin) {
		this.empDtJoin = empDtJoin;
	}


	public String getEmpDept() {
		return empDept;
	}


	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}


	public int getEmpManagerId() {
		return empManagerId;
	}


	public void setEmpManagerId(int empManagerId) {
		this.empManagerId = empManagerId;
	}


	public int getEmpAvailLeaveBal() {
		return empAvailLeaveBal;
	}


	public void setEmpAvailLeaveBal(int empAvailLeaveBal) {
		this.empAvailLeaveBal = empAvailLeaveBal;
	}


	public Employ(int empId, String empname, String empMail, String empMobNo, Date empDtJoin, String empDept,
			int empManagerId, int empAvailLeaveBal) {
		
		this.empId = empId;
		this.empname = empname;
		this.empMail = empMail;
		this.empMobNo = empMobNo;
		this.empDtJoin = empDtJoin;
		this.empDept = empDept;
		this.empManagerId = empManagerId;
		this.empAvailLeaveBal = empAvailLeaveBal;
	}
    

	public Employ() {
		
	}


	@Override
	public String toString() {
		return "Employ [empId=" + empId + ", empname=" + empname + ", empMail=" + empMail + ", empMobNo=" + empMobNo
				+ ", empDtJoin=" + empDtJoin + ", empDept=" + empDept + ", empManagerId=" + empManagerId
				+ ", empAvailLeaveBal=" + empAvailLeaveBal + "]";
	}

}
