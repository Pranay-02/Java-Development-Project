<%-- 
    Document   : lgn
    Created on : 15 Feb, 2020, 1:56:33 PM
    Author     : Pranay Singhal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("upass");
    Class.forName("com.mysql.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root", "root");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from cust where email='" + email + "' and password='" + password + "'");
    if (rs.next()) 
    {
        session.setAttribute("uname", email);
        response.sendRedirect("Logout.jsp");
    } else 
    {
        out.println("Login Failed    <a href='index.html'>Home Page</a>");
    }
%>