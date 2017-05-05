package techtalk.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;


import techtalk.pojo.Registrations;
import techtalk.pojo.TechTalk;

public class RegistrationDao extends Dao {

	PreparedStatement insertStatement;
	PreparedStatement selectStatement;
	PreparedStatement updateStatement;
	PreparedStatement deleteStatement;
	PreparedStatement selectStatementbyid;

	//insert into registers(str1, str2) values (?, ?)
	{
		this.insertStatement = this.connection.prepareStatement("insert into registers(email,techid) values (?, ?)");
		this.selectStatement = this.connection.prepareStatement("select * from registers");
		this.selectStatementbyid = this.connection.prepareStatement("select * from registers where techid=?");
		//this.updateStatement=this.connection.prepareStatement("update techtalktable set venue=?,speaker=?,date=?,time=?,title=?,Description=? where techid=?;");
		this.deleteStatement = connection.prepareStatement("delete from techtalktable where techid=?;");
	}

	public RegistrationDao() throws Exception
	{
		super(); 
	}
	public RegistrationDao(ServletContext context) throws Exception
	{
		super(context);
	}
	public RegistrationDao(String driver, String url, String user, String password)throws Exception
	{
		super(driver, url, user, password);
	}
	
public List<Registrations> fechRegistrationbyid(int id) throws SQLException {
	List<Registrations> tt = new LinkedList<>();
	    Registrations registration =null;
		this.selectStatementbyid.setInt(1,id);
		ResultSet rs;
		try {
			rs = this.selectStatementbyid.executeQuery();
			System.out.println("reg dao");
			while( rs.next())
			{
				System.out.println("reg dao");
				registration = new Registrations(rs.getInt("regid"),rs.getString("email"),rs.getInt("techid"));
				tt.add(registration);
				
		   
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tt;
	}
public boolean Registrationbyid(int id, String email) throws SQLException {
	List<Registrations> rg= this.fechRegistrationbyid(id);
	for (Registrations registrations : rg) {
		if(registrations.getRegid()==id)
		{
			return false;
		}
		else
		{
			
		}
	}
	this.insertStatement.setString(1,email);
	this.insertStatement.setInt(2, id);
	return insertStatement.execute();
}
	

}
