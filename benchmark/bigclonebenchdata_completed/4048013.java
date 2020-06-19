import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4048013 {
public MyHelperClass getParameterAsFile(String o0){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }

    public InputStream getParameterAsInputStream(String key) throws Throwable, UndefinedParameterError,(Throwable)(Object) IOException {
        String urlString =(String)(Object) getParameter(key);
        if (urlString == null) return null;
        try {
            URL url = new URL(urlString);
            InputStream stream = url.openStream();
            return stream;
        } catch (MalformedURLException e) {
            File file =(File)(Object) getParameterAsFile(key);
            if (file != null) {
                return new FileInputStream(file);
            } else {
                return null;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class UndefinedParameterError {

}
