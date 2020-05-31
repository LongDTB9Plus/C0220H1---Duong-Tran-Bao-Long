<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="border-collapse" uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs" %>
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
    <title>Edit Product</title>
</head>
<body>
<form action="/menu" method="post">
    <fieldset>
        <h1>Product information</h1>
        <table>
            <tr>
                <td>ID:</td>
                <td><input type="text" name="id" value='${requestScope["product"].getId()}'></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" value='${requestScope["product"].getName()}'></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" value='${requestScope["product"].getPrice()}'></td>
            </tr>
            <tr>
                <td>Are You Sure About Edit This Product's Information?</td>
                <td><input type="submit" name="submit" value="edit">Yes</td>
                <td><a href="/index.jsp">No</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
