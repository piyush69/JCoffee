


class c7460370 {
public static MyHelperClass DECODE;
//public MyHelperClass DECODE;

    public static boolean decodeFileToFile(String infile, String outfile) {
        boolean success = false;
        java.io.InputStream in = null;
        java.io.OutputStream out = null;
        try {
            in =(java.io.InputStream)(Object)(InputStream)(Object) new B64InputStream((BufferedInputStream)(Object)new java.io.BufferedInputStream(new java.io.FileInputStream(infile)), DECODE);
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

}

class B64InputStream {

B64InputStream(BufferedInputStream o0, MyHelperClass o1){}
	B64InputStream(){}}

class BufferedInputStream {

}

class InputStream {

}
