<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%--
    페이지 누적요청 및 랜덤 값을 출력, 매 10번째 방문자에게는 기프티콘을 드립니다.
    10번째마다 "당첨되었습니다"가 출력되게 해보세요.
    scriptlet은 <body> 태그에서 작성
    --%>
    
    <%!
    int total = 0;
    
    public int random() {
    	Random ran = new Random();
    	int r = ran.nextInt(8) + 2;
    	
    	return r;
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	total++;
	
	int rn = random();
	%>
	
	<p>
	페이지 누적 요청 : <%= total %><br>
	매 10번째 방문자에게는 기프티콘을 드립니다.<br>
	
	
	<%
	if(total % 10 == 0) {
		out.println("당첨되었습니다!");
	}
	%>
	</p>
	
	랜덤값 출력 : <%= rn %><br>
	<h4>랜덤 구구단 <%= rn %>단 입니다.</h4>
	
	<%
		for(int i = 1; i <= 9; i++) {
			int re = rn*i;
	%>
	<%= rn %> x <%= i %> = <%= re %><br>
	<%
	}
	%>
	
</body>
</html>