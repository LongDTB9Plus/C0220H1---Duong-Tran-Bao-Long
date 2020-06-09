<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 5/31/2020
  Time: 7:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Chuyen Doi Tien Te</title>
  </head>
  <body>
  <h1>Chuyen Doi VND -> USD</h1>
  <form action="/chuyendoi" method="post">
      <input type="text" name="usd"/>
      <input type="submit" name="submit"/>
  </form>
  <a href="/TuDien.jsp">Change</a>
  </body>
</html>
