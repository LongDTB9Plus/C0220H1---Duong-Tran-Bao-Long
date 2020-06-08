<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calculate" method="get">
    <input type="text" name="a" value="${A}"/>
    <input type="text" name="b" value="${B}"/>
    <input type="submit" name="submit" value="+" placeholder="+"/>
    <input type="submit" name="submit" value="-" placeholder="-"/>
    <input type="submit" name="submit" value="*" placeholder="*"/>
    <input type="submit" name="submit" value="/" placeholder="/"/>
    <br>
    <input type="text" name="result" value="${result}"/>
</form>
</body>
</html>
