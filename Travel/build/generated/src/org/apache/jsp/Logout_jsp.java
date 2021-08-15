package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Logout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("<TITLE>Welcome User</TITLE>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("</HEAD>\n");
      out.write("<BODY>\n");
      out.write("<IMG src=\"G:\\My Pictures\\images[63].jpg\" align=\"left\" height=\"150\" width=\"180\">\n");
      out.write("<IMG src=\"G:\\My Pictures\\gate[2].jpg\" align=\"right\" height=\"150\" width=\"180\"><BR>\n");
      out.write("<HEADER><CENTER>BHARAT DEKHO</CENTER></HEADER>\n");
      out.write("<HR size=\"3\" align=\"left\" width=\"100%\" color=\"black\">\n");
      out.write("<UL type=\"disc\">\n");
      out.write("<LI><A href=\"index.html\">Home</A><BR><BR>\n");
      out.write("<LI><A href=\"Contact.jsp\"> Contact us at</A><BR><BR>\n");
      out.write("<LI><A href=\"About_us.jsp\">About us</A><BR><BR>   \n");
      out.write("<LI><A href=\"Kerala.html\"> Kerala Dekho </A><BR><BR>\n");
      out.write("<LI><A href=\"Himachal.html\"> Himachal Dekho </A><BR><BR>\n");
      out.write("<LI><A href=\"Goa.html\"> GoaDekho </A><BR><BR>\n");
      out.write("<LI><A href=\"Complain.html\"> Complain </A><BR><BR>\n");
      out.write("</UL>\n");
      out.write("<HR size=\"3\" align=\"left\" width=\"100%\" color=\"black\">\n");
      out.write("<br>\n");
      out.write("<h1 style=\"margin-left: 30px ; color: crimson\">Welcome user!!!</h1>\n");
      out.write("<div style=\"margin-left: 50px\">\n");
      out.write("    <font size=\"4\">\n");
      out.write("<br><a href=\"HotelBook.jsp\">Book a Hotel</a>\n");
      out.write("<br><a href=\"PGrates.jsp\">See Hotel Rates</a>\n");
      out.write("<br><a href=\"hotel_faqs.jsp\">FAQs about Hotel</a>\n");
      out.write("<br><a href=\"PakageBook.html\">Book a Package</a>\n");
      out.write("<br><a href=\"Adventure.jsp\">Explore Different Adventure Packages</a>\n");
      out.write("<br><br><br>\n");
      out.write("</font>\n");
      out.write("</div>\n");
      out.write("<font size=\"5\" color=\"black\" face=\"comic sans ms\" style=\"margin-left: 40px\">\n");
      out.write("      <a href=\"lgt.jsp\">Logout</a>\n");
      out.write("</font>\n");
      out.write("<br><br><br>\n");
      out.write("<footer>\n");
      out.write("    BEWARE OF FAKE MOBILE CALLS FROM MIDDLEMEN AND OTHER PERSONS<BR>\n");
      out.write("    PRETENDING TO BE FROM OUR COMPANY<br>\n");
      out.write("    [ Last Update on 22th Feburary, 2020 ]\n");
      out.write("</footer>\n");
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
