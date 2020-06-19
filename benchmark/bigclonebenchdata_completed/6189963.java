import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c6189963 {
public MyHelperClass Messages;
	public MyHelperClass _method;
	public MyHelperClass StringUtils;
	public MyHelperClass ScriptingPlugin;
	public MyHelperClass IdeLog;

    public String jsFunction_send(String postData) {
        URL url = null;
        try {
            MyHelperClass _uri = new MyHelperClass();
            if ((boolean)(Object)_uri.startsWith("http")) {
//                MyHelperClass _uri = new MyHelperClass();
                url = new URL((String)(Object)_uri);
            } else {
//                MyHelperClass _uri = new MyHelperClass();
                url = new URL("file://./" + _uri);
            }
        } catch (MalformedURLException e) {
            MyHelperClass ScriptingPlugin = new MyHelperClass();
            IdeLog.logError(ScriptingPlugin.getDefault(), Messages.WebRequest_Error, e);
            MyHelperClass StringUtils = new MyHelperClass();
            return(String)(Object) StringUtils.EMPTY;
        }
        try {
            URLConnection conn = url.openConnection();
            OutputStreamWriter wr = null;
            if (this._method.equals("post")) {
                conn.setDoOutput(true);
                wr = new OutputStreamWriter(conn.getOutputStream());
                wr.write(postData);
                wr.flush();
            }
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line + "\r\n");
            }
            if (wr != null) {
                wr.close();
            }
            rd.close();
            String result = sb.toString();
            return result;
        } catch (Exception e) {
            IdeLog.logError(ScriptingPlugin.getDefault(), Messages.WebRequest_Error, e);
            return(String)(Object) StringUtils.EMPTY;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WebRequest_Error;
	public MyHelperClass EMPTY;
public MyHelperClass getDefault(){ return null; }
	public MyHelperClass logError(MyHelperClass o0, MyHelperClass o1, Exception o2){ return null; }
	public MyHelperClass logError(MyHelperClass o0, MyHelperClass o1, MalformedURLException o2){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }}
