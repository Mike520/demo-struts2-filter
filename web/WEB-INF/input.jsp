<%--
  Created by IntelliJ IDEA.
  User: liwenxiang
  Date: 2016/3/2
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输入产品</title>
</head>
<body>
<form action="product-save.action" method="post">
    产品名称:<input type="text" name="productName">
    <br><br>
    产品描述:<input type="text" name="productDesc">
    <br><br>
    产品价格:<input type="text" name="productPrice">
    <br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
