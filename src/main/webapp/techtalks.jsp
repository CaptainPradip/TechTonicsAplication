<%@page import="techtalk.pojo.User"%>
<%@page import="org.apache.taglibs.standard.tag.el.core.ForEachTag"%>
<%@page import="techtalk.pojo.TechTalk"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, maximum-scale=1">

<title>Homepage</title>
<link rel="icon" href="favicon.png" type="image/png">
<link rel="shortcut icon" href="favicon.ico" type="img/x-icon">

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
        	<li><a href="home.jsp">Home</a></li>
            <li><a href="action?action=techtalk">TechTalks</a></li>
           
            <li class="small-logo"><a href="#header"><img src="img/wo9YEo55.jpg" alt=""></a></li>
            <li><a href="index.jsp">Login</a></li>
  
            <li><a href="action?action=requesttechtalk">Take TechTalks</a></li>
        </ul>
       
    </div>
</nav><!--main-nav-end-->

<div class="container">
<br>
  <h2>Upcoming TechTalks</h2>
           
  <table class="table table-striped">
    <thead>
                                    <tr>
                                        <th>Scheduled Date</th>
                                        <th>Time</th>
                                        <th>Venue</th>
                                        <th>Title</th>
                                         <th>Speaker Name</th>
                                        <th>Description</th>
                                        <th>  Register  </th>
                                      
                                    </tr>
                                </thead>
     <tbody>
                                 
                                  
                                  <%
                                   List<TechTalk> tech= (List<TechTalk>) request.getAttribute("result");
                                   
                                  for (TechTalk techTalk : tech) {
                                	  %>
                                	    <tr>
                                	  <td><% out.print(techTalk.getDate()); %> </td>
                                      <td><% out.print(techTalk.getTime()); %> </td>
                                        <td><% out.print(techTalk.getVenue()); %> </td>
                                          <td><% out.print(techTalk.getTitle()); %> </td>
                                            <td><% out.print(techTalk.getSpeaker()) ;%> </td>
                                              <td><% out.print(techTalk.getDescription()); %> </td>
                                                  <td><a href="action?id=<%= techTalk.getTechid()%>&action=register">Register</a></td>
                  			        </tr>
                  			      <% } %>	
                          
                                </tbody>
  </table>
</div>

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