<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<title>Forgot_Password</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 0px solid #f1f1f1;}
body{
background:url('https://wallpapercave.com/wp/wp2672819.jpg') no-repeat;
background-size:cover;
}

.imgcontainer {
  text-align: center;
  vertical-align:middle;
 
}

img.avatar {
  width: 10%;
  
}

.container {
  padding: 20px;

  
}


.form-control{
margin-top: auto;
box-sizing: border-box;
vertical-align:middle;

}


.psw{
font-size:15px;
}

</style>


<!-- <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script> -->
<script type="text/javascript">





/*function validatePassword(){

if(password.value != confirm_password.value) {
  confirm_password.setCustomValidity("Passwords Don't Match");
  return false;
} else {
  confirm_password.setCustomValidity('');
  return true;
}
}*/

function validateForgot()
{
	var username = document.getElementById("username").value;
	var email = document.getElementById("emailId").value;
	var password = document.getElementById("password").value;
	var confirm_password = document.getElementById("confirm_password").value;
	
	
	

	
	var username2=uname_validate(username);
	var email2=email_validate(email);
	var password2=password_validate(password);
	var confirm_password2=comfirmpass_validate(confirm_password);
	
	 
	if(username2 && email2 && password2 && confirm_password2)
		{
		if(password!=confirm_password)
		{
			document.getElementById("error1").innerHTML="password not match"
			document.getElementById("error1").style.color=('red');
	        return false;
		}
		else
		{
			 return true;	
		}		 	 
	}	
	else
		{
		return false;
		}
}


function uname_validate(username)
{
if(username.trim()=="")
	{
	document.getElementById("usererror").innerHTML="*User Name can't be empty"
	document.getElementById("usererror").style.color=('red');
	return false;
	}
else
	{
	return true;
	}
}

function email_validate(email)
{
if(email.trim()=="")
	{
	document.getElementById("emailerror").innerHTML="*Email can't be empty"
	document.getElementById("emailerror").style.color=('red');
	return false;
	}
else
	{
	return true;
	}
}

function password_validate(password)
{
	if(password.match("^[a-zA-Z0-9!@#$%^&*]{8,15}$"))
	{
    return true;
	}
else
	{
	document.getElementById("passworderror").innerHTML="*password should contain atleast eight characters and maximum fifteen characters"
		document.getElementById("passworderror").style.color=('red');
		return false;
	}
}

function comfirmpass_validate(confirm_password)
{
if(confirm_password.trim()=="")
	{
	document.getElementById("comfirmerror").innerHTML="*Can't be empty"
	document.getElementById("comfirmerror").style.color=('red');
	return false;
	}
	else
	{
	return true;
	}
}


function showpassword()
{
var pass=document.getElementById("password");
if(pass.type==="password")
	{
	pass.type="text";
	}
else
	{
	pass.type="password";
	}
}



</script>
</head>
<body class="body">
<h2><center>Forgot Password</center></h2><br></br>

<div class="imgcontainer">
    <img src="http://cdn.onlinewebfonts.com/svg/img_229404.png" alt="LOL" class="avatar">
  </div>
  <div class="container"> 

<div class="row">
<div class="col-md-3"></div>
 <div class="col-md-6">
<form  onsubmit="return validateForgot()" action="forgetpassword">

    <div class="form-group input-group">
     <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
    <input type="text" placeholder="User Name" name="username" id="username"  class="form-control">
    
</div>
<span id="usererror"></span>




   <!--  <label for="email"><b>Email</b></label> -->
 <div class="form-group input-group">
     <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
    <input type="text" placeholder="Email" name="email" id="emailId"  class="form-control">  
    </div>
<span id="emailerror"></span>


    <div class="form-group input-group">
    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
    <input type="password" placeholder="New Password" onchange = "validatePassword()" name="password" id="password"  class="form-control">
    
   <span onclick="showpassword()" class="input-group-addon"><i class="glyphicon glyphicon-eye-open" ></i></span>
    
</div>
<span id="passworderror"></span>

    <div class="form-group input-group">
    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
    <input type="password" placeholder="Confirm Password" onkeyup = "validatePassword()" name="password" id="confirm_password" class="form-control">
   
</div>
 <span id="comfirmerror"></span>
    <span id="error1"></span>


    <input type="submit" class="form-control" onclick="" id="btnSubmit" value="Update" />

    

</form>
</div></div></div>
</body>
</html>