import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5907126 {

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws Throwable, ServletException, IOException {
        MyHelperClass CONTENT_ID = new MyHelperClass();
        String contentId = req.getParameter(CONTENT_ID);
        MyHelperClass CONTENT_TYPE = new MyHelperClass();
        String contentType = req.getParameter(CONTENT_TYPE);
        if (contentId == null || contentType == null) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Content id or content type not specified");
            return;
        }
        try {
            MyHelperClass ContentType = new MyHelperClass();
            switch(ContentType.valueOf(contentType)) {
                MyHelperClass IMAGE = new MyHelperClass();
                case IMAGE:
                    resp.setContentType("image/jpeg");
                    break;
                MyHelperClass AUDIO = new MyHelperClass();
                case AUDIO:
                    resp.setContentType("audio/mp3");
                    break;
                MyHelperClass VIDEO = new MyHelperClass();
                case VIDEO:
                    resp.setContentType("video/mpeg");
                    break;
                default:
                    throw new IllegalStateException("Invalid content type specified");
            }
        } catch (IllegalArgumentException e) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid content type specified");
            return;
        }
        MyHelperClass BASE_URL = new MyHelperClass();
        String baseUrl = this.getServletContext().getInitParameter(BASE_URL);
        URL url = new URL(baseUrl + "/" + contentType.toLowerCase() + "/" + contentId);
        URLConnection conn = url.openConnection();
        resp.setContentLength(conn.getContentLength());
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(conn.getInputStream(), resp.getOutputStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletRequest {

}

class HttpServletResponse {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}
