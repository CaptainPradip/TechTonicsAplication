package techtalk.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;

import techtalk.pojo.User;

public class UserDao extends  Dao{

	PreparedStatement insertStatement;
	PreparedStatement selectStatement;
	PreparedStatement selectStatementall;
	
	{
		this.insertStatement = this.connection.prepareStatement("insert into usertable values(?,?,?,?,?)");
		this.selectStatement = this.connection.prepareStatement("select * from usertable where name=? and password=?");
		this.selectStatementall = this.connection.prepareStatement("select * from usertable ;");
	}

	public UserDao() throws Exception
	{
		super(); 
	}
	public UserDao(ServletContext context) throws Exception
	{
		super(context);
	}
	public UserDao(String driver, String url, String user, String password)throws Exception
	{
		super(driver, url, user, password);
	}
	
	
	public List<User> alluser() throws SQLException {
		User user = null;
		ResultSet rs= this.selectStatementall.executeQuery();
		List<User> userlist=  new LinkedList<>(); 
		while (rs.next()) {
			user = new User(rs.getInt("empid"), rs.getString("name"),rs.getString("email"),rs.getString("password") ,rs.getString("role"));
		      
			userlist.add(user);
		}
		
		return userlist;
		
	}
	public boolean registerNewUser( User user )throws SQLException
	{
		 List <User> user2=this.alluser();
			for (User user3 : user2) {
				
				if (user3.getEmail().equals(user.getEmail()) || user3.getEmpid()==user.getEmpid()) {
					System.out.println("dublicate ind");
					return false;	
				}
				
			}
		this.insertStatement.setInt(1,user.getEmpid());
		this.insertStatement.setString(2, user.getName());
		this.insertStatement.setString(3, user.getEmail());
		this.insertStatement.setString(4,user.getPassword());
		this.insertStatement.setString(5, user.getRole());
		this.insertStatement.executeUpdate();
		return true;
	}
	public User validateUser( String name, String password )throws SQLException
	{  
		this.selectStatement.setString(1, name);
		this.selectStatement.setString(2, password);
		ResultSet rs = this.selectStatement.executeQuery();
		User user = null;
		if( rs.next())
		{
			user = new User(rs.getInt("empid"), rs.getString("name"),password,rs.getString("email") ,rs.getString("role"));
	        user.toString();
		}
		return user;	
		
	}
	

	

	
}
