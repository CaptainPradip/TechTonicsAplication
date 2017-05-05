package techtalk.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LoginServlet() {
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		try 
		{       

		     Loginbean login = new Loginbean();
		     login.setUserName(request.getParameter("username"));
		     login.setPassword(request.getParameter("password"));
		     User user=login.validateUser(getServletContext());
		    
             System.out.println("in the servlet");
		    // out.write("Name"+request.getParameter("username")+"<br/>");
      
		     if (user!=null)
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
		        	  
		   			try {
		   				TechTalklist= techtalk.fechtechtalk(getServletContext());
		   				request.setAttribute("result",TechTalklist);
		   	        	getServletContext().getRequestDispatcher("/user.jsp").forward(request, response);
		   			} catch (Exception e) {
		   				// TODO Auto-generated catch block
		   				e.printStackTrace();
		   			}
		         
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

