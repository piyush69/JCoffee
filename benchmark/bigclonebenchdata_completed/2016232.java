import java.io.*;
import java.lang.*;
import java.util.*;



class c2016232 {
public MyHelperClass url;
public MyHelperClass connection;
	public MyHelperClass Logger;
	public MyHelperClass status;
	public MyHelperClass STATUS_ERROR;
	public MyHelperClass prepareConnectionBeforeConnect(){ return null; }

    protected void initConnection() {
        MyHelperClass connection = new MyHelperClass();
        connection = null;
        try {
//            MyHelperClass connection = new MyHelperClass();
            connection =(MyHelperClass)(Object) (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass downloadedSize = new MyHelperClass();
            connection.setRequestProperty("Range", "bytes=" + downloadedSize + "-");
            prepareConnectionBeforeConnect();
            connection.connect();
        } catch (UncheckedIOException e) {
            status = STATUS_ERROR;
            Logger.getRootLogger().error("problem in connection",(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass getRootLogger(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass connect(){ return null; }}

class HttpURLConnection {

}
