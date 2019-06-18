<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Basket</title>
	</head>
	<body>
		<form action="basketAdd.jsp">
			제품 ID : <input type="text" name="pId"><br>
			제품 수량 : <input type="text" name="count"><br>
			제품 가격 : <input type="text" name="price"><br>
			<input type="submit" value="장바구니에 추가"><br>
		</form>
	</body>
</html>