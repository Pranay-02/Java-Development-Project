<%-- 
    Document   : view_pkg
    Created on : 18 Feb, 2020, 1:16:16 PM
    Author     : Pranay Singhal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
   <head>
      <title>SELECT Operation</title>
   </head>

   <body>
      <sql:setDataSource var = "pranay" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost/project"
         user = "root"  password = "root"/>
 
      <sql:query dataSource = "${pranay}" var = "result">
         SELECT * from package;
      </sql:query>
 
    <table border = "1" width = "100%" align="center">
         <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Package ID</th>
            <th>Date of Check-In</th>
            <th>Source</th>
            <th>Date of Check-Out</th>
         </tr>
            
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.name}"/></td>
               <td><c:out value = "${row.email}"/></td>
               <td><c:out value = "${row.pckgid}"/></td>
               <td><c:out value = "${row.sdd}"/>/&nbsp;<c:out value = "${row.smm}"/>/&nbsp;<c:out value = "${row.syy}"/></td>
               <td><c:out value = "${row.source}"/></td>
               <td><c:out value = "${row.ddd}"/>/&nbsp;<c:out value = "${row.dmm}"/>/&nbsp;<c:out value = "${row.dyy}"/></td>
             </tr>
         </c:forEach>
    </table>   
   </body>
</html>
