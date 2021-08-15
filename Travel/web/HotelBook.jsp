<%-- 
    Document   : HotelBook
    Created on : 17 Feb, 2020, 1:25:21 PM
    Author     : Pranay Singhal
--%>


<!DOCTYPE html>
<HTML>
<HEAD>
<TITLE>Book your Hotel</TITLE>
<link type="text/css" rel="stylesheet" href="style1.css">
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
<br>
<div style="display:flex">
    <div>
        <br><br><br>
<img src="C:\Users\Pranay Singhal\Documents\pictures\book.jpg" style="width:350px; height:300px ; align:left ; margin-left: 30px" >
    </div>
    <div style="align-content: center ; margin-left: 250px">
<center><font size="6" color="blue" face="comic sans ms">
<b>Book your Hotel</B> 
</font></CENTER>
<br>
<FORM method=post action="hotel.jsp">
    <center><table cellspacing=0 cellpadding=4>
        <TR>
            <TD align=right>Name &nbsp;&nbsp;:&nbsp;&nbsp;</TD>
            <TD><input name="name" type="text">
        </TR>
        <TR>
            <TD align=right>Phone &nbsp;&nbsp;:&nbsp;&nbsp;</TD>
            <TD><input name="phone" type="text">
        </TR>
        <TR>
            <TD align=right>Email &nbsp;&nbsp;:&nbsp;&nbsp;</TD>
            <TD><input name="email" type="text">
        </TR>
        <TR>
            <td align=right>Type of Accomodation&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
            <td><select name="type" id="type" class=select>
                    <option value="GH">Guest house</option>
                    <option value="1S">1 Star Hotel</option>
                    <option value="23S">2/3 Star Hotel</option>
                    <option value="5S">5 Star Hotel</option>
                    <option value="PG">P.G Accomodation</option>
                </select>
            </TD></TR>
        <TR>
            <td align=right>Check In Date&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
            <TD><select name="sdd" class="select">
                    <option value="1">01</option>
                    <option value="2">02</option>
                    <option value="3">03</option>
                    <option value="4">04</option>
                    <option value="5">05</option>
                    <option value="6">06</option>
                    <option value="7">07</option>
                    <option value="8">08</option>
                    <option value="9">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                </select>
                <select name="smm" id="select2">
                    <option value="01">JAN</option>
                    <option value="02">FEB</option>
                    <option value="03">MAR</option>
                    <option value="04">APR</option>
                    <option value="05">MAY</option>
                    <option value="06">JUN</option>
                    <option value="07">JUL</option>
                    <option value="08">AUG</option>
                    <option value="09">SEP</option>
                    <option value="10">OCT</option>
                    <option value="11">NOV</option>
                    <option value="12">DEC</option>
                </select>
                <select name="syy" id="select3">
                    <option value="01" selected>2020</option>
                    <option value="02">2021</option>
                </select></td>
        </tr>
        <TR><td align=right>Check Out Date&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
            <td><select name="ddd" id="ddd">
                    <option value="1">01</option>
                    <option value="2">02</option>
                    <option value="3">03</option>
                    <option value="4">04</option>
                    <option value="5" selected>05</option>
                    <option value="6">06</option>
                    <option value="7">07</option>
                    <option value="8">08</option>
                    <option value="9">09</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21"> 21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                </select>
                <select name="dmm" id="select5">
                    <option value="01">JAN</option>
                    <option value="02">FEB</option>
                    <option value="03">MAR</option>
                    <option value="04">APR</option>
                    <option value="05">MAY</option>
                    <option value="06">JUN</option>
                    <option value="07">JUL</option>
                    <option value="08">AUG</option>
                    <option value="09">SEP</option>
                    <option value="10">OCT</option>
                    <option value="11">NOV</option>
                    <option value="12">DEC</option>
                </select>
                <select name="dyy" id="select6">
                    <option value="03" selected>2020</option>
                    <option value="04">2021</option>
                </select></td>
        </tr>
        <TR><td align=right>Hotel Destination&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
            <td><select name="dest" id="dest">
                    <option value="ND" selected>New Delhi</option>
                    <option value="KL">Kolkata</option>
                    <option value="CH">Chennai</option>
                    <option value="MB">Mumbai</option>
                    <option value="BG">Banglore</option>
                    <option value="KE">Kerala</option>
                    <option value="AH">Ahmedabad</option>
                    <option value="HM">Himachal</option>
                    <option value="GO">Goa</option>
                </select></td>
        </tr>
        <TR><td align=right>No.of Rooms&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
            <td><select name="rooms" id="rooms">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select></td>
        </tr>
        <TR><td align=right>Types of Rooms &nbsp;&nbsp;:&nbsp;&nbsp;</TD>
            <td><select name="r_type" id="types">
                    <option value="1">Deluxe</option>
                    <option value="2">Semi-Deluxe</option>
                    <option value="3">Suite</option>
                    <option value="4">Family</option>
                </select></td>
        </tr>
        <TR><td align=right>No. of Adults&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
            <td><input type=text name="adult" id="children">
            </td></tr>
        
        <TR><td align=right>No. of Children&nbsp;&nbsp;:&nbsp;&nbsp;</TD>
            <td><input type=text name="children" id="children">
            </td></tr>
        <TR><Td colspan=2 align=center><button onclick="save();" type=submit>Book Now</button>&nbsp;&nbsp;<button type=reset>Clear Now</button>
            </TD></TR></TABLE></center></form>
<br>
    </div>
</div>
<footer>
    BEWARE OF FAKE MOBILE CALLS FROM MIDDLEMEN AND OTHER PERSONS<BR>
    PRETENDING TO BE FROM OUR COMPANY<br>
    [ Last Update on 22th Feburary, 2020 ]
</footer>
</BODY>
<script>
        function save()
        {
            alert("Your Hotel has been booked Enjoy your stay");
        }
    </script>

</HTML>

