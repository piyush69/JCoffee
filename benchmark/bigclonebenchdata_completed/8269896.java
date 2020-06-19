import java.io.*;
import java.lang.*;
import java.util.*;



class c8269896 {
public MyHelperClass oauthAuthenticator;

    private String postData(String requestUrl, String atom) throws AuthenticationException, IOException {
        URL url = new URL(requestUrl);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        String header;
        try {
            MyHelperClass profile = new MyHelperClass();
            header =(String)(Object) oauthAuthenticator.getHttpAuthorizationHeader(url.toString(), "POST", profile.getOAuthToken(), profile.getOAuthTokenSecret());
        } catch (UncheckedIOException e) {
            throw new AuthenticationException((String)(Object)e);
        }
        conn.setRequestProperty("Authorization", header);
        conn.setRequestProperty("Content-Type", "application/atom+xml");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter((OutputStream)(Object)conn.getOutputStream()));
        writer.write(atom);
        writer.close();
        MyHelperClass HttpURLConnection = new MyHelperClass();
        if (conn.getResponseCode() == HttpURLConnection.HTTP_UNAUTHORIZED) {
            throw new AuthenticationException();
        }
        InputStreamReader reader = new InputStreamReader((InputStream)(Object)conn.getInputStream());
        char[] buffer = new char[1024];
        int bytesRead = 0;
        StringBuilder data = new StringBuilder();
        while ((bytesRead = reader.read(buffer)) != -1) {
            data.append(buffer, 0, bytesRead);
        }
        reader.close();
//        MyHelperClass HttpURLConnection = new MyHelperClass();
        if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
            throw new IOException(conn.getResponseCode() + " " + conn.getResponseMessage() + "\n" + data);
        }
        return data.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_UNAUTHORIZED;
	public MyHelperClass HTTP_CREATED;
public MyHelperClass getHttpAuthorizationHeader(String o0, String o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass getOAuthTokenSecret(){ return null; }
	public MyHelperClass getOAuthToken(){ return null; }}

class AuthenticationException extends Exception{
	public AuthenticationException(String errorMessage) { super(errorMessage); }
	AuthenticationException(){}
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }}

class OAuthException extends Exception{
	public OAuthException(String errorMessage) { super(errorMessage); }
}
