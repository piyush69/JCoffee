import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3708296 {
public MyHelperClass ByteStreams;

    public byte[] transfer(@(Annotation)(Object)Nullable final TransferListener transferListener)  throws Throwable {
        try {
            MyHelperClass url = new MyHelperClass();
            InputStream inputStream = url.openStream();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(inputStream.available());
            if (transferListener != null) {
                inputStream = new ObservableInputStream(inputStream, transferListener);
            }
            MyHelperClass InputSuppliers = new MyHelperClass();
            ByteStreams.copy(InputSuppliers.asInputSupplier(inputStream), outputStream);
            return outputStream.toByteArray();
        } catch (IOException e) {
            throw new UnhandledException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass asInputSupplier(InputStream o0){ return null; }}

class TransferListener {

}

class Nullable {

}

class ObservableInputStream {

ObservableInputStream(InputStream o0, TransferListener o1){}
	ObservableInputStream(){}}

class UnhandledException extends Exception{
	public UnhandledException(String errorMessage) { super(errorMessage); }
}
