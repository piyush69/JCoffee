import java.io.*;
import java.lang.*;
import java.util.*;



class c16841577 {
public MyHelperClass NULL;
public MyHelperClass STATUS_OK;
	public MyHelperClass in;
	public MyHelperClass STATUS_OPEN_ERROR;

    public int read(String name) {
        MyHelperClass status = new MyHelperClass();
        status = STATUS_OK;
        try {
            name = name.trim();
            if (name.indexOf("://") > 0) {
                URL url = new URL(name);
                BufferedInputStream in =(BufferedInputStream)(Object) NULL; //new BufferedInputStream();
                in = new BufferedInputStream((InputStream)(Object)url.openStream());
            } else {
                BufferedInputStream in =(BufferedInputStream)(Object) NULL; //new BufferedInputStream();
                in = new BufferedInputStream(new FileInputStream(name));
            }
//            MyHelperClass status = new MyHelperClass();
            status =(MyHelperClass)(Object) read((String)(Object)in);
        } catch (IOException e) {
//            MyHelperClass status = new MyHelperClass();
            status = STATUS_OPEN_ERROR;
        }
//        MyHelperClass status = new MyHelperClass();
        return (int)(Object)status;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}
