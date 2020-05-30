<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 5/22/2020
  Time: 9:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form action="\translate" method="post">
    <input type="text" name="txtSearch" placeholder="Enter Your Word:"/><br/>
    <input type="submit" name="search" value="Search"/>
  </form>
  </body>
</html>
