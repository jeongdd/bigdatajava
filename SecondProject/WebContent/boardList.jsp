<%@page import="java.util.ArrayList"%>
<%@page import="music.BoardDTO"%>
<%@page import="music.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<script type="text/javascript">
			$(function() {
				$("#logout").submit(function() {
					$.ajax({
						url : "logout.jsp",
						success : function() {
							alert("로그아웃 되었습니다.");
						}
					});
					return false;
				});
				
				function idAdd(){
					application.
				}
		
			});
		</script>
</head>

<body>
	<%
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardDTO> list = dao.selectAll();
	%>

	<div id="top">
		<div id="title">
			<a href="main.jsp"><img src="images/Title.png"
				style="border-radius: 10px 10px 10px 10px"></a>
		</div>

		<div id="search">
			<form action="">
				<input type="text" id="searchbox"
					style="width: 400px; height: 45px;" placeholder="검색어를 입력해주세요.">
				<button type="submit" class="btn btn-primary btn-lg">검색</button>
			</form>
		</div>

		<div id="login">
			<table>
				<tr>
					<td><img src="images/Camel.png"></td>
					<td width="150px">
						<%
							Object userId = session.getAttribute("InputId");
							if (userId != null) {
						%> <b><%=session.getAttribute("InputId")%></b>님<br>안녕하세요 :)

						<form action="logout.jsp">
							<button type="submit" id="logout" class="btn btn-dark">로그아웃</button>
						</form> <%
 	} else {
 %>

						<form action="login.jsp">
							<button type="submit" id="loginbutton" class="btn btn-info">로그인</button>
						</form> <%
 	}
 %>

					</td>
				</tr>
			</table>
		</div>
	</div>
	<div id="menu">
		<table>
			<ul>
				<li class="menuselect"><a href="">음원차트</a>
				<li class="menuselect"><a href="newmusic.jsp">최신음악</a>
				<li class="menuselect"><a href="">뉴스토픽</a>
				<li class="menuselect"><a href="">에디터추천</a>
				<li class="menuselect"><a href="boardList.jsp">공지사항</a>
			</ul>
		</table>
	</div>
	<hr class="hr">

	<center>
		<div>
			<legend>
				<h4>
					<b>공지사항</b>
				</h4>
			</legend>
		</div>
		<table border="1" boardercolor="#dddddd" width="800">
			<tr align="center">
				<td width="35">N u m</td>
				<td width="200">제 목</td>
				<td width="100">작 성 자</td>
				<td width="150">작 성 일</td>
				<td width="40">조 회 수</td>
			</tr>
			<%
				for (int i = 0; i < list.size(); i++) {
					BoardDTO dto = list.get(i);
			%>
			<tr align="center">
				<td><%=dto.getNum()%></td>
				<td id="view"><a href="boardView.jsp" onclick=""><%=dto.getTitle()%></a></td>
				<td><%=dto.getId()%></td>
				<td><%=dto.getDate()%></td>
				<td></td>
			</tr>
			<%
				}
			%>
		</table>
		<br>
		<form action="adminwrite.jsp">
			<button type="submit" id="write" class="btn btn-secondary">글
				쓰기</button>
		</form>

	</center>


</body>

</html>