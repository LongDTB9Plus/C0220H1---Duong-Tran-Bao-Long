<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Delete Product</title>
</head>
<body>
<form action="/menu" method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>ID:
                    <input type="text" name="id" value="${requestScope["product"].getId()}" disabled="disabled"/>
                </td>
            </tr>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].getName()}</td>
            </tr>
            <tr>
                <td>Price: </td>
                <td>${requestScope["product"].getPrice()}</td>
            </tr>
            <tr>
                <td>Are You Sure About Delete This Product?</td>
                <td><input type="submit" name="submit" value="delete">Yes</td>
                <td><a href="/index.jsp">No</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
