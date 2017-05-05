<%@page import="techtalk.pojo.Registrations"%>
<%@page import="techtalk.pojo.User"%>
<%@page import="org.apache.taglibs.standard.tag.el.core.ForEachTag"%>
<%@page import="techtalk.pojo.TechTalk"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, maximum-scale=1">

<title>Homepage</title>
<link rel="icon" href="atmecs.ico" type="image/png">
<link rel="shortcut icon" href="atmecs.ico" type="img/x-icon">

<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,800italic,700italic,600italic,400italic,300italic,800,700,600' rel='stylesheet' type='text/css'>

<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css">
<link href="css/font-awesome.css" rel="stylesheet" type="text/css">
<link href="css/responsive.css" rel="stylesheet" type="text/css">
<link href="css/animate.css" rel="stylesheet" type="text/css">

<!--[if IE]><style type="text/css">.pie {behavior:url(PIE.htc);}</style><![endif]-->

<script type="text/javascript" src="js/jquery.1.8.3.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/jquery-scrolltofixed.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/jquery.isotope.js"></script>
<script type="text/javascript" src="js/wow.js"></script>
<script type="text/javascript" src="js/classie.js"></script>
<script src="contactform/contactform.js"></script>

</head>
<body>
<nav class="main-nav-outer" id="test"><!--main-nav-start-->
	<div class="container">
        <ul class="main-nav">
        <%  User user = (User)session.getAttribute("currentSessionUser") ;%>
        	<li><a href="#header">Wecome , <%out.print(user.getName()); %></a></li>
           
            <li><a href="action?action=adminlogin">TechTalks</a></li>
            
           
            <li class="small-logo"><img src="img/wo9YEo55.jpg" alt=""></li>
            
  
            <li>
                   <a href="action?action=addtechtalk">Add TechTalk</a>
                </li>
                <li>
                    <a href="action?action=request">Requested TechTalk</a>
                    
                 </li>
            <li>
                 <a href="action?action=logout"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
             </li>
              
        </ul>
       
    </div>
</nav>

       <div class="container">
<br>

              

                
                 
                        <h2>Employee Registers </h2>
                        <table class="table table-striped">
                                <thead>
                                    <tr>
                                     <th> SrNO.</th>
                                        <th> Registers Email</th>
                                      
                                    </tr>
                                </thead>
                                <tbody>
                                   
                                  
                                  <%
                                   List<Registrations> rg= ( List<Registrations>)session.getAttribute("registration");
                                  int i=0;
                                  for (Registrations registration : rg) {
                                	 
                                	  %>
                                	   <tr>
                                	     <td><% out.print(++i); %> </td>
                                	  <td><% out.print(registration.getEmail()); %> </td>
                                     
                  			     </tr>
                  			      <%
                  			      if(rg.isEmpty())
                  			      out.print("NO registration");
                  			        
                  			      } %>	
                             
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <!-- /.row -->

               

                <!-- /.row -->

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
 <footer class="footer">
    <div class="container">
       
        <span class="copyright">&copy; ATMECS Technology pvt.Ldt. All Rights Reserved</span>
        <div class="credits">
            <!-- 
                All the links in the footer should remain intact. 
                You can delete the links only if you purchased the pro version.
                Licensing information: https://bootstrapmade.com/license/
                Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Knight
            -->
              </div>
    </div>
</footer>
</body>

</html>
