


class c9540845 {
public static MyHelperClass closeIgnoringException(InputStream o0){ return null; }
	public static MyHelperClass closeIgnoringException(OutputStream o0){ return null; }
//public MyHelperClass closeIgnoringException(OutputStream o0){ return null; }
//	public MyHelperClass closeIgnoringException(InputStream o0){ return null; }

    static void copy(String scr, String dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in =(InputStream)(Object) new FileInputStream(scr);
            out =(OutputStream)(Object) new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int n;
            while ((n =(int)(Object) in.read(buf)) >= 0) out.write(buf, 0, n);
        } finally {
            closeIgnoringException(in);
            closeIgnoringException(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
