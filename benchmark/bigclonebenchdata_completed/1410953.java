import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1410953 {
public MyHelperClass generator;

    public  c1410953(final File file, int capacity, final IIOCacheArrayObjectMaker iomaker, int chunkSize, String name)  throws Throwable {
        super(capacity, null, chunkSize, name);
        generator =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new ICacheArrayObjectMaker() {

            FileOutputStream outStream;

            FileInputStream inStream;

            FileChannel outChannel;

            FileChannel inChannel;

            boolean inited = false;

            private synchronized void init() {
                if (!inited) {
                    try {
                        outStream = new FileOutputStream(file);
                        inStream = new FileInputStream(file);
                        outChannel =(FileChannel)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) outStream.getChannel();
                        inChannel =(FileChannel)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) inStream.getChannel();
                    } catch (FileNotFoundException foe) {
                        MyHelperClass Logging = new MyHelperClass();
                        Logging.errorln("IOCacheArray constuctor error: Could not open file " + file + ".  Exception " + foe);
//                        MyHelperClass Logging = new MyHelperClass();
                        Logging.errorln("outStream " + outStream + "  inStream " + inStream + "  outchan " + outChannel + "  inchannel " + inChannel);
                    }
                }
                inited = true;
            }

            public Object make(int itemIndex, int baseIndex, Object[] data) {
                init();
                return(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) iomaker.read(inChannel, itemIndex, baseIndex, data);
            }

            public boolean flush(int baseIndex, Object[] data) {
                init();
                return(boolean)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) iomaker.write(outChannel, baseIndex, data);
            }

            public CacheArrayBlockSummary summarize(int baseIndex, Object[] data) {
                init();
                return(CacheArrayBlockSummary)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) iomaker.summarize(baseIndex, data);
            }
        };
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass errorln(String o0){ return null; }}

class IIOCacheArrayObjectMaker {

public MyHelperClass write(FileChannel o0, int o1, Object[] o2){ return null; }
	public MyHelperClass read(FileChannel o0, int o1, int o2, Object[] o3){ return null; }
	public MyHelperClass summarize(int o0, Object[] o1){ return null; }}

class ICacheArrayObjectMaker {

}

class Object {

Object(int o0, Object o1, int o2, String o3){}
	Object(){}}

class FileChannel {

}

class CacheArrayBlockSummary {

}
