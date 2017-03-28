<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	login() {
		console.log("user :" + document.getElementById("name"));
	}
	
	addAuthHeader() {
		
	}
</script>

</head>
<body>
	<h2>Home Page</h2>

	<form onsubmit="login()">
		User Name : <br/><input type="text" id="name" /><br/><br/>
		Password : <br/><input type="password" id="password" />
		
	</form>
</body>
</html>