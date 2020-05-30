<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 5/22/2020
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="converter.jsp" method="post">
    <p>
    <label>Product Description: </label>
    <input type="text" name="description" placeholder="Product Description"/><br/>
    </p>
    <p>
    <label>List Price: </label>
    <input type="text" name="price" placeholder="List Price"/><br/>
    </p>
    <p>
    <label>Discount Percent: </label>
    <input type="text" name="discount" placeholder="Discount Percent"/><br/>
    </p>
    <input type="submit" name="Calculate" value="Calculate">
  </form>
  </body>
</html>
