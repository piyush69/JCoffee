import java.io.*;
import java.lang.*;
import java.util.*;



class c14416228 {

    private static String sendRPC(String xml) throws MalformedURLException, IOException {
        String str = "";
        MyHelperClass OSdbServer = new MyHelperClass();
        String strona =(String)(Object) OSdbServer;
        String logowanie = xml;
        URL url = new URL(strona);
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        connection.setRequestProperty("Connection", "Close");
        connection.setRequestProperty("Content-Type", "text/xml");
        connection.setDoOutput(true);
        connection.getOutputStream().write(logowanie.getBytes("UTF-8"));
        Scanner in;
        in = new Scanner((Readable)(Object)connection.getInputStream());
        while (in.hasNextLine()) {
            str += in.nextLine();
        }
        ;
        return str;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(byte[] o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
