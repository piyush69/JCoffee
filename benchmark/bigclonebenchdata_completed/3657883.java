import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3657883 {
public MyHelperClass Pattern;
	public MyHelperClass IOUtils;
	public MyHelperClass HttpServletResponse;
	public MyHelperClass deny;

//    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws Throwable, IOException {
        String context = request.getContextPath();
        String resource = request.getRequestURI().replace(context, "");
        resource = resource.replaceAll("^/\\w*/", "");
        MyHelperClass StringUtils = new MyHelperClass();
        if ((StringUtils.isEmpty(resource)) || (resource.endsWith("/"))) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        MyHelperClass ClassLoaderUtils = new MyHelperClass();
        URL url = ClassLoaderUtils.getResource(resource);
        if (url == null) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        if ((this.deny != null) && (this.deny.length > 0)) {
            for (String s : this.deny) {
                s = s.trim();
                if (s.indexOf('*') != -1) {
                    s = s.replaceAll("\\*", ".*");
                }
                if (Pattern.matches(s, resource)) {
                    response.setStatus(HttpServletResponse.SC_FORBIDDEN);
                    return;
                }
            }
        }
        InputStream input = url.openStream();
        OutputStream output = response.getOutputStream();
        URLConnection connection = url.openConnection();
        String contentEncoding = connection.getContentEncoding();
        int contentLength = connection.getContentLength();
        String contentType = connection.getContentType();
        if (contentEncoding != null) {
            response.setCharacterEncoding(contentEncoding);
        }
        response.setContentLength(contentLength);
        response.setContentType(contentType);
        IOUtils.copy(input, output, true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletRequest {

}

class HttpServletResponse {

}

class FilterChain {

}
