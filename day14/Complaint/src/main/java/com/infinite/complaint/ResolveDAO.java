package com.infinite.complaint;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResolveDAO {
	Connection connection;
	PreparedStatement pst;

	public String resolveComplaint(Resolve resolve) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Resolve(ComplaintID,ComplaintDate,ResolveDate, "
				+ "ResolvedBy,Comments) values(?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, resolve.getComplaintId());
		pst.setDate(2, resolve.getComplaintDate());
		pst.setDate(3, resolve.getResolveDate());
		pst.setString(4, resolve.getResolvedBy());
		pst.setString(5, resolve.getComments());
		pst.executeUpdate();
		cmd = "update complaint set status='RESOLVED' where ComplaintID=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, resolve.getComplaintId());
		pst.executeUpdate();
		return "Complaint Resolved Successfully...";
	}

}
