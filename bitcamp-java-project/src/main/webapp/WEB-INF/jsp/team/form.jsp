<%@page import="bitcamp.java106.pms.domain.Team"%>
<%@ page language="java" 
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 등록폼</title>
</head>
<body>

<h1>팀 등록</h1>
<form action="add" method="post">
이름: <input type="text" name="name"><br>
내용: <textarea name="description" rows="10" cols="60"></textarea><br>
최대인원: <input type="number" name="maxQty"><br>
시작일: <input type="date" name="startDate"><br>
종료일: <input type="date" name="endDate"><br>
<button>등록</button>
</form>

</body>
</html>
    