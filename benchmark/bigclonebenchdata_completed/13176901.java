import java.io.*;
import java.lang.*;
import java.util.*;



class c13176901 {
public MyHelperClass NULL;
public MyHelperClass url;

    public boolean refresh() {
        try {
            MyHelperClass text = new MyHelperClass();
            synchronized (text) {
                MyHelperClass stream = new MyHelperClass();
                stream = (new URL(url)).openStream();
//                MyHelperClass stream = new MyHelperClass();
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)stream));
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }
//                MyHelperClass text = new MyHelperClass();
                text =(MyHelperClass)(Object) sb.toString();
            }
            int price =(int)(Object) NULL; //new int();
            price = 0;
            MyHelperClass date = new MyHelperClass();
            date = null;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            MyHelperClass stream = new MyHelperClass();
            if (stream != null) try {
//                MyHelperClass stream = new MyHelperClass();
                stream.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}
