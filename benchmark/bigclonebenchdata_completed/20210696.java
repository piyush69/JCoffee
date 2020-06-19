import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20210696 {
public MyHelperClass HttpStatus;
	public MyHelperClass LogUtils;
	public MyHelperClass EntityUtils;
	public MyHelperClass getClient(){ return null; }

    public Long postEdit(final HttpPost post, final String content, final Pattern pattern) throws Throwable, RequestTrackerException {
        String rtTicketNumber = null;
        final List<NameValuePair> params = new ArrayList<NameValuePair>();
        MyHelperClass m_user = new MyHelperClass();
        params.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("user", m_user));
        MyHelperClass m_password = new MyHelperClass();
        params.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("pass", m_password));
        params.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("content", content));
        try {
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
            post.setEntity(entity);
        } catch (final UnsupportedEncodingException e) {
            MyHelperClass LogUtils = new MyHelperClass();
            LogUtils.warnf(this, e, "unsupported encoding exception for UTF-8 -- WTF?!");
        }
        try {
            final HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getClient().execute(post);
            int responseCode =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getStatusLine().getStatusCode();
            if (responseCode !=(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (int)(Object)HttpStatus.SC_OK) {
                throw new RequestTrackerException("Received a non-200 response code from the server: " + responseCode);
            } else {
                final String in = EntityUtils.toString(response.getEntity());
                final Matcher matcher =(Matcher)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) pattern.matcher(in);
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)matcher.find()) {
                    rtTicketNumber =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) matcher.group(1);
                } else {
                    LogUtils.debugf(this, "did not get ticket ID from response when posting to %s", post.toString());
                }
            }
        } catch (final Exception e) {
            LogUtils.errorf(this, e, "Failure attempting to update ticket.");
            throw new RequestTrackerException((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)e);
        }
        if (rtTicketNumber == null) {
            return null;
        }
        return Long.valueOf(rtTicketNumber);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass errorf(c20210696 o0, Exception o1, String o2){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass warnf(c20210696 o0, UnsupportedEncodingException o1, String o2){ return null; }
	public MyHelperClass debugf(c20210696 o0, String o1, String o2){ return null; }}

class HttpPost {

public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class RequestTrackerException extends Exception{
	public RequestTrackerException(String errorMessage) { super(errorMessage); }
}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(String o0, MyHelperClass o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, String o1){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
