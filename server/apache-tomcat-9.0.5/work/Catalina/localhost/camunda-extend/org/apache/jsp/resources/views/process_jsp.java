/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2019-01-26 06:18:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.resources.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class process_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div>\r\n");
      out.write("    <div class=\"templatemo-flex-row flex-content-row\">\r\n");
      out.write("        <div class=\"col-1\">\r\n");
      out.write("            <div class=\"panel panel-default templatemo-content-widget white-bg no-padding templatemo-overflow-hidden\"\r\n");
      out.write("                 style=\"width:100%\">\r\n");
      out.write("                <div class=\"panel-heading templatemo-position-relative row\">\r\n");
      out.write("                    <div class=\"col-md-2\">\r\n");
      out.write("                        <i ng-show=\"prevProcessTab\" class=\"glyphicon glyphicon-circle-arrow-left\" style=\"float: left; font-size: 25px\"\r\n");
      out.write("                           ng-click=\"prevProcessTab(groupProcessID)\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <h2 class=\"text-uppercase\" style=\"text-align : center\">Workspace {{workspace.workspaceName}}</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-6\" ng-click=\"chooseDeployBPMN()\">\r\n");
      out.write("                                <a class=\"templatemo-white-button\"  >DEPLOY BPMN</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6\" ng-click=\"chooseDeployWordpress()\">\r\n");
      out.write("                                <a class=\"templatemo-white-button \">DEPLOY WORDPRESS</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Table Process Group -->\r\n");
      out.write("                <div ng-show=\"flagTab == 'tabGroupProcess'\" class=\"table-responsive\">\r\n");
      out.write("                    <table class=\"table table-striped table-bordered\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>Process Name</th>\r\n");
      out.write("                                <th>Process Key</th>\r\n");
      out.write("                                <th>Resource</th>\r\n");
      out.write("                                <th>Version</th>\r\n");
      out.write("                                <th>Action</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr ng-repeat=\"process in workspace.listProcess\">\r\n");
      out.write("                                <td> {{process.name}}</td>\r\n");
      out.write("                                <td> {{process.key}} </td>\r\n");
      out.write("                                <td> {{process.resource}}</td>\r\n");
      out.write("                                <td> {{process.version}}</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <div class=\"btn-toolbar\">\r\n");
      out.write("                                        <div role=\"group\" class=\"btn-group\">\r\n");
      out.write("                                            <!-- button designs -->\r\n");
      out.write("                                            <button class=\"btn btn-default templatemo-blue-button\" type=\"button\"\r\n");
      out.write("                                                    ng-click=\"desginProcess(process.id)\">\r\n");
      out.write("                                                <i class=\"glyphicon glyphicon-pencil\"></i>\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div role=\"group\" class=\"btn-group\">\r\n");
      out.write("                                            <!-- button review -->\r\n");
      out.write("                                            <button class=\"btn btn-default templatemo-blue-button\" type=\"button\">\r\n");
      out.write("                                                <i class=\"glyphicon glyphicon-film\"></i></button>\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"btn-group\" role=\"group\">\r\n");
      out.write("                                            <!-- button delete -->\r\n");
      out.write("                                            <button class=\"btn btn-default templatemo-blue-button\" type=\"button\"\r\n");
      out.write("                                                    ng-click=\"deleteProcess(process.deploymentId)\">\r\n");
      out.write("                                                <i class=\"glyphicon glyphicon-minus\" style=\"color:red\"></i>\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Table Form Group -->\r\n");
      out.write("                <div ng-show=\"flagTab == 'tabFormProcess'\" class=\"table-responsive\">\r\n");
      out.write("                    <div class=\"templatemo-flex-row\">\r\n");
      out.write("                        <div class=\"templatemo-sidebar\">\r\n");
      out.write("                            <div class=\"mobile-menu-icon\">\r\n");
      out.write("                                <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <nav class=\"templatemo-left-nav\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li ng-repeat=\"definitionService in definitionServices\" data-process-id=\"{{ definitionService.groupProcessID}}\"\r\n");
      out.write("                                        ng-click=\"startService($event)\">\r\n");
      out.write("                                        <a href=\"\"><i class=\"fa fa-home fa-fw\"></i>Process\r\n");
      out.write("                                            {{definitionService.groupProcessID}}</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </nav>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"idmodelChooseDeploy\" class=\"modal modelDialog\">\r\n");
      out.write("\r\n");
      out.write("    <form class=\"modal-content animate\">\r\n");
      out.write("        <div class=\"imgcontainer\">\r\n");
      out.write("            <span onclick=\"document.getElementById('idmodelChooseDeploy').style.display = 'none'\" class=\"close\" title=\"Close Modal\">&times;</span>\r\n");
      out.write("            <!--<img src=\"img_avatar2.png\" alt=\"Avatar\" class=\"avatar\">-->\r\n");
      out.write("            <label class=\"avatar\">Deploy Resources</label>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <label for=\"nameworkspace\"><b>Name Workspace</b></label>\r\n");
      out.write("            <input type=\"text\" ng-model=\"workspace.workspaceName\" name=\"nameworkspace\" required readonly>\r\n");
      out.write("            <label for=\"psw\"><b>Deployment Name</b></label>\r\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Deployment Name\" ng-model=\"deploymentName\" id=\"deploymentName\" name=\"psw\" required>\r\n");
      out.write("            <input type=\"file\"  onchange='selectFile(event)'>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\" >\r\n");
      out.write("            <button type=\"button\" onclick=\"document.getElementById('idmodelChooseDeploy').style.display = 'none'\" class=\"cancelbtn\">Cancel</button>\r\n");
      out.write("            <button type=\"button\" class=\"sucessbtn\" ng-click=\"AddFileBPMNToWorkspace()\">Create</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>");
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
