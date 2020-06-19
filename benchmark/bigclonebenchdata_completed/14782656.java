import java.io.*;
import java.lang.*;
import java.util.*;



class c14782656 {
public static MyHelperClass previousStatusTime;
	public static MyHelperClass SWGCraft;
//public MyHelperClass SWGCraft;
//	public MyHelperClass previousStatusTime;

    private static Long statusSWGCraftTime() {
        long current = System.currentTimeMillis() / 1000L;
        MyHelperClass previousStatusCheck = new MyHelperClass();
        if (current < ((int)(Object)previousStatusCheck + (int)(Object)SWGCraft.STATUS_CHECK_DELAY)) return (Long)(Object)previousStatusTime;
        URL url = null;
        try {
            MyHelperClass previousStatusTime = new MyHelperClass();
            synchronized (previousStatusTime) {
//                MyHelperClass previousStatusCheck = new MyHelperClass();
                if (current >=(int)(Object) previousStatusCheck + (int)(Object)SWGCraft.STATUS_CHECK_DELAY) {
                    MyHelperClass SWGCraft = new MyHelperClass();
                    url =(URL)(Object) SWGCraft.getStatusTextURL();
                    MyHelperClass ZReader = new MyHelperClass();
                    String statusTime =(String)(Object) ZReader.read(url.openStream());
//                    MyHelperClass previousStatusTime = new MyHelperClass();
                    previousStatusTime =(MyHelperClass)(Object) Long.valueOf(statusTime);
//                    MyHelperClass previousStatusCheck = new MyHelperClass();
                    previousStatusCheck =(MyHelperClass)(Object) current;
                }
//                MyHelperClass previousStatusTime = new MyHelperClass();
                return (Long)(Object)previousStatusTime;
            }
        } catch (UncheckedIOException e) {
            MyHelperClass SWGCraft = new MyHelperClass();
            SWGCraft.showUnknownHostDialog(url,(UnknownHostException)(Object) e);
        } catch (Throwable e) {
            MyHelperClass SWGAide = new MyHelperClass();
            SWGAide.printDebug("cmgr", 1, "SWGResourceManager:statusSWGCraftTime:", e.toString());
        }
        return Long.valueOf(0);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STATUS_CHECK_DELAY;
public MyHelperClass showUnknownHostDialog(URL o0, UnknownHostException o1){ return null; }
	public MyHelperClass printDebug(String o0, int o1, String o2, String o3){ return null; }
	public MyHelperClass getStatusTextURL(){ return null; }
	public MyHelperClass read(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}
