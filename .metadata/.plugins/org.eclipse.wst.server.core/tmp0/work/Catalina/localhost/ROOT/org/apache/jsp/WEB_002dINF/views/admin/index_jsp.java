/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2022-05-18 15:29:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/C:/git/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/project01/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/admin/include/aside.jsp", Long.valueOf(1652887523718L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1647577167351L));
    _jspx_dependants.put("/WEB-INF/views/admin/include/footer.jsp", Long.valueOf(1652887523720L));
    _jspx_dependants.put("/WEB-INF/views/admin/include/nav.jsp", Long.valueOf(1652887523722L));
    _jspx_dependants.put("/WEB-INF/views/admin/include/header.jsp", Long.valueOf(1652887523721L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>포포펫 Admin</title>\r\n");
      out.write("\t\r\n");
      out.write("<script src=\"/resources/jquery/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/bootstrap/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/bootstrap/bootstrap-theme.min.css\">\r\n");
      out.write("<script src=\"/resources/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("<style>\r\n");
      out.write("\tbody { font-family:'맑은 고딕', verdana; padding:0; margin:0; }\r\n");
      out.write("\tul { padding:0; margin:0; list-style:none;  }\r\n");
      out.write(" \r\n");
      out.write("\tdiv#root { width:90%; margin:0 auto; }\r\n");
      out.write("\t\r\n");
      out.write("\theader#header { font-size:60px; padding:20px 0; }\r\n");
      out.write("\theader#header h1 a { color:#000; font-weight:bold; }\r\n");
      out.write("\t\r\n");
      out.write("\tnav#nav { padding:10px; text-align:right; }\r\n");
      out.write("\tnav#nav ul li { display:inline-block; margin-left:10px; }\r\n");
      out.write(" \r\n");
      out.write(" \t\tsection#container { padding:20px 0; border-top:2px solid #eee; border-bottom:2px solid #eee; }\r\n");
      out.write("\tsection#container::after { content:\"\"; display:block; clear:both; }\r\n");
      out.write("\taside { float:left; width:200px; }\r\n");
      out.write("\tdiv#container_box { float:right; width:calc(100% - 200px - 20px); }\r\n");
      out.write("\t\r\n");
      out.write("\taside ul li { text-align:center; margin-bottom:10px; }\r\n");
      out.write("\taside ul li a { display:block; width:100%; padding:10px 0;}\r\n");
      out.write("\taside ul li a:hover { background:#eee; }\r\n");
      out.write("\t\r\n");
      out.write("\tfooter#footer { background:#f9f9f9; padding:20px; }\r\n");
      out.write("\tfooter#footer ul li { display:inline-block; margin-right:10px; } \r\n");
      out.write("</style>\r\n");
      out.write("\t\t \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"root\">\r\n");
      out.write("\t<header id=\"header\">\r\n");
      out.write("\t\t<div id=\"header_box\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1 class=\"title\">\r\n");
      out.write("\t<a href=\"/admin/index\"><img src=\"/resources/AdminLogo.png\" style=\"width:90%; height :200px; margin:0px auto;\"></a>\r\n");
      out.write("</h1>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<nav id=\"nav\">\r\n");
      out.write("\t\t<div id=\"nav_box\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</ul>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t\r\n");
      out.write("\t<section id=\"container\">\r\n");
      out.write("\t\t<aside>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("@font-face {\r\n");
      out.write("    font-family: 'SBAggroL';\r\n");
      out.write("    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2108@1.1/SBAggroL.woff') format('woff');\r\n");
      out.write("    font-weight: normal;\r\n");
      out.write("    font-style: normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#menu {\r\n");
      out.write("\tdisplay:flex;\r\n");
      out.write("\tpadding:10px;\r\n");
      out.write("\tmargin: 0px auto;\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("\tfont-family: 'SBAggroL';\r\n");
      out.write("}\r\n");
      out.write("#menu td{\r\n");
      out.write("\tborder: 3px solid gray;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table id=\"menu\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><a href=\"/admin/shop/insert\">상품 등록</a></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\t\t\r\n");
      out.write("\t\t\t<td><a href=\"/admin/shop/list\">상품 목록</a></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><a href=\"/admin/shop/alltrade\">주문 목록</a></td>\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><a href=\"/admin/user/userlist\">유저 목록</a></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\t\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\t<footer id=\"footer\">\r\n");
      out.write("\t\t<div id=\"footer_box\">\r\n");
      out.write("\t\t\t");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/admin/include/nav.jsp(5,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${manager != null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<li>\r\n");
        out.write("\t\t<a href=\"/\">일반 화면</a>\t\r\n");
        out.write("\t</li>\r\n");
        out.write("\t<li>\r\n");
        out.write("\t\t<a href=\"/user/logout\">LOGOUT</a>\r\n");
        out.write("\t</li>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
