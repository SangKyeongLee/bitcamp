\<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam11</title>
</head>
<body>
<h1>JSTL - c:url</h1>
<pre>
- 특정 식별자로 구분된 문자열을 반복할 때 사용한다.
    &lt;c:url value="URL 문자열"
              var="값을 저장할 때 사용할 이름">
        &lt;c:param name="파라미터명" value="값"/>
        ...
    &lt;/c:url>
</pre>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>값을 포함하고 있는 복잡한 URL 만들기</h2>
<c:url value="http://localhost:8888/java-project/member/add"
       var="url1"
       scope="page">
    <c:param name="id" value="user01"/>
    <c:param name="email" value="user01@test.com"/>
    <c:param name="password" value="1111"/>
</c:url>

<a href="${url1}">회원 등록</a><br>

</body>
</html>





























