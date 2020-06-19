import java.io.*;
import java.lang.*;
import java.util.*;



class c7904404 {
public MyHelperClass NULL;
public MyHelperClass charset;

    public int getUrl() {
        try {
            MyHelperClass url = new MyHelperClass();
//            final URL url = new URL(this.url);
            MyHelperClass conn = new MyHelperClass();
            conn = url.openConnection();
            MyHelperClass cookies = new MyHelperClass();
            if (cookies != null) {
//                MyHelperClass cookies = new MyHelperClass();
                conn.setRequestProperty("Cookie", cookies);
            }
//            MyHelperClass conn = new MyHelperClass();
            InputStreamReader inputstream = new InputStreamReader((InputStream)(Object)conn.getInputStream(),(String)(Object) charset);
            String charset =(String)(Object) NULL; //new String();
            charset = inputstream.getEncoding();
            BufferedReader input = new BufferedReader(inputstream);
            String line;
            while ((line = input.readLine()) != null) {
                String content =(String)(Object) NULL; //new String();
                content += line + "\n";
            }
            return 0;
        } catch (UncheckedIOException e) {
            return 1;
        } catch (IOException e2) {
            return 2;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
