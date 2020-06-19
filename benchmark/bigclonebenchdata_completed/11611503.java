import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11611503 {
public static MyHelperClass Out;
	public static MyHelperClass ErrorMessages;
	public static MyHelperClass readSkel(BufferedReader o0){ return null; }
//public MyHelperClass Out;
//	public MyHelperClass ErrorMessages;
//	public MyHelperClass readSkel(BufferedReader o0){ return null; }

    public static void readDefault()  throws Throwable {
        ClassLoader l = Skeleton.class.getClassLoader();
        URL url;
        if (l != null) {
            MyHelperClass DEFAULT_LOC = new MyHelperClass();
            url = l.getResource((String)(Object)DEFAULT_LOC);
        } else {
            MyHelperClass DEFAULT_LOC = new MyHelperClass();
            url = ClassLoader.getSystemResource((String)(Object)DEFAULT_LOC);
        }
        if (url == null) {
            MyHelperClass ErrorMessages = new MyHelperClass();
            Out.error(ErrorMessages.SKEL_IO_ERROR_DEFAULT);
            throw new GeneratorException();
        }
        try {
            InputStreamReader reader = new InputStreamReader(url.openStream());
            readSkel(new BufferedReader(reader));
        } catch (IOException e) {
            Out.error(ErrorMessages.SKEL_IO_ERROR_DEFAULT);
            throw new GeneratorException();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SKEL_IO_ERROR_DEFAULT;
public MyHelperClass error(MyHelperClass o0){ return null; }}

class Skeleton {

}

class GeneratorException extends Exception{
	public GeneratorException(String errorMessage) { super(errorMessage); }
	GeneratorException(){}
}
