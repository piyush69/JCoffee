import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8330057 {
public MyHelperClass showObjectProperty(URLConnection o0, String o1, MyHelperClass o2){ return null; }
public MyHelperClass Streams;
	public MyHelperClass FORMAT;
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass showObjectProperty(URLConnection o0, String o1){ return null; }

    public void getHttpURL() throws Throwable, Exception {
        boolean display = true;
        boolean allHeaders = false;
        String url = null;
        url = "http://localhost/cubigraf2";
        url = "http://www.accenture.com/NR/rdonlyres/971C4EEE-24E2-4BAA-8C7B-D5A5133D5968/0/en_sprout.jpg";
        url = "http://www.uni.pt/img/home-direito.gif";
        url = "http://www.google.com";
        URLConnection uc = new URL(url).openConnection();
        println("HEADERS:");
        if (allHeaders) {
            Iterator<Map.Entry<String, List<String>>> itHeaders = uc.getHeaderFields().entrySet().iterator();
            while (itHeaders.hasNext()) {
                Map.Entry<String, List<String>> e = itHeaders.next();
                Iterator<?> itValues = e.getValue().iterator();
                while (itValues.hasNext()) {
                    println(e.getKey() + ": " + itValues.next());
                }
            }
        } else {
            showObjectProperty(uc, "getContentEncoding");
            showObjectProperty(uc, "getContentLength");
            showObjectProperty(uc, "getContentType");
            showObjectProperty(uc, "getDate", FORMAT.TIMESTAMP);
            showObjectProperty(uc, "getExpiration", FORMAT.TIMESTAMP);
            showObjectProperty(uc, "getLastModified", FORMAT.TIMESTAMP);
        }
        ExtendedInputStream in = new ExtendedInputStream(uc.getInputStream(), url.toString());
        if (display) {
            println("BODY:");
            ExtendedReader reader = new ExtendedReader(in);
            for (String s =(String)(Object) reader.readLine(); s != null; s =(String)(Object) reader.readLine()) {
                println(s);
            }
        } else {
            println("(BODY saved to a file)");
            String contentType = uc.getContentType();
            StringBuilder filename = new StringBuilder("C:\\Documents and Settings\\Carlos_da_S_Pereira\\Desktop\\JAVA_NET_TESTS");
            filename.append(".");
            filename.append(contentType.substring(contentType.indexOf("/") + 1));
            File file = new File(filename.toString());
            ExtendedOutputStream out = new ExtendedOutputStream(new FileOutputStream(file), file.getAbsolutePath());
            Streams.copy(in, out);
            out.close();
        }
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TIMESTAMP;
public MyHelperClass copy(ExtendedInputStream o0, ExtendedOutputStream o1){ return null; }}

class ExtendedInputStream {

ExtendedInputStream(InputStream o0, String o1){}
	ExtendedInputStream(){}
	public MyHelperClass close(){ return null; }}

class ExtendedReader {

ExtendedReader(ExtendedInputStream o0){}
	ExtendedReader(){}
	public MyHelperClass readLine(){ return null; }}

class ExtendedOutputStream {

ExtendedOutputStream(){}
	ExtendedOutputStream(FileOutputStream o0, String o1){}
	public MyHelperClass close(){ return null; }}
