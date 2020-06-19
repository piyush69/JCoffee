import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12583301 {
public MyHelperClass _;
public MyHelperClass HttpServletResponse;
	public MyHelperClass context;
	public MyHelperClass init;
	public MyHelperClass mainFilter;
	public MyHelperClass lastLoadLog4j;
	public MyHelperClass PropertyConfigurator;

    public void doFilter(final ServletRequest arg0, final ServletResponse arg1, final FilterChain arg2) throws IOException, ServletException {
        if (!(Boolean)(Object)this.init) {
            final HttpServletResponse response =(HttpServletResponse)(Object) _.Cast(arg1);
            response.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Mainfilter not initialized.");
            return;
        }
        if (this.mainFilter != null) {
            try {
                URL url =(URL)(Object) this.context.getResource("/WEB-INF/classes/log4j.properties");
                URLConnection uc = url.openConnection();
                if (uc.getLastModified() != (long)(Object)lastLoadLog4j) {
                    lastLoadLog4j =(MyHelperClass)(Object) uc.getLastModified();
                    try {
                        uc.getInputStream().close();
                    } catch (Exception ignore) {
                    }
                    PropertyConfigurator.configure(url);
                } else {
                    try {
                        uc.getInputStream().close();
                    } catch (Exception ignore) {
                    }
                }
            } catch (final Exception e) {
            }
            this.mainFilter.doFilter(arg0, arg1);
        } else {
            final HttpServletResponse response =(HttpServletResponse)(Object) _.Cast(arg1);
            response.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Mainfilter bad setup.");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_SERVICE_UNAVAILABLE;
public MyHelperClass doFilter(ServletRequest o0, ServletResponse o1){ return null; }
	public MyHelperClass configure(URL o0){ return null; }
	public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass Cast(ServletResponse o0){ return null; }}

class ServletRequest {

}

class ServletResponse {

}

class FilterChain {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class HttpServletResponse {

public MyHelperClass sendError(MyHelperClass o0, String o1){ return null; }}
