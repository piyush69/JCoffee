import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5274228 {
public MyHelperClass Response;
	public MyHelperClass logger;
	public MyHelperClass StatusCode;
	public MyHelperClass convert2Headers(Map<String,String> o0){ return null; }

    public String put(String resourceID, Map<String, String> headersMap)  throws Throwable {
        HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
        httpClient.getParams().setParameter("http.useragent", "sla@soi OCCI Client v0.2");
        HttpPut httpPut = new HttpPut(resourceID);
        List<Header> headersList =(List<Header>)(Object) this.convert2Headers(headersMap);
        for (Iterator<Header> iterator = headersList.iterator(); iterator.hasNext(); ) {
            httpPut.addHeader(iterator.next());
        }
        logger.info((String)(Object)httpPut.getRequestLine());
        logger.info((String)(Object)httpPut.getAllHeaders());
        Header[] headersArray =(Header[])(Object) httpPut.getAllHeaders();
        String[] fields = {(String)(Object) Response.Location };
        HashMap<String, String> occiHeaders = new HashMap<String, String>();
        for (int H = 0; H < headersArray.length; H++) {
            Header header = headersArray[H];
            logger.info("header - request  -" + header.toString());
            logger.info("	headerName - " + header.getName());
            logger.info("	headerValue - " + header.getValue());
        }
        String statusLine = null;
        try {
            HttpResponse httpResponse =(HttpResponse)(Object) httpClient.execute(httpPut);
            statusLine = httpResponse.getStatusLine().toString();
            int statusCode =(int)(Object) httpResponse.getStatusLine().getStatusCode();
            logger.info("----------------------------------------");
            logger.info("StatusLine - (full) - " + httpResponse.getStatusLine());
            logger.info("	StatusCode - " + statusCode);
            logger.info("	Reason - " + httpResponse.getStatusLine().getReasonPhrase());
            logger.info("	Protocol - " + httpResponse.getStatusLine().getProtocolVersion().toString());
            logger.info("----------------------------------------");
            if ((boolean)(Object)StatusCode.validate(statusCode)) {
                logger.info("Response Validated");
            } else {
                logger.error("Response NOT Validated");
                return null;
            }
            Header[] headers =(Header[])(Object) httpResponse.getAllHeaders();
            for (int i = 0; i < headers.length; i++) {
                Header header = headers[i];
                logger.info("header - response - " + header.toString());
                logger.info("	headerName - " + header.getName());
                logger.info("	headerValue - " + header.getValue());
                for (int h = 0; h < fields.length; h++) {
                    logger.info("	Looking for  - " + fields[h]);
                    if (fields[h].equals(header.getName().toString())) {
                        logger.info("	Found an OCCI Header - " + header.getName());
                        occiHeaders.put((String)(Object)header.getName(),(String)(Object) header.getValue());
                    }
                }
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
            logger.error((String)(Object)e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            logger.error((String)(Object)e);
            return null;
        } catch (ArrayStoreException e) {
            e.printStackTrace();
            logger.error((String)(Object)e);
            return null;
        } finally {
            httpClient.getConnectionManager().shutdown();
        }
        logger.info("occiHeaders - " + occiHeaders);
        if (occiHeaders.containsKey(Response.Location)) {
            logger.info("Valid Provision" + statusLine);
            return occiHeaders.get(Response.Location).toString().replaceAll((String)(Object)Response.jobs, "");
        }
        logger.info("NOT a Valid Provision - " + statusLine);
        return statusLine;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass jobs;
	public MyHelperClass Location;
public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass error(ClientProtocolException o0){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass getProtocolVersion(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass setParameter(String o0, String o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass validate(int o0){ return null; }}

class HttpClient {

public MyHelperClass getConnectionManager(){ return null; }
	public MyHelperClass execute(HttpPut o0){ return null; }
	public MyHelperClass getParams(){ return null; }}

class DefaultHttpClient {

}

class HttpPut {

HttpPut(){}
	HttpPut(String o0){}
	public MyHelperClass getRequestLine(){ return null; }
	public MyHelperClass addHeader(Header o0){ return null; }
	public MyHelperClass getAllHeaders(){ return null; }}

class Header {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getAllHeaders(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class HttpHostConnectException extends Exception{
	public HttpHostConnectException(String errorMessage) { super(errorMessage); }
}
