<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
<head>
	<title>LOG OUT</title>
</head>
<body>
<h1>
	Hello Hibiznet !!! LOG OUT
</h1>
<div id="content">
	<form id="frm" name="frm" method="post" action="/login/logoutProcess.do">
		<table id="tbl" style="width:100%;heigth:100%">
			<tr>
				<td>log out </td>
				<td><input type="submit" id="submitBtn" name="submitBtn" value="confirm"/></td>
			</tr>
		</table>
	</form>
</div>
</body>