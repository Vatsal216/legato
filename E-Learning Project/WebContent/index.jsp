<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,Learning.*"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/index1.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.0.2/TweenMax.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.0.2/TimelineMax.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/ScrollMagic/2.0.6/ScrollMagic.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/ScrollMagic/2.0.6/plugins/animation.gsap.min.js"></script>
    <title></title>
</head>

<body>


    <div class="container-fluid">
        <div class="bigodacity"></div>
        <div class="bgimg">

            <div class="header">
           

                    <ul class="header1">
                        <li><a class="a1" href="index.jsp">Home</a></li>
                       
                        <li><a class="a1" href="#join">feedback</a></li>
                       <li><a class="a1" href="#bigbox3">Courses</a></li>
                        <li><a class="a1" href="logout">Logout</a></li>
                    </ul>

                <div>
                    <h2 class="h2a">E-Learning</h2>
                </div>
                <div class="line"></div>
            </div>
            <section class="sticky">
                <div class="headline">
                    <div  class="animated slideInRight" style="animation-delay: 1s"> 
                        
                        <pre class="headtxt1">The Best Professional e-Learning  </pre> </div>
                        <div  class="animated slideInLeft" style="animation-delay: 2s"> 
                        <pre class="headtxt1"> Courses For better World! </pre></div>
<%
String name=(String)session.getAttribute("name");
out.println("Hello : "+name); 

%>
    
                   
                </div>
            </section>
           
        </div>


      

      

        <section id="bigbox3">
              <div class="tt1">
                  <h2 class="tt2">Our Courses</h2>
              </div>
            
                <div class="boxa1">
                    <a href="python.jsp"> <img class="zoom9"
                            src="https://2.bp.blogspot.com/-zERL7nKzlRM/Wa7ZuhpzLtI/AAAAAAAAJbA/2MvVcy7wLUknS8_53Zf91EhY-SJqKtWlACK4BGAYYCw/s1600/python.jpg"> </a>
                    <div class="boztxt">
                        <h6 class="bo">
                               Python
                        </h6>
                        <p class="bo1">
                         Learn to Program
and Analyze Data
with Python.Develop
programs to gather,
clean,analyze, and 
visualize data.
                        </p>
                        <div class="butl">
                            <a class="but2al" href="python.jsp">Read More</a>
                        </div>
                    </div>
    
                
              </div>
              
                <div class="boxa2">

                    <a href="java.jsp"> <img class="zoom9"
                            src="https://bittlife.com/wp-content/uploads/2017/10/java.png"> </a>
                    <div class="boztxt">
                        <h6 class="bo">
                           Java
                        </h6>
                        <p class="bo1">
                         Learn to Program
and Analyze Data
with Java.Develop
programs to gather,
clean,analyze, and 
visualize data.
                        </p>
                        <div class="butl">
                                <a class="but2al" href="java.jsp">Read More</a>
                            </div>
                    </div>
                  
                </div>
              
              
                <div class="boxa3">
                    <a href="#"> <img class="zoom9"
                            src="https://businessstudent.scdn5.secure.raxcdn.com/wp-content/uploads/2018/09/datascience.jpg">
                    </a>
                    <div class="boztxt">
                        <h6 class="bo">
                                Data Science
                        </h6>
                        <p class="bo1">
                        Learn to Program
and Analyze Data
with Data Science.
Developprograms to 
gather,clean,analyze,
and visualize data.
                  
                    </p>
                    <div class="butl">
                            <a class="but2al" href="but2al">Read More</a>
                        </div>
                </div>
    
                
    
    </div>
            </section>






        <div class="image">

        </div>

         <section id="join">

            <div class="contactbg">
                <div class="blur"></div>

                <div class="contact">
                    <div class="imgd">
                        <h1 class="h1q">Feedback</h1>
                    </div>
                    <div class="con">
                        <form class="form-group" action="feedback">
                            <div class="row">
                                <div class="col-lg-8">
                                    <div class="form-group input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input class="form-control" type="text" name='Name' placeholder="Name" id="n1"
                                            size="10" required="required" /><span id="s1"></span>
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-lg-8">
                                    <div class="form-group input-group">
                                        <span class="input-group-addon"><i
                                                class="glyphicon glyphicon-envelope"></i></span>
                                        <input class="form-control" type="e-mail" name='E-mail'   placeholder="E-mail"
                                            required="required" /> <span id="s2"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-8">
                                    <div class="form-group input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-list-alt"></i></span>
                                        <Textarea class="form-control"  name='Feedback' id="m1" required="required" ></Textarea>
                                            
                                           <span id="s3"></span>
                                    </div>
                                </div>
                            </div>
                            
                             <div class="row">
                                <div class="col-lg-8">
                                    <div class="form-group input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-list-alt"></i></span>
                                        <input type="number"  name='phone' id="m1" required="required" >
                                            
                                           <span id="s3"></span>
                                    </div>
                                </div>
                            </div>
                            

                            <div class="row">
                                <div class="col-lg-4">
                                    <button type="submit" class="form-control">Submit</button>
                                </div>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </section>




       





    </div>



    <!-- <script>  -->
    <!-- var t1 = new TimelineMax({onUpdate:updatePercentage});  -->
    <!-- const controller = new ScrollMagic.Controller();  -->

    <!-- t1.from("blockquote", 1, {x:0,opacity:0});  -->
    <!-- // t1.from("#office", 1, {x:-, opacity:0});  -->
    <!-- // t1.from("#building", 1, {x:50, opacity:0});  -->

    <!-- const scene = new ScrollMagic.Scene({  -->
    <!-- triggerElement: ".sticky",  -->
    <!-- triggerHook: "onLeave",  -->
    <!-- duration: "100%"  -->
    <!-- })  -->
    <!-- .setPin(".sticky")  -->
    <!-- .setTween(t1)  -->
    <!-- .addTo(controller);  -->

    <!-- function updatePercentage(){ -->
    <!-- t1.progress();  -->
    <!-- console.log(t1.progress());  -->
    <!-- }  -->

    <!-- </script>  -->



    <script>
    jQuery(function( $ ){

// Smooth scrolling when clicking on a hash link
$('a[href^="#"]').on('click',function (e) {
    e.preventDefault();

    var target = this.hash;
    var $target = $(target);

    $('html, body').stop().animate({
        'scrollTop': $target.offset().top
    }, 900, 'swing');
});

});
    </script>
</body>

</html>