import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15354003 {
public MyHelperClass name;
	public MyHelperClass server;
	public MyHelperClass assertEquals(int o0, int o1){ return null; }

    public void testAddCommandProcessor() throws Exception {
        String host = "localhost";
        MyHelperClass DEFAULT_PORT = new MyHelperClass();
        int port =(int)(Object) DEFAULT_PORT;
        URLConnection connection = null;
        URL url = new URL("http://" + host + ":" + port + "/nonexistant");
        MyHelperClass name = new MyHelperClass();
        server.invoke(name, "addCommandProcessor", new Object[] { "nonexistant", new DummyCommandProcessor() }, new String[] { "java.lang.String", "mx4j.tools.adaptor.http.HttpCommandProcessor" });
        connection = url.openConnection();
        assertEquals(200, ((HttpURLConnection) connection).getResponseCode());
        server.invoke(name, "removeCommandProcessor", new Object[] { "nonexistant" }, new String[] { "java.lang.String" });
        connection = url.openConnection();
        assertEquals(404, ((HttpURLConnection) connection).getResponseCode());
        server.invoke(name, "addCommandProcessor", new Object[] { "nonexistant", "test.mx4j.tools.adaptor.http.HttpAdaptorTest$DummyCommandProcessor" }, new String[] { "java.lang.String", "java.lang.String" });
        connection = url.openConnection();
        assertEquals(200, ((HttpURLConnection) connection).getResponseCode());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass invoke(MyHelperClass o0, String o1, Object[] o2, String[] o3){ return null; }}

class DummyCommandProcessor {

}
