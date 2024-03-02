<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<body>
	<div class="container" style="padding-top: 50px">
		<form action="sessionJoin.jsp" method="post">
			<div class="mb-3">
				<label for="idinput" class="form-label">아이디</label> 
				<input type="text" name="id" class="form-control" id="idinput" placeholder="아이디">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">이메일</label>
				<input type="email" name="email" class="form-control"
					id="exampleFormControlInput1" placeholder="name@example.com">
			</div>
			<div class="mb-3">
				<label for="nameinput" class="form-label">이름 </label> 
				<input type="text" name="name" class="form-control" id="nameinput" placeholder="이름">
			</div>
			<button class="btn btn-outline-secondary">등록</button>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>