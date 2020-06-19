


class c6908554 {
public static MyHelperClass FD_WRITE;
//public MyHelperClass FD_WRITE;

    static void reopen(MJIEnv env, int objref) throws IOException {
        int fd =(int)(Object) env.getIntField(objref, "fd");
        long off =(long)(Object) env.getLongField(objref, "off");
        MyHelperClass content = new MyHelperClass();
        if (content.get(fd) == null) {
            int mode =(int)(Object) env.getIntField(objref, "mode");
            int fnRef =(int)(Object) env.getReferenceField(objref, "fileName");
            String fname =(String)(Object) env.getStringObject(fnRef);
            MyHelperClass FD_READ = new MyHelperClass();
            if (mode == (int)(Object)FD_READ) {
                FileInputStream fis = new FileInputStream(fname);
                FileChannel fc =(FileChannel)(Object) fis.getChannel();
                fc.position(off);
//                MyHelperClass content = new MyHelperClass();
                content.set(fd, fis);
            MyHelperClass FD_WRITE = new MyHelperClass();
            } else if (mode == (int)(Object)FD_WRITE) {
                FileOutputStream fos = new FileOutputStream(fname);
                FileChannel fc =(FileChannel)(Object) fos.getChannel();
                fc.position(off);
//                MyHelperClass content = new MyHelperClass();
                content.set(fd, fos);
            } else {
                env.throwException("java.io.IOException", "illegal mode: " + mode);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass set(int o0, FileOutputStream o1){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass set(int o0, FileInputStream o1){ return null; }}

class MJIEnv {

public MyHelperClass getStringObject(int o0){ return null; }
	public MyHelperClass getLongField(int o0, String o1){ return null; }
	public MyHelperClass getIntField(int o0, String o1){ return null; }
	public MyHelperClass getReferenceField(int o0, String o1){ return null; }
	public MyHelperClass throwException(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass position(long o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
