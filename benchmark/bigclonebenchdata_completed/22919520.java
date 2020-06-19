


class c22919520 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    public static void copyFile(String sourceFilePath, String destFilePath) throws IOException {
        FileChannel in = null;
        FileChannel out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(sourceFilePath).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(destFilePath).getChannel());
            long inputSize =(long)(Object) in.size();
            in.transferTo(0, inputSize, out);
            MappedByteBuffer buf =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, inputSize);
            out.write(buf);
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferTo(int o0, long o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class MappedByteBuffer {

}
