


class c5704569 {
public static MyHelperClass StaticUtils;
//public MyHelperClass StaticUtils;

    public static void copy(File src, File dest) throws IOException {
        if (!(Boolean)(Object)src.exists()) {
            MyHelperClass OStrings = new MyHelperClass();
            throw new IOException((String)(Object)StaticUtils.format(OStrings.getString("LFC_ERROR_FILE_DOESNT_EXIST"), new Object[] { src.getAbsolutePath() }));
        }
        FileInputStream fis = new FileInputStream(src);
        dest.getParentFile().mkdirs();
        FileOutputStream fos = new FileOutputStream(dest);
        MyHelperClass BUFSIZE = new MyHelperClass();
        byte[] b = new byte[(int)(Object)BUFSIZE];
        int readBytes;
        while ((readBytes =(int)(Object) fis.read(b)) > 0) fos.write(b, 0, readBytes);
        fis.close();
        fos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass format(MyHelperClass o0, Object[] o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

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
