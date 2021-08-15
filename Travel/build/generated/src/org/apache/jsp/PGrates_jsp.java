package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PGrates_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("<TITLE> Bharat Dhekho </TITLE>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"slider.css\">\n");
      out.write("</HEAD>\n");
      out.write("<BODY>\n");
      out.write("<IMG src=\"G:\\My Pictures\\images[63].jpg\" align=\"left\" height=\"150\" width=\"180\">\n");
      out.write("<IMG src=\"G:\\My Pictures\\gate[2].jpg\" align=\"right\" height=\"150\" width=\"180\"><BR>\n");
      out.write("<HEADER><CENTER>BHARAT DEKHO</CENTER></HEADER>\n");
      out.write("<HR size=\"3\" align=\"left\" width=\"100%\" color=\"black\">\n");
      out.write("<div class=\"navbar\">\n");
      out.write("  <a href=\"index.html\">Home</a>\n");
      out.write("  <a href=\"Contact.jsp\">Contact Us</a>\n");
      out.write("  <a href=\"About_us.jsp\">About Us</a>\n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Sign In \n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"Login.html\">User Login</a>\n");
      out.write("      <a href=\"Register.html\">User Registration</a>\n");
      out.write("      <a href=\"Admin_login.html\">Admin Login</a>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("\n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Have a Look \n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"Goa.html\">Goa Dekho</a>\n");
      out.write("      <a href=\"Himachal.html\">Himachal Dekho</a>\n");
      out.write("      <a href=\"Kerala.html\">Kerala Dekho</a>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Feedback/Complain \n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"Feedback.html\">FeedBack</a>\n");
      out.write("      <a href=\"Complain.html\">Complain</a>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("    <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Packages \n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"Adventure.jsp\">Adventure Packages</a>\n");
      out.write("      <a href=\"PakageBook.html\">Book a Package</a>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Hotels\n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"HotelBook.jsp\">Book a Hotel</a>\n");
      out.write("      <a href=\"PGrates.jsp\">Prices </a>\n");
      out.write("      <a href=\"hotel_faqs.jsp\">FAQs about Hotels</a>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("</div>\n");
      out.write("<HR size=\"3\" align=\"left\" width=\"100%\" color=\"black\">\n");
      out.write("<br><center>\n");
      out.write("<font size=\"5\" color=\"red\" face=\"comic sans ms\">\n");
      out.write("<b>Rates Till December 2020</b></font><br></center>\n");
      out.write("<font size=\"4\" color=\"black\" face=\"comic sans ms\">\n");
      out.write("<BR><B>Guest Houses</B><BR>\n");
      out.write("Room Rates for Guest houses are around Rs. 500/- to Rs. 700 per day. Available for only walk in guests<BR><BR>\n");
      out.write("<B>1 Star Hotel</b><br>\n");
      out.write("Room Rates for One star hotels are around Rs. 900 to 1500 per day. Mostly non A/C Rooms are there<BR><BR>\n");
      out.write("<B>2/3 Star Hotel</B><BR>\n");
      out.write("Business travelers Services discounted room rates and special amenities such as newspaper a piping hot cup of coffee.<BR>\n");
      out.write("Room Rates for 2/3 star hotels are around Rs. 1500 to 3000 per day.<BR><BR>\n");
      out.write("<B>5 star Hotel </B><Br>\n");
      out.write("Room Rates for 5/7 star hotels are around Rs. 3000 to 6000 per day. There will be room service and other room amenities will be there<br><BR>\n");
      out.write("<B> P.G. Accomodation</B><BR>\n");
      out.write("Since P.G Accomodation is mainly for backpackers, family, students. So there is no fixed rates for P.G. Accomodation. It will vary according to your criteria <br><BR>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("</font>\n");
      out.write("<div class=\"slideshow-container\">\n");
      out.write("    <br><br>\n");
      out.write("                    <!--images with number and caption text -->\n");
      out.write("                    <div class=\"mySlides fade\">\n");
      out.write("                        <img src=\"C:\\Users\\Pranay Singhal\\Documents\\pictures\\hotel.jpg\" style=\"width:100%\">\n");
      out.write("                        <div class=\"text\">Guest House</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"mySlides fade\">\n");
      out.write("                        <img src=\"C:\\Users\\Pranay Singhal\\Documents\\pictures\\hotel1.jfif\"  style=\"width:100%\">\n");
      out.write("                        <div class=\"text\">5 Star Hotel </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"mySlides fade\">\n");
      out.write("                        <img src=\"C:\\Users\\Pranay Singhal\\Documents\\pictures\\hotel2.jfif\" style=\"width:100%\">\n");
      out.write("                        <div class=\"text\">3 Star Hotel</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"mySlides fade\">\n");
      out.write("                        <img src=\"C:\\Users\\Pranay Singhal\\Documents\\pictures\\hotel3.jfif\" style=\"width:100%\">\n");
      out.write("                        <div class=\"text\">Guest House</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Next and previous buttons -->\n");
      out.write("                    <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\n");
      out.write("                    <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <!-- The dots -->\n");
      out.write("                <div style=\"text-align:center\">\n");
      out.write("                     <span class=\"dot\" onclick=\"currentSlide(1)\"></span> \n");
      out.write("                     <span class=\"dot\" onclick=\"currentSlide(2)\"></span> \n");
      out.write("                     <span class=\"dot\" onclick=\"currentSlide(3)\"></span> \n");
      out.write("                     <span class=\"dot\" onclick=\"currentSlide(4)\"></span> \n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("<footer>\n");
      out.write("    BEWARE OF FAKE MOBILE CALLS FROM MIDDLEMEN OTHER PERSONS<BR>\n");
      out.write("    PRETENDING TO BE FROM OUR COMPANY<br>\n");
      out.write("    [ Last Update on 7th Feburary, 2020 ]\n");
      out.write("</footer>\n");
      out.write("</BODY>\n");
      out.write(" <script>\n");
      out.write("        var slideIndex = 1;\n");
      out.write("        showSlides(slideIndex);\n");
      out.write("\n");
      out.write("        // Next/previous controls\n");
      out.write("        function plusSlides(n)\n");
      out.write("        {\n");
      out.write("            showSlides(slideIndex += n);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Thumbnail image controls\n");
      out.write("        function currentSlide(n)\n");
      out.write("        {\n");
      out.write("            showSlides(slideIndex = n);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function showSlides(n) \n");
      out.write("        {\n");
      out.write("            var i;\n");
      out.write("            var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("            var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("            if (n > slides.length)\n");
      out.write("                    slideIndex = 1; \n");
      out.write("            if (n < 1) \n");
      out.write("                    slideIndex = slides.length;\n");
      out.write("            for (i = 0; i < slides.length; i++) \n");
      out.write("                    slides[i].style.display = \"none\"; \n");
      out.write("            for (i = 0; i < dots.length; i++)\n");
      out.write("                    dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("            slides[slideIndex-1].style.display = \"block\"; \n");
      out.write("            dots[slideIndex-1].className += \" active\";\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</HTML>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
