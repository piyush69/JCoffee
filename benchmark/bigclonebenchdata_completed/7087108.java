import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7087108 {

//    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws Throwable, IOException {
        String path =(int)(Object) request.getPathTranslated().substring(0,(int)(Object) request.getPathTranslated().length() - (int)(Object)request.getPathInfo().length()) +(String)(Object) (int)(Object)request.getServletPath() + (int)(Object)request.getPathInfo();
        File file = new File(path);
        if (file.exists()) {
            FileInputStream in = new FileInputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(in, response.getOutputStream());
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(FileInputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass substring(int o0, int o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getPathInfo(){ return null; }
	public MyHelperClass getServletPath(){ return null; }
	public MyHelperClass getPathTranslated(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }}
