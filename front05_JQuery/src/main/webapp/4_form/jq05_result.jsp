<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script>

	$(function){
	var lst = $('h3:eq(2)').attr(hidden)
	$.each(lst,function(index,item){
		$('body').append("<p>"+item+"</p>")
		
	})
	
}

	}
</script>
</head>
<body>
<B>RESULT PAGE...</B>
<h3>회원님의 아이디는 ${param.id}</h3><br/>
<h3>회원님의 비밀번호는${param.password}</h3><br/>
<h3 hidden='<jsp:element name="hobby"></jsp:element>'></h3>
</body>
</html>