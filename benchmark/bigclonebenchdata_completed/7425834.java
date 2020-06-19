import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7425834 {
public MyHelperClass getProperty(MyHelperClass o0){ return null; }
	public MyHelperClass setProperty(MyHelperClass o0, String o1){ return null; }
public MyHelperClass SPEC_UNSET;
	public MyHelperClass DEBUG;
	public MyHelperClass mURL;
	public MyHelperClass mimeType;
	public MyHelperClass VUE;
	public MyHelperClass CONTENT_TYPE;
	public MyHelperClass Log;
	public MyHelperClass UNSET;
	public MyHelperClass out(String o0){ return null; }
	public MyHelperClass getSpec(){ return null; }

//    @Override
    protected String determineDataType()  throws Throwable {
        final String spec =(String)(Object) getSpec();
        if (spec.endsWith("=jpeg")) {
            return "jpeg";
        } else if (mimeType != UNSET) {
            return(String)(Object) mimeType;
        } else if (spec != (String)(Object)SPEC_UNSET && spec.startsWith("http") && spec.contains("fedora")) {
            if (spec.endsWith("bdef:AssetDef/getFullView/")) {
                return "html";
            } else {
                String type =(String)(Object) getProperty(CONTENT_TYPE);
                if (type == null || type.length() < 1) {
                    try {
                        final URL url = (mURL != null ? mURL : new URL((String)(Object)getSpec()));
                        if ((boolean)(Object)DEBUG.Enabled) out("polling actual HTTP server for content-type: " + url);
                        if (!(Boolean)(Object)VUE.isApplet()) type = url.openConnection().getHeaderField("Content-type"); else type = null;
                        if ((boolean)(Object)DEBUG.Enabled) {
                            out("got contentType " + url + " [" + type + "]");
                        }
                        if (type != null && type.length() > 0) setProperty(CONTENT_TYPE, type);
                    } catch (Throwable t) {
                        Log.error("content-type-fetch: " + this, t);
                    }
                }
                if (type != null && type.contains("/")) {
                    mimeType =(MyHelperClass)(Object) type.split("/")[1];
                    if ((int)(Object)mimeType.indexOf(';') > 0) {
                        mimeType = mimeType.substring(0, mimeType.indexOf(';'));
                    }
                    return(String)(Object) mimeType;
                }
            }
        }
        return this.determineDataType();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass Enabled;
public MyHelperClass isApplet(){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass indexOf(char o0){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }}
