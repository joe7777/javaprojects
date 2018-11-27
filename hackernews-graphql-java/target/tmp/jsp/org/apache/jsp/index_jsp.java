/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.6.v20170531
 * Generated at: 2018-11-08 04:37:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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

      out.write("<!--\r\n");
      out.write(" *  Copyright (c) Facebook, Inc.\r\n");
      out.write(" *  All rights reserved.\r\n");
      out.write(" *\r\n");
      out.write(" *  This source code is licensed under the license found in the\r\n");
      out.write(" *  LICENSE file in the root directory of this source tree.\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <style>\r\n");
      out.write("      body {\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        overflow: hidden;\r\n");
      out.write("      }\r\n");
      out.write("      #graphiql {\r\n");
      out.write("        height: 100vh;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <!--\r\n");
      out.write("      This GraphiQL example depends on Promise and fetch, which are available in\r\n");
      out.write("      modern browsers, but can be \"polyfilled\" for older browsers.\r\n");
      out.write("      GraphiQL itself depends on React DOM.\r\n");
      out.write("      If you do not want to rely on a CDN, you can host these files locally or\r\n");
      out.write("      include them directly in your favored resource bunder.\r\n");
      out.write("    -->\r\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/es6-promise/4.0.5/es6-promise.auto.min.js\"></script>\r\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/fetch/0.9.0/fetch.min.js\"></script>\r\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/react/15.4.2/react.min.js\"></script>\r\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/react/15.4.2/react-dom.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--\r\n");
      out.write("      These two files can be found in the npm module, however you may wish to\r\n");
      out.write("      copy them directly into your environment, or perhaps include them in your\r\n");
      out.write("      favored resource bundler.\r\n");
      out.write("     -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//cdn.jsdelivr.net/npm/graphiql@0.11.2/graphiql.css\" />\r\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/npm/graphiql@0.11.2/graphiql.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div id=\"graphiql\">Loading...</div>\r\n");
      out.write("    <script>\r\n");
      out.write("      /**\r\n");
      out.write("       * This GraphiQL example illustrates how to use some of GraphiQL's props\r\n");
      out.write("       * in order to enable reading and updating the URL parameters, making\r\n");
      out.write("       * link sharing of queries a little bit easier.\r\n");
      out.write("       *\r\n");
      out.write("       * This is only one example of this kind of feature, GraphiQL exposes\r\n");
      out.write("       * various React params to enable interesting integrations.\r\n");
      out.write("       */\r\n");
      out.write("      // Parse the search string to get url parameters.\r\n");
      out.write("      var search = window.location.search;\r\n");
      out.write("      var parameters = {};\r\n");
      out.write("      search.substr(1).split('&').forEach(function (entry) {\r\n");
      out.write("        var eq = entry.indexOf('=');\r\n");
      out.write("        if (eq >= 0) {\r\n");
      out.write("          parameters[decodeURIComponent(entry.slice(0, eq))] =\r\n");
      out.write("            decodeURIComponent(entry.slice(eq + 1));\r\n");
      out.write("        }\r\n");
      out.write("      });\r\n");
      out.write("      // if variables was provided, try to format it.\r\n");
      out.write("      if (parameters.variables) {\r\n");
      out.write("        try {\r\n");
      out.write("          parameters.variables =\r\n");
      out.write("            JSON.stringify(JSON.parse(parameters.variables), null, 2);\r\n");
      out.write("        } catch (e) {\r\n");
      out.write("          // Do nothing, we want to display the invalid JSON as a string, rather\r\n");
      out.write("          // than present an error.\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      // When the query and variables string is edited, update the URL bar so\r\n");
      out.write("      // that it can be easily shared\r\n");
      out.write("      function onEditQuery(newQuery) {\r\n");
      out.write("        parameters.query = newQuery;\r\n");
      out.write("        updateURL();\r\n");
      out.write("      }\r\n");
      out.write("      function onEditVariables(newVariables) {\r\n");
      out.write("        parameters.variables = newVariables;\r\n");
      out.write("        updateURL();\r\n");
      out.write("      }\r\n");
      out.write("      function onEditOperationName(newOperationName) {\r\n");
      out.write("        parameters.operationName = newOperationName;\r\n");
      out.write("        updateURL();\r\n");
      out.write("      }\r\n");
      out.write("      function updateURL() {\r\n");
      out.write("        var newSearch = '?' + Object.keys(parameters).filter(function (key) {\r\n");
      out.write("          return Boolean(parameters[key]);\r\n");
      out.write("        }).map(function (key) {\r\n");
      out.write("          return encodeURIComponent(key) + '=' +\r\n");
      out.write("            encodeURIComponent(parameters[key]);\r\n");
      out.write("        }).join('&');\r\n");
      out.write("        history.replaceState(null, null, newSearch);\r\n");
      out.write("      }\r\n");
      out.write("      // Defines a GraphQL fetcher using the fetch API. You're not required to\r\n");
      out.write("      // use fetch, and could instead implement graphQLFetcher however you like,\r\n");
      out.write("      // as long as it returns a Promise or Observable.\r\n");
      out.write("      function graphQLFetcher(graphQLParams) {\r\n");
      out.write("        // This example expects a GraphQL server at the path /graphql.\r\n");
      out.write("        // Change this to point wherever you host your GraphQL server.\r\n");
      out.write("        return fetch('/graphql', {\r\n");
      out.write("          method: 'post',\r\n");
      out.write("          headers: {\r\n");
      out.write("            'Accept': 'application/json',\r\n");
      out.write("            'Content-Type': 'application/json',\r\n");
      out.write("          },\r\n");
      out.write("          body: JSON.stringify(graphQLParams),\r\n");
      out.write("          credentials: 'include',\r\n");
      out.write("        }).then(function (response) {\r\n");
      out.write("          return response.text();\r\n");
      out.write("        }).then(function (responseBody) {\r\n");
      out.write("          try {\r\n");
      out.write("            return JSON.parse(responseBody);\r\n");
      out.write("          } catch (error) {\r\n");
      out.write("            return responseBody;\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("      // Render <GraphiQL /> into the body.\r\n");
      out.write("      // See the README in the top level of this module to learn more about\r\n");
      out.write("      // how you can customize GraphiQL by providing different values or\r\n");
      out.write("      // additional child elements.\r\n");
      out.write("      ReactDOM.render(\r\n");
      out.write("        React.createElement(GraphiQL, {\r\n");
      out.write("          fetcher: graphQLFetcher,\r\n");
      out.write("          query: parameters.query,\r\n");
      out.write("          variables: parameters.variables,\r\n");
      out.write("          operationName: parameters.operationName,\r\n");
      out.write("          onEditQuery: onEditQuery,\r\n");
      out.write("          onEditVariables: onEditVariables,\r\n");
      out.write("          onEditOperationName: onEditOperationName\r\n");
      out.write("        }),\r\n");
      out.write("        document.getElementById('graphiql')\r\n");
      out.write("      );\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
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
