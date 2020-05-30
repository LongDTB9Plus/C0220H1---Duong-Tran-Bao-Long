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
    <title>Edit Product</title>
</head>
<body>
<table>
    <c:forEach var="product" items="${listProduct}">
        <tr>
            <td><c:out value="${product.getId()}"></c:out></td>
            <td><c:out value="${product.getName()}"></c:out></td>
            <td><c:out value="${product.getPrice()}"></c:out></td>
            <td><input type="submit" name="submit" value="edit"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
