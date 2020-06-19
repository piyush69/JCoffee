import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22501521 {
public MyHelperClass m_cookieHandler;

    public String sendRequest(RequestData requestData) throws Throwable, HTTPHandlerException {
        try {
            final String urlString =(String)(Object) requestData.getURLString();
            final URL url = new URL(urlString);
            final String postString =(String)(Object) requestData.getPostString();
            MyHelperClass m_pluginThreadContext = new MyHelperClass();
            m_pluginThreadContext.startTimer();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            final Iterator headersIterator =(Iterator)(Object) requestData.getHeaders().entrySet().iterator();
            while (headersIterator.hasNext()) {
                final Map.Entry entry = (Map.Entry) headersIterator.next();
                connection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            final AuthorizationData authorizationData =(AuthorizationData)(Object) requestData.getAuthorizationData();
            if (authorizationData != null &&(BasicAuthorizationData)(Object) authorizationData instanceof BasicAuthorizationData) {
                final BasicAuthorizationData basicAuthorizationData = (BasicAuthorizationData)(BasicAuthorizationData)(Object) authorizationData;
                MyHelperClass Codecs = new MyHelperClass();
                connection.setRequestProperty("Authorization", "Basic " + Codecs.base64Encode(basicAuthorizationData.getUser() + ":" + basicAuthorizationData.getPassword()));
            }
            MyHelperClass m_followRedirects = new MyHelperClass();
            connection.setInstanceFollowRedirects((boolean)(Object)m_followRedirects);
            MyHelperClass m_useCookies = new MyHelperClass();
            if ((boolean)(Object)m_useCookies) {
                MyHelperClass m_useCookiesVersionString = new MyHelperClass();
                final String cookieString =(String)(Object) m_cookieHandler.getCookieString(url, m_useCookiesVersionString);
                if (cookieString != null) {
                    connection.setRequestProperty("Cookie", cookieString);
                }
            }
            connection.setUseCaches(false);
            if (postString != null) {
                connection.setRequestMethod("POST");
                connection.setDoOutput(true);
                final BufferedOutputStream bos = new BufferedOutputStream(connection.getOutputStream());
                final PrintWriter out = new PrintWriter(bos);
                out.write(postString);
                out.close();
            }
            connection.connect();
            final int responseCode = connection.getResponseCode();
            MyHelperClass m_timeToFirstByteIndex = new MyHelperClass();
            if (m_timeToFirstByteIndex != null) {
//                MyHelperClass m_timeToFirstByteIndex = new MyHelperClass();
                m_pluginThreadContext.getCurrentTestStatistics().addValue(m_timeToFirstByteIndex, System.currentTimeMillis() - (long)(Object)m_pluginThreadContext.getStartTime());
            }
//            MyHelperClass m_useCookies = new MyHelperClass();
            if ((boolean)(Object)m_useCookies) {
                int headerIndex = 1;
                String headerKey = null;
                String headerValue = connection.getHeaderField(headerIndex);
                while (headerValue != null) {
                    headerKey = connection.getHeaderFieldKey(headerIndex);
                    if (headerKey != null && "Set-Cookie".equals(headerKey)) {
                        MyHelperClass m_cookieHandler = new MyHelperClass();
                        m_cookieHandler.setCookies(headerValue, url);
                    }
                    headerValue = connection.getHeaderField(++headerIndex);
                }
            }
            if (responseCode == HttpURLConnection.HTTP_OK) {
                final InputStreamReader isr = new InputStreamReader(connection.getInputStream());
                final BufferedReader in = new BufferedReader(isr);
                final StringWriter stringWriter = new StringWriter(512);
                char[] buffer = new char[512];
                int charsRead = 0;
                MyHelperClass m_dontReadBody = new MyHelperClass();
                if (!(Boolean)(Object)m_dontReadBody) {
                    while ((charsRead = in.read(buffer, 0, buffer.length)) > 0) {
                        stringWriter.write(buffer, 0, charsRead);
                    }
                }
                in.close();
                stringWriter.close();
//                MyHelperClass m_pluginThreadContext = new MyHelperClass();
                m_pluginThreadContext.logMessage(urlString + " OK");
                return stringWriter.toString();
            } else if (responseCode == HttpURLConnection.HTTP_NOT_MODIFIED) {
//                MyHelperClass m_pluginThreadContext = new MyHelperClass();
                m_pluginThreadContext.logMessage(urlString + " was not modified");
            } else if (responseCode == HttpURLConnection.HTTP_MOVED_PERM || responseCode == HttpURLConnection.HTTP_MOVED_TEMP || responseCode == 307) {
//                MyHelperClass m_pluginThreadContext = new MyHelperClass();
                m_pluginThreadContext.logMessage(urlString + " returned a redirect (" + responseCode + "). " + "Ensure the next URL is " + connection.getHeaderField("Location"));
                return null;
            } else {
//                MyHelperClass m_pluginThreadContext = new MyHelperClass();
                m_pluginThreadContext.logError("Unknown response code: " + responseCode + " for " + urlString);
            }
            return null;
        } catch (Exception e) {
            throw new HTTPHandlerException(e.getMessage(), e);
        } finally {
            MyHelperClass m_pluginThreadContext = new MyHelperClass();
            m_pluginThreadContext.stopTimer();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass logError(String o0){ return null; }
	public MyHelperClass addValue(MyHelperClass o0, long o1){ return null; }
	public MyHelperClass base64Encode(String o0){ return null; }
	public MyHelperClass startTimer(){ return null; }
	public MyHelperClass setCookies(String o0, URL o1){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getCurrentTestStatistics(){ return null; }
	public MyHelperClass stopTimer(){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass getCookieString(URL o0, MyHelperClass o1){ return null; }
	public MyHelperClass getStartTime(){ return null; }
	public MyHelperClass logMessage(String o0){ return null; }}

class AuthorizationData {

}

class HTTPHandlerException extends Exception{
	public HTTPHandlerException(String errorMessage) { super(errorMessage); }
	HTTPHandlerException(String o0, Exception o1){}
	HTTPHandlerException(){}
}

class RequestData {

public MyHelperClass getURLString(){ return null; }
	public MyHelperClass getHeaders(){ return null; }
	public MyHelperClass getPostString(){ return null; }
	public MyHelperClass getAuthorizationData(){ return null; }}

class BasicAuthorizationData {

public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getUser(){ return null; }}
