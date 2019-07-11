<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>상품 검색 정보입니다.</h2>
		<h3>검색한 상품 목록입니다.</h3>
		<table>
			<tr>
				<td>상품 ID</td>
				<td>상품 이름</td>
				<td>상품 가격</td>
				<td>마일리지</td>
			</tr>
			<tr>
				<td>${productDTO.pId}</td>
				<td>${productDTO.pName}</td>
				<td>${productDTO.price}</td>
				<td>${productDTO.point}</td>
			</tr>
		</table>
	</body>
</html>