import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10332951 {
public static MyHelperClass NULL;
public static MyHelperClass loginurl;
	public static MyHelperClass mspokcookie;
//	public MyHelperClass NULL;
//public MyHelperClass loginurl;
//	public MyHelperClass mspokcookie;

    public static void loginSkyDrive() throws Throwable, Exception {
        System.out.println("login ");
        URL u =(URL)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new URL();
        u = new URL((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)loginurl);
        HttpURLConnection uc =(HttpURLConnection)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new HttpURLConnection();
        uc = (HttpURLConnection) u.openConnection();
        MyHelperClass msprcookie = new MyHelperClass();
        uc.setRequestProperty("Cookie", msprcookie + ";" + mspokcookie);
//        MyHelperClass uc = new MyHelperClass();
        uc.setDoOutput(true);
//        MyHelperClass uc = new MyHelperClass();
        uc.setRequestMethod("POST");
//        MyHelperClass uc = new MyHelperClass();
        uc.setInstanceFollowRedirects(false);
        PrintWriter pw =(PrintWriter)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new PrintWriter();
        pw = new PrintWriter(new OutputStreamWriter(uc.getOutputStream()), true);
        MyHelperClass ppft = new MyHelperClass();
        pw.print("login=dinesh007007%40hotmail.com&passwd=&SI=Sign+in&type=11&LoginOptions=3&NewUser=1&MEST=&PPSX=Passpor&PPFT=" + ppft + "&PwdPad=&sso=&i1=&i2=1&i3=10524&i4=&i12=1&i13=&i14=437&i15=624&i16=3438");
//        MyHelperClass pw = new MyHelperClass();
        pw.flush();
//        MyHelperClass pw = new MyHelperClass();
        pw.close();
//        MyHelperClass uc = new MyHelperClass();
        System.out.println(uc.getResponseCode());
//        MyHelperClass uc = new MyHelperClass();
        Map<String, List<String>> headerFields = uc.getHeaderFields();
        if (headerFields.containsKey("Set-Cookie")) {
            List<String> header = headerFields.get("Set-Cookie");
            for (int i = 0; i < header.size(); i++) {
                String tmp =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new String();
                tmp = header.get(i);
//                MyHelperClass tmp = new MyHelperClass();
                System.out.println(tmp);
            }
        }
        String location =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new String();
        location = uc.getHeaderField("Location");
//        MyHelperClass location = new MyHelperClass();
        System.out.println("Location : " + location);
        System.out.println("going to open paaport page");
        DefaultHttpClient d = new DefaultHttpClient();
        HttpGet hg = new HttpGet("https://skydrive.live.com");
//        MyHelperClass msprcookie = new MyHelperClass();
        hg.setHeader("Cookie", msprcookie + ";" + mspokcookie);
        HttpResponse execute =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) d.execute(hg);
        HttpEntity entity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) execute.getEntity();
        MyHelperClass EntityUtils = new MyHelperClass();
        System.out.println(EntityUtils.toString(entity));
        System.out.println(execute.getStatusLine());
        Header[] allHeaders =(Header[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) execute.getAllHeaders();
        for (int i = 0; i < allHeaders.length; i++) {
            System.out.println(allHeaders[i].getName() + " : " + allHeaders[i].getValue());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass getHeaderFields(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }}

class DefaultHttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getAllHeaders(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

}

class Header {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
