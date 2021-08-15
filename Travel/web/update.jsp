<%-- 
    Document   : update
    Created on : 17 Feb, 2020, 11:11:02 PM
    Author     : Pranay Singhal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
   <head>
      <title>UPDATE Operation</title>
   </head>
   
   <body>
      <sql:setDataSource var = "pranay" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost/project"
         user = "root" password = "root"/>
 
      <sql:update dataSource = "${pranay}" var = "count">
         UPDATE hotel SET phone = 9899206677 WHERE email='pranay@gmail.com';
      </sql:update>
 
      <sql:query dataSource = "${pranay}" var = "result">
         SELECT * from hotel;
      </sql:query>
 
      <table border = "1" width = "100%" align="center">
         <tr>
            <th>Name</th>
            <th>ID</th>
            <th>Email</th>
            <th>Date</th>
            <th>Account</th>
            <th>Gender</th>
            <th>Phone no.</th>
            <th>Amount</th>
         </tr>
            
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.name}"/></td>
               <td><c:out value = "${row.id}"/></td>
               <td><c:out value = "${row.email}"/></td>
               <td><c:out value = "${row.date}"/></td>
               <td><c:out value = "${row.a_type}"/></td>
               <td><c:out value = "${row.gender}"/></td>
               <td><c:out value = "${row.phone}"/></td>
               <td><c:out value = "${row.amount}"/></td>
            
         </c:forEach>
      </table>
 
   </body>
</html>
