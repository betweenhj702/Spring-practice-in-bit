/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.40
 * Generated at: 2021-01-27 03:13:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--A Design by W3layouts\r\n");
      out.write("Author: W3layout\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Food Corner a Hotels and Restaurants Category Flat Bootstrap responsive Website Template | Single :: w3layouts</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Food Corner Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!-- bootstrap-css -->\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--// bootstrap-css -->\r\n");
      out.write("<!-- css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--// css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link href=\"css/owl.theme.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- font-awesome icons -->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("<!-- //font-awesome icons -->\r\n");
      out.write("<!-- font -->\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,700italic,700,400italic,300italic,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!-- //font -->\r\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"js/SmoothScroll.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- banner -->\r\n");
      out.write("\t<div class=\"banner about-bg\">\r\n");
      out.write("\t\t<!--header-->\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t<h1><a href=\"index.html\">Food Corner</a></h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"top-nav\">\r\n");
      out.write("\t\t\t\t<span class=\"menu\"><img src=\"images/menu.png\" alt=\"\"/></span>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"about.html\">About</a></li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"menu.html\">Menu</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"codes.html\">Codes</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"blog.html\">Blog</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!-- script-for-menu -->\r\n");
      out.write("\t\t\t\t<script>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"span.menu\").click(function(){\r\n");
      out.write("\t\t\t\t\t\t$(\".top-nav ul\").slideToggle(\"slow\" , function(){\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t<!-- script-for-menu -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t<!--//header-->\r\n");
      out.write("\t\t<div class=\"about-heading\">\r\n");
      out.write("\t\t\t<h2>Single Page</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //banner -->\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"blog\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"agile-blog-grids\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8 agile-blog-grid-left\">\r\n");
      out.write("\t\t\t\t\t<div class=\"agile-blog-grid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"agile-blog-grid-left-img\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/e2.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-left-grids\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"blog-left-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-pencil\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"blog-left-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"blog-left-right-top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Integer et turpis augue. In hac habitasse platea dictumst.</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Posted By <a href=\"#\">Admin</a> &nbsp;&nbsp; on June 2, 2016 &nbsp;&nbsp; <a href=\"#\">Comments (10)</a></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"blog-left-right-bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Vivamus fermentum vel lacus ac ornare. Vestibulum pulvinar massa pharetra risus pharetra, eu blandit risus viverra. Aenean in ultrices enim, ut tincidunt libero. Phasellus libero enim, semper ac felis eget, efficitur ultrices orci. Aenean tincidunt lacus lorem, non varius enim luctus sed. Quisque eu aliquet quam, et sollicitudin nibh. Duis finibus at felis eu laoreet. Nulla non lacus sem.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Curabitur vel elementum tortor, gravida tempor magna. Nullam sit amet lectus at mi dapibus tempus fermentum quis ipsum. Pellentesque rutrum tellus nec dolor suscipit, et bibendum ligula consequat. </span></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"response\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Responses</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media response-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-left response-text-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img class=\"media-object\" src=\"images/t1.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5><a href=\"#\">Admin</a></h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-body response-text-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>June 21, 2016</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"single.html\">Reply</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"media response-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-left response-text-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img class=\"media-object\" src=\"images/t2.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5><a href=\"#\">Admin</a></h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body response-text-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tsed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>June 21, 2016</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"single.html\">Reply</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media response-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-left response-text-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img class=\"media-object\" src=\"images/t3.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5><a href=\"#\">Admin</a></h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-body response-text-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>June 21, 2016</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"single.html\">Reply</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"opinion\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Leave Your Comment</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Name\" placeholder=\"Name\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Email\" placeholder=\"Email\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea name=\"Message\" placeholder=\"Message\" required=\"\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"SEND\">\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 agile-blog-grid-right\">\r\n");
      out.write("\t\t\t\t\t<div class=\"categories\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Categories</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Phasellus sem leo, interdum quis risus</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Nullam egestas nisi id malesuada aliquet </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Donec condimentum purus urna venenatis</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Ut congue, nisl id tincidunt lobor mollis</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Cum sociis natoque penatibus et magnis</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Suspendisse nec magna id ex pretium</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"categories\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Archive</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"marked-list offs1\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">May 2016 (7)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">April 2016 (11)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">March 2016 (12)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">February 2016 (14)</a> </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">January 2016 (10)</a></li>    \r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">December 2016 (12)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">November 2016 (8)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">October 2016 (7)</a> </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">September 2016 (8)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">August 2016 (6)</a></li>                          \r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- footer -->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"agile-footer-grids\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 agile-footer-grid\">\r\n");
      out.write("\t\t\t\t\t<h4>About Food Corner</h4>\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed pellentesque elit sit amet lorem fermentum.<span>Nullam turpis ipsum, dapibus eu congue sit amet.</span></p>\r\n");
      out.write("\t\t\t\t\t<h5>Get In Touch<h5>\r\n");
      out.write("\t\t\t\t\t<div class=\"agileinfo-social-grids\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-rss\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-vk\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 agile-footer-grid\">\r\n");
      out.write("\t\t\t\t\t<h4>Twitter Posts</h4>\r\n");
      out.write("\t\t\t\t\t<ul class=\"w3agile_footer_grid_list\">\r\n");
      out.write("\t\t\t\t\t\t<li>Ut aut reiciendis voluptatibus maiores <a href=\"#\">http://lkj.ewr.com</a> alias, ut aut reiciendis.\r\n");
      out.write("\t\t\t\t\t\t\t<span><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i> 02 days ago</span></li>\r\n");
      out.write("\t\t\t\t\t\t<li>Itaque earum rerum hic tenetur a sapiente delectus <a href=\"#\">http://uiubajaj.com</a> ut aut\r\n");
      out.write("\t\t\t\t\t\t\tvoluptatibus.<span><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i> 03 days ago</span></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 agile-footer-grid\">\r\n");
      out.write("\t\t\t\t\t<h4>Popular Items</h4>\r\n");
      out.write("\t\t\t\t\t<div class=\"popular-grids\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"popular-grid\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/s1.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"popular-grid\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/s2.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"popular-grid\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/s3.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"popular-grids\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"popular-grid\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/s5.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"popular-grid\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/s6.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"popular-grid\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/s7.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 agile-footer-grid\">\r\n");
      out.write("\t\t\t\t\t<h4>Newsletter</h4>\r\n");
      out.write("\t\t\t\t\t<p>Sed pellentesque elit sit amet lorem fermentum, vitae maximus tortor accumsan.</p>\r\n");
      out.write("\t\t\t\t\t<form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"email\" name=\"Email\" placeholder=\"Email\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Subscribe\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //footer -->\r\n");
      out.write("\t<!-- agileits-copyright -->\r\n");
      out.write("\t<div class=\"agileits-copyright\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<p>Â© 2016 Food Corner. All rights reserved | Design by <a href=\"http://w3layouts.com\">W3layouts</a></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //agileits-copyright -->\r\n");
      out.write("</body>\t\r\n");
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
