import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22254269 {
public MyHelperClass LOGGER;
public MyHelperClass FETCHING_RESULT;
	public MyHelperClass logConnection(HttpURLConnection o0){ return null; }

//    @Override
    public String post(final FetchInfos fetchInfos, final String data) throws Throwable, HttpException {
        URL url = null;
        try {
            url = new URL((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)fetchInfos.getUri());
        } catch (MalformedURLException exception) {
            throw new HttpException("uri is malformed '" + fetchInfos.getUri() + "'", exception);
        }
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException exception) {
            MyHelperClass FETCHING_RESULT = new MyHelperClass();
            fetchInfos.setResult(FETCHING_RESULT.IO_ERROR);
            throw new HttpException("get '" + fetchInfos.getUri() + "' failed", exception);
        }
        InputStream input = null;
        try {
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", "" + Integer.toString(data.getBytes().length));
            final DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.writeBytes(data);
            wr.flush();
            wr.close();
            input = connection.getInputStream();
            if ("gzip".equals(connection.getHeaderField("content-encoding"))) {
                input =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new GZIPInputStream(input);
            }
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)LOGGER.isDebugEnabled()) {
                this.logConnection(connection);
                input =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new LoggingInputStream(input);
            }
        } catch (SocketTimeoutException exception) {
            fetchInfos.setResult(FETCHING_RESULT.TIME_OUT);
            throw new HttpException("get '" + fetchInfos.getUri() + "' timeout", exception);
        } catch (IOException exception) {
            fetchInfos.setResult(FETCHING_RESULT.IO_ERROR);
            throw new HttpException("get '" + fetchInfos.getUri() + "' failed", exception);
        }
        fetchInfos.setResult(FETCHING_RESULT.OK);
        String response = null;
        try {
            response = this.toString(input);
        } catch (IOException exception) {
            throw new HttpException("converting inputstream to string failed", exception);
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IO_ERROR;
	public MyHelperClass TIME_OUT;
	public MyHelperClass OK;
public MyHelperClass isDebugEnabled(){ return null; }}

class FetchInfos {

public MyHelperClass getUri(){ return null; }
	public MyHelperClass setResult(MyHelperClass o0){ return null; }}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
	HttpException(String o0, IOException o1){}
	HttpException(){}
}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class LoggingInputStream {

LoggingInputStream(InputStream o0){}
	LoggingInputStream(){}}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
