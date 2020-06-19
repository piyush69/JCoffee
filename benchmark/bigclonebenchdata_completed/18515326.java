
import java.io.UncheckedIOException;


class c18515326 {

    public static boolean cpy(File a, File b) {
        try {
            FileInputStream astream = null;
            FileOutputStream bstream = null;
            try {
                astream = new FileInputStream(a);
                bstream = new FileOutputStream(b);
                long flength =(long)(Object) a.length();
                int bufsize = (int) Math.min(flength, 1024);
                byte buf[] = new byte[bufsize];
                long n = 0;
                while (n < flength) {
                    int naread =(int)(Object) astream.read(buf);
                    bstream.write(buf, 0, naread);
                    n += naread;
                }
            } finally {
                if (astream != null) astream.close();
                if (bstream != null) bstream.close();
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass length(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
