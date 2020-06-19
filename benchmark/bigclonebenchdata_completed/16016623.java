import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16016623 {
public MyHelperClass logger;
	public MyHelperClass IOUtils;
	public MyHelperClass getServletContext(){ return null; }

//    @Override
    protected ModelAndView handleRequestInternal(final HttpServletRequest request, final HttpServletResponse response) throws Throwable, Exception {
        MyHelperClass ServletRequestUtils = new MyHelperClass();
        final String filename = ServletRequestUtils.getRequiredStringParameter(request, "id");
        MyHelperClass path = new MyHelperClass();
        final File file = new File(path, filename + ".html");
         static MyHelperClass logger = new MyHelperClass();
        logger.debug("Getting static content from: " + file.getPath());
        final InputStream is = getServletContext().getResourceAsStream(file.getPath());
        OutputStream out = null;
        if (is != null) {
            try {
                out = response.getOutputStream();
                IOUtils.copy(is, out);
            } catch (IOException ioex) {
                logger.error(ioex);
            } finally {
                is.close();
                if (out != null) {
                    out.close();
                }
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletRequest {

}

class HttpServletResponse {

}

class ModelAndView {

}
