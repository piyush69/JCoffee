import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14117901 {
public MyHelperClass m_parms;
	public MyHelperClass AuthScope;
	public MyHelperClass IOUtils;
	public MyHelperClass m_page;
	public MyHelperClass getUserAgent(){ return null; }
	public MyHelperClass getVirtualHost(){ return null; }
	public MyHelperClass getRange(){ return null; }
	public MyHelperClass getFailurePattern(){ return null; }
	public MyHelperClass getSuccessPattern(){ return null; }
	public MyHelperClass getMethod(){ return null; }

        void execute(HttpClient client, MonitoredService svc) {
            try {
                URI uri = getURI(svc);
                PageSequenceHttpMethod method = getMethod();
                method.setURI(uri);
                if (getVirtualHost() != null) {
                    method.getParams().setVirtualHost(getVirtualHost());
                }
                if (getUserAgent() != null) {
                    method.addRequestHeader("User-Agent", getUserAgent());
                }
                if (m_parms.length > 0) {
                    method.setParameters(m_parms);
                }
                if (m_page.getUserInfo() != null) {
                    String userInfo = m_page.getUserInfo();
                    String[] streetCred = userInfo.split(":", 2);
                    if (streetCred.length == 2) {
                        client.getState().setCredentials(new AuthScope(AuthScope.ANY), new UsernamePasswordCredentials(streetCred[0], streetCred[1]));
                        method.setDoAuthentication(true);
                    }
                }
                int code = client.executeMethod(method);
                if (!getRange().contains(code)) {
                    throw new PageSequenceMonitorException("response code out of range for uri:" + uri + ".  Expected " + getRange() + " but received " + code);
                }
                InputStream inputStream = method.getResponseBodyAsStream();
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                try {
                    IOUtils.copy(inputStream, outputStream);
                } finally {
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly(outputStream);
                }
                String responseString = outputStream.toString();
                if (getFailurePattern() != null) {
                    Matcher matcher = getFailurePattern().matcher(responseString);
                    if (matcher.find()) {
                        throw new PageSequenceMonitorException(getResolvedFailureMessage(matcher));
                    }
                }
                if (getSuccessPattern() != null) {
                    Matcher matcher = getSuccessPattern().matcher(responseString);
                    if (!matcher.find()) {
                        throw new PageSequenceMonitorException("failed to find '" + getSuccessPattern() + "' in page content at " + uri);
                    }
                }
            } catch (URIException e) {
                throw new IllegalArgumentException("unable to construct URL for page: " + e, e);
            } catch (HttpException e) {
                throw new PageSequenceMonitorException("HTTP Error " + e, e);
            } catch (IOException e) {
                throw new PageSequenceMonitorException("I/O Error " + e, e);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpClient {

}

class MonitoredService {

}

class PageSequenceHttpMethod {

}

class AuthScope {

}

class UsernamePasswordCredentials {

}

class PageSequenceMonitorException extends Exception{
	public PageSequenceMonitorException(String errorMessage) { super(errorMessage); }
}

class Matcher {

}

class URIException extends Exception{
	public URIException(String errorMessage) { super(errorMessage); }
}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}
