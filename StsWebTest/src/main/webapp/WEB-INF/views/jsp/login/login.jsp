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
						<input type="text" id="id" name="id" value="lee"/>
						<!--<input type="text" id="id" name="id" value="kim"/>-->
					</td>			
				</tr>
				<tr>
					<td>비밀번호 : </td>
					<td>
						<input type="password" id="password" name="password" value="lee123"/>
						<!--<input type="password" id="password" name="password" value="kim123"/>-->
					</td>			
				</tr>
				<tr>
					<td><input type="submit" id="submitBtn" name="submitBtn" value="confirm"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>