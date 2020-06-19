import java.io.*;
import java.lang.*;
import java.util.*;



class c17431783 {

    protected void registerClasses() throws PrintException {
        MyHelperClass init = new MyHelperClass();
        if (!(Boolean)(Object)init) {
            try {
                Enumeration<URL> somethingToRegister =(Enumeration<URL>)(Object) this.getClass().getClassLoader().getResources("META-INF/" + getClass().getSimpleName() + ".properties");
                while (somethingToRegister.hasMoreElements()) {
                    URL url = (URL) somethingToRegister.nextElement();
                    InputStream in =(InputStream)(Object) url.openStream();
                    BufferedReader buff = new BufferedReader(new InputStreamReader(in));
                    String line = buff.readLine();
                    while (line != null) {
                        MyHelperClass log = new MyHelperClass();
                        log.debug(line);
                        try {
                            Class cls = Class.forName(line);
                            cls.newInstance();
//                            MyHelperClass log = new MyHelperClass();
                            log.debug("class " + line + " registered " + url);
                        } catch (ClassNotFoundException e) {
//                            MyHelperClass log = new MyHelperClass();
                            log.error("class " + line + " not found " + url, e);
                        } catch (InstantiationException e) {
//                            MyHelperClass log = new MyHelperClass();
                            log.error("class " + line + " not found " + url, e);
                        } catch (IllegalAccessException e) {
//                            MyHelperClass log = new MyHelperClass();
                            log.error("class " + line + " not found " + url, e);
                        }
                        line = buff.readLine();
                    }
                    buff.close();
                    in.close();
                }
            } catch (IOException e) {
                throw new PrintException(e.getMessage(), e);
            }
//            MyHelperClass init = new MyHelperClass();
            init =(MyHelperClass)(Object) true;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IllegalAccessException o1){ return null; }
	public MyHelperClass error(String o0, ClassNotFoundException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0, InstantiationException o1){ return null; }}

class PrintException extends Exception{
	public PrintException(String errorMessage) { super(errorMessage); }
	PrintException(){}
	PrintException(String o0, IOException o1){}
}

class URL {

public MyHelperClass openStream(){ return null; }}
