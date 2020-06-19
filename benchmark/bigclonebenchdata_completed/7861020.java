import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7861020 {

    private void writeToFile(Body b, File mime4jFile) throws Throwable, FileNotFoundException, IOException {
        if ((TextBody)(Object)b instanceof TextBody) {
            MyHelperClass CharsetUtil = new MyHelperClass();
            String charset =(String)(Object) CharsetUtil.toJavaCharset(b.getParent().getCharset());
            if (charset == null) {
                charset = "ISO8859-1";
            }
            OutputStream out = new FileOutputStream(mime4jFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(((TextBody)(TextBody)(Object) b).getReader(), out, charset);
        } else {
            OutputStream out = new FileOutputStream(mime4jFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(((BinaryBody)(BinaryBody)(Object) b).getInputStream(), out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, OutputStream o1, String o2){ return null; }
	public MyHelperClass toJavaCharset(MyHelperClass o0){ return null; }
	public MyHelperClass getCharset(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }}

class Body {

public MyHelperClass getParent(){ return null; }}

class TextBody {

public MyHelperClass getReader(){ return null; }}

class BinaryBody {

public MyHelperClass getInputStream(){ return null; }}
