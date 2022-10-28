package com.infinite.hibleave;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name="leave_history")
public class Leave {
	
	@Id
	@Column(name="Leave_ID")
	private int leaveId;
	
	@Column(name="LEAVE_NO_OF_DAYS")
	private int noOfDays;
	
	@Column(name="LEAVE_MNGR_COMMENTS")
	private String mgrCmt;
	
	@Column(name="EMP_ID")
	private int empId;
	
	@Column(name="LEAVE_START_DATE")
	private Date leaveStartDate;
	
	@Column(name="LEAVE_END_DATE")
	private Date leaveEndDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name="LEAVE_STATUS")
	private LeaveStatus leaveStatus;
	
	@Enumerated(EnumType.STRING)
    @Column(name="LEAVE_TYPE")
	private LeaveType leaveType;
	
	@Column(name="LEAVE_REASON")
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

	
	
}
