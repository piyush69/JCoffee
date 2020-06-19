import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21553327 {
public MyHelperClass NULL;
public MyHelperClass Log;
	public MyHelperClass DigestUtils;
	public MyHelperClass eval(MyHelperClass o0){ return null; }
public MyHelperClass JiveScriptEngine;
	public MyHelperClass NetworkImplementorIntf;
	public MyHelperClass loading;
	public MyHelperClass echo(String o0){ return null; }

//    @JiveScriptCommand(help = "Load and executes a JiveScript file")
    public void load(String path) throws Throwable, JiveScriptException, IOException {
        boolean loading =(boolean)(Object) NULL; //new boolean();
        loading = true;
        MyHelperClass JivesScene = new MyHelperClass();
        JivesScene.setActiveScene(null);
        MyHelperClass JiveScriptEngine = new MyHelperClass();
        boolean allowScripting =(boolean)(Object) JiveScriptEngine.allowScripting;
//        MyHelperClass JiveScriptEngine = new MyHelperClass();
        JiveScriptEngine.allowScripting =(MyHelperClass)(Object) true;
//        MyHelperClass JiveScriptEngine = new MyHelperClass();
        JiveScriptEngine.FILENAME = null;
        URL url = new URL(path);
        InputStream fis = url.openStream();
        if (fis == null) {
            throw new IOException("Unable to open file at path " + path);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String script =(String)(Object) NULL; //new String();
        script = "";
        String line;
        while ((line = br.readLine()) != null) {
//            MyHelperClass script = new MyHelperClass();
            script = script.concat(line) + Log.LINE_SEPARATOR;
        }
//        MyHelperClass script = new MyHelperClass();
        eval((MyHelperClass)(Object)script);
//        MyHelperClass JiveScriptEngine = new MyHelperClass();
        if (JiveScriptEngine.FILENAME == null) {
            String filename = path.substring(path.lastIndexOf(File.separatorChar) + 1);
//            MyHelperClass JiveScriptEngine = new MyHelperClass();
            JiveScriptEngine.FILENAME =(MyHelperClass)(Object) filename;
        }
//        MyHelperClass JiveScriptEngine = new MyHelperClass();
        JiveScriptEngine.MD5 = DigestUtils.md5Hex(script.toString().getBytes());
        MyHelperClass Jives = new MyHelperClass();
        NetworkImplementorIntf networkImplementor =(NetworkImplementorIntf)(Object) Jives.getNetwork();
        MyHelperClass NetworkImplementorIntf = new MyHelperClass();
        Object[] config = (Object[])(Object[])(Object) networkImplementor.getConnectionState(NetworkImplementorIntf.CONNECTIONSTATE_ALL);
//        MyHelperClass NetworkImplementorIntf = new MyHelperClass();
        boolean internet = (Boolean) config[(int)(Object)NetworkImplementorIntf.CONNECTIONSTATE_INTERNET];
        if (internet) {
            echo("Starting network on the internet");
        } else {
            boolean ipv6 = (Boolean) config[(int)(Object)NetworkImplementorIntf.CONNECTIONSTATE_IPV6];
            String connection = (String) config[(int)(Object)NetworkImplementorIntf.CONNECTIONSTATE_RENDEZVOUS_IPV4] + ":" + (Integer) config[(int)(Object)NetworkImplementorIntf.CONNECTIONSTATE_RENDEZVOUS_IPV4_PORT];
            if (ipv6) {
                connection = (String)(String)(Object) networkImplementor.getConnectionState(NetworkImplementorIntf.CONNECTIONSTATE_RENDEZVOUS_IPV6) + ":" + (Integer)(Integer)(Object) networkImplementor.getConnectionState(NetworkImplementorIntf.CONNECTIONSTATE_RENDEZVOUS_IPV6_PORT);
            }
            echo("Starting network on " + connection);
        }
        networkImplementor.startNetwork(JiveScriptEngine.FILENAME, JiveScriptEngine.MD5);
        fis.close();
        if ((boolean)(Object)JiveScriptEngine.allowScripting && !allowScripting) {
            JiveScriptEngine.allowScripting =(MyHelperClass)(Object) allowScripting;
        }
        loading =(boolean)(Object)(MyHelperClass)(Object) false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LINE_SEPARATOR;
	public MyHelperClass CONNECTIONSTATE_RENDEZVOUS_IPV6;
	public MyHelperClass CONNECTIONSTATE_RENDEZVOUS_IPV4;
	public MyHelperClass CONNECTIONSTATE_RENDEZVOUS_IPV6_PORT;
	public MyHelperClass MD5;
	public MyHelperClass CONNECTIONSTATE_RENDEZVOUS_IPV4_PORT;
	public MyHelperClass CONNECTIONSTATE_ALL;
	public MyHelperClass allowScripting;
	public MyHelperClass CONNECTIONSTATE_INTERNET;
	public MyHelperClass FILENAME;
	public MyHelperClass CONNECTIONSTATE_IPV6;
public MyHelperClass getNetwork(){ return null; }
	public MyHelperClass md5Hex(byte[] o0){ return null; }
	public MyHelperClass concat(String o0){ return null; }
	public MyHelperClass setActiveScene(Object o0){ return null; }}

class JiveScriptException extends Exception{
	public JiveScriptException(String errorMessage) { super(errorMessage); }
}

class JiveScriptCommand {

}

class NetworkImplementorIntf {

public MyHelperClass getConnectionState(MyHelperClass o0){ return null; }
	public MyHelperClass startNetwork(MyHelperClass o0, MyHelperClass o1){ return null; }}
