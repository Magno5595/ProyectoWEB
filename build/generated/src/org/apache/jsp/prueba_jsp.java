package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prueba_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_actionmessage_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sx_autocompleter_size_name_list_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_checkbox_name_key_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_submit_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_actionmessage_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sx_autocompleter_size_name_list_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_checkbox_name_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_submit_value_nobody.release();
    _jspx_tagPool_s_actionmessage_nobody.release();
    _jspx_tagPool_s_form_action.release();
    _jspx_tagPool_sx_autocompleter_size_name_list_nobody.release();
    _jspx_tagPool_s_checkbox_name_key_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("        \n");
      out.write("            <label>Examen escritura</label>\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("pruebamandarcombo.action");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_sx_autocompleter_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            \n");
        out.write("            \n");
        out.write("            ");
        if (_jspx_meth_s_checkbox_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_checkbox_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_checkbox_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_checkbox_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            \n");
        out.write("            ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_actionmessage_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_sx_autocompleter_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sx:autocompleter
    org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag _jspx_th_sx_autocompleter_0 = (org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag) _jspx_tagPool_sx_autocompleter_size_name_list_nobody.get(org.apache.struts2.dojo.views.jsp.ui.AutocompleterTag.class);
    _jspx_th_sx_autocompleter_0.setPageContext(_jspx_page_context);
    _jspx_th_sx_autocompleter_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_sx_autocompleter_0.setSize("1");
    _jspx_th_sx_autocompleter_0.setList("lista4");
    _jspx_th_sx_autocompleter_0.setName("examen");
    int _jspx_eval_sx_autocompleter_0 = _jspx_th_sx_autocompleter_0.doStartTag();
    if (_jspx_th_sx_autocompleter_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sx_autocompleter_size_name_list_nobody.reuse(_jspx_th_sx_autocompleter_0);
      return true;
    }
    _jspx_tagPool_sx_autocompleter_size_name_list_nobody.reuse(_jspx_th_sx_autocompleter_0);
    return false;
  }

  private boolean _jspx_meth_s_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_checkbox_0 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _jspx_tagPool_s_checkbox_name_key_nobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_s_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_checkbox_0.setName("si1");
    _jspx_th_s_checkbox_0.setKey("respuesta 1 correcta?");
    int _jspx_eval_s_checkbox_0 = _jspx_th_s_checkbox_0.doStartTag();
    if (_jspx_th_s_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_checkbox_name_key_nobody.reuse(_jspx_th_s_checkbox_0);
      return true;
    }
    _jspx_tagPool_s_checkbox_name_key_nobody.reuse(_jspx_th_s_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_s_checkbox_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_checkbox_1 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _jspx_tagPool_s_checkbox_name_key_nobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_checkbox_1.setPageContext(_jspx_page_context);
    _jspx_th_s_checkbox_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_checkbox_1.setName("si2");
    _jspx_th_s_checkbox_1.setKey("respuesta 2 correcta?");
    int _jspx_eval_s_checkbox_1 = _jspx_th_s_checkbox_1.doStartTag();
    if (_jspx_th_s_checkbox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_checkbox_name_key_nobody.reuse(_jspx_th_s_checkbox_1);
      return true;
    }
    _jspx_tagPool_s_checkbox_name_key_nobody.reuse(_jspx_th_s_checkbox_1);
    return false;
  }

  private boolean _jspx_meth_s_checkbox_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_checkbox_2 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _jspx_tagPool_s_checkbox_name_key_nobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_checkbox_2.setPageContext(_jspx_page_context);
    _jspx_th_s_checkbox_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_checkbox_2.setName("si3");
    _jspx_th_s_checkbox_2.setKey("respuesta 3 correcta?");
    int _jspx_eval_s_checkbox_2 = _jspx_th_s_checkbox_2.doStartTag();
    if (_jspx_th_s_checkbox_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_checkbox_name_key_nobody.reuse(_jspx_th_s_checkbox_2);
      return true;
    }
    _jspx_tagPool_s_checkbox_name_key_nobody.reuse(_jspx_th_s_checkbox_2);
    return false;
  }

  private boolean _jspx_meth_s_checkbox_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_checkbox_3 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _jspx_tagPool_s_checkbox_name_key_nobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_checkbox_3.setPageContext(_jspx_page_context);
    _jspx_th_s_checkbox_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_checkbox_3.setName("si4");
    _jspx_th_s_checkbox_3.setKey("respuesta 4 correcta?");
    int _jspx_eval_s_checkbox_3 = _jspx_th_s_checkbox_3.doStartTag();
    if (_jspx_th_s_checkbox_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_checkbox_name_key_nobody.reuse(_jspx_th_s_checkbox_3);
      return true;
    }
    _jspx_tagPool_s_checkbox_name_key_nobody.reuse(_jspx_th_s_checkbox_3);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setValue("Crear");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }

  private boolean _jspx_meth_s_actionmessage_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionmessage
    org.apache.struts2.views.jsp.ui.ActionMessageTag _jspx_th_s_actionmessage_0 = (org.apache.struts2.views.jsp.ui.ActionMessageTag) _jspx_tagPool_s_actionmessage_nobody.get(org.apache.struts2.views.jsp.ui.ActionMessageTag.class);
    _jspx_th_s_actionmessage_0.setPageContext(_jspx_page_context);
    _jspx_th_s_actionmessage_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    int _jspx_eval_s_actionmessage_0 = _jspx_th_s_actionmessage_0.doStartTag();
    if (_jspx_th_s_actionmessage_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_actionmessage_nobody.reuse(_jspx_th_s_actionmessage_0);
      return true;
    }
    _jspx_tagPool_s_actionmessage_nobody.reuse(_jspx_th_s_actionmessage_0);
    return false;
  }
}
