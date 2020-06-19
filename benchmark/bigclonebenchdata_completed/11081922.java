import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c11081922 {
public MyHelperClass name;
	public MyHelperClass server;
	public MyHelperClass assertEquals(int o0, int o1){ return null; }

    public void testAuthentication() throws Exception {
        String host = "localhost";
        int port = 8080;
        URL url = new URL("http://" + host + ":" + port + "/");
        URLConnection connection = url.openConnection();
        InputStream in = connection.getInputStream();
        in.close();
        MyHelperClass name = new MyHelperClass();
        server.invoke(name, "stop", null, null);
//        MyHelperClass name = new MyHelperClass();
        server.setAttribute(name, new Attribute("AuthenticationMethod", "basic"));
//        MyHelperClass name = new MyHelperClass();
        server.invoke(name, "addAuthorization", new Object[] { "openjmx", "openjmx" }, new String[] { "java.lang.String", "java.lang.String" });
//        MyHelperClass name = new MyHelperClass();
        server.invoke(name, "start", null, null);
        url = new URL("http://" + host + ":" + port + "/");
        connection = url.openConnection();
        in = connection.getInputStream();
        in.close();
        assertEquals(((HttpURLConnection) connection).getResponseCode(), 401);
        url = new URL("http://" + host + ":" + port + "/");
        connection = url.openConnection();
        connection.setRequestProperty("Authorization", "basic b3BlbmpteDpvcGVuam14");
        in = connection.getInputStream();
        in.close();
        server.invoke(name, "stop", null, null);
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
