
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
  </head>
</head>
<body>

<div class="container" style="padding-top: 50px;">
<table class="table  table-bordered ">
    <tr>
        <th>제목</th>
        <td>${bd.title}</td>
    </tr>
    <tr>
        <th>작성자</th>	
        <td>${bd.writer}</td>
    </tr>
    <tr>
        <th>작성일시</th>
        <td>${bd.regtime}</td>
    </tr>
    <tr>
        <th>조회수</th>
        <td>${bd.hits}</td>
    </tr>
    <tr>
        <th>내용</th>
        <td>${bd.content}</td>
    </tr>
</table>

<br>
<input type="button" value="목록보기" class="btn btn-outline-secondary" onclick="location.href='list.do'">
<input type="button" value="수정" class="btn btn-outline-secondary"
       onclick="location.href='write.jsp?num=${bd.num}'">
<input type="button" value="삭제" class="btn btn-outline-secondary"
       onclick="location.href='delete.jsp?num=${bd.num}'">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>
