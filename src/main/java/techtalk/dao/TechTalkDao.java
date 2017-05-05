package techtalk.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;

import techtalk.pojo.TechTalk;
import techtalk.pojo.User;

public class TechTalkDao extends Dao {

	PreparedStatement insertStatement;
	PreparedStatement selectStatement;
	PreparedStatement updateStatement;
	PreparedStatement deleteStatement;
	PreparedStatement selectStatementbyid;

	
	{
		this.insertStatement = this.connection.prepareStatement("insert into techtalktable values(?,?,?,?,?,?,?)");
		this.selectStatement = this.connection.prepareStatement("select * from techtalktable");
		this.selectStatementbyid = this.connection.prepareStatement("select * from techtalktable where techid=?;");
		this.updateStatement=this.connection.prepareStatement("update techtalktable set venue=?,speaker=?,date=?,time=?,title=?,Description=? where techid=?;");
		this.deleteStatement = connection.prepareStatement("delete from techtalktable where techid=?;");
	}

	public TechTalkDao() throws Exception
	{
		super(); 
	}
	public TechTalkDao(ServletContext context) throws Exception
	{
		super(context);
	}
	public TechTalkDao(String driver, String url, String user, String password)throws Exception
	{
		super(driver, url, user, password);
	}
	
	public int updateTechtalk( TechTalk techtalk ) throws SQLException
	{ 
		
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 String stringDate = sdf.format(techtalk.getDate());
		
		this.updateStatement.setString(1,techtalk.getVenue());
		this.updateStatement.setString(2, techtalk.getSpeaker());
		this.updateStatement.setDate(3,java.sql.Date.valueOf(stringDate));//VIP
		this.updateStatement.setTime(4, techtalk.getTime());
		this.updateStatement.setString(5, techtalk.getTitle());
		this.updateStatement.setString(6, techtalk.getDescription());
		this.updateStatement.setInt(7, techtalk.getTechid());
	
		return this.updateStatement.executeUpdate();
	}
	public int deletetechtalk(int id) throws SQLException
	{
		this.deleteStatement.setInt(1, id );
		return this.deleteStatement.executeUpdate();
	}

	public List<TechTalk> fechtechtalk() {
		List<TechTalk> tt = new LinkedList<>();
		
		ResultSet rs;
		try {
			rs = this.selectStatement.executeQuery();
			while( rs.next())
			{

				TechTalk techtalk = new TechTalk(rs.getInt("techid"),rs.getString("venue"),rs.getString("speaker"),rs.getDate("date"), rs.getTime("time"), rs.getString("title"), rs.getString("Description"));
			System.out.println(techtalk.getSpeaker());
		    tt.add(techtalk);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tt;	
		
	}
	public TechTalk fechtechtalkbyid(int id) throws SQLException {
		
		TechTalk techtalk =null;
		this.selectStatementbyid.setInt(1,id);
		ResultSet rs;
		try {
			rs = this.selectStatementbyid.executeQuery();
			if( rs.next())
			{

				 techtalk = new TechTalk(rs.getInt("techid"),rs.getString("venue"),rs.getString("speaker"),rs.getDate("date"), rs.getTime("time"), rs.getString("title"), rs.getString("Description"));
			System.out.println(techtalk.getSpeaker());
		   
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return techtalk;
	}
	
	public int addTechtalk( TechTalk techtalk) throws SQLException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String stringDate = sdf.format(techtalk.getDate());
		this.insertStatement.setInt(1, techtalk.getTechid());
		this.insertStatement.setString(2,techtalk.getVenue());
		this.insertStatement.setString(3, techtalk.getSpeaker());
		this.insertStatement.setDate(4,java.sql.Date.valueOf(stringDate));
		this.insertStatement.setTime(5, techtalk.getTime());
		this.insertStatement.setString(6, techtalk.getTitle());
		this.insertStatement.setString(7, techtalk.getDescription());
		
		return this.insertStatement.executeUpdate();
	}

	
	


	
	
}
