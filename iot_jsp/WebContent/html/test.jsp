<%@page import="java.util.HashMap"%>
<%@page import="com.google.gson.Gson"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String param = request.getParameter("param");
Gson gs = new Gson();
HashMap hm = gs.fromJson(param, HashMap.class);
hm.put("msg","로그인에 성공하셨습니다.");
if(hm.get("id").equals("test")){
	if(!hm.get("pwd").equals("r1r2")){
		hm.put("msg","비밀번호 확인!");
	}
}else{
	hm.put("msg","아이디를 확인해주세요!");
}
out.println(gs.toJson(hm));

%>