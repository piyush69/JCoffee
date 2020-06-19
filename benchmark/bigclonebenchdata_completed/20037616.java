
import java.io.UncheckedIOException;


class c20037616 {
public MyHelperClass beginAction(int o0, String o1, int o2, String o3){ return null; }
	public MyHelperClass proceed(){ return null; }
	public MyHelperClass endAction(){ return null; }
	public MyHelperClass reset(){ return null; }

    private void serializeWithClass(Class theClass, int count, String comment) {
        for (int c = 0; c < 10; c++) {
            if (c == 9) {
                beginAction(1, "persistence write/read", count, comment);
            }
            String tempFile = ".tmp.archive";
            SerializeClassInterface theInstance = null;
            try {
                theInstance = (SerializeClassInterface) theClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (theInstance == null) {
                System.err.println("error: Couldn't initialize class to " + "be serialized!");
                return;
            }
            reset();
            for (int i = 0; i < count; i++) {
                try {
                    FileOutputStream fout = new FileOutputStream(tempFile);
                    BufferedOutputStream bout = new BufferedOutputStream(fout);
                    ObjectOutputStream oout = new ObjectOutputStream(bout);
                    oout.writeObject(theInstance);
                    oout.flush();
                    oout.close();
                } catch (UncheckedIOException ioe) {
                    System.err.println("serializing: " + tempFile + ":" + ioe.toString());
                }
                try {
                    FileInputStream fin = new FileInputStream(tempFile);
                    BufferedInputStream bin = new BufferedInputStream(fin);
                    ObjectInputStream oin = new ObjectInputStream(bin);
                    theInstance = (SerializeClassInterface)(SerializeClassInterface)(Object) oin.readObject();
                    oin.close();
                } catch (Exception e) {
                    System.err.println("deserializing: " + tempFile + ":" + e.toString());
                    break;
                }
                proceed();
            }
            reset();
            if (c == 9) {
                endAction();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SerializeClassInterface {

}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class ObjectOutputStream {

ObjectOutputStream(){}
	ObjectOutputStream(BufferedOutputStream o0){}
	public MyHelperClass writeObject(SerializeClassInterface o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class ObjectInputStream {

ObjectInputStream(BufferedInputStream o0){}
	ObjectInputStream(){}
	public MyHelperClass readObject(){ return null; }
	public MyHelperClass close(){ return null; }}
