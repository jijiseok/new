<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>

<%
    // 지정된 글 번호 얻기
    int num = Integer.parseInt(request.getParameter("num")); 

	// 게시글 데이터를 담을 변수 정의
	int    number  = 0;
	String title   = "";
	String content = "";
	String regtime = "";
	int    hits    = 0;
	int   memberno = 0;
	
	String memberId = (String)session.getAttribute("MEMBERID");
	if (memberId == null) {
		response.sendRedirect("sessionLoginForm.jsp");
	}
	BoardDao dao = BoardDao.getInstance();
	Board board = dao.selectOne(num, true);
	
	// 글 데이터를 변수에 저장
    number  = board.getNum();
    title   = board.getTitle();
    content = board.getContent();
    regtime = board.getRegitime();
    hits	= board.getHits();
    memberno= board.getMemberno();
	
	// 글 제목과 내용이 웹 페이지에 올바르게 출력되도록 
    // 공백과 줄 바꿈 처리
    title   = title.replace  (" ", "&nbsp;");
    content = content.replace(" ", "&nbsp;").replace("\n", "<br>");
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
  </head>
<body>
 <div class="container" style="padding-top: 50px;">
<table class="table  table-bordered table-hover">
    <tr>
        <th>제목</th>
        <td><%=title%></td>
    </tr>
        <th>작성일시</th>
        <td><%=regtime%></td>
    </tr>
    <tr>
        <th>조회수</th>
        <td><%=hits%></td>
    </tr>
    <tr>
        <th>내용</th>
        <td><%=content%></td>
    </tr>

</table>

<br>
<input type="button" value="목록보기" class="btn btn-outline-secondary" onclick="location.href='list.jsp'">
<input type="button" value="수정" class="btn btn-outline-secondary"
       onclick="location.href='write.jsp?num=<%=num%>'">
<input type="button" value="삭제" class="btn btn-outline-secondary"
       onclick="location.href='delete.jsp?num=<%=num%>'">
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  </body>
</html>
