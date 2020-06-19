import java.io.*;
import java.lang.*;
import java.util.*;



class c16961459 {

//    @Test
    public void testConfigurartion() {
        try {
            Enumeration<URL> assemblersToRegister =(Enumeration<URL>)(Object) this.getClass().getClassLoader().getResources("META-INF/PrintAssemblerFactory.properties");
            MyHelperClass log = new MyHelperClass();
            log.debug("PrintAssemblerFactory " + SimplePrintJobTest.class.getClassLoader().getResource("META-INF/PrintAssemblerFactory.properties"));
//            MyHelperClass log = new MyHelperClass();
            log.debug("ehcache " + SimplePrintJobTest.class.getClassLoader().getResource("ehcache.xml"));
//            MyHelperClass log = new MyHelperClass();
            log.debug("log4j " + this.getClass().getClassLoader().getResource("/log4j.xml"));
//            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) {
                while (assemblersToRegister.hasMoreElements()) {
                    URL url = (URL) assemblersToRegister.nextElement();
                    InputStream in =(InputStream)(Object) url.openStream();
                    BufferedReader buff = new BufferedReader(new InputStreamReader(in));
                    String line = buff.readLine();
                    while (line != null) {
//                        MyHelperClass log = new MyHelperClass();
                        log.debug(line);
                        line = buff.readLine();
                    }
                    buff.close();
                    in.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class Test {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class SimplePrintJobTest {

}
