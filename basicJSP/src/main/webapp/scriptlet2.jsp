<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
  //out.println(), while, break 사용해서 구구단 4단을 출력해 보세요.
  
/*   int i = 4; */
  int j = 1;
  
/*    while(i == 4) {
	  while(j <= 9) {
		  out.println(i + "*" + j + "=" + i*j + "<br>");
		  j++;
	  }
	  break;
  } */ 
  
   out.println("<br>");
   
   j = 1;
   
  while(true) {
	  out.println("4 * " + j + " = " + 4*j + "<br>");
%>
	  -----------------------------------------------<br>
<%
	  j++;
	  if(j == 10) {
		  break;
	  }
  }
  
  %>
  
  <hr>
  for문으로 체크박스 20개 가로로 생성 <br>

<%


for(int i = 1; i <= 20; i++) {
%>	
<input type="checkbox" name="check"> ....
<%
}
%>

</body>
</html>