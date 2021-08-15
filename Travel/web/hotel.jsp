<%-- 
    Document   : hotel
    Created on : 17 Feb, 2020, 5:46:46 PM
    Author     : Pranay Singhal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page language="java" import="java.sql.*"%>
<%
    String name = request.getParameter("name");
    String phone = request.getParameter("phone");
    String email = request.getParameter("email");
    String type = request.getParameter("type");
    String sdd = request.getParameter("sdd");
    String smm = request.getParameter("smm");
    String syy = request.getParameter("syy");
    String ddd = request.getParameter("ddd");
    String dmm = request.getParameter("dmm");
    String dyy = request.getParameter("dyy");
    String dest = request.getParameter("dest");
    String room = request.getParameter("room");
    String r_type = request.getParameter("r_type");
    String adult = request.getParameter("adult");
    String children = request.getParameter("children");
        
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
        PreparedStatement ps = con.prepareStatement("insert into hotel values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, email);
            ps.setString(4, type);
            ps.setString(5, sdd);
            ps.setString(6, smm);
            ps.setString(7, syy);
            ps.setString(8, ddd);
            ps.setString(9, dmm);
            ps.setString(10, dyy);
            ps.setString(11, dest);
            ps.setString(12, room);
            ps.setString(13, r_type);
            ps.setString(14, adult);
            ps.setString(15, children);

            ps.executeUpdate();
            response.sendRedirect("HotelBook.jsp");
    }
    catch (Exception e) 
    {
        out.println(e);
    } 
%>