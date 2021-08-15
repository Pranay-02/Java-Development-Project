package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <HEAD>\n");
      out.write("        <TITLE> Contact Us </TITLE>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("    </HEAD>\n");
      out.write("    <BODY bgcolor=\"white\" text=\"black\" link=\"blue\" vlink=\"red\" alink=\"purple\">\n");
      out.write("        <IMG src=\"G:\\My Pictures\\contact-us[1].jpg\" align=\"left\" height=\"150\" width=\"180\">\n");
      out.write("        <IMG src=\"G:\\My Pictures\\contact%20us[1].jpg\" align=\"right\" height=\"150\" width=\"180\">\n");
      out.write("        <FONT size=\"7\" color=\"green\" face=\"lucida calligraphy\">\n");
      out.write("        <header><CENTER>CONTACT US AT </CENTER></HEADER>\n");
      out.write("    </FONT>\n");
      out.write("    <HR size=\"3\" align=\"left\" width=\"100%\" color=\"black\">\n");
      out.write("    <div class=\"navbar\">\n");
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
      out.write("    <HR size=\"3\" align=\"left\" width=\"100%\" color=\"black\"><br>\n");
      out.write("    <center><B><font size=\"6.5\" color=\"red\" face=\"comic sans ms\">Cox and Kings (I) LTD. OFFICES:\n");
      out.write("            </font></B><br><br></center>\n");
      out.write("    <div class=\"contact\">\n");
      out.write("        <div id=\"lt\" >   \n");
      out.write("    <p align=\"center\">\n");
      out.write("        <font color=\"blue\" face=\"comic sans ms\" size=\"5\"><b>Contact Us At : </b></font><br><br>\n");
      out.write("        <font color=\"purple\" face=\"calibri\"><B><U>MUMBAI :</font><BR>\n");
      out.write("                Tel : </B></U>(022) 2082104/2073066\n");
      out.write("            <B><U><BR> Fax : </U></B>(022) 2073068\n");
      out.write("            <B><U><BR> Email : </U></B>coxnkings_mum@gmail.com\n");
      out.write("    </P><BR>\n");
      out.write("    <p align=\"center\">\n");
      out.write("        <font color=\"purple\" face=\"calibri\"><B><U>DELHI : </font><BR>\n");
      out.write("                Tel : </B></U>(011) 331 0348 / 373 8811<BR>\n");
      out.write("            <B><U> Fax : </U></B>(011)331 7373 / 373 1484\n");
      out.write("               <B><U><BR> Email : </U></B>coxnkings_del@gmail.com\n");
      out.write("        </P><BR>\n");
      out.write("    <p align=\"center\">\n");
      out.write("        <font color=\"purple\" face=\"calibri\"><B><U>GOA : </font><BR>\n");
      out.write("                Tel : </B></U>(0832) 279 047 / 279 886<BR>\n");
      out.write("            <B><U> Fax : </U></B>(0832)279 886\n");
      out.write("            <B><U><BR> Email : </U></B>coxnkings_goa@gmail.com\n");
      out.write("    </P><BR>\n");
      out.write("    <p align=\"center\">\n");
      out.write("        <font color=\"purple\" face=\"calibri\"><B><U>BANGALORE : </font><BR>\n");
      out.write("                Tel : </B></U>(080)227 6021 / 222 4799 / 233 9258<BR>\n");
      out.write("            <B><U>Fax : </U></B>(080)223 8911\n");
      out.write("           <B><U><BR> Email : </U></B>coxnkings_ban@gmail.com\n");
      out.write("    </P><BR>\n");
      out.write("    <p align=\"center\">\n");
      out.write("        <font color=\"purple\" face=\"calibri\"><B><U>PUNE : </font><BR>\n");
      out.write("                Tel : </B></U>(020) 613 5441<BR>\n");
      out.write("            <B><U> Fax : </U></B>(020) 6131 977\n");
      out.write("           <B><U><BR> Email : </U></B>coxnkings_pun@gmail.com\n");
      out.write("    </P><BR><BR>\n");
      out.write("        </DIV>\n");
      out.write("\n");
      out.write("        <div id=\"ct\">\n");
      out.write("            <p align=\"center\">\n");
      out.write("        <font color=\"blue\" face=\"comic sans ms\" size=\"5\"><b>Follow Us At : </b></font><br><br>\n");
      out.write("        <b>Facebook</b><br><br>\n");
      out.write("                    <a href=\"https://www.facebook.com\">\n");
      out.write("                        <img src=\"D:/images/facebook.png\" height=\"50px\" width=\"50px\">\n");
      out.write("                    </a>\n");
      out.write("                    <br><br><br>\n");
      out.write("                    <b>Twitter</b><br><br>\n");
      out.write("                    <a href=\"https://www.twitter.com\">\n");
      out.write("                          <img src=\"D:/images/twitter.png\" height=\"50px\" width=\"50px\">   \n");
      out.write("                    </a>\n");
      out.write("                    <br><br><br>\n");
      out.write("                    <b>Instagram</b><br><br>\n");
      out.write("                    <a href=\"https://www.instagram.com\">\n");
      out.write("                         <img src=\"D:/images/instagram.jpg\" height=\"50px\" width=\"50px\">   \n");
      out.write("                    </a>\n");
      out.write("            </p>   \n");
      out.write("        </div>\n");
      out.write("        <div id=\"rt\">\n");
      out.write("            <p align=\"center\">\n");
      out.write("                 <font color=\"blue\" face=\"comic sans ms\" size=\"5\"><b>Reach Us At : </b></font><br><br>\n");
      out.write("                 <b>Corporate Address : </b><br>\n");
      out.write("                 Kobala Castle Mahim,<br>\n");
      out.write("                 Mumbai - 400016\n");
      out.write("                 <br><br><br>\n");
      out.write("                 <b>Head Office Address : </b><br>\n");
      out.write("                 Deep Market , Ashok Vihar<br>\n");
      out.write("                 Delhi - 110085\n");
      out.write("                 <br><br><br>\n");
      out.write("                 <b>Regional Address : </b><br>\n");
      out.write("                 Vashi , Navi Mumbai <br>\n");
      out.write("                 Mumbai - 400703\n");
      out.write("                 <br><br><br>\n");
      out.write("                 <b>Regional Address : </b><br>\n");
      out.write("                 Anand Rao Circle <br>\n");
      out.write("                 Banglore - 560009\n");
      out.write("                 <br><br><br>\n");
      out.write("                 <b>Regional Address : </b><br>\n");
      out.write("                 New Market , Margao<br>\n");
      out.write("                 Goa - 403601\n");
      out.write("                 <br><br><br>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </DIV>\n");
      out.write("    <footer><marquee>\n");
      out.write("        BEWARE OF FAKE MOBILE CALLS FROM MIDDLEMEN AND OTHER PERSONS\n");
      out.write("        PRETENDING TO BE FROM OUR COMPANY\n");
      out.write("        [ Last Update on 7th Feburary, 2020 ]\n");
      out.write("    </marquee></footer>\n");
      out.write("</BODY>\n");
      out.write("</HTML>\n");
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
