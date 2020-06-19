import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17682090 {
public MyHelperClass getReader(MyHelperClass o0){ return null; }
	public MyHelperClass getWriter(MyHelperClass o0){ return null; }
public MyHelperClass getFileInputStream(String o0){ return null; }
	public MyHelperClass transform(Reader o0, Writer o1, Map<String,Object> o2){ return null; }
	public MyHelperClass getFileOutputStream(String o0){ return null; }

    public Reader transform(Reader reader, Map<String, Object> parameterMap)  throws Throwable {
        try {
            File file = File.createTempFile("srx2", ".srx");
            file.deleteOnExit();
            Writer writer =(Writer)(Object) getWriter(getFileOutputStream(file.getAbsolutePath()));
            transform(reader, writer, parameterMap);
            writer.close();
            Reader resultReader =(Reader)(Object) getReader(getFileInputStream(file.getAbsolutePath()));
            return resultReader;
        } catch (IOException e) {
            throw new IORuntimeException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IORuntimeException extends Exception{
	public IORuntimeException(String errorMessage) { super(errorMessage); }
}
