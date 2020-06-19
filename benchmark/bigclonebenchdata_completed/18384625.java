import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18384625 {
public MyHelperClass numConns;
public MyHelperClass pool;

    private void setupPool()  throws Throwable {
        this.pool =(MyHelperClass)(Object) new ObjectPool(this.numConns) {

            protected Object getNewObject() throws IOException {
                URLConnection conn = HTTPMessageDeliveryImpl.this.url.openConnection();
                conn.setDoInput(true);
                conn.setDoOutput(true);
                conn.setUseCaches(false);
                conn.setRequestProperty("Content-Type", "text/xml");
                return conn;
            }
        };
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ObjectPool {

ObjectPool(MyHelperClass o0){}
	ObjectPool(){}}

class HTTPMessageDeliveryImpl {

}
