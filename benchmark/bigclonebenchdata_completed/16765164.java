import java.io.*;
import java.lang.*;
import java.util.*;



class c16765164 {
public MyHelperClass NULL;
public MyHelperClass cached;
	public MyHelperClass LOG;
	public MyHelperClass url;

        private void open() throws IOException {
            MyHelperClass in = new MyHelperClass();
            if (in != null) return;
            try {
                MyHelperClass con = new MyHelperClass();
                con = url.openConnection();
//                MyHelperClass in = new MyHelperClass();
                in = con.getInputStream();
            } catch (UncheckedIOException e) {
                MyHelperClass cached = new MyHelperClass();
                if ((boolean)(Object)cached.exists()) {
                    MyHelperClass url = new MyHelperClass();
                    LOG.fine("Falling back to cached copy of wiki file " + url);
//                    MyHelperClass in = new MyHelperClass();
                    in =(MyHelperClass)(Object) new FileInputStream((String)(Object)cached);
                    MyHelperClass con = new MyHelperClass();
                    con = null;
                    return;
                }
                throw e;
            }
            try {
                File tmp =(File)(Object) NULL; //new File();
                tmp = new File(cached.getAbsolutePath() + ".tmp");
//                MyHelperClass tmp = new MyHelperClass();
                tmp.getParentFile().mkdirs();
                FileOutputStream out =(FileOutputStream)(Object) NULL; //new FileOutputStream();
                out = new FileOutputStream((String)(Object)tmp);
            } catch (IOException e) {
                MyHelperClass url = new MyHelperClass();
                LOG.fine("can't write cached copy of wiki file " + url);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass openConnection(){ return null; }}
