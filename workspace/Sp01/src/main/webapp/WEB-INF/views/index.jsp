<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<div style="text-align:center">
		   <h1>주제</h1>
		   <p>
		     	<a href="sample/">m01</a>
		      	<a href="sample/base1">m02</a>
		      	<a href="sample/base2">m03</a>
		      	<a href="sample/base3">m04</a>
		      	<a href="sample/form">form</a>
		   </p>
		   <p> 
		     	<a href="sample/param1?name=홍길동&age=24">m05</a>
		      	<a href="sample/param2?name=이순신&age=27">m06</a>
		      	<a href="sample/param3?names=김좌진&names=유관순&names=강감찬">m07</a>
		      	<a href="sample/param4?ns=김좌진&ns=유관순&ns=강감찬">m08</a>
		      	<a href="sample/param5?names=김좌진2&names=유관순2&names=강감찬2">m09</a>
		      	
		      	<!--<a href="sample/param6?list[0].name=홍길동&list[0].age=24&list[1].name=이순신&list[1].age=27">m10</a>-->
		      	<a href="sample/param6?list%5B0%5D.name=홍길동&list%5B0%5D.age=24&list%5B1%5D.name=이순신&list%5B1%5D.age=27">m10</a>
		   		<a href="sample/param7?name=홍길동&age=24&page=10">m11</a>
		   		<a href="sample/param8?subject=데이트&cdate=2021/01/18 17:10:33">m12</a>
		   </p>
		   <p>
		      <a href="sample/json1">m13</a>
		      <a href="sample/json2">m14</a>
		   </p>
		   
		   <P>  The time on the server is ${serverTime}. </P>
		</div>



</body>
</html>
