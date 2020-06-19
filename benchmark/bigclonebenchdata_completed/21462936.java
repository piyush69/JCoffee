import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21462936 {
public MyHelperClass IOUtils;
	public MyHelperClass unzip;
	public MyHelperClass byteArrayOutputStream;
	public MyHelperClass getCharsetName(){ return null; }

//    @Override
    public String toString()  throws Throwable {
        String charsetName =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getCharsetName();
        if (charsetName == null) charsetName = "ISO-8859-1";
        try {
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)unzip) {
                GZIPInputStream gzipInputStream = new GZIPInputStream(new ByteArrayInputStream((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(byte[])(Object)byteArrayOutputStream.toByteArray()));
                ByteArrayOutputStream unzippedResult = new ByteArrayOutputStream();
                IOUtils.copy(gzipInputStream, unzippedResult);
                return unzippedResult.toString(charsetName);
            } else {
                return byteArrayOutputStream.toString(charsetName);
            }
        } catch (UnsupportedEncodingException e) {
            throw new OutputException((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)e);
        } catch (IOException e) {
            throw new OutputException((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass copy(GZIPInputStream o0, ByteArrayOutputStream o1){ return null; }}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(ByteArrayInputStream o0){}}

class OutputException extends Exception{
	public OutputException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(String o0){ return null; }}
