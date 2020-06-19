


class c19643373 {
public static MyHelperClass DECODE;
	public static MyHelperClass logger;
//public MyHelperClass DECODE;
//	public MyHelperClass logger;

    public static boolean decodeFileToFile(String infile, String outfile) {
        boolean success = false;
        java.io.InputStream in = null;
        java.io.OutputStream out = null;
        try {
            in =(java.io.InputStream)(Object) new InputStream((BufferedInputStream)(Object)new java.io.BufferedInputStream(new java.io.FileInputStream(infile)), DECODE);
            out = new java.io.BufferedOutputStream(new java.io.FileOutputStream(outfile));
            byte[] buffer = new byte[65536];
            int read = -1;
            while ((read = in.read(buffer)) >= 0) {
                out.write(buffer, 0, read);
            }
            success = true;
        } catch (java.io.IOException exc) {
            MyHelperClass Logger = new MyHelperClass();
            logger.error(Logger.SECURITY_FAILURE, "Problem decoding file to file",(IOException)(Object) exc);
        } finally {
            try {
                in.close();
            } catch (Exception exc) {
            }
            try {
                out.close();
            } catch (Exception exc) {
            }
        }
        return success;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SECURITY_FAILURE;
public MyHelperClass error(MyHelperClass o0, String o1, IOException o2){ return null; }}

class InputStream {

InputStream(BufferedInputStream o0, MyHelperClass o1){}
	InputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

}
