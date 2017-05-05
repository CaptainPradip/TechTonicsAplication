<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Login and Registration</title>
		<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
		<link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
	    <link rel="stylesheet" type="text/css" href="css\style2.css">
    </head>
    <body>
    <nav class="main-nav-outer" id="test"><!--main-nav-start-->
	<div class="container">
       
           
            <li class="small-logo"><a href="#header"><img src="img/atmecs.ico" alt=""></a></li>
           
     
       
    </div>
        <div class="container">
           
            <header>
                <h1>Login and Registration Form</h1>
				
            </header>
            <section>	
            			
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="login" autocomplete="on" method="POST"> 
                                <h1>Log in</h1> 
                                <p> 
                                    <label for="username" class="uname" > Your email or username </label>
                                    <input id="username" name="username" required="required" type="text" placeholder="myusername or mymail@mail.com"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd"> Your password </label>
                                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
                                <p class="keeplogin"> 
									<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
									<label for="loginkeeping">Keep me logged in</label>
								</p>
                                <p class="login button"> 
                                   <input type="submit" value="login"/> 
								</p>
                                <p class="change_link">
									Not a member yet ?
									<a href="#toregister" class="to_register">Join us</a>
								</p>
                            </form>
                        </div>

                        <div id="register" class="animate form">
                            <form  action="signup" autocomplete="on" onsubmit="return Validate()"> 
                                <h1> Sign up </h1> 
				
                                <p> 
                                    <label for="usernamesignup" class="uname" >Your username</label>
                                    <input id="name" name="name" required="required" type="text" placeholder="mysuperusername690" />
                                </p>
                                <p> 
                                <p> 
                                    <label for="usernamesignup" class="uname" >Your EmpId</label>
                                    <input id="empid" name="empid" required="required" type="text" placeholder="332
                                    " />
                                </p>
                                    <label for="emailsignup" class="youmail"  > Your email</label>
                                    <input id="email" name="email" required="required" type="email" placeholder="mysupermail@atmecs.com"/> 
                                </p>
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" >Your password </label>
                                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                     <input  name="role"  type="hidden" value="emplyee"/>
                               
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" >Please confirm your password </label>
                                    <input id="cpassword" name="passwordsignup_confirm" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p class="signin button"> 
									<input type="submit" value="Sign up"/> 
								</p>
                                <p class="change_link">  
									Already a member ?
									<a href="#tologin" class="to_register"> Go and log in </a>
								</p>
                            </form>
                        </div>
						
                    </div>
                </div>  
            </section>
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
<script type="text/javascript">
    function Validate() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("cpassword").value;
        var firstname= document.getElementById("name").value;
      
    	var email = document.getElementById('email').value;
        var mobile = document.getElementById('mobile').value;
        var birthdate = document.getElementById('birthdate').value;
        var passwordlength = password.length; 
      
      
     
    
      

        if(allLetterf(firstname))  
        {  
         
          		if(validatedate(birthdate))  
        		{  
        			if(phonenumber(mobile))  
        			{  
        				if(ValidateEmail(email))  
       					 {  
     					   if(passwordvalidation(password))  
        					{  
           					 if( confirmpasswordValidate(password,confirmPassword))
                				{
           					 
                				}
         					}  
        				 }   
        			}  
       		   }   
        	  
        }  
        
  			return false;

 		}  

    function allLetterf(firstname)  
    {     var letters = /^[A-Za-z]+$/;
     
    	if(firstname.match(letters))  
    	{  
    	return true;  
    	}  
    else  
    {  
    alert('First Name must have alphabet characters only');  
     
    return false;  
    }  
    }  
    function allLetterl(lastname)  
    {     var letters = /^[A-Za-z]+$/;
     
    if(lastname.match(letters))  
    {  
    return true;  
    }  
    else  
    {  
    alert('Last Name must have alphabet characters only');  
     
    return false;  
    }  
    }  
    
    function phonenumber(mobile)  
    {  
    	   var phoneno = /^\+?([0-9]{2})\)?[-. ]?([0-9]{10})$/;  
    	  if((mobile.match(phoneno)))  
    	    {  
    	      return true;  
    	    }  
    	    else  
    	        {  
    	        alert("Mobile Number Is Not Correct"); 
    	       
    	        return false;  
    	        }  
    }  
    
    function validatedate(birthdate)
     { 
    	  var dateformat = /^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/; 
       // Match the date format through regular expression 
       if(birthdate.match(dateformat)) {
           return true;;
         } 
       else 
           { 
           alert("Invalid date format!"); 
           
            return false; 
           } 
      } 

    function ValidateEmail(email)  
    {  
        var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/; 
  
	    if(email.match(mailformat))  
	    {  
	   			 return true;  
	    }  
	    else  
	    {  
	    alert("You have entered an invalid email address!");  
	    
	    return false;  
	    }  
    }
 function passwordvalidation(password)  
    {  
	  var passwordpattern= /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{4,15}$/ ;
    if (password.match(passwordpattern))  
    {  
     return true;  
      
    } 
    else{
    	 alert("4 to 15 characters which contain at least one lowercase letter, one uppercase letter, one numeric digit, and one special character")       
         
    	 return false;
        } 
   
    }  

 function confirmpasswordValidate(password,confirmPassword) 
 {
      if (password != confirmPassword) 
          {
         alert("Passwords do not match.");
         return false;
         }
     else  
    {  
    alert(' Succesfully Registered !!! Thank you for registration !!  Now You can login !!');  
    	
     return true;  
    }  
  }

 </script>
   </body>
</html>