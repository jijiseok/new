<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>  
<%@ page import="java.time.*" %>
 
<%
    request.setCharacterEncoding("utf-8");

    // 양식에 입력되었던 값 읽기
    int num = Integer.parseInt(request.getParameter("num"));
    String title  = request.getParameter("title" );
    String content   = request.getParameter("content");
    int memberno = Integer.parseInt(request.getParameter("memberno"));
	
    // 빈 칸이 하나라도 있으면 오류 출력하고 종료
    if (num == 0 || title == null || title.length() == 0 ||
    	    content == null || content.length() == 0 ||
    	    memberno == 0) {
%>      
        <script>
            alert('모든 항목이 빈칸 없이 입력되어야 합니다.');
            history.back();
        </script>
<%        



        return;
    }

    String memberId = (String) session.getAttribute("MEMBERID");
    if (memberId == null) {
    	response.sendRedirect("sessionLoginForm.jsp");
    }
    BoardDao dao = BoardDao.getInstance();
    Board board = new Board();
    //Board board = new Board(0, writer, title, content, "", 0);
    /*Board board = new Board();
    board.setWriter(writer);
    board.setTitle(title);
    board.setContent(content);*/
    dao.insert(board);
    // 목록보기 화면으로 돌아감
    response.sendRedirect("list.jsp");
%>     




