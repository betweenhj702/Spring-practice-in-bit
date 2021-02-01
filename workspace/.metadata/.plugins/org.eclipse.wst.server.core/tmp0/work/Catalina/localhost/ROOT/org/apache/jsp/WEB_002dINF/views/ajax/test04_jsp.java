/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.40
 * Generated at: 2021-01-25 03:06:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.ajax;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test04_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t    <meta charset=\"utf-8\"/>\r\n");
      out.write("\t\t<title>Ajax Test03</title>\r\n");
      out.write("\t\t<script type=\"text/javascript\" language=\"javascript\" \r\n");
      out.write("\t\t     src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t   $(function(){\r\n");
      out.write("\t\t\t   $(\"#seq\").on(\"keyup\", function(){\r\n");
      out.write("\t\t\t\t   $.ajax({\r\n");
      out.write("\t\t\t\t\t   url: \"../ajax04/search01.json\", \r\n");
      out.write("\t\t\t\t\t   type: \"GET\",\r\n");
      out.write("\t\t\t\t\t   data: { seq: $(\"#seq\").val()},\r\n");
      out.write("\t\t\t\t\t   success: function(responseData){\r\n");
      out.write("\t\t\t\t\t\t  //var jsObj = JSON.parse(responseData); //jQuery 버젼을 올려서 필요 없음\r\n");
      out.write("                          if(!responseData){\r\n");
      out.write("\t\t\t\t\t\t\t  //alert(\"존재하지 않는 seq 임\");\r\n");
      out.write("\t\t\t\t\t\t\t  return false;\r\n");
      out.write("\t\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\t\t  var html= \"\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"<form id='ajax'>\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"번호 <input name='seq' value='\"+responseData.seq+\"'>\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"이름 <input name='name' value='\"+responseData.name+\"'>\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"주소 <input name='addr' value='\"+responseData.addr+\"'>\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"날짜 <input name='rdate' value='\"+responseData.rdate+\"'>\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"</form>\";\r\n");
      out.write("\t\t\t\t\t\t  $(\"#name\").val(\"\");\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t  $(\"#container\").html(html);\r\n");
      out.write("\t\t\t\t\t   }\r\n");
      out.write("\t\t\t\t   });\r\n");
      out.write("\t\t\t   });\r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\t   $(\"#searchOk02\").on(\"click\", function(){\r\n");
      out.write("\t\t\t\t   $.ajax({\r\n");
      out.write("\t\t\t\t\t   url: \"../ajax04/search02.json\", \r\n");
      out.write("\t\t\t\t\t   type: \"POST\",\r\n");
      out.write("\t\t\t\t\t   data: { name: $(\"#name\").val()},\r\n");
      out.write("\t\t\t\t\t   success: function(responseData){\r\n");
      out.write("\t\t\t\t\t\t  //var jsObj = JSON.parse(responseData); //jQuery 버젼을 올려서 필요 없음\r\n");
      out.write("                          if(!responseData){\r\n");
      out.write("\t\t\t\t\t\t\t  //alert(\"존재하지 않는 name 임\");\r\n");
      out.write("\t\t\t\t\t\t\t  return false;\r\n");
      out.write("\t\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\t\t  var html= \"\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"<table border='1' width='50%'>\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"<tr>\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"<th>번호</th>\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"<th>이름</th>\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"<th>주소</th>\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"<th>날짜</th>\";\r\n");
      out.write("\t\t\t\t\t\t  html += \"</tr>\";\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t  if(responseData.length != 0){\r\n");
      out.write("\t\t\t\t\t\t\t  for(var i=0; i<responseData.length; i++){\r\n");
      out.write("\t\t\t\t\t\t\t\t  html += \"<tr>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t  html += \"<td align='center'>\"+responseData[i].seq+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t  html += \"<td align='center'>\"+responseData[i].name+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t  html += \"<td align='center'>\"+responseData[i].addr+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t  html += \"<td align='center'>\"+responseData[i].rdate+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t  html += \"</tr>\";\r\n");
      out.write("\t\t\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\t\t  }else{\r\n");
      out.write("\t\t\t\t\t\t\t  html += \"<tr>\";\r\n");
      out.write("\t\t\t\t\t\t\t  html += \"<td colspan='4' align='center'>그런 이름을 가진 사람 없음</td>\";\r\n");
      out.write("\t\t\t\t\t\t\t  html += \"</tr>\";\r\n");
      out.write("\t\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\t\t  html += \"</table>\";\r\n");
      out.write("\t\t\t\t\t\t  $(\"#seq\").val(\"\");\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t  $(\"#container\").html(html);\r\n");
      out.write("\t\t\t\t\t   }\r\n");
      out.write("\t\t\t\t   });\r\n");
      out.write("\t\t\t   });\r\n");
      out.write("\t\t   });\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t    <center>\r\n");
      out.write("\t    <h2>(방법4) @RestController</h2>\r\n");
      out.write("\t    \r\n");
      out.write("\t    번호: <input type=\"text\" name=\"seq\" id=\"seq\"/>\r\n");
      out.write("\t    <input type=\"button\" value=\"번호 검색\" id=\"searchOk01\"/>\r\n");
      out.write("\t    <br/>\r\n");
      out.write("\t    \r\n");
      out.write("\t    이름: <input type=\"text\" name=\"name\" id=\"name\"/>\r\n");
      out.write("\t    <input type=\"button\" value=\"이름 검색\" id=\"searchOk02\"/>\r\n");
      out.write("\t \r\n");
      out.write("        <br/><br/>\r\n");
      out.write("\t\t<div id=\"container\"></div>\r\n");
      out.write("\t\t<br/><br/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<a href=\"../\">인덱스</a><br/><br/>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
