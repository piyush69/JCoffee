import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14037891 {

    private void transformFile(File input, File output, Cipher cipher, boolean compress, String progressMessage) throws Throwable, IOException {
        FileInputStream fileInputStream = new FileInputStream(input);
        InputStream inputStream;
        if (progressMessage != null) {
            inputStream =(InputStream)(Object) new ProgressMonitorInputStream(null, progressMessage, fileInputStream);
        } else {
            inputStream = fileInputStream;
        }
        FilterInputStream is = new BufferedInputStream(inputStream);
        FilterOutputStream os = new BufferedOutputStream(new FileOutputStream(output));
        FilterInputStream fis;
        FilterOutputStream fos;
        if (compress) {
            fis = is;
            fos =(FilterOutputStream)(Object) new GZIPOutputStream(new CipherOutputStream(os, cipher));
        } else {
            fis =(FilterInputStream)(Object) new GZIPInputStream(new CipherInputStream(is, cipher));
            fos = os;
        }
        MyHelperClass blocksInBuffer = new MyHelperClass();
        byte[] buffer = new byte[(int)(Object)cipher.getBlockSize() * (int)(Object)blocksInBuffer];
        int readLength = fis.read(buffer);
        while (readLength != -1) {
            fos.write(buffer, 0, readLength);
            readLength = fis.read(buffer);
        }
        if (compress) {
            GZIPOutputStream gos = (GZIPOutputStream)(GZIPOutputStream)(Object) fos;
            gos.finish();
        }
        fos.close();
        fis.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Cipher {

public MyHelperClass getBlockSize(){ return null; }}

class ProgressMonitorInputStream {

ProgressMonitorInputStream(Object o0, String o1, FileInputStream o2){}
	ProgressMonitorInputStream(){}}

class GZIPOutputStream {

GZIPOutputStream(CipherOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass finish(){ return null; }}

class CipherOutputStream {

CipherOutputStream(){}
	CipherOutputStream(FilterOutputStream o0, Cipher o1){}}

class GZIPInputStream {

GZIPInputStream(CipherInputStream o0){}
	GZIPInputStream(){}}

class CipherInputStream {

CipherInputStream(FilterInputStream o0, Cipher o1){}
	CipherInputStream(){}}
