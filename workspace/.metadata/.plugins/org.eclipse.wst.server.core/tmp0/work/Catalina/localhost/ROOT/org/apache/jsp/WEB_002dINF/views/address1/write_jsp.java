/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.40
 * Generated at: 2021-01-21 01:58:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.address1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/bit/Desktop/SDO/Spring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Sp02/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1610939903288L));
  }

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
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<title>Title</title>\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\ttable, th, td {\r\n");
      out.write("\t\t\t   border: 1px solid black;\r\n");
      out.write("\t\t\t   border-collapse: collapse;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tth, td {\r\n");
      out.write("\t\t\t   padding: 5px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\ta { text-decoration:none }\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<script src=\"/js/trim.js\"></script>\r\n");
      out.write("\t\t<script language=\"javascript\"> \r\n");
      out.write("\t\t    function check(){\r\n");
      out.write("\t\t\t\tvar nameval = f.name.value;\r\n");
      out.write("\t\t\t\tnameval = trim(nameval);\r\n");
      out.write("\t\t\t\tif(nameval.length == 0){\r\n");
      out.write("\t\t\t\t\talert(\"이름을 넣어주세요\");\r\n");
      out.write("\t\t\t\t\tf.name.value = \"\";\r\n");
      out.write("\t\t\t\t\tf.name.focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tpass = checkByteLen(nameval, 10);\r\n");
      out.write("\t\t\t\t\tif(!pass){\r\n");
      out.write("\t\t\t\t\t\talert(\"이름이 너무 길어요\");\r\n");
      out.write("\t\t\t\t\t\tf.name.focus();\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar addrval = f.addr.value;\r\n");
      out.write("\t\t\t\taddrval = trim(addrval);\r\n");
      out.write("\t\t\t\tif(addrval.length == 0){\r\n");
      out.write("\t\t\t\t\talert(\"주소를 넣어주세요\");\r\n");
      out.write("\t\t\t\t\tf.addr.value = \"\";\r\n");
      out.write("\t\t\t\t\tf.addr.focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tpass = checkByteLen(addrval, 20);\r\n");
      out.write("\t\t\t\t\tif(!pass){\r\n");
      out.write("\t\t\t\t\t\talert(\"주소가 너무 길어요\");\r\n");
      out.write("\t\t\t\t\t\tf.addr.focus();\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\tf.submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t    function checkByteLen(str, size){\r\n");
      out.write("\t\t        var byteLen = getByteLen(str);\r\n");
      out.write("\t\t\t\tif(byteLen <= size){\r\n");
      out.write("\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction getByteLen(str){\r\n");
      out.write("\t\t\t   return str.replace(/[\\0-\\x7f]|([0-\\u07ff]|(.))/g,\"$&$1$2\").length;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction enterCheck(elm){\r\n");
      out.write("\t\t\t\tif(event.keyCode == 13){\r\n");
      out.write("\t\t\t\t\tif(elm == f.name){\r\n");
      out.write("\t\t\t\t\t\tf.addr.focus();\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tcheck();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body onload=\"document.f.name.focus()\">\r\n");
      out.write("\t<center>\r\n");
      out.write("\t   <h1>\r\n");
      out.write("\t\t\tAddress1 Input with Spring5\r\n");
      out.write("\t   </h1>\r\n");
      out.write("\t   <form name=\"f\" action=\"write.do\" method=\"post\">\r\n");
      out.write("\t\t   <table border=\"1\" width=\"300\" height=\"200\">\r\n");
      out.write("\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t <td width=\"30%\" colspan=\"2\" align=\"center\"><h2>입력폼</h2></td> \r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t <th width=\"30%\">이름</th> \r\n");
      out.write("\t\t\t\t <td><input name=\"name\" align=\"center\" size=\"20\" align=\"center\" onkeydown=\"enterCheck(this)\"></td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t <th width=\"30%\">주소</th> \r\n");
      out.write("\t\t\t\t <td><input name=\"addr\" size=\"20\" align=\"center\" onkeydown=\"enterCheck(this)\"></td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t <td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t <input type=\"button\" value=\"전송\" onclick=\"check()\"/>\r\n");
      out.write("\t\t\t\t\t <input type=\"reset\" value=\"취소\"/>\r\n");
      out.write("\t\t\t\t </td> \r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t   </table>\r\n");
      out.write("\t   </form>\r\n");
      out.write("\t</center>\r\n");
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
