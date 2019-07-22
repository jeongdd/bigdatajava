<%@page import="java.util.List"%>
<%@page import="com.itbank.mvc99.ReplyDTO"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#hi").click(function(){
					var params = $("#re").serialize();
					var id = "아이디 : " + $("#id").val() + "<br>";
					var reply = "댓글 : " + $("#rere").val() + "<hr color=\"skyblue\"size=\"5\">";
					$.ajax({
						url:"insertR",
						data : params,
						success : function(){
							$("#replyAll").append("<img src=\"resources/img/jyp.jpg\" style=\"width: 50px; height: 60px;\">")
							$("#replyAll").append(id) ;
							$("#replyAll").append(reply);
						},
						error: function(xhr, status){
							alret(xhr + " : " + status);
						}
					});
				});
			});
		</script>
	</head>
<body>

	<h1>ID 검색결과 입니다.</h1>
	<hr>
	아이디 : ${dto.id }<br>
	제목 : ${dto.title }<br>
	내용 : ${dto.content }<br> 
	글쓴이 : ${dto.writer }<br>
	<hr style="color: yellowgreen; size: 5px;">
	<h2>댓글</h2>
	<hr style="color: pink; size: 5px;">
	<form action="insertR" id ="re">
		<input type="hidden" name="id" value="${dto.id}" id="id"> 
		댓글 : <input	type="text" name="reply" id="rere">
		<button type="button" id="hi">댓글 등록</button>
	</form>
	<hr style="color: pink; size: 5px;">
	<div id="replyAll">
		<%
			List<ReplyDTO> list = (List<ReplyDTO>)request.getAttribute("listC");
			String InputId = request.getParameter("id");
			for(int i = 0; i < list.size(); i++){
				ReplyDTO dto = list.get(i);
				if(dto.getId().equals(InputId)){
		%>
			<img src="resources/img/jyp.jpg" style="width: 50px; height: 60px;">
			아이디  : <%= dto.getId() %><br>
			댓글 : <%= dto.getReply() %><br>
			<hr color="skyblue" size="5">
			
		<% 
				}
			}
		%>
	</div>
</body>
</html>