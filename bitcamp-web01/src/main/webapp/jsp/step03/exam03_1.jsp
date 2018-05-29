<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam01</title>
</head>
<body>
<h1>PageContext에서 ArrayList객체 꺼내기</h1>
<jsp:useBean id="list" class="java.util.ArrayList" scope="page"></jsp:useBean>
<%=list.size() %>

<h2>Member 객체를 만들어 PageContext에 보관하기</h2>
<jsp:useBean id="member" class="jsp.Member"></jsp:useBean>
아이디: <%=member.getId() %><br>
이메일: <%=member.getEmail()%><br>
암호: <%=member.getPassword()%><br>
<pre>
</pre>
</body>
</html>







