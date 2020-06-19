import java.io.*;
import java.lang.*;
import java.util.*;



class c4311563 {
public static MyHelperClass URLEncoder;
	public static MyHelperClass AuthenticationUtil;
//public MyHelperClass AuthenticationUtil;
//	public MyHelperClass URLEncoder;

    public static int sendMessage(String auth_token, String registrationId, String message) throws IOException {
        StringBuilder postDataBuilder = new StringBuilder();
        MyHelperClass PARAM_REGISTRATION_ID = new MyHelperClass();
        postDataBuilder.append(PARAM_REGISTRATION_ID).append("=").append(registrationId);
        MyHelperClass PARAM_COLLAPSE_KEY = new MyHelperClass();
        postDataBuilder.append("&").append(PARAM_COLLAPSE_KEY).append("=").append("0");
        MyHelperClass UTF8 = new MyHelperClass();
        postDataBuilder.append("&").append("data.payload").append("=").append(URLEncoder.encode(message, UTF8));
//        MyHelperClass UTF8 = new MyHelperClass();
        byte[] postData = postDataBuilder.toString().getBytes((String)(Object)UTF8);
        MyHelperClass C2DM_SEND_ENDPOINT = new MyHelperClass();
        URL url = new URL(C2DM_SEND_ENDPOINT);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setDoOutput(true);
        conn.setUseCaches(false);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        conn.setRequestProperty("Content-Length", Integer.toString(postData.length));
        conn.setRequestProperty("Authorization", "GoogleLogin auth=" + auth_token);
        OutputStream out =(OutputStream)(Object) conn.getOutputStream();
        out.write(postData);
        out.close();
        int responseCode =(int)(Object) conn.getResponseCode();
        MyHelperClass HttpServletResponse = new MyHelperClass();
        if (responseCode == (int)(Object)HttpServletResponse.SC_UNAUTHORIZED || responseCode == (int)(Object)HttpServletResponse.SC_FORBIDDEN) {
            MyHelperClass Util = new MyHelperClass();
            AuthenticationUtil.getTokenFromServer(Util.USER, Util.PASSWORD);
            sendMessage(auth_token, registrationId, message);
        }
        MyHelperClass UPDATE_CLIENT_AUTH = new MyHelperClass();
        String updatedAuthToken =(String)(Object) conn.getHeaderField(UPDATE_CLIENT_AUTH);
        if (updatedAuthToken != null && !auth_token.equals(updatedAuthToken)) {
            MyHelperClass Util = new MyHelperClass();
            Util.updateToken(updatedAuthToken);
        }
        return responseCode;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_FORBIDDEN;
	public MyHelperClass PASSWORD;
	public MyHelperClass SC_UNAUTHORIZED;
	public MyHelperClass USER;
public MyHelperClass updateToken(String o0){ return null; }
	public MyHelperClass encode(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getTokenFromServer(MyHelperClass o0, MyHelperClass o1){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getHeaderField(MyHelperClass o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }}
