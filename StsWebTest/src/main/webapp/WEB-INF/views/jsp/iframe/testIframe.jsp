<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hibiznet-Iframe1</title>
</head>
<body>
<div id="wrap">
	<div id="head">
		<nav>test1</nav>
	</div>
	<div id="body">
		<iframe name="frame1" src="http://dev2.hibiznet.net/test/iframe/process.do?jsessionid=<%=session.getId()%>" width="100%" height="100%"></iframe>
		<%--<iframe name="frame1" src="http://dev1.hibiznet.net/test/iframe/process.do?jsessionid=<%=session.getId()%>" width="100%" height="100%"></iframe>--%>
	</div>
	<div id="footer">
		footer
	</div>
</div>
</body>
</html>