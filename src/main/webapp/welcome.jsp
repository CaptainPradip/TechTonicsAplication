
<!DOCTYPE html>
<%@page import="techtalk.pojo.User"%>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="robots" content="noindex"> 

    <title> Login Success</title>
   
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
   <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
</head>
<body>
    

   <div class="container">
	<div class="row text-center">
        <div class="col-sm-6 col-sm-offset-3">
        <br><br> <h2 style="color:#0fad00">Success</h2>
        <img src="http://osmhotels.com//assets/check-true.jpg">
        <h3>Dear,<% User user = (User)request.getAttribute("result");
        out.print(user.getName()); %></h3>
        <p style="font-size:20px;color:#5C5C5C;">Thank you for verifying your Email We have sent you an email "<%out.print(user.getEmail()); %>" with your details
         Please go to your above email now and login.</p>
        <a href="index.jsp" class="btn btn-success">     Log in      </a>
    <br><br>
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
