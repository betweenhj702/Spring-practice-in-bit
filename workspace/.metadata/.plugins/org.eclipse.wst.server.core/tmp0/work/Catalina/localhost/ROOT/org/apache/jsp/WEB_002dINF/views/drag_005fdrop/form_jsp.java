/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.40
 * Generated at: 2021-01-26 03:42:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.drag_005fdrop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>drag_drop</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.dragDropDiv {\r\n");
      out.write("\t\twidth: 650px;\r\n");
      out.write("\t\theight: 300px;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tpadding: 10px 0px 10px 10px;\r\n");
      out.write("\t\tborder: 2px solid green;\r\n");
      out.write("\t}\r\n");
      out.write("\t#tabFileName{\r\n");
      out.write("\t\twidth: 470px;\r\n");
      out.write("\t\ttext-align: left;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#tabFileSize{\r\n");
      out.write("\t\twidth: 70px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#tabFileDel{\r\n");
      out.write("\t\twidth: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\ttable , tr , td{\r\n");
      out.write("\t\tborder: 1px solid black;\r\n");
      out.write("\t\tborder-collapse: collapse;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/map.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/stringBuffer.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t//폼에 데이터를 추가하기 위해 (파일을 전송하기 전 정보 유지)\r\n");
      out.write("\tvar fd = new FormData();\r\n");
      out.write("\t//파일 중복 업로드 방지용 맵을 선언한다.\r\n");
      out.write("\tvar map = new Map();\r\n");
      out.write("\t//submit 버튼을 눌렀을 때 \r\n");
      out.write("\tfunction submitFile(){\r\n");
      out.write("\t\t//추가적으로 보낼 파라미터가 있으면 formData에 넣어준다. \r\n");
      out.write("\t\t//예를들어 , 게시판의 경우 게시글 제목 , 게시글 내용 등등\r\n");
      out.write("\t\tfd.append('temp',$('#temp').val());\r\n");
      out.write("\t\t//ajax로 이루어진 파일 전송 함수를 수행시킨다.\r\n");
      out.write("\t\tsendFileToServer();\r\n");
      out.write("\t}\r\n");
      out.write("\t//파일 전송 함수이다.\r\n");
      out.write("\tvar sendFileToServer = function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\turl : \"fileUpload.do\", //Upload URL\r\n");
      out.write("\t\t\tdata : fd,\r\n");
      out.write("\t\t\tcontentType : false,\r\n");
      out.write("\t\t\tprocessData : false,\r\n");
      out.write("\t\t\tcache : false,\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tif(data) {\r\n");
      out.write("\t\t\t\t\talert('성공');\r\n");
      out.write("\t\t\t\t\tlocation.href=\"list.do\";\r\n");
      out.write("\t\t\t\t}else {\r\n");
      out.write("\t\t\t\t\talert('실패');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction handleFileUpload(files) {\r\n");
      out.write("\t\t//파일의 길이만큼 반복하며 formData에 셋팅해준다.\r\n");
      out.write("\t\tvar megaByte = 1024*1024;\r\n");
      out.write("\t\tfor (var i = 0; i < files.length; i++) {\r\n");
      out.write("\t\t\tif(map.containsValue(files[i].name) == false && (files[i].size/megaByte) <= 20 ){\r\n");
      out.write("\t\t\t\tfd.append(files[i].name, files[i]);\r\n");
      out.write("\t\t\t\t//파일 중복 업로드를 방지하기 위한 설정\r\n");
      out.write("\t\t\t\tmap.put(files[i].name, files[i].name);\r\n");
      out.write("\t\t\t\t// 파일 이름과 정보를 추가해준다.\r\n");
      out.write("\t\t\t\tvar tag = createFile(files[i].name, files[i].size);\r\n");
      out.write("\t\t\t\t$('#fileTable').append(tag);\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t//중복되는 정보 확인 위해 콘솔에 찍음\r\n");
      out.write("\t\t\t\tif((files[i].size/megaByte) > 20){\r\n");
      out.write("\t\t\t\t\talert(files[i].name+\"은(는) \\n 20메가 보다 커서 업로드가 할 수 없습니다.\");\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert('파일 중복 : ' + files[i].name);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\t// 태그 생성\r\n");
      out.write("\tfunction createFile(fileName, fileSize) {\r\n");
      out.write("\t\tvar file = {\r\n");
      out.write("\t\t\t\tname : fileName,\r\n");
      out.write("\t\t\t\tsize : fileSize,\r\n");
      out.write("\t\t\t\tformat : function() {\r\n");
      out.write("\t\t\t\t\tvar sizeKB = this.size / 1024;\r\n");
      out.write("\t\t\t\t\tif (parseInt(sizeKB) > 1024) {\r\n");
      out.write("\t\t\t\t\t\tvar sizeMB = sizeKB / 1024;\r\n");
      out.write("\t\t\t\t\t\tthis.size = sizeMB.toFixed(2) + \" MB\";\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tthis.size = sizeKB.toFixed(2) + \" KB\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t//파일이름이 너무 길면 화면에 표시해주는 이름을 변경해준다.\r\n");
      out.write("\t\t\t\t\tif(name.length > 70){\r\n");
      out.write("\t\t\t\t\t\tthis.name = this.name.substr(0,68)+\"...\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn this;\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\ttag : function() {\r\n");
      out.write("\t\t\t\t\tvar tag = new StringBuffer();\r\n");
      out.write("\t\t\t\t\ttag.append('<tr>');\r\n");
      out.write("\t\t\t\t\ttag.append('<td>'+this.name+'</td>');\r\n");
      out.write("\t\t\t\t\ttag.append('<td>'+this.size+'</td>');\r\n");
      out.write("\t\t\t\t\ttag.append(\"<td><button id='\"+this.name+\"' onclick='delFile(this)'>취소</button></td>\");\r\n");
      out.write("\t\t\t\t\ttag.append('</tr>');\r\n");
      out.write("\t\t\t\t\treturn tag.toString();\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn file.format().tag();\r\n");
      out.write("\t}\r\n");
      out.write("\t//업로드 할 파일을 제거할 때 수행되는 함수\r\n");
      out.write("\tfunction delFile(e) {\r\n");
      out.write("\t\t//선택한 창의 아이디가 파일의 form name이므로 아이디를 받아온다.\r\n");
      out.write("\t\tvar formName = e.id;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//form에서 데이터를 삭제한다.\r\n");
      out.write("\t\tfd.delete(formName);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//맵에서도 올린 파일의 정보를 삭제한다.\r\n");
      out.write("\t\tmap.remove(formName);\r\n");
      out.write("\t\t// tr을 삭제하기 위해\r\n");
      out.write("\t\t$(e).parents('tr').remove();\r\n");
      out.write("\t\talert('삭제 완료!');\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\tvar objDragDrop = $(\".dragDropDiv\");\r\n");
      out.write("\t\t// div 영역으로 드래그 이벤트호출\r\n");
      out.write("\t\t$(\".dragDropDiv\").on(\"dragover\",\r\n");
      out.write("\t\t\tfunction(e) {\r\n");
      out.write("\t\t\t\te.stopPropagation();\r\n");
      out.write("\t\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t\t$(this).css('border', '2px solid red');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t// 해당 파일 드랍시 호출 이벤트\r\n");
      out.write("\t\t$(\".dragDropDiv\").on(\"drop\", function(e) {\r\n");
      out.write("\t\t\t$(this).css('border', '2px solid green');\r\n");
      out.write("\t\t\t//브라우저로 이동되는 이벤트를 방지하고 드랍 이벤트를 우선시 한다.\r\n");
      out.write("\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t//DROP 되는 위치에 들어온 파일 정보를 배열 형태로 받아온다.\r\n");
      out.write("\t\t\tvar files = e.originalEvent.dataTransfer.files;\r\n");
      out.write("\t\t\t//DIV에 DROP 이벤트가 발생 했을 때 다음을 호출한다.\r\n");
      out.write("\t\t\thandleFileUpload(files);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//sendFileToServer(); //테스팅 20200108\r\n");
      out.write("\t\t\t//submitFile(); //테스팅 20200108\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t// div 영역빼고 나머지 영역에 드래그 원래색변경\r\n");
      out.write("\t\t$(document).on('dragover', function(e) {\r\n");
      out.write("\t\t\te.stopPropagation();\r\n");
      out.write("\t\t\te.preventDefault();\r\n");
      out.write("\t\t\tobjDragDrop.css('border', '2px solid green');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <center>\r\n");
      out.write("\t   <h1>Drag&Drop</h1> \r\n");
      out.write("\t   <a href=\"../\">인덱스</a>&nbsp;&nbsp;\r\n");
      out.write("\t   <a href=\"list.do\">리스트</a>\r\n");
      out.write("\t   <br/><br/>\r\n");
      out.write("   \r\n");
      out.write("\t   <div id=\"fileUpload\" class=\"dragDropDiv\">\r\n");
      out.write("\t   \t\t<table id='fileTable'>\r\n");
      out.write("\t   \t\t\t<tr>\r\n");
      out.write("\t\t            <td id='tabFileName'>파일명</td>\r\n");
      out.write("\t\t            <td id='tabFileSize'>사이즈</td>\r\n");
      out.write("\t\t            <td id='tabFileDel'>삭제 </td>\r\n");
      out.write("\t   \t\t\t</tr>\r\n");
      out.write("\t   \t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<input type=\"button\" onclick=\"submitFile()\" value=\"전송\">\r\n");
      out.write("\t\t<input type=\"hidden\" value=\"추가데이터테스트!\" name='temp' id='temp'>\r\n");
      out.write("\t</center>\r\n");
      out.write("</body>\r\n");
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
