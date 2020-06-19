import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19800554 {
public MyHelperClass mimeCharset;
	public MyHelperClass tempFile;
	public MyHelperClass IOUtils;
	public MyHelperClass TempStorage;

    public  void MemoryTextBody(InputStream is, String mimeCharset) throws Throwable, IOException {
        this.mimeCharset =(MyHelperClass)(Object) mimeCharset;
        TempPath tempPath =(TempPath)(Object) TempStorage.getInstance().getRootTempPath();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOUtils.copy(is, out);
        out.close();
        tempFile =(MyHelperClass)(Object) out.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRootTempPath(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class TempPath {

}
