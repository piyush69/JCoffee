import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8496070 {
public MyHelperClass RewriteUtils;
	public MyHelperClass ResourceUtils;

    private void removeSessionId(InputStream inputStream, Output output) throws Throwable, IOException {
        MyHelperClass target = new MyHelperClass();
        String jsessionid =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) RewriteUtils.getSessionId(target);
        MyHelperClass httpClientResponse = new MyHelperClass();
        boolean textContentType =(boolean)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) ResourceUtils.isTextContentType(httpClientResponse.getHeader("Content-Type"));
        if (jsessionid == null || !textContentType) {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputStream, output.getOutputStream());
        } else {
//            MyHelperClass httpClientResponse = new MyHelperClass();
            String charset =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClientResponse.getContentCharset();
            if (charset == null) {
                charset = "ISO-8859-1";
            }
            MyHelperClass IOUtils = new MyHelperClass();
            String content = IOUtils.toString(inputStream, charset);
            content = removeSessionId((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(InputStream)(Object)jsessionid,(Output)(Object) content);
            if (output.getHeader("Content-length") != null) {
                output.setHeader("Content-length", Integer.toString(content.length()));
            }
            OutputStream outputStream =(OutputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) output.getOutputStream();
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.write(content, outputStream, charset);
        }
        inputStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass getSessionId(MyHelperClass o0){ return null; }
	public MyHelperClass isTextContentType(MyHelperClass o0){ return null; }
	public MyHelperClass write(String o0, OutputStream o1, String o2){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getContentCharset(){ return null; }}

class Output {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class Object {

public MyHelperClass toString(InputStream o0, String o1){ return null; }}
