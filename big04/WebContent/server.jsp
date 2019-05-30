<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>CSS8 결과창</title>
		<link rel="stylesheet" 
					type="text/css" href="style2.css"/>
	</head>
	<body>
	<a href="css6.html"><img src="jsp.jpg" width="500" height="150"></a>
		<div id="total">
					<div id="top">
					<ul>
						<li><a href="css1.html">회사소개</a></li>
						<li><a href="css1.html">회사제품</a></li>
						<li><a href="css1.html">게시판</a></li>
						<li><a href="css1.html">회사연락처</a></li>
					</ul>
						</div>
					<div id="top2">
					<ul type="square">
						<li><a href="css1.html">고양이</a></li>
						<li><a href="css1.html">강아지</a></li>
						<li><a href="css1.html">고라니</a></li>
						<li><a href="css1.html">호랑이</a></li>
					</ul>
					</div>
						<div id="content">
						<h2>결과출력 값</h2>
							<center>
							<form action="server.jsp">
								<table border="1" bordercolor="gold">
									<tr>
										<td class="t1">아이디</td>
										<td class="t2">${param.id}</td>
									</tr>
									<tr>
										<td class="t1">패스워드</td>
										<td class="t2">${param.pw}</td>
									</tr>
									<tr>
										<td class="t1">이름</td>
										<td class="t2">${param.name}</td>
									</tr>
									<tr>
										<td class="t1">전화번호</td>
										<td class="t2">${param.tel}</td>
									</tr>
									
								</table>
							</form>
							</center>
					</div>
				</div>
	</body>
</html>