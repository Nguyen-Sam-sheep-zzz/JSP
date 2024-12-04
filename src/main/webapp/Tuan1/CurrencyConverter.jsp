<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Curency Converter</title>
</head>
<body>
<h2>
    Curency converter
</h2>
<form action="convert" method="get">
    <label>Rate : </label><br/>
    <input type="text" name="rate" placeholder="input rate" value="25000"><br/>
    <label>USD : </label><br/>
    <input type="text" name="usd" placeholder="input usd" value="0"><br/>
    <input type="submit" id="submit" value="Converter"><br/>
</form>
</body>
</html>
