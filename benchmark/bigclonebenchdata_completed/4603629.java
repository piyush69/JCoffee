import java.io.*;
import java.lang.*;
import java.util.*;



class c4603629 {
public static MyHelperClass USE_NIO;
	public static MyHelperClass LogUtils;
	public static MyHelperClass setLastModified(File o0, long o1){ return null; }
	public static MyHelperClass makeFile(File o0){ return null; }
	public static MyHelperClass pipe(FileInputStream o0, FileOutputStream o1, boolean o2){ return null; }
	public static MyHelperClass copy(File o0, File o1, String o2){ return null; }
//public MyHelperClass USE_NIO;
//	public MyHelperClass LogUtils;
//	public MyHelperClass makeFile(File o0){ return null; }
//	public MyHelperClass setLastModified(File o0, long o1){ return null; }
//	public MyHelperClass copy(File o0, File o1, String o2){ return null; }
//	public MyHelperClass pipe(FileInputStream o0, FileOutputStream o1, boolean o2){ return null; }

    public static boolean copy(File from, File to) {
        if (from.isDirectory()) {
            for (String name : Arrays.asList(from.list())) {
                if (!(Boolean)(Object)copy(from, to, name)) {
                    LogUtils.info("Failed to copy " + name + " from " + from + " to " + to, null);
                    return false;
                }
            }
        } else {
            try {
                FileInputStream is = new FileInputStream(from);
                FileChannel ifc =(FileChannel)(Object) is.getChannel();
                FileOutputStream os =(FileOutputStream)(Object) makeFile(to);
                if ((boolean)(Object)USE_NIO) {
                    FileChannel ofc =(FileChannel)(Object) os.getChannel();
                    ofc.transferFrom(ifc, 0, from.length());
                } else {
                    pipe(is, os, false);
                }
                is.close();
                os.close();
            } catch (IOException ex) {
                LogUtils.warning("Failed to copy " + from + " to " + to, ex);
                return false;
            }
        }
        long time = from.lastModified();
        setLastModified(to, time);
        long newtime = to.lastModified();
        if (newtime != time) {
            LogUtils.info("Failed to set timestamp for file " + to + ": tried " + new Date(time) + ", have " + new Date(newtime), null);
            to.setLastModified(time);
            long morenewtime = to.lastModified();
            return false;
        }
        return time == newtime;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0, IOException o1){ return null; }
	public MyHelperClass info(String o0, Object o1){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, long o2){ return null; }}
