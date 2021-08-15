package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Adventure_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<TITLE>Adventure Packages</TITLE>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"style1.css\">\n");
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
      out.write("<HR size=\"3\" align=\"left\" width=\"100%\" color=\"black\"><br>\n");
      out.write("<b><center><font size=\"6\" color=\"blue\" face=\"comic sans ms\">\n");
      out.write("Adventure Packages\n");
      out.write("</font></center></b><br>\n");
      out.write("<DIV align=center margin-left=\"30px\" margin-right=\"30px\"> \n");
      out.write("    <FONT face=arial size=4>\n");
      out.write("  <TABLE width=80%>\n");
      out.write("    <TBODY>\n");
      out.write("      <TR> \n");
      out.write("        <TD width=\"50%\">\n");
      out.write("            ID : <B>RR 26 - Rafting</B><BR>\n");
      out.write("          <B>Duration -</B> 2 Nights (Uttar Pradesh)<BR>\n");
      out.write("          <B>Places -</B> Devprayang to Rishikesh on river Ganges<BR>\n");
      out.write("          <B>Season -</B> Oct. - May<BR>\n");
      out.write("          <BR><BR>\n");
      out.write("        </TD>\n");
      out.write("        <TD width=\"50%\">\n");
      out.write("            ID : <B>RR 27 - Rafting</B><BR>\n");
      out.write("          <B>Duration -</B> 2 Nights (Nepal)<BR>\n");
      out.write("          <B>Points -</B> Mugling - Narayanghat (Trishuli River)<BR>\n");
      out.write("          <B>Season -</B> Oct. - June<BR>\n");
      out.write("          <BR><BR>\n");
      out.write("        </TD>\n");
      out.write("      </TR>\n");
      out.write("      <TR> \n");
      out.write("        <TD width=\"50%\">\n");
      out.write("            ID : <B>RR 28 - Camel Safari</B><BR>\n");
      out.write("          <B>Duration -</B> 2-7 Days (Rajasthan)<BR>\n");
      out.write("          <B>Region -</B> Jaisalmer, Bikaner, Khimsar, Osian (Rajasthan)<BR>\n");
      out.write("          <B>Season -</B> Oct. - Mar.<BR>\n");
      out.write("          <BR><BR>\n");
      out.write("          </FONT></TD>\n");
      out.write("        <TD width=\"50%\">\n");
      out.write("           ID : <B>RR 29 - Trekking</B><BR>\n");
      out.write("          <B>Duration -</B> 12 Nights (Ladakh\\Himachal)<BR>\n");
      out.write("          <B>Region -</B> Rupshu Valley (Leh to Manali)<BR>\n");
      out.write("          <B>Season -</B> Jul. mid - Sep.<BR>\n");
      out.write("          <BR><BR>\n");
      out.write("         </TD>\n");
      out.write("      </TR>\n");
      out.write("      <TR> \n");
      out.write("        <TD width=\"50%\">\n");
      out.write("            ID : <B>RR 30 - Trekking</B><BR>\n");
      out.write("          <B>Duration -</B> 10 Nights<BR>\n");
      out.write("          <B>Region -</B> (Ladakh\\Himachal) (Manali to Padum - Zanskar)<BR>\n");
      out.write("          <B>Season -</B> Jul. mid - Sep.<BR>\n");
      out.write("          <BR><BR>\n");
      out.write("        </TD>\n");
      out.write("        <TD width=\"50%\">\n");
      out.write("            ID : <B>RR 31 - Trekking</B><BR>\n");
      out.write("          <B>Duration -</B> 4 Nights (Ladakh)<BR>\n");
      out.write("          <B>Region -</B> Lamayuru to Alchi (Ladakh)<BR>\n");
      out.write("          <B>Season -</B> Jul. mid - Sep.<BR>\n");
      out.write("          <BR><BR>\n");
      out.write("        </TD>\n");
      out.write("      </TR>\n");
      out.write("      <TR> \n");
      out.write("        <TD width=\"50%\">\n");
      out.write("            ID : <B>RR 32 - Trekking</B><BR>\n");
      out.write("          <B>Duration -</B> 8 Nights (Ladakh)<BR>\n");
      out.write("          <B>Region -</B> Markha Valley (Leh to Leh)<BR>\n");
      out.write("          <B>Season -</B> Jun. - Sep.<BR>\n");
      out.write("          <BR><BR>  \n");
      out.write("        </TD>\n");
      out.write("        <TD width=\"50%\">\n");
      out.write("            ID : <B>RR 33 - Trekking</B><BR>\n");
      out.write("          <B>Duration -</B> 7 Nights (Garhwal)<BR>\n");
      out.write("          <B>Area -</B> Valley of Flowers (Delhi to Delhi - trek 3 days only)<BR>\n");
      out.write("          <B>Season -</B> Jul. mid - Oct.<BR>\n");
      out.write("          <BR><BR>\n");
      out.write("         </TD>\n");
      out.write("      </TR>\n");
      out.write("      <TR> \n");
      out.write("        <TD width=\"50%\">\n");
      out.write("            ID : <B>RR 34 - Trekking</B></A><BR>\n");
      out.write("          <B>Duration -</B> 9 Nights (Garhwal)<BR>\n");
      out.write("          <B>Region -</B> Gaumukh/ Tapoban (Delhi to Delhi - trek 5 days only)<BR>\n");
      out.write("          <B>Season -</B> Jun. - Oct.\n");
      out.write("          <BR><BR>\n");
      out.write("        </TD>\n");
      out.write("        <TD width=\"50%\">\n");
      out.write("            ID : <B>RR 35 - Trekking</B></A><BR>\n");
      out.write("          <B>Duration -</B> 12 Nights (Kumaon Hills)<BR>\n");
      out.write("          <B>Places -</B> Pindari Glacier<BR>\n");
      out.write("          <B>Season -</B> May/ June &amp; Sep. mid - Oct.<BR>\n");
      out.write("          <BR><BR>\n");
      out.write("        </TD>\n");
      out.write("      </TR>\n");
      out.write("    </TBODY>\n");
      out.write("  </TABLE>\n");
      out.write("    <button onclick=\"window.location.href = 'PakageBook.html';\">Book a Package</button>\n");
      out.write("</DIV>\n");
      out.write("</font>\n");
      out.write("<br><br>\n");
      out.write("<footer>\n");
      out.write("    BEWARE OF FAKE MOBILE CALLS FROM MIDDLEMEN OTHER PERSONS<BR>\n");
      out.write("    PRETENDING TO BE FROM OUR COMPANY<br>\n");
      out.write("    [ Last Update on 7th Feburary, 2020 ]\n");
      out.write("</footer>\n");
      out.write("</BODY>\n");
      out.write("</HTML>");
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
