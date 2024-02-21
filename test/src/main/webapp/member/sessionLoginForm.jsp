<%@ page contentType = "text/html; charset=utf-8" %>
<html>
<head><title>로그인폼</title></head>
<body>

<form action="<%= request.getContextPath() %>/member/sessionLogin.jsp" method="post">
아이디 <input type="text" name="id" size="10">
이름 <input type="text" name="password" size="10">
<input type="submit" value="로그인">
</form>

<form action="login.jsp" method="post"> 
<input type="button" value="회원가입">
</form>

</body>
</html>
