<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("user_id");
String pwd = request.getParameter("user_pwd");
String name = request.getParameter("userName");
String msg = "test님 로그인을 성공하셨어요!";
if(id.equals("test")){
	if(!pwd.equals("r1r2")){
		msg="비밀번호를 확인하세요!";
	}
}else{
	msg="아이디가 틀렸습니다.";
}
out.println(msg);
%>
</body>
</html>