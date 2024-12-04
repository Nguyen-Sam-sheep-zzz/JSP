<%@ page import="com.example.baitapweb1true.Tuan2.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<% List<Customer> customers = new ArrayList<>();
    customers.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà nội", "https://th.bing.com/th/id/OIP.gXlmZJ1dYJtEQV2iIfnK8QHaEK?w=251&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
    customers.add(new Customer("Nguyễn Văn Nam", "1983-08-20", "Pắc Giang", "https://th.bing.com/th/id/OIP.gXlmZJ1dYJtEQV2iIfnK8QHaEK?w=251&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
    customers.add(new Customer("Nguyễn Thái Hòa", "1983-08-20", "Hà nội", "https://th.bing.com/th/id/OIP.gXlmZJ1dYJtEQV2iIfnK8QHaEK?w=251&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
    customers.add(new Customer("Trần Đăng Khoa", "1983-08-20", "Thái Bình", "https://th.bing.com/th/id/OIP.gXlmZJ1dYJtEQV2iIfnK8QHaEK?w=251&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
    customers.add(new Customer("Nguyễn Đình Thi", "1983-08-20", "Hà nội", "https://th.bing.com/th/id/OIP.gXlmZJ1dYJtEQV2iIfnK8QHaEK?w=251&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
    request.setAttribute("customers", customers);
%>
<h1>Danh sách khách hàng</h1>
<table border="1">
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.dateOfBirth}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.img}" alt="Customer Image" width="70" height="50"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
