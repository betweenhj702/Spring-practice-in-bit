/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.40
 * Generated at: 2021-01-25 09:35:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class requestbody_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1610939903288L));
    _jspx_dependants.put("jar:file:/C:/Users/bit/Desktop/SDO/Spring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Sp03/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("\r\n");
      out.write("    <input id=\"na\">\r\n");
      out.write("\t<input id=\"ad\">\r\n");
      out.write("\t<input type=\"button\" value=\"주소록 추가\" id=\"insertObj\"/><br/><br/>\r\n");
      out.write("\t<script type=\"text/javascript\" language=\"javascript\" \r\n");
      out.write("\t\t     src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#insertObj\").on(\"click\", function(){\r\n");
      out.write("\t\t   //var obj = new Object();\r\n");
      out.write("\t\t   //obj.name = $(\"#na\").val();\r\n");
      out.write("\t\t   //obj.addr = $(\"#ad\").val();\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t   var obj = {name:$(\"#na\").val(), addr:$(\"#ad\").val()};\r\n");
      out.write("\t\t   var jsonData = JSON.stringify(obj); //jsObj -> json \r\n");
      out.write("\t\t   alert(\"jsonData: \" + jsonData);\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t   $.ajax({\r\n");
      out.write("\t\t\t   url: \"../rest/json_dto.json\", \r\n");
      out.write("\t\t\t   type: \"POST\",\r\n");
      out.write("\t\t\t   contentType: \"application/json\",\r\n");
      out.write("\t\t\t   data: jsonData, \r\n");
      out.write("\t\t\t   success: function(responseData){\r\n");
      out.write("\t\t\t\t   alert(\"responseData.name: \" + responseData.name);\r\n");
      out.write("\t\t\t   }\r\n");
      out.write("\t\t   });\r\n");
      out.write("\t    });\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>");
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
