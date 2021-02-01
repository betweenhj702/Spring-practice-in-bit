<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html>
	<head>
		<meta charset="UTF-8">
	    <title>Sp03 index</title> 
	</head>
	<body>
		<div style="text-align:center">
		   <!-- 
		   <h1>Sp02 Index</h1>
		   <p>
		     <a href="address/list.do">주소록</a>(with jdbc)<br/>
		     <a href="address1/list.do">주소록1</a>(with mybatis)<br/>
		     <a href="address2/list.do">주소록2</a>(with mybatis - mapper구현내용변경)<br/>
		     
		     <a href="board/list.do">게시판</a>(with mybatis)<br/>
		     <a href="file/list.do">파일리스트</a><br/>
		   </p>
		    -->
		    
		   <h1>Sp03 Index</h1>
		   
		   <h3> Ajax </h3>
		   <a href="ajax/test01.do">Ajax01</a>&nbsp;&nbsp;
		   <a href="ajax/test02.do">Ajax02</a>&nbsp;&nbsp;
		   <a href="ajax/test03.do">Ajax03</a>&nbsp;&nbsp;
		   <a href="ajax/test04.do">Ajax04</a><br/><br/>
		   
		   <h3> RestFul 구축 </h3>
		   <a href="rest/getText">getText</a>&nbsp;&nbsp;
		   <a href="rest/getAddress.xml">getAddress</a>(xml)&nbsp;&nbsp;
		   <a href="rest/getAddress.json">getAddress</a>(json)&nbsp;&nbsp;	
		   <a href="rest/getList.xml">getList</a>(xml)&nbsp;&nbsp;
		   <a href="rest/getList.json">getList</a>(json)&nbsp;&nbsp;
		   <a href="rest/getMap.xml">getMap</a>(xml)&nbsp;&nbsp;
		   <a href="rest/getMap.json">getMap</a>(json)&nbsp;&nbsp;	
		   <br/>
		   
		   <a href="rest/check?height=170&weight=70">check</a>(xml) &nbsp;&nbsp;
		   <a href="rest/check.json?height=140&weight=45">check</a>(json) &nbsp;&nbsp;
		   <br/>
		   
		   <a href="rest/product/bag/001">product/bag/001</a>(xml) &nbsp;&nbsp;	 
		   <a href="rest/product/bag/002.json">product/bag/002.json</a>(json) &nbsp;&nbsp;	
		   <br/> 
		    
		   <a href="ajax/requestbody.do">requestbody.do</a>
		   <br/>
		   
		   <h3> Ajax 응용 </h3>
		   <!-- 
		   <a href="file/form_dd.do">Drag&Drop</a>
		    -->
		   <a href="file/list.do">파일 리스트</a> &nbsp;&nbsp;
		   <a href="chart/chart.do">Google Chart</a> &nbsp;&nbsp;
		   <a href="auto/auto.do">자동완성</a>
		</div>
	</body>
</html>












