package infinite.JsfAgent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;





@ManagedBean
@SessionScoped

public class AgentDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	
	 public String updateAgent(Agent agentNew) 
				throws ClassNotFoundException, SQLException {
			
				String cmd = "update agent set name=?, city=?, gender=?,  maritalStatus =? ,premium=? where agentId=?";
				connection = ConnectionHelper.getConnection();
				pst = connection.prepareStatement(cmd);
				pst.setString(1, agentNew.getName());
				pst.setString(2, agentNew.getCity());
				pst.setString(3, agentNew.getGender());
				pst.setInt(4, agentNew.getMaritalStatus());
				pst.setDouble(5, agentNew.getPremium());
				pst.setInt(6, agentNew.getAgentId());
				
				pst.executeUpdate();
				
			//return "Record  Updated....";
				return "AgentRecord.xhtml?faces-redirect=true";
		} 
	
	 public String deleteAgent(int agentId)
				throws ClassNotFoundException, SQLException {
			
				connection = ConnectionHelper.getConnection();
				String cmd = "delete from Agent where agentId=?";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, agentId);
				pst.executeUpdate();
				return "Agent Record Not Found...";
	    }
	
	 public String addAgent(Agent agent)
	    		throws ClassNotFoundException, SQLException {
	    connection = ConnectionHelper.getConnection();
	    String cmd = "insert into Agent(Name,City,Gender, maritalStatus,premium)"+"values(?,?,?,?,?)";
	    pst = connection.prepareStatement(cmd);
	    pst.setString(1,agent.getName());
	    pst.setString(2,agent.getCity());
	    pst.setString(3,agent.getGender());
	    pst.setInt(4,agent.getMaritalStatus());
	    pst.setDouble(5,agent.getPremium());
	    pst.executeUpdate();
	   // return "Record Inserted";
	    return "AgentRecord.xhtml?faces-redirect=true";
	     }
	 
	 public String searchAgent(int agentId)
				throws ClassNotFoundException, SQLException {
	    	Map<String,Object> sessionMap=
	    			FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			connection = ConnectionHelper.getConnection();
			String cmd = "select * from Agent where agentId=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, agentId);
			ResultSet rs = pst.executeQuery();
			Agent agent= null;
			if(rs.next()) {
				agent = new Agent();
				agent.setAgentId(rs.getInt("agentId"));
				agent.setName(rs.getString("name"));
				agent.setCity(rs.getString("city"));
				agent.setGender(rs.getString("gender"));
				agent.setMaritalStatus(rs.getInt("maritalStatus"));
				agent.setPremium(rs.getDouble("premium"));
				sessionMap.put("editAgent", agent);
				
			}
			//return agent;
			return "/UpdateAgent.xhtml?faces-redirect=true";
	 }

	public List<Agent> showAgent() throws ClassNotFoundException, SQLException{
		
		List<Agent> agentList = new ArrayList<Agent>();
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Agent";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Agent agent = null;
		while(rs.next()){
			agent = new Agent();
			agent.setAgentId(rs.getInt("AgentId"));
			agent.setCity(rs.getString("City"));
			agent.setPremium(rs.getInt("Premium"));
			agent.setName(rs.getString("Name"));
		agent.setGender(rs.getString("GENDER"));
			agent.setMaritalStatus(rs.getInt("MaritalStatus"));
			agentList.add(agent);
		}
		return agentList;
	}
}
