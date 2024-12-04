<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate</title>
</head>
<body>
<h2>Product Discount Calculator
</h2>
<form action="simpleCalculate" method="get">
    <input type="number" name="inputA" size="30" placeholder="Enter first number"/>/> <br/>
    <input type="number" name="inputB" size="30" placeholder="Enter second number"/>/> <br/>
    <input type="submit" name="operation" value="+"/>
    <input type="submit" name="operation" value="-"/>
    <input type="submit" name="operation" value="x"/>
    <input type="submit" name="operation" value="/"/>
</form>
</body>
</html>
