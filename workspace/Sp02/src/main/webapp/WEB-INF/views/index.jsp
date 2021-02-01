<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<div style="text-align:center">
		   <h1>Sp02 index</h1>
		   <p>
		   		<a href="address/list.do">주소록(dao)</a><br/>
		   		<a href="board/list.do">게시판</a><br/>
		   		<a href="address1/list.do">주소록1(mybatis)</a><br/>
		   		<!--  <a href="address2/list.do">주소록2(mapper 구현내용이 틀림, DI 설명을 위해, 일반적인 케이스는 아님)</a><br/> -->
		   		<a href="board1/list.do">게시판1(mybatis)</a><br/>
		   		<a href="file/list.do">파일</a><br/>
		   </p>
		   
		   <P>  The time on the server is ${serverTime}. </P>
		</div>



</body>
</html>
