


class c5751313 {
public static MyHelperClass ENCODE;
//public MyHelperClass ENCODE;
	public static MyHelperClass closeQuietly(InputStream o0){ return null; }
//public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }

    public static boolean encodeFileToFile(String infile, String outfile) {
        boolean success = false;
        java.io.InputStream in = null;
        java.io.OutputStream out = null;
        try {
            in =(java.io.InputStream)(Object) new InputStream((BufferedInputStream)(Object)new java.io.BufferedInputStream(new java.io.FileInputStream(infile)), ENCODE);
            out = new java.io.BufferedOutputStream(new java.io.FileOutputStream(outfile));
            byte[] buffer = new byte[65536];
            int read = -1;
            while ((read = in.read(buffer)) >= 0) {
                out.write(buffer, 0, read);
            }
            success = true;
        } catch (java.io.IOException exc) {
            exc.printStackTrace();
        } finally {
            closeQuietly((InputStream)(Object)in);
            closeQuietly((InputStream)(Object)out);
        }
        return success;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

InputStream(){}
	InputStream(BufferedInputStream o0, MyHelperClass o1){}}

class OutputStream {

}

class BufferedInputStream {

}
