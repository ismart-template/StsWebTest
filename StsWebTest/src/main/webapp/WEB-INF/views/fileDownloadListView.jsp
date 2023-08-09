<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일다운로드 뷰</title>
</head>
<body>
    <c:forEach items="${fileList}" var="file">
        <a href="<c:url value='/fileDownload/${file}'/> ">${file} 파일 다운로드</a><br>
    </c:forEach>
</body>
</html>