import java.io.*;
import java.lang.*;
import java.util.*;



class c5918578 {
public MyHelperClass NULL;
public MyHelperClass siteThread_;
public MyHelperClass httpURLConnection_;
	public MyHelperClass url_;
	public MyHelperClass post(String o0){ return null; }

    public void connect(String method, String data, String urlString, Properties properties, boolean allowredirect) throws Exception {
        if (urlString != null) {
            try {
                URL url_ =(URL)(Object) NULL; //new URL();
                url_ = new URL((MyHelperClass)(Object)url_, urlString);
            } catch (Exception e) {
                throw new Exception("Invalid URL");
            }
        }
        try {
            HttpURLConnection httpURLConnection_ =(HttpURLConnection)(Object) NULL; //new HttpURLConnection();
            httpURLConnection_ = (HttpURLConnection)(HttpURLConnection)(Object) url_.openConnection(siteThread_.getProxy());
//            MyHelperClass httpURLConnection_ = new MyHelperClass();
            httpURLConnection_.setDoInput(true);
//            MyHelperClass httpURLConnection_ = new MyHelperClass();
            httpURLConnection_.setDoOutput(true);
//            MyHelperClass httpURLConnection_ = new MyHelperClass();
            httpURLConnection_.setUseCaches(false);
//            MyHelperClass httpURLConnection_ = new MyHelperClass();
            httpURLConnection_.setRequestMethod(method);
//            MyHelperClass httpURLConnection_ = new MyHelperClass();
            httpURLConnection_.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
//            MyHelperClass httpURLConnection_ = new MyHelperClass();
            httpURLConnection_.setInstanceFollowRedirects(allowredirect);
            if (properties != null) {
                for (Object propertyKey : properties.keySet()) {
                    String propertyValue = properties.getProperty((String) propertyKey);
                    if (propertyValue.equalsIgnoreCase("Content-Length")) {
//                        MyHelperClass httpURLConnection_ = new MyHelperClass();
                        httpURLConnection_.setFixedLengthStreamingMode(0);
                    }
//                    MyHelperClass httpURLConnection_ = new MyHelperClass();
                    httpURLConnection_.setRequestProperty((String) propertyKey, propertyValue);
                }
            }
//            MyHelperClass httpURLConnection_ = new MyHelperClass();
            int connectTimeout =(int)(Object) httpURLConnection_.getConnectTimeout();
            if (data != null) {
                post(data);
            }
            httpURLConnection_.connect();
        } catch (Exception e) {
            throw new Exception("Connection failed with url " + url_);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(MyHelperClass o0){ return null; }
	public MyHelperClass setFixedLengthStreamingMode(int o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getProxy(){ return null; }
	public MyHelperClass getConnectTimeout(){ return null; }
	public MyHelperClass connect(){ return null; }}

class URL {

URL(MyHelperClass o0, String o1){}
	URL(){}}

class HttpURLConnection {

public MyHelperClass setFixedLengthStreamingMode(int o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getConnectTimeout(){ return null; }
	public MyHelperClass connect(){ return null; }}
