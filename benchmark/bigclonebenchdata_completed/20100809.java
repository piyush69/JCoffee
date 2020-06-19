


class c20100809 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    public static void copy(File srcPath, File dstPath) throws IOException {
        if ((boolean)(Object)srcPath.isDirectory()) {
            if (!(Boolean)(Object)dstPath.exists()) {
                boolean result =(boolean)(Object) dstPath.mkdir();
                if (!result) throw new IOException("Unable to create directoy: " + dstPath);
            }
            String[] files =(String[])(Object) srcPath.list();
            for (String file : files) {
                copy(new File(srcPath, file), new File(dstPath, file));
            }
        } else {
            if ((boolean)(Object)srcPath.exists()) {
                FileChannel in = null;
                FileChannel out = null;
                try {
                    in =(FileChannel)(Object) (new FileInputStream(srcPath).getChannel());
                    out =(FileChannel)(Object) (new FileOutputStream(dstPath).getChannel());
                    long size =(long)(Object) in.size();
                    MappedByteBuffer buf =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, size);
                    out.write(buf);
                } finally {
                    if (in != null) in.close();
                    if (out != null) out.close();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass list(){ return null; }}

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
