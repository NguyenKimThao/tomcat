/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2018-11-01 05:28:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.resources.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

      out.write("<div class=\"templatemo-flex-row\">\r\n");
      out.write("        <div class=\"templatemo-sidebar\">\r\n");
      out.write("            <header class=\"templatemo-site-header\">\r\n");
      out.write("                <div class=\"square\"></div>\r\n");
      out.write("                <h1>Visual Executor</h1>\r\n");
      out.write("            </header>\r\n");
      out.write("            <div class=\"profile-photo-container\">\r\n");
      out.write("                <img src=\"./resources/images/profile-photo.jpg\" alt=\"Profile Photo\" class=\"img-responsive\">\r\n");
      out.write("                <div class=\"profile-photo-overlay\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Search box -->\r\n");
      out.write("            <form class=\"templatemo-search-form\" role=\"search\">\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                    <button type=\"button\" class=\"fa fa-search\"></button>\r\n");
      out.write("                    <input type=\"text\" ng-model=\"searchConstrains\" class=\"form-control\" placeholder=\"Search\" name=\"srch-term\" id=\"srch-term\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"mobile-menu-icon\">\r\n");
      out.write("                <i class=\"fa fa-bars\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav class=\"templatemo-left-nav\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li ng-repeat=\"definition in definitions\" ng-show=\"definition.name.toLowerCase().search(searchConstrains.toLowerCase())>=0\" data-process-id=\"{{ definition.id }}\" ng-click=\"startProcess($event)\">\r\n");
      out.write("                        <a href=\"\"><i class=\"fa fa-home fa-fw\"></i>{{ (definition.name || definition.id) }}</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Main content -->\r\n");
      out.write("        <div class=\"templatemo-content col-1 light-gray-bg\">\r\n");
      out.write("            <div class=\"templatemo-top-nav-container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <nav class=\"templatemo-top-nav col-lg-12 col-md-12\">\r\n");
      out.write("                        <ul class=\"text-uppercase\">\r\n");
      out.write("                            <li><a href=\"\" ng-click=\"showTask()\">History<span ng-show=\"history!=0\" class=\"badge\">{{history}}</span></a></li>\r\n");
      out.write("                            <li><a href=\"\" ng-click=\"showNewTasks()\">Your New task<span ng-show=\"newtasks.length!=0\" class=\"badge\">{{newtasks.length}}</span></a></li>\r\n");
      out.write("                            <li><a href=\"./#/login\">Sign Out</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"templatemo-content-container\">\r\n");
      out.write("                <div ng-show=\"!tableView\" class=\"templatemo-content-widget white-bg\" style=\"display: inline-block; width: 100%\">\r\n");
      out.write("\r\n");
      out.write("                    <h2 class=\"margin-bottom-10\">{{taskName}}</h2>\r\n");
      out.write("                    <div class=\"column right\"></div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div ng-show=\"tableView\" ng-include=\"'./resources/views/session.jsp'\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>");
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
