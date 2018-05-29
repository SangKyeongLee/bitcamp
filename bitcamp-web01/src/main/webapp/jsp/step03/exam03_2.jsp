<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam03_2</title>
</head>
<body>
<h1>JSP 전용 태그:setProperty</h1>
<h2>Member 객체를 만들어 PageContext에 보관하기 + 프로퍼티 값 설정하기</h2>
<jsp:useBean id="member" class="jsp.Member"></jsp:useBean>
<jsp:setProperty property="id" name="member" value="홍길동"/>
<jsp:setProperty property="email" name="member" value="hong@test.com"/>
<jsp:setProperty property="password" name="member" value="1111"/>

아이디: <%=member.getId() %><br>
이메일: <%=member.getEmail()%><br>
암호: <%=member.getPassword()%><br>
<pre>
</pre>
</body>
</html>







