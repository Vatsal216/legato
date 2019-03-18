<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 0px solid #f1f1f1;}
body{
background:url('http://www.mtboss.com/images/hero-header/login.jpg') no-repeat;
background-size:cover;
}

.imgcontainer {
  text-align: center;
  vertical-align:middle;
 
}

img.avatar {
  width: 10%;
  border-radius: 50%;
}

.container {
  padding: 50px;

  
}


.form-control{
text-align: center;
margin-top: auto;
box-sizing: border-box;
vertical-align:middle;

}
.for{
padding: 3px;
}

.psw1{
font-size:15px;
}

.psw{
margin-left:120px;
font-size:15px;
}

</style>

<script>
function validatelogin()
{
	var name1=document.getElementById("n1").value;
	 var pswd1=document.getElementById("p1").value;
	
  var patternName="^[A-Za-z]+$";
  var patternPswd="^[A-Za-z0-9@#]+$";

//if(name.toLowercase()=="admin" && password=="Admin")


/*if (name1.match(patternName) && pswd1.match(patternPswd)) {
	document.getElementById("s1").innerHTML="  "  ;
	document.getElementById("s2").innerHTML="  " ;
	return true;
}
else*/ if(name1.match(patternName)==null && pswd1.match(patternPswd)==null){
	console.log("name and password are empty");
	document.getElementById("s1").innerHTML=" Name can't be empty " ;
	document.getElementById("s1").style.color=('red');
	document.getElementById("s2").innerHTML="Password can't be empty";
	document.getElementById("s2").style.color=('blue');
return false;
}

else  if (pswd1.match(patternPswd)==null) {
	console.log(" password is empty");
	document.getElementById("s2").innerHTML="Password can't be empty";
	document.getElementById("s2").style.color=('blue');
	document.getElementById("s1").innerHTML=" ";
	return false;
}

	    else if(name1.match(patternName)==null) {
	    	console.log(" name is empty");
	    	document.getElementById("s1").innerHTML=" Name can't be empty" ;
	    	document.getElementById("s1").style.color=('red');
		document.getElementById("s2").innerHTML=" " ;
		
		
	return false;
	}
	  
	  
}



</script>
</head>
<body class="body">

<h2><center>Login Form</center></h2><br></br>


  <div class="imgcontainer">
    <img src="https://t4.ftcdn.net/jpg/00/24/94/01/500_F_24940114_byTrVVviV4zCscBU3F3uFzfY9j7CoPjG.jpg" alt="LOL" class="avatar">
  </div>
  <div class="container"> 
 <div class="row">
 <div class="col-md-3"></div>
 <div class="col-md-6" >
<form onsubmit="return validatelogin()" class="for" action="LoginServlet">


 <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <input class="form-control" type="text" name='username' placeholder="username" id="n1"/>
            
</div>
<span id="s1" ></span>




     <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
            <input class="form-control" type="password" name='password' placeholder="password" id="p1"/>
            
</div>
<span id="s2"></span>

        

    <input type="submit" class="form-control" value="Login">
  
    
    <span class="psw1">For new User <a href="Signup.jsp"><b><U>click here</U></b></a></span>

    <span class="psw">Forgot <a href="forgetpassword.jsp">password?</a></span>
    </form>
  </div></div>
   
</div>

 


</body>
</html>