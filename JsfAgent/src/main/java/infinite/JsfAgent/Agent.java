package infinite.JsfAgent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Agent {

	private int agentId;
	private String name;
	private String city;
	private String gender;
	private int maritalStatus;
	private double premium;
	
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", name=" + name + ", city=" + city + ", gender=" + gender
				+ ", maritalStatus=" + maritalStatus + ", premium=" + premium + "]";
	}
	public Agent(int agentId, String name, String city, String gender, int maritalStatus, double premium) {
		
		this.agentId = agentId;
		this.name = name;
		this.city = city;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.premium = premium;
	}
	public Agent() {
		
	}
	
	
	
	
}
