import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16930288 {
public MyHelperClass TempStorage;
	public MyHelperClass IOUtils;
	public MyHelperClass tempFile;
	public MyHelperClass mimeCharset;

    public void TempFileTextBody(InputStream is, String mimeCharset) throws IOException {
        this.mimeCharset =(MyHelperClass)(Object) mimeCharset;
        TempPath tempPath =(TempPath)(Object) TempStorage.getInstance().getRootTempPath();
        tempFile = tempPath.createTempFile("attachment", ".txt");
        OutputStream out =(OutputStream)(Object) tempFile.getOutputStream();
        IOUtils.copy(is, out);
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getRootTempPath(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class TempPath {

public MyHelperClass createTempFile(String o0, String o1){ return null; }}
