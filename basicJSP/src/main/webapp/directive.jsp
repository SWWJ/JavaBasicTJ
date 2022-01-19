<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<% 
	// ArrayList<String> list = new ArrayList<>(); // <>에 String이 생략된 것
	List<String> list = new ArrayList<>();
	
	list.add("홍길동");
	list.add("홍길자");
	
//	HashMap<Integer, String> map = new HashMap<>();
	Map<Integer, String> map = new HashMap<>();
	
	map.put(1, "홍길동");
	map.put(2, "홍길자");
	
	Random rand = new Random();
	int r = rand.nextInt(10);
	
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
	String now = sdf.format(d);
	
%>	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	리스트의 크기 : <%= list.size() %><br>
	리스트의 형태 : <%= list.toString() %><br>
	<br>
	맵의 크기 : <%= map.size() %><br>
	맵의 형태 : <%= map.toString() %><br>
	<br>
	랜덤 값 : <%= r %><br>
	날짜 : <%= now %><br>
	
</body>
</html>