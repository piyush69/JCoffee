


class c7713594 {
public static MyHelperClass isHiddenOrDotFile(File o0){ return null; }
//public MyHelperClass isHiddenOrDotFile(File o0){ return null; }

    private static void copyFile(File source, File dest, boolean visibleFilesOnly) throws IOException {
        if (visibleFilesOnly && (boolean)(Object)isHiddenOrDotFile(source)) {
            return;
        }
        if ((boolean)(Object)dest.exists()) {
            System.err.println("Destination File Already Exists: " + dest);
        }
        FileChannel in = null, out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            in.transferTo(0, in.size(), out);
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
