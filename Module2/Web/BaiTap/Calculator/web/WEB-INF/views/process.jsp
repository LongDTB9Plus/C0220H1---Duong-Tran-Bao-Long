<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form:form action="/calculate" method="post" modelAttribute="number">
    <form:input type="text" name="a" path="number1"/>
    <form:input type="text" name="b" path="number2"/>
    <input type="submit" name="submit" value="+" placeholder="+"/>
    <input type="submit" name="submit" value="-" placeholder="-"/>
    <input type="submit" name="submit" value="*" placeholder="*"/>
    <input type="submit" name="submit" value="/" placeholder="/"/>
    <br>
    <input type="text" name="result" value="${result}"/>
    <h2>${message}</h2>
</form:form>
</body>
</html>
