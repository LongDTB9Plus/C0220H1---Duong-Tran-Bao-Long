<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 5/28/2020
  Time: 8:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Menu</title>
  </head>
  <body>
  <h2><c:out value="${message}"></c:out></h2>
  <form action="/menu" method=get >
  <label>Select</label>
  <select name="action">
    <option value="Create">Create</option>
    <option value="Edit">Edit</option>
    <option value="Delete">Delete</option>
    <option value="Show">Show</option>
  </select>
  <input type="submit" value="submit"/>
  </form>
  </body>
</html>
