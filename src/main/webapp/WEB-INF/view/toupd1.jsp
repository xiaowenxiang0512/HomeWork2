<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
   <%@  taglib  prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--日期插件--><script type="text/javascript" src="/resource/My97DatePicker/WdatePicker.js"></script>
<!--bootstrap的css,js -->
<link rel="stylesheet" href="/resource/css/index3.css"/>
<link rel="stylesheet" href="/resource/bootstrap-4.3.1/css/bootstrap.css"/> 
<script type="text/javascript" src="/resource/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="/resource/bootstrap-4.3.1/js/bootstrap.js"></script> 
</head>
<body>
	
	<form action="upd1" method="post">
	<h1>更新投票<input type="text" name="id" value="${item.id}" readonly="readonly"></h1>
	投票项目名:${item.name}<br><br>
	所属主题:<c:if test="${item.topic_id==1}">你公司的项目中使用哪些数据库？</c:if>
		  <c:if test="${item.topic_id==2}">你公司里用的Web层框架是什么？</c:if>
		  <c:if test="${item.topic_id==3}">你公司里用的持久层框架是什么？</c:if>
		  <c:if test="${item.topic_id==4}">你公司使用了哪些页面UI框架？</c:if>
		  <c:if test="${item.topic_id==5}">你公司使用了哪些前端技术？</c:if>
		  <c:if test="${item.topic_id==6}">你公司使用了哪些项目构建工具？</c:if>
		  <br><br>
	投票票数:<input type="text" name="votes" value="${item.votes}">
	<input type="submit" value="更新">
	</form>
</body>
</html>