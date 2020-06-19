import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16576182 {
public MyHelperClass url;
	public MyHelperClass write(){ return null; }

    public Output openOutput() throws Throwable, java.io.IOException {
        URL url =(URL)(Object) this.url;
        if (null != url) {
            URLConnection connection = url.openConnection();
            connection.setDoOutput(true);
            if ((Connection)(Object)connection instanceof Connection) {
                ((Connection)(Connection)(Object) connection).setReference(this);
            }
            return(Output)(Object) new ReferenceOutputStream(this, connection);
        }
        HttpMessage container =(HttpMessage)(Object) this.write();
        return(Output)(Object) new ReferenceOutputStream(this, container);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ReferenceOutputStream {

ReferenceOutputStream(c16576182 o0, HttpMessage o1){}
	ReferenceOutputStream(){}
	ReferenceOutputStream(c16576182 o0, URLConnection o1){}}

class HttpMessage {

}

class Output {

}

class Connection {

public MyHelperClass setReference(c16576182 o0){ return null; }}
