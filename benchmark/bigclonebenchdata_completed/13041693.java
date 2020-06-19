import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13041693 {
public MyHelperClass getCookies(HttpURLConnection o0){ return null; }

//    @Override
    public void vote(String urlString, Map<String, String> headData, Map<String, String> paramData)  throws Throwable {
        HttpURLConnection httpConn = null;
        try {
            URL url = new URL(urlString);
            httpConn = (HttpURLConnection) url.openConnection();
            String cookies =(String)(Object) getCookies(httpConn);
            System.out.println(cookies);
            BufferedReader post = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "GB2312"));
            String text = null;
            while ((text = post.readLine()) != null) {
                System.out.println(text);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new VoteBeanException("网址不正确", e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new VoteBeanException("不能打开网址", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class VoteBeanException extends Exception{
	public VoteBeanException(String errorMessage) { super(errorMessage); }
	VoteBeanException(String o0, IOException o1){}
	VoteBeanException(){}
	VoteBeanException(String o0, MalformedURLException o1){}
}
