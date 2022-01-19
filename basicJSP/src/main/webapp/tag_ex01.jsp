<%@page import="java.util.concurrent.CountDownLatch"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    

<%!
	// 선언자와 스크립트릿의 차이 => 멤버 변수는 전역변수의 성질을 가지면서 전체 어플에 영향을 준다.
	
int total = 0;	
int r;

public int random() {
	Random rand = new Random();
    r = rand.nextInt(100);

    return r;
    }

%>

<% /* 
	  	1. 페이지를 접속할 때마다 랜덤으로 생성된 값을 출력한다(메소드를 사용) :
	     출력 양식 -> 오늘의 숫자 : 랜덤 숫자를 출력
	    2. 페이지 누적요청 숫자를 계산하여 출력
	     출력 양식 -> 페이지 누적요청 : 누적요청 수(int)
	    3. 요청한 페이지 개별요청 숫자를 표시 - 각 페이지가 얼마나 요청됐는지?
	     출력 양식 -> 페이지 개별요청 : 개별요청 수(int)
	*/
	// 페이지가 실행될 때마다 발생하는 코드를 작성
	
	int each = 0;
	
	total++;
	
	each++;
	
	int rn = random();  // 0 ~ 99 사이의 랜덤값 출력
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>오늘의 숫자 : <%= rn %><br>
	페이지 누적요청 : <%= total %><br>
	페이지 개별요청 : <%= each %></p>

</body>
</html>