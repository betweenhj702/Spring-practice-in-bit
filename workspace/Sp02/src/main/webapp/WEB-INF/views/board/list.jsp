<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
	<title> Spring Board </title>
	<meta charset="utf-8">
	<style>
		a{text-decoration:none}
	</style>
</head>
<body>
<center>
<font color='gray' size='4' face='휴먼편지체'>
<hr width='600' size='2' color='gray' noshade>
<h3> Spring Board</h3>
<font color='gray' size='4' face='휴먼편지체'>
<a href='../'>인덱스</a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href='write.do'>글쓰기</a><br/>
</font>
<hr width='600' size='2' color='gray' noshade>

<TABLE border='2' width='600' align='center' noshade>
<TR size='2' align='center' noshade bgcolor='AliceBlue'>
	<th bgcolor='AliceBlue'>no</th>
	<th color='gray'>writer</th>
	<th color='gray'>e-mail</th>
	<th color='gray'>subject</th>
	<th color='gray'>date</th>
</TR>
     <c:if test="${empty boardVo.list}">
       <TR align='center' noshade>
          <TD colspan="5">데이터가 없음</TD>
       </TR>
   	</c:if>
	<c:forEach items="${boardVo.list}" var= "board" >
	    <TR align='center' noshade>
			<TD>${board.seq}</TD>
			<TD>${board.writer}</TD>
			<TD>${board.email}</TD>
		    <TD>
		      <a href="content.do?seq=${board.seq}">
			    ${board.subject}
			  </a>
			</TD>
			<TD>${board.rdate}</TD>
		 </TR> 
	</c:forEach>
</TABLE>

<hr width='600' size='2' color='gray' noshade>
<font color='gray' size='3' face='휴먼편지체'>
    (총페이지수 : ${boardVo.totalPageCount})
    &nbsp;&nbsp;&nbsp;
    <c:forEach begin="1" end="${boardVo.totalPageCount}" var= "i">
        <a href="list.do?cp=${i}">
			<c:choose>
               <c:when test="${i==cp}">
                  <strong>${i}</strong>
               </c:when>
	           <c:otherwise>
	              ${i}
	           </c:otherwise>
           </c:choose>
		</a>&nbsp;
    </c:forEach>
    
    ( TOTAL : ${boardVo.totalCount} )
    
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       페이지 싸이즈 : 
    <select id="psId" name="ps" onchange="f(this)">
  		<option value="3" <c:if test="${ps == 3}">selected</c:if> > 3</option>
    	<option value="5" <c:if test="${ps == 5}">selected</c:if> > 5</option>
        <option value="10" <c:if test="${ps == 10}">selected</c:if> > 10</option>
    </select>
    
    <script language="javascript">
       function f(select){
           //var el = document.getElementById("psId");
           var ps = select.value;
           //alert("ps : " + ps);
           location.href="list.do?ps="+ps;
       }
    </script>
    
</font>
<hr width='600' size='2' color='gray' noshade>
    
</center>
</body>
</html>