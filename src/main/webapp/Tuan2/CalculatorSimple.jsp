<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate</title>
</head>
<body>
<h2>Product Discount Calculator
</h2>
<form action="calculatorT2" method="get">
    <input type="number" name="inputA" size="30" placeholder="Enter first number"/>/> <br/>
    <select name="calculator" id="calculator1">
        <option value="+">Cộng</option>
        <option value="-">Trừ</option>
        <option value="x">Nhân</option>
        <option value="/">Chia</option>
    </select>
    <br/>
    <input type="number" name="inputB" size="30" placeholder="Enter second number"/>/> <br/>
    <input type="submit" name="operation" value="calculator"/>
</form>
</body>
</html>
