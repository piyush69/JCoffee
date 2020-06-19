import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19591847 {
public MyHelperClass context;
	public MyHelperClass target;
	public MyHelperClass ExecutionContext;
	public MyHelperClass requestCount;
	public MyHelperClass count;
	public MyHelperClass exception;

//        @Override
        public void run()  throws Throwable {
            try {
                for (int r = 0; r < this.requestCount; r++) {
                    HttpGet httpget = new HttpGet("/");
                    HttpResponse response = this.httpclient.execute(this.target, httpget, this.context);
                    this.count++;
                    ManagedClientConnection conn = (ManagedClientConnection) this.context.getAttribute(ExecutionContext.HTTP_CONNECTION);
                    this.context.setAttribute("r" + r, conn.getState());
                    HttpEntity entity = response.getEntity();
                    if (entity != null) {
                        entity.consumeContent();
                    }
                }
            } catch (Exception ex) {
                this.exception = ex;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpGet {

}

class HttpResponse {

}

class ManagedClientConnection {

}

class HttpEntity {

}
