<%@ page language="java" 
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>회원 목록</title>
</head>
<body>
<jsp:include page="../header.jsp"/>
<h1>회원 목록</h1>
<p><a href='form.html'>새 회원 추가</a></p>
<table border='1'>
<tr>
    <th>회원명</th><th>이메일</th>
</tr>
<c:forEach items="${list}" var="member">
<tr>
    <td><a href='view.do?id=${member.id}'>${member.id}</a></td>
    <td>${member.email}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
    