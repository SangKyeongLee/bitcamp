<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>팀 목록(MVC + JSP 전용 태그 + EL + JSTL)</title>
</head>
<body>
<jsp:include page="../header.jsp"/>
<h1>팀 목록(MVC + JSP 전용 태그 + EL + JSTL)</h1>
<p><a href='form'>새 팀 등록</a></p>
<table border='1'>
<tr><th>팀명</th><th>인원</th><th>활동기간</th></tr>
<c:forEach items="${list}" var="team">
    <tr>
       <td><a href='${team.name}'>${team.name}</a></td>
       <td>${team.maxQty}</td>
       <td>${team.startDate} ~ ${team.endDate}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
