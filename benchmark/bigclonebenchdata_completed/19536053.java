import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19536053 {
public MyHelperClass DIR;
	public MyHelperClass extList;

//        @Override
        public InputStream getStream(String uri) throws Throwable, IOException {
            MyHelperClass debug = new MyHelperClass();
            debug.print("uri=" + uri);
            boolean isStreamFile = false;
            for (int i = 0; i < extList.length; i++) {
                MyHelperClass GLOBAL = new MyHelperClass();
                if (uri.toLowerCase().endsWith(GLOBAL.extList[i].toLowerCase())) {
                    isStreamFile = true;
                }
            }
            if (isStreamFile) {
                MyHelperClass GLOBAL = new MyHelperClass();
                GLOBAL.streamFile = DIR + File.separator + uri;
//                MyHelperClass GLOBAL = new MyHelperClass();
                File file = new File((String)(Object)GLOBAL.streamFile);
                URL url = file.toURI().toURL();
                System.out.println("url=" + url);
//                MyHelperClass GLOBAL = new MyHelperClass();
                GLOBAL.cstream = new CountInputStream(url.openStream());
//                MyHelperClass GLOBAL = new MyHelperClass();
                if (GLOBAL.Resume && GLOBAL.positions.containsKey(GLOBAL.streamFile)) {
//                    MyHelperClass GLOBAL = new MyHelperClass();
                    GLOBAL.Resume =(MyHelperClass)(Object) false;
                    if (uri.toLowerCase().endsWith(".mpg") || uri.toLowerCase().endsWith(".vob") || uri.toLowerCase().endsWith(".mp2") || uri.toLowerCase().endsWith(".mpeg") || uri.toLowerCase().endsWith(".mpeg2")) {
//                        MyHelperClass GLOBAL = new MyHelperClass();
                        System.out.println("--Skipping to last bookmark=" + GLOBAL.positions.get(GLOBAL.streamFile));
//                        MyHelperClass GLOBAL = new MyHelperClass();
                        GLOBAL.cstream.skip(GLOBAL.positions.get(GLOBAL.streamFile));
                    }
                }
//                MyHelperClass GLOBAL = new MyHelperClass();
                return(InputStream)(Object) GLOBAL.cstream;
            }
            return this.getStream(uri);
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass cstream;
	public String streamFile;
	public MyHelperClass[] extList;
	public MyHelperClass Resume;
	public MyHelperClass positions;
public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass containsKey(MyHelperClass o0){ return null; }}

class CountInputStream {

CountInputStream(InputStream o0){}
	CountInputStream(){}}
