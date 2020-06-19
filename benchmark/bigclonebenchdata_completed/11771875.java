import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11771875 {
public MyHelperClass StringConverter;

    private synchronized jdbcResultSet executeHTTP(String s) throws Throwable, SQLException {
        byte result[];
        try {
            MyHelperClass sConnect = new MyHelperClass();
            URL url = new URL((String)(Object)sConnect);
            MyHelperClass sUser = new MyHelperClass();
            String p =(String)(Object) StringConverter.unicodeToHexString((String)(Object)sUser);
            MyHelperClass sPassword = new MyHelperClass();
            p += "+" + StringConverter.unicodeToHexString((String)(Object)sPassword);
            MyHelperClass StringConverter = new MyHelperClass();
            p += "+" + StringConverter.unicodeToHexString(s);
            URLConnection c = url.openConnection();
            c.setDoOutput(true);
            OutputStream os = c.getOutputStream();
            MyHelperClass ENCODING = new MyHelperClass();
            os.write(p.getBytes((String)(Object)ENCODING));
            os.close();
            c.connect();
            InputStream is = (InputStream) c.getContent();
            BufferedInputStream in = new BufferedInputStream(is);
            int len = c.getContentLength();
            result = new byte[len];
            for (int i = 0; i < len; i++) {
                int r = in.read();
                result[i] = (byte) r;
            }
        } catch (Exception e) {
            MyHelperClass Trace = new MyHelperClass();
            throw(Throwable)(Object) Trace.error(Trace.CONNECTION_IS_BROKEN, e.getMessage());
        }
        return new jdbcResultSet(new Result(result));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONNECTION_IS_BROKEN;
public MyHelperClass unicodeToHexString(String o0){ return null; }
	public MyHelperClass error(MyHelperClass o0, String o1){ return null; }}

class jdbcResultSet {

jdbcResultSet(Result o0){}
	jdbcResultSet(){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Result {

Result(byte[] o0){}
	Result(){}}
