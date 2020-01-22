<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prepare Shop</title>
<link  rel="stylesheet" type="text/css" href="http://localhost:8080/shopprepa/css/commonpage.css">
<link rel="stylesheet" type = "text/css" href="http://localhost:8080/shopprepa/css/mainpage.css">
</head>
<body>
	
	<div class ="header">
		<div class="titlediv"><span class ="title">Prepare Shop</span></div>
		<div class="logindiv"><span class ="login" onclick="http://localhost:8080/shopprepa/login">Login</span></div>
	</div>
	
	<div class="nav">
		<ul>
			<li class="navli"><span class="navspan" id="best">Best</span> 
			<li class="navli"><span class="navspan" id="outer">Outer</span>
			<li class="navli"><span class="navspan" id="top">Top</span>
			<li class="navli"><span class="navspan" id="shirt">Shirt</span>
			<li class="navli"><span class="navspan" id="pants">Pants</span>
			<li class="navli"><span class="navspan" id="suit">Suit</span>
		</ul>
	</div>
	
	<div class="product">
		<ul class="productul">
		<% for(int i=1;i<8;i++){
			%>
			<li class="productli"><img  src="http://localhost:8080/shopprepa/img/outer/outer<%=i%>.png">
			<span class="clothname">패딩</span> <br>
			<span class="clothprice">39000</span>
			</li>
			<%} %>
		</ul>
	</div>
	
</body>
</html>