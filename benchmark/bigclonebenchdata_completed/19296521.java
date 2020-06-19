import java.io.*;
import java.lang.*;
import java.util.*;



class c19296521 {
public MyHelperClass Log;
	public MyHelperClass HttpStatus;
	public MyHelperClass mHttpClient;
	public MyHelperClass LOG_TAG;
	public MyHelperClass mHttpGet;
	public MyHelperClass normalizeUrl(String o0){ return null; }

        private InputStream get(String url, long startOffset, long expectedLength) throws ClientProtocolException, IOException {
            url =(String)(Object) normalizeUrl(url);
            Log.i(LOG_TAG, "Get " + url);
            mHttpGet =(MyHelperClass)(Object) new HttpGet(url);
            int expectedStatusCode =(int)(Object) HttpStatus.SC_OK;
            if (startOffset > 0) {
                String range = "bytes=" + startOffset + "-";
                if (expectedLength >= 0) {
                    range += expectedLength - 1;
                }
                Log.i(LOG_TAG, "requesting byte range " + range);
                mHttpGet.addHeader("Range", range);
                expectedStatusCode =(int)(Object) HttpStatus.SC_PARTIAL_CONTENT;
            }
            HttpResponse response =(HttpResponse)(Object) mHttpClient.execute(mHttpGet);
            long bytesToSkip = 0;
            int statusCode =(int)(Object) response.getStatusLine().getStatusCode();
            if (statusCode != expectedStatusCode) {
                if ((statusCode == (int)(Object)HttpStatus.SC_OK) && (expectedStatusCode == (int)(Object)HttpStatus.SC_PARTIAL_CONTENT)) {
                    Log.i(LOG_TAG, "Byte range request ignored");
                    bytesToSkip = startOffset;
                } else {
                    throw new IOException("Unexpected Http status code " + statusCode + " expected " + expectedStatusCode);
                }
            }
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            InputStream is =(InputStream)(Object) entity.getContent();
            if (bytesToSkip > 0) {
                is.skip(bytesToSkip);
            }
            return is;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_PARTIAL_CONTENT;
	public MyHelperClass SC_OK;
public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass i(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class HttpGet {

HttpGet(){}
	HttpGet(String o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}
