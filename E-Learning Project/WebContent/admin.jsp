<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ page import="java.util.*,Learning.registration,Learning.Feedback,Learning.LoginClass"%>
<%@ page import="Learning.HibernateUtil" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>



    
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.0.2/TweenMax.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.0.2/TimelineMax.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/ScrollMagic/2.0.6/ScrollMagic.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/ScrollMagic/2.0.6/plugins/animation.gsap.min.js"></script>



</head>
<body>



<%String name="k"; %>
<% HibernateUtil util= new HibernateUtil();
util.createSessionFactory();  %>



<form action="">
 <div class="container-fluid">
        <div class="bigodacity"></div>
        <div class="bgimg">

            <div class="header">
                <div class="col-md-6">

                    <ul class="header1">
                        <li><a class="a1" href="#">Home</a></li>
                        <li><a class="a1" href="contact">Contact </a></li>
                        <li><a class="a1" href="#">Feedback </a></li>
                        <li><a class="a1" href="#">Registration </a></li>
                         <li><a class="a1" href="logout">Logout </a></li>
                    </ul>

                </div>
                <div>
                    <h2 class="h2a">Admin</h2>
                </div>
                <div>
                
                
                
                </div>

</div>
</div>
</div>
</form>






	




	
	
	





</body>
</html>