import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19541856 {

//    @RequestMapping(value = "/image/{fileName}", method = RequestMethod.GET)
    public void getImage(@(Annotation)(Object)PathVariable String fileName, HttpServletRequest req, HttpServletResponse res) throws Throwable, Exception {
        MyHelperClass STORAGE_PATH = new MyHelperClass();
        File file = new File(STORAGE_PATH + fileName + ".jpg");
        res.setHeader("Cache-Control", "no-store");
        res.setHeader("Pragma", "no-cache");
        res.setDateHeader("Expires", 0);
        res.setContentType("image/jpg");
        ServletOutputStream ostream = res.getOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(new FileInputStream(file), ostream);
        ostream.flush();
        ostream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, ServletOutputStream o1){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass setDateHeader(String o0, int o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class PathVariable {

}

class RequestMapping {

}

class ServletOutputStream {

public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }}
