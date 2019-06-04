<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>member.jsp</title>
	</head>
	<body>
	<!-- 선언문 : 전역변수를 사용할 수 있는 부분, 메소드 정의  // 거의 사용되지 않음  -->
	<%! 
	
	%>
		<!-- 스크립트릿 : 자바코드가 들어가는 부분.(service() : 기본값)-> 지역변수!  -->
		<!-- 메소드 정의 할 수 없음. 전역변수 사용 불가!  -->
		<% /* 브라우저에서는 보이지 않음  => 처리하는 부분*/
		/* request 객체 */
		/* HttpServletRequest request = new HttpServletRequest(); */
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String tel = request.getParameter("tel");
			String hobby[] = request.getParameterValues("hobby");
			String result = "";
			for(int i = 0; i < hobby.length; i++){
				result = result + hobby[i] + " ";
		 	}
		%>
		<!-- 브라우저에서 보이는 부분 -->
		<h1>딩신이 입력한 정보는 아래와 같습니다.</h1>
		<hr color="blue" size="5">
		ID : <%= id %> <br>
		PW : <%= pw %><br>
		NAME : <%= name %><br>
		TEL : <%= tel %><br>
		HOBBY : <%= result %><br> <!-- 표현식(Expression):변수값 출력, 연산결과, 메소드 호출 반환값  -->
		
	</body>
</html>