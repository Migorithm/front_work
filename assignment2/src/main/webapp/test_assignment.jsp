<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script>
$(function(){
	
	var x = $('p').html()
	alert(x)
	
})



</script>
</head>
<body>
<strong>폼에 입력된 정보를 출력합니다...</strong><br>
<ol>
${param.userName}
</ol>
</body>

</body>
</html>