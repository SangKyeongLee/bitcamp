<%@page import="bitcamp.java106.pms.domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 등록폼</title>
</head>
<body>

<h1>회원 등록</h1>
<form action="add.do" method="post">
아이디: <input type="text" name="id"><br>
이메일: <input type="text" name="email"><br>
비밀번호: <input type="password" name="password"><br>
<button>등록</button>
</form>

</body>
</html>
