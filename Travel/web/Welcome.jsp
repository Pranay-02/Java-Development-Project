<%-- 
    Document   : Welcome
    Created on : 15 Feb, 2020, 1:42:27 PM
    Author     : Pranay Singhal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
<TITLE> Bharat Dhekho </TITLE>
<link type="text/css" rel="stylesheet" href="style1.css">
</HEAD>
<BODY>
<IMG src="G:\My Pictures\images[63].jpg" align="left" height="150" width="180">
<IMG src="G:\My Pictures\gate[2].jpg" align="right" height="150" width="180"><BR>
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
<br>
<center><h2>Welcome Admin!!!</h2></center>
<div style="margin-left: 50px ; face:comic sans ms ; font-size: 20px">
<font color="red">

                <b>For Registration</b>
                <br>&nbsp;<a href="view_reg.jsp">View all Enteries</a>
                <br><br><br>
                 <b>For Hotel Booking</b> 
                <br>&nbsp;<a href="view.jsp">View all Enteries</a>
                <br>&nbsp;<a href="delete.jsp">Delete an Entry</a>
                <br>&nbsp;<a href="update.jsp">Update an Entry</a>
                <br><br><br>
                <b>For Package booking</b>
                <br>&nbsp;<a href="view_pkg.jsp">View all Enteries</a>

                </font>
</div>
<br>
<footer>
    BEWARE OF FAKE MOBILE CALLS FROM MIDDLEMEN AND OTHER PERSONS<BR>
    PRETENDING TO BE FROM OUR COMPANY<br>
    [ Last Update on 22th Feburary, 2020 ]
</footer>
</BODY>
</HTML>
