<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>상품 등록 결과입니다.</h1>
		상품 ID : ${productDTO.pId}<br>
		상품이름 : ${productDTO.pName}<br>
		상품가격 : ${productDTO.price}<br>
		마일리지 : ${productDTO.point}<br>
	</body>
</html>