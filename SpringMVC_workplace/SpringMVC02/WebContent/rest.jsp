<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
<script type="text/javascript" src = "http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
	function test(){
		$.ajax({
			 url:"testREST",
			 type:"POST",
			 data:{id : 1001},			 
			 dataType:"json", //返回結果類型
			 success:function(msg){
				 alert(msg);
			 }
		});
	}
</script>
</head>
<body>

	<a href="testREST/1001">測試GET請求</a>
	<br/>
	
	<form action="testREST" method = "POST">
		<input type="hidden" name = "id" value="1001"/>
		<input type="submit" value = "測試POST"/>
	</form>
	
	<br/>
	
	<form action="testREST" method = "POST">
		<input type="hidden" name = "_method" value="PUT"/>
		<input type="submit" value = "測試PUT"/>
	</form>
	
		<br/>
	
	<form action="testREST/1001" method = "POST">
		<input type="hidden" name = "_method" value="DELETE"/>
		<input type="submit" value = "測試DELETE"/>
	</form>
	
	<input type="button" value="測試AJAX" onclick="test()"/>
	
</body>
</html>