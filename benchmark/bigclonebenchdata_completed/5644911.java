import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5644911 {
public static MyHelperClass NULL;
//public MyHelperClass NULL;
	public static MyHelperClass vimPort;
//public MyHelperClass vimPort;

    private static long writeVMDKFile(String absoluteFile, String urlString) throws Throwable, Exception {
        URL urlCon = new URL(urlString);
        HttpsURLConnection conn = (HttpsURLConnection)(HttpsURLConnection)(Object) urlCon.openConnection();
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setAllowUserInteraction(true);
        MyHelperClass headers = new MyHelperClass();
        List cookies = (List) headers.get("Set-cookie");
        String cookieValue =(String)(Object) NULL; //new String();
        cookieValue = (String) cookies.get(0);
//        MyHelperClass cookieValue = new MyHelperClass();
        StringTokenizer tokenizer = new StringTokenizer((String)(Object)cookieValue, ";");
//        MyHelperClass cookieValue = new MyHelperClass();
        cookieValue =(String)(Object)(MyHelperClass)(Object) tokenizer.nextToken();
        String path = "$" + tokenizer.nextToken();
//        MyHelperClass cookieValue = new MyHelperClass();
        String cookie = "$Version=\"1\"; " + cookieValue + "; " + path;
        Map map = new HashMap();
        map.put("Cookie", Collections.singletonList(cookie));
        MyHelperClass MessageContext = new MyHelperClass();
        ((BindingProvider)(BindingProvider)(Object) vimPort).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, map);
        conn.setRequestProperty("Cookie", cookie);
        conn.setRequestProperty("Content-Type", "application/octet-stream");
        conn.setRequestProperty("Expect", "100-continue");
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-Length", "1024");
        InputStream in =(InputStream)(Object) conn.getInputStream();
        MyHelperClass localPath = new MyHelperClass();
        String localpath = localPath + "/" + absoluteFile;
        OutputStream out = new FileOutputStream(new File(localpath));
        byte[] buf = new byte[102400];
        int len = 0;
        long written = 0;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
            written = written + len;
        }
        System.out.println("   Exported File " + absoluteFile + " : " + written);
        in.close();
        out.close();
        return written;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_REQUEST_HEADERS;
public MyHelperClass put(MyHelperClass o0, Map o1){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class HttpsURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }}

class BindingProvider {

public MyHelperClass getRequestContext(){ return null; }}
