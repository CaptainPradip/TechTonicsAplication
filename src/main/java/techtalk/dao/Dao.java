package techtalk.dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;

public abstract class Dao implements Closeable
{
	public Dao()throws Exception
	{
		this("","","","");
	}
	public Dao(ServletContext context )throws Exception
	{
		this(context.getInitParameter("DRIVER"),context.getInitParameter("URL"),context.getInitParameter("USER"),context.getInitParameter("PASSWORD"));	
	}
	protected Connection connection;
	public Dao( String driver, String url, String user, String password )throws Exception
	{
		Class.forName(driver);
		this.connection = DriverManager.getConnection(url,user,password);
	}
	
	public void close() throws IOException
	{
		try
		{
			if( this.connection != null )
				this.connection.close();
		}
		catch (SQLException e)
		{
			throw new IOException(e);
		}
	}
}

