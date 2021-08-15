<%-- 
    Document   : view_reg
    Created on : 17 Feb, 2020, 11:01:25 PM
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
         SELECT * from cust;
      </sql:query>
 
    <table border = "1" width = "100%" align="center">
         <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Password</th>
            <th>Date</th>
            <th>Gender</th>
            <th>Phone no.</th>
            <th>Country</th>
         </tr>
            
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.name}"/></td>
               <td><c:out value = "${row.email}"/></td>
               <td><c:out value = "${row.password}"/></td>
               <td><c:out value = "${row.date}"/></td>
               <td><c:out value = "${row.gender}"/></td>
               <td><c:out value = "${row.phone}"/></td>
               <td><c:out value = "${row.country}"/></td>
            </tr>
         </c:forEach>
    </table>   
   </body>
</html>
