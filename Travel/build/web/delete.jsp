<%-- 
    Document   : delete
    Created on : 17 Feb, 2020, 11:05:31 PM
    Author     : Pranay Singhal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
   <head>
      <title>DELETE Operation</title>
   </head>
   
   <body>
      <sql:setDataSource var = "pranay" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost/project"
         user = "root" password = "root"/>
 
      <c:set var = "email" value = "1"/>
 
      <sql:update dataSource = "${pranay}" var = "count">
         DELETE FROM hotel WHERE email = ?
         <sql:param value = "${email}" />
      </sql:update>
 
      <sql:query dataSource = "${pranay}" var = "result">
         SELECT * from hotel;
      </sql:query>
 
      <table border = "1" width = "100%" align="center">
         <tr>
             <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Date of Check-In</th>
            <th>Date of Check-Out</th>
            <th>Destination</th>
            <th>No. of rooms</th>
            <th>Type of room</th>
         </tr>
            
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.name}"/></td>
               <td><c:out value = "${row.phone}"/></td>
               <td><c:out value = "${row.email}"/></td>
               <td><c:out value = "${row.sdd}"/>/<c:out value = "${row.smm}"/>/<c:out value = "${row.syy}"/></td>
               <td><c:out value = "${row.ddd}"/>/<c:out value = "${row.dmm}"/>/<c:out value = "${row.dyy}"/></td>
               <td><c:out value = "${row.dest}"/></td>
               <td><c:out value = "${row.room}"/></td>
               <td><c:out value = "${row.r_type}"/></td>
            </tr>
         </c:forEach>
      </table>
   </body>
</html>