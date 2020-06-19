
import java.io.UncheckedIOException;


class c13202429 {
public MyHelperClass ChiselResources;

    private ProgramYek getYek(String keyFilename) {
        File f = new File(keyFilename);
        InputStream is = null;
        try {
            is =(InputStream)(Object) new FileInputStream(f);
        } catch (java.io.UncheckedIOException ee) {
        } catch (Exception e) {
            System.out.println("** Exception reading key: " + e);
        }
        if (is == null) {
            try {
                MyHelperClass ProgramYek = new MyHelperClass();
                URL url =(URL)(Object) ChiselResources.getResourceByName(ProgramYek.getVidSys(), ChiselResources.LOADFROMCLASSPATH);
                if (url == null) {
                } else {
                    is =(InputStream)(Object) url.openStream();
                }
            } catch (Exception e) {
                System.out.println("** Exception reading key: " + e);
            }
        }
        ProgramYek y = null;
        if (is != null) {
            try {
                MyHelperClass ProgramYek = new MyHelperClass();
                y =(ProgramYek)(Object) ProgramYek.read(is);
            } catch (Exception e) {
                System.out.println("** Exception reading key: " + e);
            }
        } else {
            MyHelperClass checkFilename = new MyHelperClass();
            File chk = new File(checkFilename);
            if ((boolean)(Object)chk.exists()) {
                MyHelperClass appname = new MyHelperClass();
                System.out.println("This is the evaluation version of " + appname);
//                MyHelperClass appname = new MyHelperClass();
                y = new ProgramYek(appname, "Evaluation", "", 15);
                MyHelperClass ProgramYek = new MyHelperClass();
                ProgramYek.serialize(y, keyFilename);
            }
        }
        return y;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOADFROMCLASSPATH;
public MyHelperClass getVidSys(){ return null; }
	public MyHelperClass getResourceByName(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass read(InputStream o0){ return null; }
	public MyHelperClass serialize(ProgramYek o0, String o1){ return null; }}

class ProgramYek {

ProgramYek(MyHelperClass o0, String o1, String o2, int o3){}
	ProgramYek(){}}

class File {

File(MyHelperClass o0){}
	File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class InputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class URL {

public MyHelperClass openStream(){ return null; }}
