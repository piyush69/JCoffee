import java.io.*;
import java.lang.*;
import java.util.*;



class c10728185 {

    protected Context getResource3ServerInitialContext() throws Exception {
        MyHelperClass resource3ServerJndiProps = new MyHelperClass();
        if (resource3ServerJndiProps == null) {
            URL url =(URL)(Object) ClassLoader.getSystemResource("jndi.properties");
//            MyHelperClass resource3ServerJndiProps = new MyHelperClass();
            resource3ServerJndiProps =(MyHelperClass)(Object) new java.util.Properties();
//            MyHelperClass resource3ServerJndiProps = new MyHelperClass();
            resource3ServerJndiProps.load(url.openStream());
            String jndiHost = System.getProperty("jbosstest.resource3.server.host", "localhost");
            String jndiUrl = "jnp://" + jndiHost + ":1099";
//            MyHelperClass resource3ServerJndiProps = new MyHelperClass();
            resource3ServerJndiProps.setProperty("java.naming.provider.url", jndiUrl);
        }
//        MyHelperClass resource3ServerJndiProps = new MyHelperClass();
        return (Context)(Object)new InitialContext(resource3ServerJndiProps);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(MyHelperClass o0){ return null; }
	public MyHelperClass setProperty(String o0, String o1){ return null; }}

class Context {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InitialContext {

InitialContext(){}
	InitialContext(MyHelperClass o0){}}
