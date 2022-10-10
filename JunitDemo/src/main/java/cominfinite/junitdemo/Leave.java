package cominfinite.junitdemo;

import java.util.Date;

public class Leave {
	private int leaveId;
	private int noOfDays;
	private String mgrCmt;
	private int empId;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private LeaveStatus leaveStatus;
	private LeaveType leaveType;
	private String leaveReason;
	
	
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getMgrCmt() {
		return mgrCmt;
	}
	public void setMgrCmt(String mgrCmt) {
		this.mgrCmt = mgrCmt;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public Date getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public LeaveType getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	@Override
	public String toString() {
		return "Leave [leaveId=" + leaveId + ", noOfDays=" + noOfDays + ", mgrCmt=" + mgrCmt + ", empId=" + empId
				+ ", leaveStartDate=" + leaveStartDate + ", leaveEndDate=" + leaveEndDate + ", leaveStatus="
				+ leaveStatus + ", leaveType=" + leaveType + ", leaveReason=" + leaveReason + "]";
	}
	public Leave(int leaveId, int noOfDays, String mgrCmt, int empId, Date leaveStartDate, Date leaveEndDate,
			LeaveStatus leaveStatus, LeaveType leaveType, String leaveReason) {
		
		this.leaveId = leaveId;
		this.noOfDays = noOfDays;
		this.mgrCmt = mgrCmt;
		this.empId = empId;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.leaveStatus = leaveStatus;
		this.leaveType = leaveType;
		this.leaveReason = leaveReason;
	}
	public Leave() {
		
	}
	
	

}
