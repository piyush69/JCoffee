import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18748953 {

    private static String appletLoad(String file, Output OUT)  throws Throwable {
        MyHelperClass urlpath = new MyHelperClass();
        if (!urlpath.endsWith("/")) {
//            MyHelperClass urlpath = new MyHelperClass();
           (char)(Object) urlpath += '/';
        }
//        MyHelperClass urlpath = new MyHelperClass();
        if (!urlpath.startsWith("http://")) {
//            MyHelperClass urlpath = new MyHelperClass();
            urlpath = "http://"(MyHelperClass)(Object) + urlpath;
        }
        String url = "";
        if (file.equals("languages.txt")) {
//            MyHelperClass urlpath = new MyHelperClass();
            url = urlpath + file;
        } else {
//            MyHelperClass urlpath = new MyHelperClass();
            url = urlpath + "users/" + file;
        }
        try {
            StringBuffer sb = new StringBuffer(2000);
            BufferedReader br = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            String a;
            while ((a = br.readLine()) != null) {
                sb.append(a).append('\n');
            }
            return sb.toString();
        } catch (Exception e) {
            OUT.println("load failed for file->" + file);
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }}

class Output {

public MyHelperClass println(String o0){ return null; }}
