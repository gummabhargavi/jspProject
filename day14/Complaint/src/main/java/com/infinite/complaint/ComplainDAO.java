package com.infinite.complaint;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComplainDAO {
	
	Connection connection;
	PreparedStatement pst;

	public int tat(Date cdate) {

		java.util.Date today = new java.util.Date();

		java.sql.Date td = new java.sql.Date(today.getTime());
		long ms = td.getTime() - cdate.getTime();
	    long m = ms / (1000 * 24 * 60 * 60);
	    int days = (int) m;
	    days = days + 1;
		return days;
	}

	public String addComplaint(Complaint complaint) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		complaint.setStatus("PENDING");
		String cmd = "Insert into Complaint(ComplaintID, ComplaintType, CDescription, "
				+ "ComplaintDate,Severity,Status) values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, complaint.getComplaintId());
		pst.setString(2, complaint.getComplaintType());
		pst.setString(3, complaint.getcDescription());
		pst.setDate(4, complaint.getComplaintDate());
		pst.setString(5, complaint.getSeverity());
		pst.setString(6, complaint.getStatus());
		pst.executeUpdate();
		return "Complaint Raised...";
	}
	public String generateComplaintId() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select case when max(ComplaintID) is NULL THEN 'C001' else max(complaintId) end  cid from Complaint";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		String rid = rs.getString("cid");
		int id = Integer.parseInt(rid.substring(1));
		id++;
		String cid="";
		if (id >=1 && id <=9) {
			cid="C00"+id;
		}
		if (id >=10 && id <= 99) {
			cid="C0"+id;
		}
		if (id >=100 && id<=999) {
			cid="C"+id;
		}
		return cid;
	}
	public Complaint searchComplaint(String cid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Complaint where ComplaintID=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, cid);
		ResultSet rs = pst.executeQuery();
		Complaint complaint = null;
		while(rs.next()) {
			complaint = new Complaint();
			complaint.setComplaintId(rs.getString("ComplaintID"));
			complaint.setComplaintType(rs.getString("ComplaintType"));
			complaint.setcDescription(rs.getString("CDescription"));
			complaint.setSeverity(rs.getString("Severity"));
			complaint.setComplaintDate(rs.getDate("ComplaintDate"));
			complaint.setStatus(rs.getString("status"));
		}
		return complaint;
	}
	public Complaint[] showComplaint() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Complaint";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Complaint complaint = null;
		List<Complaint> complaintList = new ArrayList<Complaint>();
		while(rs.next()) {
			complaint = new Complaint();
			complaint.setComplaintId(rs.getString("ComplaintID"));
			complaint.setComplaintType(rs.getString("ComplaintType"));
			complaint.setcDescription(rs.getString("CDescription"));
			complaint.setSeverity(rs.getString("Severity"));
			complaint.setComplaintDate(rs.getDate("ComplaintDate"));
			complaint.setStatus(rs.getString("status"));
			complaintList.add(complaint);
		}
		return complaintList.toArray(new Complaint[complaintList.size()]);
	}

}
