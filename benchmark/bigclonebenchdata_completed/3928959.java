


class c3928959 {

    public static void copyFile(File from, File to) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(from);
            out = new FileOutputStream(to);
            byte[] bytes = new byte[1024 * 4];
            int len = 0;
            while ((len =(int)(Object) in.read(bytes)) >= 0) out.write(bytes, 0, len);
        } finally {
            MyHelperClass Streams = new MyHelperClass();
            Streams.closeQuietly(in);
//            MyHelperClass Streams = new MyHelperClass();
            Streams.closeQuietly(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}
