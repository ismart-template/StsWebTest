<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOG IN</title>
</head>
<body>
	<div id="content">
		<form id="frm" name="frm" method="post" action="/login/loginProcess.do">
			<table id="main">
				<tr>
					<td>아이디 : </td>
					<td>
						${userId}
					</td>			
				</tr>
				<tr>
					<td>이름 : </td>
					<td>
						${userName}
					</td>			
				</tr>
			</table>
		</form>
	</div>
</body>
</html>