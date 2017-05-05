package techtalk.models;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import techtalk.dao.RegistrationDao;
import techtalk.dao.TechTalkDao;
import techtalk.pojo.Registrations;

public class Registrationbean {

	public List<Registrations> fechRegistrationbyid(ServletContext context, int id) throws IOException, Exception {
		
		
      try(RegistrationDao regdao =new RegistrationDao(context)) {
			
    	  System.out.println("reg bean");
			return regdao.fechRegistrationbyid(id);	
		} 
		
	}

	public boolean Registrationbyid(ServletContext context, int id,String email) throws IOException, Exception {
		
		try(RegistrationDao regdao =new RegistrationDao(context)) {
			
	    	  System.out.println("reg bean");
				return  regdao.Registrationbyid(id,email);	
			} 
			
	}

	
	
	
}
