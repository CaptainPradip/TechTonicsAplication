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
            <li><a href="action?action=techtalk">TechTalks</a></li>
           
            <li class="small-logo"><a href="#header"><img src="img/wo9YEo55.jpg" alt=""></a></li>
            <li><a href="action?action=logout"">LogOut</a></li>
  
            <li><a href="action?action=requesttechtalk">Take TechTalks</a></li>
        </ul>
       
    </div>
</nav><!--main-nav-end-->



<div class="container">    
            
    <div id="signupbox" style=" margin-top:50px" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Request TechTalk</div>
               
            </div>  
            <div class="panel-body" >
                
                         

                    <form  class="form-horizontal" method="POST" action="action" >
                       
                        
                        
                        <div id="div_id_password1" class="form-group required">
                            <label for="id_password1" class="control-label col-md-4  requiredField">Speaker<span class="asteriskField">*</span> </label>
                            <div class="controls col-md-6 "> 
                                <input " class="input-md textinput textInput form-control"  name="speaker" style="margin-bottom: 10px" type="text" />
                            </div>
                        </div>
                        <div id="div_id_password2" class="form-group required">
                             <label for="id_password2" class="control-label col-md-4  requiredField">Date<span class="asteriskField">*</span> </label>
                             <div class="controls col-md-6 ">
                                <input class="input-md textinput textInput form-control"  name="date" style="margin-bottom: 10px" type="date" />
                            </div>
                        </div>
                        <div id="div_id_name" class="form-group required"> 
                            <label for="id_name" class="control-label col-md-4  requiredField">Time<span class="asteriskField">*</span> </label> 
                            <div class="controls col-md-6 "> 
                                <input "class="input-md  textInput form-control"  name="time"  style="margin-bottom: 10px" type="time" />
                            </div>
                        </div>
                       
                        <div id="div_id_company" class="form-group required"> 
                            <label for="id_company" class="control-label col-md-4  requiredField">Title<span class="asteriskField">*</span> </label>
                            <div class="controls col-md-6 "> 
                                 <input  " class="input-md textinput textInput form-control"  name="title"  style="margin-bottom: 10px" type="text" />
                            </div>
                        </div> 
                        <div id="div_id_catagory" class="form-group required">
                            <label for="id_catagory" class="control-label col-md-4  requiredField">Description<span class="asteriskField">*</span> </label>
                            <div class="controls col-md-6 "> 
                                 <input  class="input-md textinput textInput form-control" name="Description" style="margin-bottom: 10px" type="text" />
                            </div>
                        </div> 
                        
                        <div class="form-group"> 
                            <div class="aab controls col-md-4 "></div>
                            <div class="controls col-md-4 ">
                                <input type="submit" name="action" value="Requesttotechtalk" class="btn btn-primary btn btn-info" id="submit-id-signup" />
                                
                            </div>
                        </div> 
                       
                            
                    </form>
            </div>
        </div>
    </div> 
</div>
    






 <footer class="footer">
    <div class="container">
       
        <span class="copyright">&copy; ATMECS Technology pvt.Ldt. All Rights Reserved</span>
        <div class="credits">
            
              </div>
    </div>
</footer>          
</body>
</html>