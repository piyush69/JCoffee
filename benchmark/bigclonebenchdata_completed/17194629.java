import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17194629 {

    public static InputStream openRemoteFile(URL urlParam) throws Throwable, KExceptionClass(Throwable)(Object) {
        InputStream result = null;
        try {
            result = urlParam.openStream();
        } catch (IOException error) {
            String message = new String();
            message = "No se puede abrir el recurso [";
            message += urlParam.toString();
            message += "][";
            message += error.toString();
            message += "]";
            throw new KExceptionClass(message, error);
        }
        ;
        return (result);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class KExceptionClass {

KExceptionClass(String o0, IOException o1){}
	KExceptionClass(){}}
