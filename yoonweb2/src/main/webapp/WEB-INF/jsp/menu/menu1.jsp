<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
   <%
	String test1 = (String) session.getAttribute("USER_NM");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

loginSuccess view
test
<h2 id="test1"></h2>
</body>



<link type="text/css" rel="stylesheet"  href="/static/assets/css/login.css">
<script src="/static/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

let initialize = function () {
	
	console.log("Testgere");
	
}


$(function () {
    initialize();
})




</script>
</html>