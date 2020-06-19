import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15919250 {

    private static byte[] loadBytecodePrivileged()  throws Throwable {
        URL url = SecureCaller.class.getResource("SecureCallerImpl.clazz");
        try {
            InputStream in = url.openStream();
            try {
                ByteArrayOutputStream bout = new ByteArrayOutputStream();
                for (; ; ) {
                    int r = in.read();
                    if (r == -1) {
                        return bout.toByteArray();
                    }
                    bout.write(r);
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new UndeclaredThrowableException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SecureCaller {

}

class UndeclaredThrowableException extends Exception{
	public UndeclaredThrowableException(String errorMessage) { super(errorMessage); }
}
