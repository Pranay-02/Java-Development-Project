<%-- 
    Document   : package
    Created on : 18 Feb, 2020, 12:02:05 PM
    Author     : Pranay Singhal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page language="java" import="java.sql.*"%>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String id = request.getParameter("pckgid");
    String sdd = request.getParameter("sdd");
    String smm = request.getParameter("smm");
    String syy = request.getParameter("syy");
    String source = request.getParameter("source");
    String ddd = request.getParameter("ddd");
    String dmm = request.getParameter("dmm");
    String dyy = request.getParameter("dyy");
        
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
        PreparedStatement ps = con.prepareStatement("insert into package values(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, id);
            ps.setString(4, sdd);
            ps.setString(5, smm);
            ps.setString(6, syy);
            ps.setString(7,source);
            ps.setString(8, ddd);
            ps.setString(9, dmm);
            ps.setString(10, dyy);

            ps.executeUpdate();
            response.sendRedirect("PakageBook.html");
    }
    catch (Exception e) 
    {
        out.println(e);
    } 
%>