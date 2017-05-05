package techtalk.controller;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import techtalk.models.Registrationbean;
import techtalk.models.TechTalkbean;
import techtalk.pojo.Registrations;
import techtalk.pojo.TechTalk;
import techtalk.pojo.User;


@WebServlet("/action")
public class AdminActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AdminActionServlet() {
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action =request.getParameter("action");
		
		 TechTalkbean techtalkbean =new TechTalkbean();
		
		 HttpSession session = request.getSession(true);
		switch (action) {
		case "update":
			int id1 =Integer.parseInt(request.getParameter("id"));
		       try {
            	TechTalk techtalk=	techtalkbean .fechtechtalkbyid(getServletContext(),id1);
				 System.out.println(techtalk.getDescription());
				 session.setAttribute("updateTechtalk",techtalk); 
				
				   response.sendRedirect("update.jsp");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case "delete":
			int id2 =Integer.parseInt(request.getParameter("id"));
			try {
				techtalkbean .deletetechtalk(getServletContext(),id2);
				List<TechTalk>TechTalklist = new LinkedList<>();
		         
	               TechTalkbean techtalk1 =new TechTalkbean();
	               TechTalklist= techtalk1.fechtechtalk(getServletContext());
	               session.setAttribute("techtalklist",TechTalklist);
	               response.sendRedirect("admin.jsp");
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			break;
		case "registers" :
			 try {
				 Registrationbean  registrationbean =new Registrationbean();
	            	List<Registrations> rg=	registrationbean.fechRegistrationbyid(getServletContext(),Integer.parseInt(request.getParameter("id")));
					System.out.println("inside regist");
					 session.setAttribute("registration",rg); 
					
					   response.sendRedirect("registers.jsp");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			  
			
       case "save" :
    	 
    	
         try {
        	       int id3 =Integer.parseInt(request.getParameter("id"));
                 
        	       DateFormat sdf = new SimpleDateFormat("hh:mm");
        	       System.out.println(request.getParameter("time"));
        	       Date date = sdf.parse(request.getParameter("time"));
        	       
        	       System.out.println("Time: " + sdf.format(date));
        	       
        	      System.out.println("inside save");
        	     TechTalk tech =new TechTalk(id3,request.getParameter("venue"), request.getParameter("speaker"), new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date")),new Time(date.getTime()), request.getParameter("title"), request.getParameter("Description"));
         	      techtalkbean .updateTechtalk(getServletContext(),tech);
				
         	        List<TechTalk>TechTalklist = new LinkedList<>();
		         
	               TechTalkbean techtalk1 =new TechTalkbean();
	               TechTalklist= techtalk1.fechtechtalk(getServletContext());
	               session.setAttribute("techtalklist",TechTalklist);
				    response.sendRedirect("admin.jsp");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
       case "addtechtalk" :
    	   response.sendRedirect("addtechtalk.jsp");
    	   break;
       case "add" :    
           try {
          	       
        	   
                     DateFormat sdf1 = new SimpleDateFormat("hh:mm");
          	         Date date1 = sdf1.parse(request.getParameter("time"));
          	      
          	      System.out.println("inside save");
          	     TechTalk tech =new TechTalk(Integer.parseInt(request.getParameter("id")),request.getParameter("venue"), request.getParameter("speaker"), new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date")),new Time(date1.getTime()), request.getParameter("title"), request.getParameter("Description"));
           	      techtalkbean .addTechtalk(getServletContext(),tech);
  				
           	        List<TechTalk>TechTalklist = new LinkedList<>();
  		            TechTalkbean techtalk1 =new TechTalkbean();
  	               TechTalklist= techtalk1.fechtechtalk(getServletContext());
  	              
  	                session.setAttribute("techtalklist",TechTalklist);
  				    response.sendRedirect("admin.jsp");
  				
  			} catch (Exception e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
  			
  			break;
  			
       case "techtalk":
    	   List<TechTalk>TechTalklist = new LinkedList<>();
	         
           TechTalkbean techtalk =new TechTalkbean();
			try {
				TechTalklist= techtalk.fechtechtalk(getServletContext());
				request.setAttribute("result",TechTalklist);
	        	getServletContext().getRequestDispatcher("/techtalks.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
       case "register":
    	     
    	      User user =(User)session.getAttribute("currentSessionUser");
    	      if(user!=null)
    	      {
    	    	 
	            try {
	            	 Registrationbean  registrationbean =new Registrationbean();
					boolean num= registrationbean.Registrationbyid(getServletContext(),Integer.parseInt(request.getParameter("id")),user.getEmail());
					System.out.println(num);
					if(num)
						{
						response.sendRedirect("registredthanks.jsp");
						}
					else
					{
						response.sendRedirect("registredallready.jsp");
					}
	            } catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
    	      }
    	      else
    	      {
    	    	  response.sendRedirect("index.jsp");
    	      }
    	      break;
       case "logout":
  	     
 	            session.removeAttribute("currentSessionUser");
 	      
 	    	    response.sendRedirect("index.jsp");
 	    	  break;
       case "requesttechtalk":
    	     
  	    response.sendRedirect("requesttechtalk.jsp");
  	    	  break; 
       case "Requesttotechtalk":
    	  
    	   break;
       case "login":
    	        TechTalkbean techtalk1 =new TechTalkbean();
    	      
    	     
    	        	
			try {
				 List<TechTalk>TechTalklist1 = new LinkedList<>();
				TechTalklist1= techtalk1.fechtechtalk(getServletContext());
				request.setAttribute("result",TechTalklist1);
	        	getServletContext().getRequestDispatcher("/user.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
    	  break;
       case "adminlogin":
    	  List<TechTalk>TechTalklist1 = new LinkedList<>();
	         
          TechTalkbean techtalk2 =new TechTalkbean();
			try {
				System.out.println("adminlogin servlet");
				TechTalklist1= techtalk2.fechtechtalk(getServletContext());
				session.setAttribute("techtalklist",TechTalklist1);
		          
		         
	        	  response.sendRedirect("admin.jsp");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           
           
        break;
    	   
		default:
			
			break;
		}
}
		
		
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
