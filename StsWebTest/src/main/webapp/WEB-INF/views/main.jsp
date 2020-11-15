<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
<head>
	<title>main</title>
</head>
<body>
<h1>
	Hello Hibiznet !!! 
</h1>
<div id="content">
	<table id="tbl" style="width:100%;heigth:100%">
		<tr>
			<td>ID :</td>
			<td>${id}</td>
		</tr>
		<tr>
			<td>name :</td>
			<td>${name}</td>
		</tr>
		<tr>
			<td><a href="/login/logout.do">logout</a></td>
		</tr>	
	</table>
</div>
</body>
