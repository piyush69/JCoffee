import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2753498 {
public MyHelperClass Context;
	public MyHelperClass activity;
	public MyHelperClass downloadFile(HttpResponse o0, FileOutputStream o1){ return null; }

    void download() throws DownloaderException {
        final HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        try {
            MyHelperClass APK_FILENAME = new MyHelperClass();
            final FileOutputStream fos =(FileOutputStream)(Object) this.activity.openFileOutput(APK_FILENAME, Context.MODE_WORLD_READABLE);
            MyHelperClass URL = new MyHelperClass();
            final HttpResponse response =(HttpResponse)(Object) client.execute(new HttpGet(URL));
            downloadFile(response, fos);
            fos.close();
        } catch (UncheckedIOException e) {
            throw new DownloaderException((String)(Object)e);
        } catch (IOException e) {
            throw new DownloaderException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MODE_WORLD_READABLE;
public MyHelperClass openFileOutput(MyHelperClass o0, MyHelperClass o1){ return null; }}

class DownloaderException extends Exception{
	public DownloaderException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpResponse {

}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(){}}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}
