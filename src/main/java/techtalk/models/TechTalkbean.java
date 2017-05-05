package techtalk.models;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;

import techtalk.dao.TechTalkDao;
import techtalk.pojo.TechTalk;
public class TechTalkbean {

	
	
	public List<TechTalk>fechtechtalk(ServletContext context) throws IOException, Exception {
		
		try(TechTalkDao techtalk =new TechTalkDao(context);) {
			
			return techtalk.fechtechtalk();	
		} 
		
	}

	public TechTalk fechtechtalkbyid(ServletContext context, int id) throws IOException, Exception {
		
         try(TechTalkDao techtalk =new TechTalkDao(context);) {
			
			return techtalk.fechtechtalkbyid(id);	
		} 
		
	}

	public int updateTechtalk(ServletContext context,TechTalk tech) throws IOException, Exception {
		
       try(TechTalkDao techtalk =new TechTalkDao(context);) {
			
			return  techtalk.updateTechtalk(tech);	
		} 
		
		
	}

	public int deletetechtalk(ServletContext context, int id) throws IOException, Exception {
		
         try(TechTalkDao techtalk =new TechTalkDao(context);) {
			
			return  techtalk.deletetechtalk(id);	
		}
	}

	public int  addTechtalk(ServletContext context, TechTalk tech) throws IOException, Exception {
     try(TechTalkDao techtalk =new TechTalkDao(context);) {
			
			return  techtalk.addTechtalk(tech);	
		} 
		
	}
	
	
}
