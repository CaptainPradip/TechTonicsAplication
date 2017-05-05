package techtalk.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import techtalk.models.Loginbean;
import techtalk.models.TechTalkbean;
import techtalk.pojo.TechTalk;
import techtalk.pojo.User;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SignupServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try 
		{       
			
             User user =new User(Integer.parseInt(request.getParameter("empid")),request.getParameter("name"),request.getParameter("password"),request.getParameter("email"),request.getParameter("role"));
		     Loginbean login = new Loginbean();
		  
		  boolean val= login.signup(getServletContext(),user);
		    
           
      
		     if (user!=null&&val)
		     {
		           
		          HttpSession session = request.getSession(true);       
		          session.setAttribute("currentSessionUser",user); 
		          List<TechTalk>TechTalklist = new LinkedList<>();
		         
	               TechTalkbean techtalk =new TechTalkbean();
	               TechTalklist= techtalk.fechtechtalk(getServletContext());
	               
	               session.setAttribute("techtalklist",TechTalklist);
		           if(user.getRole().equals("admin"))
		           { System.out.println("in the servletn admin");
		               
		        	  response.sendRedirect("admin.jsp");
		        	  
		          }
		          else
		          {
		        	  request.setAttribute("result", user);
		        	  getServletContext().getRequestDispatcher("/welcome.jsp").forward(request, response);
		         
		          System.out.println("in the servlet user");
		          }
		     }
		           
		     else 
		     {
		          response.sendRedirect("invalidLogin.jsp"); //error page ]
		     }
		} 
		      
		      
		catch (Throwable theException)        
		{
		     System.out.println(theException); 
		}
		      
	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
