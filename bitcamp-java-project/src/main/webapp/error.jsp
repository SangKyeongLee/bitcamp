<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<meta http-equiv='Refresh' 
      content='5;url=${header.Referer}'>
<title>실행 오류</title>
</head>
<body>
<h1>${requestScope.title}(MVC + JSP 전용태그 + EL)</h1>
<pre>
${requestScope.error}
</pre>
</body>
</html>
