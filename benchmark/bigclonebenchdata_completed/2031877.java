import java.io.*;
import java.lang.*;
import java.util.*;



class c2031877 {
public MyHelperClass IOUtils;
	public MyHelperClass responseContent;
	public MyHelperClass getResponseStream(){ return null; }

    public byte[] getResponseContent() throws IOException {
        MyHelperClass responseContent = new MyHelperClass();
        if (responseContent == null) {
            InputStream is =(InputStream)(Object) getResponseStream();
            if (is == null) {
                responseContent =(MyHelperClass)(Object) new byte[0];
            } else {
                ByteArrayOutputStream baos = new ByteArrayOutputStream(4096);
                IOUtils.copy(is, baos);
                responseContent =(MyHelperClass)(Object) baos.toByteArray();
            }
        }
        return (byte[])(Object)responseContent;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}
