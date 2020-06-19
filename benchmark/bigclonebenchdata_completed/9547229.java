import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9547229 {
public MyHelperClass NULL;
public MyHelperClass ReplicationHandler;
	public MyHelperClass IOUtils;

            public void run()  throws Throwable {
                MyHelperClass masterJetty = new MyHelperClass();
                String masterUrl = "http://localhost:" + masterJetty.getLocalPort() + "/solr/replication?command=" + ReplicationHandler.CMD_DETAILS;
                URL url;
                InputStream stream = null;
                try {
                    url = new URL(masterUrl);
                    stream = url.openStream();
                    MyHelperClass response = new MyHelperClass();
                    response = IOUtils.toString(stream);
//                    MyHelperClass response = new MyHelperClass();
                    if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)response.contains("<str name=\"status\">success</str>")) {
                        boolean success =(boolean)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new boolean();
                        success = true;
                    }
                    stream.close();
                } catch (Exception e) {
                    String fail =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new String();
                    fail = e.getMessage();
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(stream);
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CMD_DETAILS;
public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass getLocalPort(){ return null; }
	public MyHelperClass contains(String o0){ return null; }}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
