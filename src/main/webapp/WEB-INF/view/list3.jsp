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
	
	<h1>你公司里用的持久层框架是什么？</h1>
	
	
	<!-- 列表 -->
<div class="table-responsive-xl">
  <table class="table">
	<tr>
		<td>选项</td>
		<td>小计</td>
		<td>比例</td>
	</tr>  
	<c:forEach items="${list}" var="f">
	<tr>
		<td>${f.name}</td>
		<td>${f.votes}</td>
		<td>
			<!-- 百分比 -->
			<div class="progress" style="width: 500px">
		  		<div class="progress-bar" role="progressbar" style="width: ${f.votes}%;" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>${f.votes}%
			</div>
		</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="10">总计为:</td>
	</tr>
  </table>
</div>
	
</body>
</html>