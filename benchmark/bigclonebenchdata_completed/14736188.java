


class c14736188 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    public static void copyFile(File source, File destination) throws IOException {
        FileChannel in = null;
        FileChannel out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(destination).getChannel());
            long size =(long)(Object) in.size();
            MappedByteBuffer buffer =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, size);
            out.write(buffer);
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
public MyHelperClass READ_ONLY;
}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class MappedByteBuffer {

}
