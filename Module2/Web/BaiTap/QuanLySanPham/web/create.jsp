<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 5/28/2020
  Time: 8:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Product</title>
</head>
<body>
<form action="/menu" method="post">
<label >ID</label>
<input type="text" name="id"/><br>
<label>Name</label>
<input type="text" name="name"/><br>
<label>Price</label>
<input type="text" name="price"/><br>
<input type="submit" value="create" name="submit"/>
</form>
</body>
</html>
