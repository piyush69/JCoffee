import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14768963 {
public MyHelperClass fork(StringBuffer o0, VarContainer o1, ActionContainer o2, ThingTypeContainer o3, Output o4, InputStream o5, boolean o6, Statement o7, String[] o8){ return null; }

    public static boolean exec_applet(String fname, VarContainer vc, ActionContainer ac, ThingTypeContainer ttc, Output OUT, InputStream IN, boolean AT, Statement state, String[] arggies)  throws Throwable {
        MyHelperClass urlpath = new MyHelperClass();
        if (!urlpath.endsWith("/")) {
//            MyHelperClass urlpath = new MyHelperClass();
            urlpath =(char)(Object) urlpath + '/';
        }
//        MyHelperClass urlpath = new MyHelperClass();
        if (!urlpath.startsWith("http://")) {
//            MyHelperClass urlpath = new MyHelperClass();
            urlpath = "http://"(MyHelperClass)(Object) + urlpath;
        }
//        MyHelperClass urlpath = new MyHelperClass();
        String url =(String)(Object) urlpath;
        if (fname.startsWith("dusty_")) {
            url = url + "libraries/" + fname;
        } else {
            url = url + "users/" + fname;
        }
        StringBuffer src = new StringBuffer(2400);
        try {
            String s;
            BufferedReader br = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            while ((s = br.readLine()) != null) {
                src.append(s).append('\n');
            }
            br.close();
        } catch (Exception e) {
            MyHelperClass DSOut = new MyHelperClass();
            OUT.println(new DSOut(DSOut.ERR_OUT, -1, "Dustyscript failed at reading the file'" + fname + "'\n\t...for 'use' statement"), vc, AT);
            return false;
        }
        fork(src, vc, ac, ttc, OUT, IN, AT, state, arggies);
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERR_OUT;
public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }}

class VarContainer {

}

class ActionContainer {

}

class ThingTypeContainer {

}

class Output {

}

class Statement {

}

class DSOut {

}
