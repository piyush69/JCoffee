


class c20210697 {
public MyHelperClass parseResponseStream(MyHelperClass o0){ return null; }
public MyHelperClass LogUtils;
	public MyHelperClass Collections;
	public MyHelperClass m_baseURL;
	public MyHelperClass HttpStatus;
	public MyHelperClass getClient(){ return null; }
	public MyHelperClass getSession(){ return null; }

    public RTUser getUserInfo(final String username) {
        getSession();
        Map attributes =(Map)(Object) Collections.emptyMap();
        final HttpGet get = new HttpGet(m_baseURL + "/REST/1.0/user/" + username);
        try {
            final HttpResponse response =(HttpResponse)(Object) getClient().execute(get);
            int responseCode =(int)(Object) response.getStatusLine().getStatusCode();
            if (responseCode != (int)(Object)HttpStatus.SC_OK) {
                throw new RequestTrackerException("Received a non-200 response code from the server: " + responseCode);
            } else {
                if (response.getEntity() != null) {
                    attributes =(Map)(Object) parseResponseStream(response.getEntity().getContent());
                }
            }
        } catch (final Exception e) {
            LogUtils.errorf(this, e, "An exception occurred while getting user info for " + username);
            return null;
        }
        final String id =(String)(Object) attributes.get("id");
        final String realname =(String)(Object) attributes.get("realname");
        final String email =(String)(Object) attributes.get("emailaddress");
        if (id == null || "".equals(id)) {
            LogUtils.errorf(this, "Unable to retrieve ID from user info.");
            return null;
        }
        return new RTUser(Long.parseLong(id.replace("user/", "")), username, realname, email);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getContent(){ return null; }
	public MyHelperClass errorf(c20210697 o0, String o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass emptyMap(){ return null; }
	public MyHelperClass errorf(c20210697 o0, Exception o1, String o2){ return null; }}

class RTUser {

RTUser(long o0, String o1, String o2, String o3){}
	RTUser(){}}

class Map {

public MyHelperClass get(String o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class RequestTrackerException extends Exception{
	public RequestTrackerException(String errorMessage) { super(errorMessage); }
}
