package cominfinite.junitdemo;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class LeaveTest {

	@Test
	public void testConstructor() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Leave leave=new Leave();
		Leave leaveNew=new Leave(1, 1, "Enjoy", 1000, sdf.parse("2022-10-10"), sdf.parse("2022-10-11"),
				LeaveStatus.APPROVED, LeaveType.EL, "cold");
		assertNotNull(leave);
		assertEquals(1, leaveNew.getLeaveId());
		assertEquals(1, leaveNew.getNoOfDays());
		assertEquals("Enjoy", leaveNew.getMgrCmt());
		assertEquals(1000, leaveNew.getEmpId());
		assertEquals(sdf.parse("2022-10-10"), leaveNew.getLeaveStartDate());
		assertEquals(sdf.parse("2022-10-11"), leaveNew.getLeaveEndDate());
		assertEquals(LeaveStatus.APPROVED, leaveNew.getLeaveStatus());
		assertEquals(LeaveType.EL, leaveNew.getLeaveType());
		assertEquals("cold", leaveNew.getLeaveReason());

	}
	@Test
	public void testToString() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Leave leave1 = new Leave(1, 1, "Enjoy", 1000,sdf.parse("2022-10-10"), sdf.parse("2022-10-11"),
				LeaveStatus.APPROVED, LeaveType.EL, "cold");
		
		String result ="Leave [leaveId=" + 1 + ", noOfDays=" + 1 + ", mgrCmt=" + "Enjoy" + ", empId=" + 1000
				+ ", leaveStartDate=" + sdf.parse("2022-10-10") + ", leaveEndDate=" + sdf.parse("2022-10-11") + ", leaveStatus="
				+ LeaveStatus.APPROVED + ", leaveType=" + LeaveType.EL + ", leaveReason=" + "cold" + "]";
		assertEquals(result, leave1.toString());
	}
	@Test
	public void testGetterAndSetter() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Leave leave2=new Leave();
		leave2.setLeaveId(1);
		leave2.setNoOfDays(1);
		leave2.setEmpId(1000);
		leave2.setMgrCmt("Enjoy");
		leave2.setLeaveStartDate(sdf.parse("2022-10-10"));
		leave2.setLeaveEndDate(sdf.parse("2022-10-11"));
		leave2.setLeaveStatus(LeaveStatus.APPROVED);
		leave2.setLeaveType(LeaveType.EL);
		leave2.setLeaveReason("cold");
		
		assertEquals(1, leave2.getLeaveId());
		assertEquals(1, leave2.getNoOfDays());
		assertEquals("Enjoy", leave2.getMgrCmt());
		assertEquals(1000, leave2.getEmpId());
		assertEquals(sdf.parse("2022-10-10"), leave2.getLeaveStartDate());
		assertEquals(sdf.parse("2022-10-11"), leave2.getLeaveEndDate());
		assertEquals(LeaveStatus.APPROVED, leave2.getLeaveStatus());
		assertEquals(LeaveType.EL, leave2.getLeaveType());
		assertEquals("cold", leave2.getLeaveReason());
		
	}

}
