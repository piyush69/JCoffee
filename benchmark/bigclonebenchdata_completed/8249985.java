import java.io.*;
import java.lang.*;
import java.util.*;



class c8249985 {
public MyHelperClass setInputStream(MyHelperClass o0){ return null; }
public MyHelperClass con;
	public MyHelperClass getURL(){ return null; }
	public MyHelperClass getPosition(){ return null; }
	public MyHelperClass getRangeEnd(){ return null; }

    public void initGet() throws Exception {
        URL url = new URL(getURL());
        con =(MyHelperClass)(Object) (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        con.setRequestProperty("Accept", "*/*");
        con.setRequestProperty("Range", "bytes=" + getPosition() + "-" + getRangeEnd());
        con.setUseCaches(false);
        con.connect();
        setInputStream(con.getInputStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

}
