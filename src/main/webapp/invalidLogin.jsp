<%@page import="techtalk.pojo.User"%>
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
        	<li><a href="#header">Home</a></li>
            <li><a href="action?action=login">TechTalks</a></li>
           
            <li class="small-logo"><a href="#header"><img src="img/atmecs.ico" alt=""></a></li>
            <li><a href="action?action=requesttechtalk">Take TalkTalk</a></li>
            <li><a href="action?action=logout">logout</a></li>
  
            
        </ul>
       
    </div>
</nav><!--main-nav-end-->

   <div class="container">
	<div class="row text-center">
        <div class="col-sm-6 col-sm-offset-3">
     
     <br><br> <h2 style="color:##f44242">Fail</h2>
        <img src="http://osmhotels.com//assets/check-true.jpg">
        <h3>Dear,<% User user = (User)session.getAttribute("currentSessionUser");
        out.print(user.getName()); %></h3>
        <p style="font-size:20px;color:#5C5C5C;"> Sorry ,You Have all Ready account on TechTalk...please login !!!!!!!</p>
           <a href="index.jsp" class="btn btn-success">Log in</a>  <br>
        </div>
        
	</div>
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
