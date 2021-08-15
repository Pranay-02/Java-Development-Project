<%-- 
    Document   : feedback
    Created on : 13 Feb, 2020, 11:28:31 PM
    Author     : Pranay Singhal
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.sql.*"%>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
    String feed = request.getParameter("feed"); 
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
        PreparedStatement ps = con.prepareStatement("insert into feed values(?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, feed);
            ps.executeUpdate();
            response.sendRedirect("Feedback.html");
    }
    catch (Exception e) 
    {
        out.println(e);
    } 
%>