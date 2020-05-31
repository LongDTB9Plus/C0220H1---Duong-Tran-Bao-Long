<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="border-collapse" uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs" %>
<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 5/31/2020
  Time: 8:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<table cellpadding="15" border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Price</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach items='${requestScope["listProduct"]}'  var="product" >
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td><a href="/menu?action=edit&id=${product.getId()}">EDIT</a></td>
            <td><a href='/menu?action=delete&id=${product.getId()}'>DELETE</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
