import java.io.*;
import java.lang.*;
import java.util.*;



class c17824349 {
public MyHelperClass password;
public MyHelperClass AUTH_OK;
	public MyHelperClass AUTH_BAD;
	public MyHelperClass URLEncoder;
	public MyHelperClass statusMessage;
	public MyHelperClass authenthicated;
	public MyHelperClass checkForError(String o0){ return null; }
	public MyHelperClass getAuthentificationString(){ return null; }

    private String httpGet(String urlString, boolean postStatus) throws Exception {
        URL url;
        URLConnection conn;
        String answer = "";
        try {
            MyHelperClass username = new MyHelperClass();
            if (username.equals("") || password.equals("")) throw new AuthNotProvidedException();
            url = new URL(urlString);
            conn =(URLConnection)(Object) url.openConnection();
            conn.setRequestProperty("Authorization", "Basic " + getAuthentificationString());
            if (postStatus) {
                conn.setDoOutput(true);
                conn.setUseCaches(false);
                conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                DataOutputStream das = new DataOutputStream((OutputStream)(Object)conn.getOutputStream());
                String content = "status=" + URLEncoder.encode(statusMessage, "UTF-8") + "&source=" + URLEncoder.encode("sametimetwitterclient", "UTF-8");
                das.writeBytes(content);
                das.flush();
                das.close();
            }
            InputStream is = (InputStream)(InputStream)(Object) conn.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null) {
                answer += line + "\n";
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
            throw new RuntimeException("Page not Found. Maybe Twitter-API has changed.");
        } catch (UncheckedIOException ex) {
            System.out.println(ex.toString());
            throw new RuntimeException("Network connection problems. Could not find twitter.com");
        } catch (IOException ex) {
            System.out.println("IO-Exception");
            if (ex.getMessage().indexOf("401") > -1) {
                authenthicated = AUTH_BAD;
                throw new AuthNotAcceptedException();
            }
            System.out.println(ex.toString());
        }
        if (checkForError(answer) != null) {
            throw new RuntimeException((String)(Object)checkForError(answer));
        }
        authenthicated = AUTH_OK;
        return answer;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}

class AuthNotAcceptedException extends Exception{
	public AuthNotAcceptedException(String errorMessage) { super(errorMessage); }
	AuthNotAcceptedException(){}
}

class AuthNotProvidedException extends Exception{
	public AuthNotProvidedException(String errorMessage) { super(errorMessage); }
	AuthNotProvidedException(){}
}
