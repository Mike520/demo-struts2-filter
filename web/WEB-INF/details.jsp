<%--
  Created by IntelliJ IDEA.
  User: liwenxiang
  Date: 2016/4/6
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品详情</title>
</head>
<br>
    productId: ${requestScope.product.productId}
    </br>
    productName: ${requestScope.product.productName}
    </br>
    productDesc: ${requestScope.product.productDesc}
    </br>
    productPrice: <fmt:formatNumber value="${requestScope.product.productPrice}" pattern="0.00"/>
    </br>
</body>
</html>
