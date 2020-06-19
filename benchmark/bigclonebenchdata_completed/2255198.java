import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2255198 {
public MyHelperClass constructQuery(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass contentLastmod;
	public MyHelperClass url;
	public MyHelperClass encoding;
	public MyHelperClass query;
	public MyHelperClass bytesize;
	public MyHelperClass contentExpires;
	public MyHelperClass serviceDate;
	public MyHelperClass _uu;
	public MyHelperClass mimetype;
	public MyHelperClass close(){ return null; }
	public MyHelperClass jsGet_locale(){ return null; }

    public boolean open()  throws Throwable {
        MyHelperClass _uu = new MyHelperClass();
        if (null == _uu) {
            try {
                MyHelperClass url = new MyHelperClass();
                if (null == url) return false; else {
                    if (null != this.query) this.url = constructQuery(url, this.query);
                    _uu = url.openConnection();
                    _uu.setAllowUserInteraction(false);
                    _uu.setDoInput(true);
                    MyHelperClass _loc = new MyHelperClass();
//                    MyHelperClass _loc = new MyHelperClass();
//                    MyHelperClass _loc = new MyHelperClass();
//                    MyHelperClass _loc = new MyHelperClass();
//                    MyHelperClass _loc = new MyHelperClass();
//                    MyHelperClass _loc = new MyHelperClass();
//                    MyHelperClass _loc = new MyHelperClass();
//                    MyHelperClass _loc = new MyHelperClass();
//                    MyHelperClass _loc = new MyHelperClass();
                    MyHelperClass _loc = new MyHelperClass();
                    if (null != super._loc) {
                        try {
                            _uu.setRequestProperty("Accept-Language", jsGet_locale());
                        } catch (JavaScriptException jsx) {
                        }
                    }
                    encoding = _uu.getContentEncoding();
                    bytesize = _uu.getContentLength();
                    mimetype = _uu.getContentType();
                    serviceDate = _uu.getDate();
                    contentExpires = _uu.getExpiration();
                    contentLastmod = _uu.getLastModified();
                    return true;
                }
            } catch (Exception exc) {
                close();
                return false;
            }
        } else return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getExpiration(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getDate(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getContentLength(){ return null; }}

class JavaScriptException extends Exception{
	public JavaScriptException(String errorMessage) { super(errorMessage); }
}
