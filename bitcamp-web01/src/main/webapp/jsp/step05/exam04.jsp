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
<h1>JSTL - c:set</h1>
<pre>
- 값을 저장소에 보관하기
&lt;c:set target="객체" property="프로퍼티명" value="저장할 값"/>
</pre>

<%
Member member = new Member();
pageContext.setAttribute("member", member);
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
id: ${member.id}<br>
email: ${member.email}<br>
password: ${member.password}<br>
<hr>

<c:set target="${member}" property="id" value="user01"/>
<c:set target="${member}" property="email" value="user01@email.com"/>
<c:set target="${member}" property="password" value="1111"/>

id: ${member.id}<br>
email: ${member.email}<br>
password: ${member.password}<br>

</body>
</html>







