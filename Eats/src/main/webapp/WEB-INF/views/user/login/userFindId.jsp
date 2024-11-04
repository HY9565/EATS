<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="form-wrapper">
		<form name="userFindId" action="sendCode" method="post">
			<div class="name-wrapper">
				<input type="text" name="user_name" id="user_name" placeholder="이름을 입력하세요">
			</div>
			<div class="email-wrapper">
				<input type="text" name="user_email" id="user_email" placeholder="이메일을 입력하세요">
				<input type="submit" value="인증번호 발송">
			</div>
		</form>
		<form name="checkCode" action="userCheckCode" method="post">
			<div class="code-wrapper">
				<input type="text" name="user_code" id="user_code" placeholder="인증번호를 입력해주세요">
				<input type="submit" value="인증번호 확인">
			</div>
		</form>
		<div class="button-wrapper">
			<input type="button" value="아이디 찾기">
		</div>
	</div>
</body>
</html>