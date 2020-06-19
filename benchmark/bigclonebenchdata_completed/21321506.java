import java.io.*;
import java.lang.*;
import java.util.*;



class c21321506 {

    public static int convertImage(InputStream is, OutputStream os, String command) throws IOException, InterruptedException {
        MyHelperClass logger = new MyHelperClass();
        if ((boolean)(Object)logger.isInfoEnabled()) {
//            MyHelperClass logger = new MyHelperClass();
            logger.info(command);
        }
        Process p = Runtime.getRuntime().exec(command);
        ByteArrayOutputStream errOut = new ByteArrayOutputStream();
        StreamGobbler errGobbler = new StreamGobbler(p.getErrorStream(), errOut, "Convert Thread (err gobbler): " + command);
        errGobbler.start();
        StreamGobbler outGobbler = new StreamGobbler(new BufferedInputStream(is), p.getOutputStream(), "Convert Thread (out gobbler): " + command);
        outGobbler.start();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(p.getInputStream(), os);
            os.flush();
            if (p.waitFor() != 0) {
//                MyHelperClass logger = new MyHelperClass();
                logger.error("Unable to convert, stderr: " + new String(errOut.toByteArray(), "UTF-8"));
            }
            return p.exitValue();
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(os);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass isInfoEnabled(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class StreamGobbler {

StreamGobbler(){}
	StreamGobbler(BufferedInputStream o0, OutputStream o1, String o2){}
	StreamGobbler(InputStream o0, ByteArrayOutputStream o1, String o2){}
	public MyHelperClass start(){ return null; }}
