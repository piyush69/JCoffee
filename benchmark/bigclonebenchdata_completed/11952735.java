


class c11952735 {
public static MyHelperClass logger;
//public MyHelperClass logger;

    public static boolean copyFile(String sourceName, String destName) {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        boolean wasOk = false;
        try {
            sourceChannel =(FileChannel)(Object) (new FileInputStream(sourceName).getChannel());
            destChannel =(FileChannel)(Object) (new FileOutputStream(destName).getChannel());
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
            wasOk = true;
        } catch (Throwable exception) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, "Exception in copyFile", exception);
        } finally {
            try {
                if (sourceChannel != null) sourceChannel.close();
            } catch (Throwable tt) {
            }
            try {
                if (destChannel != null) destChannel.close();
            } catch (Throwable tt) {
            }
        }
        return wasOk;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, Throwable o2){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
