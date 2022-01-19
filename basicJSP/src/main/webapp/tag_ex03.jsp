<%@page import="java.util.Collections"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- ArrayList를 사용하여 1 ~ 45까지 랜덤한 번호를 생성 -->
<%
	ArrayList<Integer> list = new ArrayList<>();

	Random rand = new Random();
	while(list.size() < 6) {
		int num = rand.nextInt(45) + 1;
		if(!list.contains(num)) {
			list.add(num);
		}
	}
	
	Collections.sort(list);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로또 번호 : <%= list.toString() %>
</body>
</html>