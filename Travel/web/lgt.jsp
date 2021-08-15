<%-- 
    Document   : lgt
    Created on : 15 Feb, 2020, 1:59:38 PM
    Author     : Pranay Singhal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%   session.setAttribute("email", null);
     session.invalidate();
     response.sendRedirect("Login.html");
%>        
