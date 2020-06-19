import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10846738 {
public static MyHelperClass IOUtils;
//public MyHelperClass IOUtils;

    private static <OS extends OutputStream> OS getUnzipAndDecodeOutputStream(InputStream inputStream, final OS outputStream)  throws Throwable {
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();
        final List<Throwable> ungzipThreadThrowableList = new LinkedList<Throwable>();
        Writer decoderWriter = null;
        Thread ungzipThread = null;
        try {
            final PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
            ungzipThread = new Thread(new Runnable() {

                public void run() {
                    GZIPInputStream gzipInputStream = null;
                    try {
                        gzipInputStream = new GZIPInputStream(pipedInputStream);
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(gzipInputStream,(OS)(Object)(OS)(Object)(OS)(Object)(OS)(Object)(OS)(Object)(OS)(Object)(OS)(Object) outputStream);
                    } catch (Throwable t) {
                        ungzipThreadThrowableList.add(t);
                    } finally {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.closeQuietly(gzipInputStream);
//                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.closeQuietly(pipedInputStream);
                    }
                }
            });
            decoderWriter =(Writer)(Object) Base64.newDecoder(pipedOutputStream);
            ungzipThread.start();
            MyHelperClass DVK_MESSAGE_CHARSET = new MyHelperClass();
            IOUtils.copy(inputStream, decoderWriter, DVK_MESSAGE_CHARSET);
            decoderWriter.flush();
            pipedOutputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException("failed to unzip and decode input", e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(decoderWriter);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(pipedOutputStream);
            if (ungzipThread != null) {
                try {
                    ungzipThread.join();
                } catch (InterruptedException ie) {
                    throw new RuntimeException("thread interrupted while for ungzip thread to finish", ie);
                }
            }
        }
        if (!ungzipThreadThrowableList.isEmpty()) {
            throw new RuntimeException("ungzip failed", ungzipThreadThrowableList.get(0));
        }
        return outputStream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, Writer o1, MyHelperClass o2){ return null; }
	public MyHelperClass closeQuietly(Writer o0){ return null; }
	public MyHelperClass closeQuietly(PipedOutputStream o0){ return null; }
	public MyHelperClass closeQuietly(PipedInputStream o0){ return null; }
	public MyHelperClass copy(GZIPInputStream o0, OS o1){ return null; }
	public MyHelperClass closeQuietly(GZIPInputStream o0){ return null; }}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(PipedInputStream o0){}}

class Base64 {

public static MyHelperClass newDecoder(PipedOutputStream o0){ return null; }}

class OS {

}
