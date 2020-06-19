import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23247146 {
public MyHelperClass i;
	public MyHelperClass log;
	public MyHelperClass AH_ERROR;
	public MyHelperClass getTileUrl(int o0, int o1, int o2){ return null; }

//    @Override
    public synchronized HttpURLConnection getTileUrlConnection(int zoom, int tilex, int tiley) throws Throwable, IOException {
        HttpURLConnection conn = null;
        try {
            String url =(String)(Object) getTileUrl(zoom, tilex, tiley);
            conn = (HttpURLConnection) new URL(url).openConnection();
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            log.error("", e);
            throw new IOException(e);
        }
        try {
            i.set("conn", conn);
            i.eval("addHeaders(conn);");
        } catch (EvalError(Throwable)(Object) e) {
            String msg = e.getMessage();
            if (!AH_ERROR.equals(msg)) {
                log.error(e.getClass() + ": " + e.getMessage(), e);
                throw new IOException((String)(Object)e);
            }
        }
        return conn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass set(String o0, HttpURLConnection o1){ return null; }
	public MyHelperClass eval(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }}

class EvalError {

public MyHelperClass getMessage(){ return null; }}
