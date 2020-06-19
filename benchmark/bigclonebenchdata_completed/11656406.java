import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11656406 {
public static MyHelperClass HttpStatus;
	public static MyHelperClass client;
	public MyHelperClass getHttpPost(MyHelperClass o0, String o1){ return null; }
	public static MyHelperClass getUploadUrl(String o0){ return null; }
public MyHelperClass client;
	public MyHelperClass HttpStatus;
	public MyHelperClass getUploadUrl(String o0){ return null; }

    public static String upLoadImg(File pic, String uid) throws Throwable {
        System.out.println("开始上传=======================================================");
        HttpPost post = getHttpPost(getUploadUrl(uid), uid);
        FileBody file = new FileBody(pic, "image/jpg");
        MultipartEntity reqEntity = new MultipartEntity();
        reqEntity.addPart("pic1", file);
        post.setEntity(reqEntity);
        HttpResponse response = client.execute(post);
        int status = response.getStatusLine().getStatusCode();
        post.abort();
        if (status == HttpStatus.SC_MOVED_TEMPORARILY || status == HttpStatus.SC_MOVED_PERMANENTLY) {
            String newuri = response.getHeaders("location")[0].getValue();
            System.out.println(newuri);
            return newuri.substring(newuri.indexOf("pid=") + 4, newuri.indexOf("&token="));
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_MOVED_PERMANENTLY;
	public MyHelperClass SC_MOVED_TEMPORARILY;
public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

public MyHelperClass abort(){ return null; }
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class FileBody {

FileBody(File o0, String o1){}
	FileBody(){}}

class MultipartEntity {

public MyHelperClass addPart(String o0, FileBody o1){ return null; }}

class HttpResponse {

public MyHelperClass getHeaders(String o0){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}
