<%-- 
    Document   : PGrates
    Created on : 18 Feb, 2020, 1:02:48 PM
    Author     : Pranay Singhal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
<TITLE> Bharat Dhekho </TITLE>
<link type="text/css" rel="stylesheet" href="style1.css">
<link type="text/css" rel="stylesheet" href="slider.css">
</HEAD>
<BODY>
<HEADER><CENTER>BHARAT DEKHO</CENTER></HEADER>
<HR size="3" align="left" width="100%" color="black">
<div class="navbar">
  <a href="index.html">Home</a>
  <a href="Contact.jsp">Contact Us</a>
  <a href="About_us.jsp">About Us</a>
  <div class="dropdown">
    <button class="dropbtn">Sign In 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="Login.html">User Login</a>
      <a href="Register.html">User Registration</a>
      <a href="Admin_login.html">Admin Login</a>
    </div>
  </div> 

  <div class="dropdown">
    <button class="dropbtn">Have a Look 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="Goa.html">Goa Dekho</a>
      <a href="Himachal.html">Himachal Dekho</a>
      <a href="Kerala.html">Kerala Dekho</a>
    </div>
  </div> 
  <div class="dropdown">
    <button class="dropbtn">Feedback/Complain 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="Feedback.html">FeedBack</a>
      <a href="Complain.html">Complain</a>
    </div>
  </div> 
    <div class="dropdown">
    <button class="dropbtn">Packages 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="Adventure.jsp">Adventure Packages</a>
      <a href="PakageBook.html">Book a Package</a>
    </div>
  </div> 
  <div class="dropdown">
    <button class="dropbtn">Hotels
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="HotelBook.jsp">Book a Hotel</a>
      <a href="PGrates.jsp">Prices </a>
      <a href="hotel_faqs.jsp">FAQs about Hotels</a>
    </div>
  </div> 
</div>
<HR size="3" align="left" width="100%" color="black">
<br><center>
<font size="5" color="red" face="comic sans ms">
<b>Rates Till December 2020</b></font><br></center>
<font size="4" color="black" face="comic sans ms">
<BR><B>Guest Houses</B><BR>
Room Rates for Guest houses are around Rs. 500/- to Rs. 700 per day. Available for only walk in guests<BR><BR>
<B>1 Star Hotel</b><br>
Room Rates for One star hotels are around Rs. 900 to 1500 per day. Mostly non A/C Rooms are there<BR><BR>
<B>2/3 Star Hotel</B><BR>
Business travelers Services discounted room rates and special amenities such as newspaper a piping hot cup of coffee.<BR>
Room Rates for 2/3 star hotels are around Rs. 1500 to 3000 per day.<BR><BR>
<B>5 star Hotel </B><Br>
Room Rates for 5/7 star hotels are around Rs. 3000 to 6000 per day. There will be room service and other room amenities will be there<br><BR>
<B> P.G. Accomodation</B><BR>
Since P.G Accomodation is mainly for backpackers, family, students. So there is no fixed rates for P.G. Accomodation. It will vary according to your criteria <br><BR>
<br>
<br>
</font>
<div class="slideshow-container">
    <br><br>
                    <!--images with number and caption text -->
                    <div class="mySlides fade">
                        <img src="C:\Users\Pranay Singhal\Documents\pictures\hotel.jpg" style="width:100%">
                        <div class="text">Guest House</div>
                    </div>

                    <div class="mySlides fade">
                        <img src="C:\Users\Pranay Singhal\Documents\pictures\hotel1.jfif"  style="width:100%">
                        <div class="text">5 Star Hotel </div>
                    </div>

                    <div class="mySlides fade">
                        <img src="C:\Users\Pranay Singhal\Documents\pictures\hotel2.jfif" style="width:100%">
                        <div class="text">3 Star Hotel</div>
                    </div>

                    <div class="mySlides fade">
                        <img src="C:\Users\Pranay Singhal\Documents\pictures\hotel3.jfif" style="width:100%">
                        <div class="text">Guest House</div>
                    </div>

                    <!-- Next and previous buttons -->
                    <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
                    <a class="next" onclick="plusSlides(1)">&#10095;</a>
                </div>
                <br>

                <!-- The dots -->
                <div style="text-align:center">
                     <span class="dot" onclick="currentSlide(1)"></span> 
                     <span class="dot" onclick="currentSlide(2)"></span> 
                     <span class="dot" onclick="currentSlide(3)"></span> 
                     <span class="dot" onclick="currentSlide(4)"></span> 
                </div>
                <br>
                <br>
<footer>
    BEWARE OF FAKE MOBILE CALLS FROM MIDDLEMEN AND OTHER PERSONS<BR>
    PRETENDING TO BE FROM OUR COMPANY<br>
    [ Last Update on 22th Feburary, 2020 ]
</footer>
</BODY>
 <script>
        var slideIndex = 1;
        showSlides(slideIndex);

        // Next/previous controls
        function plusSlides(n)
        {
            showSlides(slideIndex += n);
        }

        // Thumbnail image controls
        function currentSlide(n)
        {
            showSlides(slideIndex = n);
        }

        function showSlides(n) 
        {
            var i;
            var slides = document.getElementsByClassName("mySlides");
            var dots = document.getElementsByClassName("dot");
            if (n > slides.length)
                    slideIndex = 1; 
            if (n < 1) 
                    slideIndex = slides.length;
            for (i = 0; i < slides.length; i++) 
                    slides[i].style.display = "none"; 
            for (i = 0; i < dots.length; i++)
                    dots[i].className = dots[i].className.replace(" active", "");
            slides[slideIndex-1].style.display = "block"; 
            dots[slideIndex-1].className += " active";
        }
    </script>
</HTML>

