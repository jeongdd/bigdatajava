<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시물 정보</title>
		<link rel="stylesheet" 
				type="text/css" href="basic.css"/>
		<style type="text/css">
			body {
				background: yellow;
				color: blue;
			}
			.h1{
				font-size: 30px;
				color: black;
			}
		</style>
	</head>
	<body>
		<a href="home.html"><img src="logo.png" width="700" height="200"></a>
		<div id=total>
		<div id=top>
			<ul type="none"><!-- 상단메뉴바 -->
				<li><a href="home.html">홈</a></li>
				<li><a href="member.html">회사구성원</a></li>
				<li><a href="product.html">거래품목</a></li>
				<li><a href="board.html">게시글 등록</a></li>
				<li><a href="come.html">오시는길</a></li>
				<li><a href="listen.html">고객의 소리</a></li>
			</ul>
		</div>
		<div id=top2>
			<ul type="none"> <!-- 사이드 메뉴바  -->
				<li><a href="home.html">홈</a></li>
				<li><a href="member.html">회사구성원</a></li>
				<li><a href="product.html">거래품목</a></li>
				<li><a href="board.html">게시글 등록</a></li>
				<li><a href="come.html">오시는길</a></li>
				<li><a href="listen.html">고객의 소리</a></li>
			</ul>
		</div>
		</div>
		<center>
		<%  /* board.html에서 값 받아오기 */
		String title = request.getParameter("title");
		String user = request.getParameter("user");
		String price = request.getParameter("price");
		String pw = request.getParameter("pw");
		String content = request.getParameter("content");
		%>
		<hr color="pink" size="5" width="900">
		<h2>#등록 내용#</h2>   <!-- 받아온 값을 테이블로 갈끔하게 출력 -->
		<table border="2">
			<tr class="h1">
				<td>제목 : </td>
				<td><%= title %></td>
			</tr>
			<tr class="h1">
				<td>작성자 : </td>
				<td><%= user %></td>
			</tr>
			<tr class="h1">
				<td>가격 : </td>
				<td><%= price %></td>
			</tr>
			<tr class="h1">
				<td>비밀번호 : </td>
				<td><%= pw %></td>
			</tr>
			<tr class="h1">
				<td>카테고리 : </td>
				<td>${param.cate}</td>
			</tr>
			<tr class="h1">
				<td>내용 : </td>
				<td><%= content %></td>
			</tr>
		</table>
		
		<hr color="skyblue" size="5" width="900">
		
		<h3>중고나라</h3>
			주소 : 서울특별시 종로구 묘동 돈화문로 26<br>
			연락처 : 02-5151-1545<br>
			회사 이메일 : <a href="mailto:admin@jungo.com">메일 보내기</a>
		</center>
	</body>
</html>