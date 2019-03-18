<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<style>

.container{
 padding-top: 32px;
  vertical-align:middle;
padding-left:450px;
}
.imgcontainer{
 padding-top: 42px;
  text-align: center;
  vertical-align:middle;
  width: 15%;
  border-radius: 50%;
padding-left:617px;
}


body{
background-image: url(https://backgroundcheckall.com/wp-content/uploads/2017/12/background-tembok-hd-2.jpg);
height: auto;
 min-width: auto;
 background-size:cover;
 }




</style>
</head>
 <body>

<form onsubmit="" action="Registration_FromServelet">

   <div class="imgcontainer">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuTzj_ixSt7yDPdwRK36ixTDtp4VjBCVrTyLyv68GIV6emVVQi">
  </div>
  

  <div class="container">
  
  
                     <div class="row">
 <div class="col-lg-4" >
 <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <input class="form-control" type="text" name='Name' placeholder="Name"/><span id="s1" ></span>
</div></div></div>

             <div class="row">
 <div class="col-lg-4">
     <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
            <input class="form-control" type="e-mail" name='E-mail' placeholder="E-mail"/>    <span id="s2"></span>
</div></div></div>
        
        
        
        <div class="row">
 <div class="col-lg-4">
     <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-phone"></i></span>
            <input class="form-control" type="text"  name='Mobile_No' placeholder="Mobile No." required>    <span id="s2"></span>
</div></div></div>
        
        <!--    <div class="row">
 <div class="col-lg-4">
     <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-registration-mark"></i></span>
            <input class="form-control" value="" name='Reg_No' placeholder="Registration No." readonly="readonly"/>    <span id="s2"></span>
</div></div></div> -->
        
        
             <div class="row">
 <div class="col-lg-4">
     <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
            <%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); %>
            <input class="form-control" name="Date" value="<%= df.format(new java.util.Date()) %>"  readonly="readonly"><span id="s2"></span>
 
</div></div></div>
        
        
             <div class="row">
 <div class="col-lg-4">
     <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-hourglass"></i></span>
            <%java.text.DateFormat df1 = new java.text.SimpleDateFormat("HH:mm:ss"); %>
            <input class="form-control" value="<%= df1.format(new java.util.Date()) %>" name="Time"  readonly="readonly" />    <span id="s2"></span>
</div></div></div>
        
        
                   <div class="row">
 <div class="col-lg-4">
     <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></span>
            <input class="form-control" type="text" name='Place' placeholder="Place"/>    <span id="s2"></span>
</div></div></div>
        
        
                   <div class="row">
 <div class="col-lg-4">
     <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-education"></i></span>
            <input class="form-control" type="text" name='Course' placeholder="Course" readonly="readonly"/>    <span id="s2"></span>
</div></div></div>
        
        
                   <div class="row">
 <div class="col-lg-4">
     <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-usd"></i></span>
            <input class="form-control" type="number" name='Fees' placeholder="Fees" readonly="readonly"/>    <span id="s2"></span>
</div></div></div>
        
        
        
        
        
        
        
        
        
        
        
        <div class="row">
         <div class="col-lg-4">
    <button type="submit" class="form-control" >Submit</button>
    </div></div>
   
  </div> </form>
 


</body>
</html>