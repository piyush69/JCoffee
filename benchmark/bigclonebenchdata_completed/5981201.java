


class c5981201 {

    public static void copyFile(File src, File dst) throws IOException {
        MyHelperClass T = new MyHelperClass();
        if ((boolean)(Object)T.t) T.info("Copying " + src + " -> " + dst + "...");
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dst);
        MyHelperClass KB = new MyHelperClass();
        byte buf[] = new byte[40 * (int)(Object)KB];
        int read;
        while ((read =(int)(Object) in.read(buf)) != -1) {
            out.write(buf, 0, read);
        }
        out.flush();
        out.close();
        in.close();
//        MyHelperClass T = new MyHelperClass();
        if ((boolean)(Object)T.t) T.info("File copied.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass t;
public MyHelperClass info(String o0){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
