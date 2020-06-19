import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15097859 {
public static MyHelperClass closeStream(InputStream o0){ return null; }
//public MyHelperClass closeStream(InputStream o0){ return null; }

    public static Bitmap loadBitmap(String token, String id, final String type) {
        MyHelperClass XMLfunctions = new MyHelperClass();
        String imageUrl =(String)(Object) XMLfunctions.URL;
        imageUrl = imageUrl.replace("{0}", token);
        imageUrl = imageUrl.replace("{1}", id);
        InputStream imageStream = null;
        try {
            HttpGet httpRequest = new HttpGet(new URL(imageUrl).toURI());
            HttpResponse response = (HttpResponse) (HttpResponse)(Object)new DefaultHttpClient().execute(httpRequest);
            httpRequest = null;
            BufferedHttpEntity bufHttpEntity = new BufferedHttpEntity(response.getEntity());
            response = null;
            imageStream =(InputStream)(Object) bufHttpEntity.getContent();
            bufHttpEntity = null;
            if (imageStream != null) {
                final Options options = new Options();
                if (type.equals("image")) {
                    options.inSampleSize =(MyHelperClass)(Object) 2;
                }
                MyHelperClass BitmapFactory = new MyHelperClass();
                return(Bitmap)(Object) BitmapFactory.decodeStream(imageStream, null, options);
            } else {
            }
        } catch (IOException e) {
        } catch (URISyntaxException e) {
        } finally {
            if (imageStream != null) closeStream(imageStream);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass URL;
public MyHelperClass decodeStream(InputStream o0, Object o1, Options o2){ return null; }}

class Bitmap {

}

class HttpGet {

HttpGet(){}
	HttpGet(URI o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class BufferedHttpEntity {

BufferedHttpEntity(MyHelperClass o0){}
	BufferedHttpEntity(){}
	public MyHelperClass getContent(){ return null; }}

class Options {
public MyHelperClass inSampleSize;
}
