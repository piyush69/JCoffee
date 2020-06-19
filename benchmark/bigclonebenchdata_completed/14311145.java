


class c14311145 {
public static MyHelperClass LogUtil;
	public static MyHelperClass closeSafe(FileChannel o0){ return null; }
//public MyHelperClass LogUtil;
//	public MyHelperClass closeSafe(FileChannel o0){ return null; }

    public static void copyFile(File src, File dst) throws IOException {
        MyHelperClass TAG = new MyHelperClass();
        LogUtil.d(TAG, "Copying file %s to %s", src, dst);
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            inChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            outChannel =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } finally {
            closeSafe(inChannel);
            closeSafe(outChannel);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass d(MyHelperClass o0, String o1, File o2, File o3){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
