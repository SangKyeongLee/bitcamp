<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam03</title>
</head>
<body>
<h1>JSTL - c:remove</h1>
<pre>
- 저장소에 저장된 객체 제거하기
    &lt;c:remove var="변수명" scope="page|request|session|application"/>
</pre>

<%
Member member = new Member();
member.setId("user01");
member.setEmail("user@test.com");
member.setPassword("1111");
pageContext.setAttribute("member", member);
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

id: ${member.id}<br>
email: ${member.email}<br>
password: ${member.password}<br>
<hr>

<c:remove var="member" scope="page"/>

id: ${member.id}<br>
email: ${member.email}<br>
password: ${member.password}<br>

</body>
</html>







