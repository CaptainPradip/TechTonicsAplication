package techtalk.models;

import java.io.IOException;

import javax.servlet.ServletContext;

import techtalk.dao.UserDao;
import techtalk.pojo.User;

public class Loginbean {

	private String userName;
	private String password;
	
	public Loginbean()
	{
		this.userName =  "";
		this.password =  "";
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public User validateUser( ServletContext context ) throws IOException, Exception
	{
		try( UserDao dao = new UserDao(context))
		{
			System.out.println("loginbean");
			User user = dao.validateUser(userName, password);
			if( user != null )
				return user;
		}
		return null;
		
	}
	public boolean signup(ServletContext context,User user ) throws IOException, Exception {
		
		try( UserDao dao = new UserDao(context))
		{
			System.out.println("signbean");
		
			return dao.registerNewUser(user);
		}
	
		
		
	}

}
