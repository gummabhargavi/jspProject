package com.infinite.hibagent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Agent")
public class Agent {
    
	@Id
	@Column(name="AgentId")
	private int AgentId;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="City")
	private String City;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender")
	private Gender gender;
	
	@Column(name="MaritalStatus")
	private int MaritalStatus;
	
	@Column(name="premium")
	private double premium;
	
	public int getAgentId() {
		return AgentId;
	}
	public void setAgentId(int agentId) {
		AgentId = agentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	@Override
	public String toString() {
		return "Agent [AgentId=" + AgentId + ", Name=" + Name + ", City=" + City + ", gender=" + gender
				+ ", MaritalStatus=" + MaritalStatus + ", premium=" + premium + "]";
	}
	
	
}
