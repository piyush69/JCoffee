import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6368581 {

    private URLConnection getConnection(String url, int count)  throws Throwable {
        URLConnection conn = null;
        try {
            conn = new URL(url).openConnection();
        } catch (IOException e) {
            if (count < 5) {
                System.out.println();
                System.out.print("getConnection failed - ");
                System.out.println(count);
                System.out.println("Trying again ...");
                conn = this.getConnection(url, count++);
            } else {
                System.out.println("Giving up");
                throw new OntopiaRuntimeException((String)(Object)e);
            }
        }
        return conn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class OntopiaRuntimeException extends Exception{
	public OntopiaRuntimeException(String errorMessage) { super(errorMessage); }
}
