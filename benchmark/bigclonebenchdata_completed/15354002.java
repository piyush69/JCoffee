import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15354002 {
public MyHelperClass name;
	public MyHelperClass server;
	public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass waitToStop(){ return null; }

    public void testAuthentication() throws Exception {
        String host = "localhost";
        MyHelperClass DEFAULT_PORT = new MyHelperClass();
        int port =(int)(Object) DEFAULT_PORT;
        URL url = new URL("http://" + host + ":" + port + "/");
        URLConnection connection = url.openConnection();
        InputStream in = connection.getInputStream();
        in.close();
        waitToStop();
        server.setAttribute(name, new Attribute("AuthenticationMethod", "basic"));
        server.invoke(name, "addAuthorization", new Object[] { "mx4j", "mx4j" }, new String[] { "java.lang.String", "java.lang.String" });
        server.invoke(name, "start", null, null);
        url = new URL("http://" + host + ":" + port + "/");
        connection = url.openConnection();
        try {
            in = connection.getInputStream();
        } catch (Exception e) {
        } finally {
            in.close();
        }
        assertEquals(((HttpURLConnection) connection).getResponseCode(), 401);
        url = new URL("http://" + host + ":" + port + "/");
        connection = url.openConnection();
        connection.setRequestProperty("Authorization", "basic bXg0ajpteDRq");
        in = connection.getInputStream();
        in.close();
        waitToStop();
        server.setAttribute(name, new Attribute("AuthenticationMethod", "none"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass invoke(MyHelperClass o0, String o1, Object o2, Object o3){ return null; }
	public MyHelperClass setAttribute(MyHelperClass o0, Attribute o1){ return null; }
	public MyHelperClass invoke(MyHelperClass o0, String o1, Object[] o2, String[] o3){ return null; }}

class Attribute {

Attribute(String o0, String o1){}
	Attribute(){}}
