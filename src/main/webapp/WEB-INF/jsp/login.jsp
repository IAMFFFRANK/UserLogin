<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action= "login_submit" name="login">
		<h1>用户登录</h1>
		用户名：<input type=text name='username'> <br>
		密码：<input type=password name='password'> <br>
		<input type="submit" name="cmdOK" value="提  交"> &nbsp; 
		<input type="reset" name="cmdCancel" value="重  置">
	</form>
</body>
</html>