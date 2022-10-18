package com.infinite.complaint;

import java.sql.Date;

public class Resolve {
	private String complaintId;
	private Date complaintDate;
	private Date resolveDate;
	private String resolvedBy;
	private String comments;
	
	
	public String getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}
	public Date getComplaintDate() {
		return complaintDate;
	}
	public void setComplaintDate(Date complaintDate) {
		this.complaintDate = complaintDate;
	}
	public Date getResolveDate() {
		return resolveDate;
	}
	public void setResolveDate(Date resolveDate) {
		this.resolveDate = resolveDate;
	}
	public String getResolvedBy() {
		return resolvedBy;
	}
	public void setResolvedBy(String resolvedBy) {
		this.resolvedBy = resolvedBy;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Resolve [complaintId=" + complaintId + ", complaintDate=" + complaintDate + ", resolveDate="
				+ resolveDate + ", resolvedBy=" + resolvedBy + ", comments=" + comments + "]";
	}
	public Resolve(String complaintId, Date complaintDate, Date resolveDate, String resolvedBy, String comments) {
		this.complaintId = complaintId;
		this.complaintDate = complaintDate;
		this.resolveDate = resolveDate;
		this.resolvedBy = resolvedBy;
		this.comments = comments;
	}
	public Resolve() {
		
	}
	
	
	

}
