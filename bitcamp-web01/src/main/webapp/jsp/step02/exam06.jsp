<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Date"
    import="java.net.Socket"
    import="java.net.ServerSocket,java.io.File"
    trimDirectiveWhitespaces="true"
    buffer="1kb"
    autoFlush="true"%>
<%@ page import="java.io.FileReader" %>
<%@ page import="java.io.FileWriter" %>
<%@ page import="java.io.FileInputStream, java.io.FileOutputStream" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam06</title>
</head>
<body>
<h1>지시문(directive element)</h1> 
<pre>
[지시문]
- 지시문의 특성에 따라 적절한 자바 코드를 생성한다.
    
[JSP 코드]
 &lt;%@ page 속성명="값" %>

[language 속성]
- 스크립트릿이나 표현식, 선언문 등의 태그 안에 코드를 작성할 때 사용할 언어를 지정한다.
- 현재는 java 언어만 가능하다.
- JSP를 만들 당시에는 JSP 페이지를 작성할 때 Java 언어 외에 다른 언어를 사용할 것을 대비해서 
  language라는 속성을 만들었다.
- 초창기에는 JSP 페이지에 다른 언어를 삽입하려는 여러 시도가 있었다.
    지금은 Java만 넣는다.
- 그래서 language 속성의 값으로는 "java"만 가능하다!
    생략해도 된다.

[contentType 속성]
- response.setContentType() 코드를 만든다.

[pageEncoding 속성]
- JSP 페이지를 저장할 때 사용한 문자표(character set)을 지정한다.
- JSP 엔진이 JSP 파일을 읽을 때 어떤 문자표를 사용하여 읽어야 하는지 결정하게 된다.
- 보통 에디터는 이 속성을 참고하여 JSP 파일을 해당 문자표를 사용하여 저장한다.
- 생략해도 된다.

[import 속성]
- 자바 import 문을 생성한다.

[trimDirectiveWhitespaces]
- 지시문 사이의 있는 공백(white space; 스페이스, 탭, 줄바꿈)
</pre>

</body>
</html>


















