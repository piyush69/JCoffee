import java.io.*;
import java.lang.*;
import java.util.*;



class c22358005 {
public MyHelperClass Definitions;
	public MyHelperClass IOUtils;

//    @Override
    public InputStream getInputStream() throws IOException {
        MyHelperClass dfos = new MyHelperClass();
        if (dfos == null) {
            MyHelperClass Config = new MyHelperClass();
            int deferredOutputStreamThreshold =(int)(Object) Config.getInstance().getDeferredOutputStreamThreshold();
//            MyHelperClass dfos = new MyHelperClass();
            dfos =(MyHelperClass)(Object) new DeferredFileOutputStream(deferredOutputStreamThreshold, Definitions.PROJECT_NAME, "." + Definitions.TMP_EXTENSION);
            try {
                MyHelperClass is = new MyHelperClass();
                IOUtils.copy(is, dfos);
            } finally {
//                MyHelperClass dfos = new MyHelperClass();
                dfos.close();
            }
        }
//        MyHelperClass dfos = new MyHelperClass();
        return(InputStream)(Object) dfos.getDeferredInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TMP_EXTENSION;
	public MyHelperClass PROJECT_NAME;
public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getDeferredInputStream(){ return null; }
	public MyHelperClass getDeferredOutputStreamThreshold(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class DeferredFileOutputStream {

DeferredFileOutputStream(int o0, MyHelperClass o1, String o2){}
	DeferredFileOutputStream(){}}
