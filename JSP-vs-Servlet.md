# JSP vs Servlet

JSP-JavaServer Pages | Servlet
--- | --
View | Controller
Java in HTML | HTML in Java
Directives & Scriptlets | HttpServlet / GenericServlet / Servlet
|  | web.xml / @WebServlet
|  | fast
Easy |
Custom tags |

* JSP can be compiled into Servlets
* JSP may be viewed as a high-level abstraction of Java servlets
* JSPs are translated into servlets at runtime, therefore JSP is a Servlet; each JSP servlet is cached and re-used until the original JSP is modified
* JSP needs a servlet container (Tomcat / Jetty / GlashFish) to run
