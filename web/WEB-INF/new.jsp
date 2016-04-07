<%--
  Created by IntelliJ IDEA.
  User: liwenxiang
  Date: 2016/4/6
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=gb2312"  import ="java.util.*"%>

<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt " uri ="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <title>Insert title here</title>

</head>

<body>

<c:set var="todayValue" value="<%=new Date() %>"/>

ÖÐÎÄ£­´óÂ½ :< fmt :setLocale value="zh"/> < fmt :formatDate value="${todayValue}"/><br>

ÖÐÎÄ - Ì¨Íå < fmt :setLocale value="zh_tw"/> < fmt :formatDate value="${todayValue}"/><br>

ÖÐÎÄ - ÐÂ¼ÓÆÂ < fmt :setLocale value="zh_sg"/> < fmt :formatDate value="${todayValue}"/><br>

Ó¢ÎÄ :< fmt :setLocale value="en"/> < fmt :formatDate value="${todayValue}"/>

</body>

</html>