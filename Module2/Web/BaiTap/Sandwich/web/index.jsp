<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 6/3/2020
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sandwich Element</title>
  </head>
  <body>

  <form action="/sandwich" method="post">
    <label>Lettuce</label>
    <input type="checkbox" name="ele" value="Lettuce"/>
    <label>Tomato</label>
    <input type="checkbox" name="ele" value="Tomato"/>
    <label>Mustard</label>
    <input type="checkbox" name="ele" value="Mustard"/>
    <label>Sprouts</label>
    <input type="checkbox" name="ele" value="Sprouts"/>
    <br>
    <input type="submit" name="submit"/>
  </form>
  </body>
</html>
