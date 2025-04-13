<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${todo.todoTitle} 수정 페이지</title>
</head>
<body>
	
	<h4>할 일 수정</h4>
	<%--
		/todo/update - POST 방식 요청
				-> UpdateServlet 클래스에 doPost() 오버라이딩
	 --%>
	<form action="/todo/update" method="post" id="updateForm">
		<div>
			제목 : <input type="text" name="title" value="${todo.todoTitle}">
		</div>
		<div>
			<textarea name="detail" rows="3" cols="50" placeholder="상세 내용..">
				${todo.todoDetail}
			</textarea>
		</div>
		
		<input type="hidden" name="todoNo" value="${param.todoNo}">
		
		<button>수정 완료</button>
	</form>

</body>
</html>