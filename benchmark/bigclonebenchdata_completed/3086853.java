import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3086853 {
public MyHelperClass Utils;
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass getFullPath(String o0, String o1){ return null; }

    protected Icon newIcon(String iconName)  throws Throwable {
        URL url =(URL)(Object) Utils.getResource(getFullPath(iconName, "/"), getClass());
        if (url == null) {
            if (getParent() != null) return(Icon)(Object) getParent().getIcon(iconName);
            return null;
        }
        try {
            MethodCall getImage = (MethodCall)(Object)new MethodCaller("org.apache.sanselan.Sanselan", null, "getBufferedImage", new Object[] { InputStream.class }).getMethodCall();
            getImage.setArgumentValue(0, url.openStream());
            return(Icon)(Object) new ImageIcon((BufferedImage)(BufferedImage)(Object) getImage.call());
        } catch (Throwable e) {
            return(Icon)(Object) new ImageIcon(url);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(MyHelperClass o0, Class o1){ return null; }
	public MyHelperClass getIcon(String o0){ return null; }}

class Icon {

}

class MethodCall {

public MyHelperClass setArgumentValue(int o0, InputStream o1){ return null; }
	public MyHelperClass call(){ return null; }}

class MethodCaller {

MethodCaller(String o0, Object o1, String o2, Object[] o3){}
	MethodCaller(){}
	public MyHelperClass getMethodCall(){ return null; }}

class ImageIcon {

ImageIcon(URL o0){}
	ImageIcon(){}
	ImageIcon(BufferedImage o0){}}

class BufferedImage {

}
