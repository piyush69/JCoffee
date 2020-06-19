import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19396006 {
public MyHelperClass OK_MAX;

    private Tuple execute(final HttpMethodBase method, int numTries) throws Throwable, IOException {
        MyHelperClass Metric = new MyHelperClass();
        final Timer timer =(Timer)(Object) Metric.newTimer("RestClientImpl.execute");
        try {
            MyHelperClass httpClient = new MyHelperClass();
            final int sc =(int)(Object) httpClient.executeMethod(method);
            MyHelperClass OK_MIN = new MyHelperClass();
            if (sc < (int)(Object)OK_MIN || sc > (int)(Object)OK_MAX) {
                throw new RestException("Unexpected status code: " + sc + ": " + method.getStatusText() + " -- " + method, sc);
            }
            final InputStream in =(InputStream)(Object) method.getResponseBodyAsStream();
            try {
                final StringWriter writer = new StringWriter(2048);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, writer, method.getResponseCharSet());
                return new Tuple(sc, writer.toString());
            } finally {
                in.close();
            }
        } catch (NullPointerException e) {
            if (numTries < 3) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ie) {
                    Thread.interrupted();
                }
                return execute(method, numTries + 1);
            }
            MyHelperClass url = new MyHelperClass();
            throw new IOException("Failed to connet to " + url + " [" + method + "]", e);
        } catch (SocketException e) {
            if (numTries < 3) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ie) {
                    Thread.interrupted();
                }
                return execute(method, numTries + 1);
            }
            MyHelperClass url = new MyHelperClass();
            throw new IOException("Failed to connet to " + url + " [" + method + "]", e);
        } catch (IOException e) {
            if (numTries < 3) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ie) {
                    Thread.interrupted();
                }
                return execute(method, numTries + 1);
            }
            throw e;
        } finally {
            method.releaseConnection();
            timer.stop();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newTimer(String o0){ return null; }
	public MyHelperClass executeMethod(HttpMethodBase o0){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1, MyHelperClass o2){ return null; }}

class HttpMethodBase {

public MyHelperClass getResponseCharSet(){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass getStatusText(){ return null; }
	public MyHelperClass releaseConnection(){ return null; }}

class Tuple {

Tuple(){}
	Tuple(int o0, String o1){}}

class RestException extends Exception{
	public RestException(String errorMessage) { super(errorMessage); }
	RestException(String o0, int o1){}
	RestException(){}
}

class Timer {

public MyHelperClass stop(){ return null; }}
