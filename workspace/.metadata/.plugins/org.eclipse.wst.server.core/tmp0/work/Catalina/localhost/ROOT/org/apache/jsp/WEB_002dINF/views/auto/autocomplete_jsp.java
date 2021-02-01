/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.40
 * Generated at: 2021-01-26 07:57:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.auto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class autocomplete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css\" />\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.9.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"http://code.jquery.com/ui/1.10.3/jquery-ui.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t//검색할 때 입력한 글자만 진하게 나오는 부분\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.ui.autocomplete.prototype._renderItem = function (ul, item) {\r\n");
      out.write("\t\t\t    item.label = item.label.replace(new RegExp(\"(?![^&;]+;)(?!<[^<>]*)(\" + $.ui.autocomplete.escapeRegex(this.term) + \")(?![^<>]*>)(?![^&;]+;)\", \"gi\"), \"<strong>$1</strong>\");\r\n");
      out.write("\t\t\t    return $(\"<li></li>\")\r\n");
      out.write("\t\t\t            .data(\"item.autocomplete\", item)\r\n");
      out.write("\t\t\t            .append(\"<a>\" + item.label + \"</a>\")\r\n");
      out.write("\t\t\t            .appendTo(ul);\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//input 태그 id가 name\r\n");
      out.write("\t\t    $( \"#name\" ).autocomplete({\r\n");
      out.write("\t\t        source : function( request, response ) {\r\n");
      out.write("\t\t             $.ajax({\r\n");
      out.write("\t\t                    type: 'post',\r\n");
      out.write("\t\t                    url: \"auto_result\",\r\n");
      out.write("\t\t                    dataType: \"json\",\r\n");
      out.write("\t\t                    //request.term = $(\"#autocomplete\").val()\r\n");
      out.write("\t\t                    data: { \"writer\" : $(\"#name\").val()},\r\n");
      out.write("\t\t                    //select * from BOARD where writer like %?%;\r\n");
      out.write("\t\t                    success: function(data) {\r\n");
      out.write("\t\t                        //서버에서 json 데이터 response 후 목록에 뿌려주기 위함\r\n");
      out.write("\t\t                        response(\r\n");
      out.write("\t\t                            $.map(data, function(item) {\r\n");
      out.write("\t\t                            \tconsole.log(item);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t return {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tlabel: item.name+\" \"+item.addr+\" \"+item.rdate,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue: item.name\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t }\t\t                               \r\n");
      out.write("\t\t                            })\r\n");
      out.write("\t\t                        );\r\n");
      out.write("\t\t                    }\r\n");
      out.write("\t\t               });\r\n");
      out.write("\t\t            },\r\n");
      out.write("\t\t        //조회를 위한 최소글자수\r\n");
      out.write("\t\t        minLength: 1,\r\n");
      out.write("\t\t        select: function( event, ui) {\r\n");
      out.write("\t\t            // 만약 검색리스트에서 선택하였을때 선택한 데이터에 의한 이벤트발생\r\n");
      out.write("\t\t        \t  var html= \"하이\";\r\n");
      out.write("\t\t        \t \r\n");
      out.write("\t\t\t\t\t  $(\"#container\").html(html);\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t})\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body onload=\"$('#name').focus()\">\r\n");
      out.write("<center>\r\n");
      out.write("    <h3> 자동완성 주소록 </h3>\r\n");
      out.write("\t<input id=\"name\"><br>\r\n");
      out.write("\t<div id=\"container\"></div>\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
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
