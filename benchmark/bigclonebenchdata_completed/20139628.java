import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c20139628 {
public MyHelperClass open(MyHelperClass o0){ return null; }
public MyHelperClass file;
	public MyHelperClass close(){ return null; }
	public MyHelperClass getName(){ return null; }

    public void postProcess() throws StopWriterVisitorException {
        MyHelperClass dbfWriter = new MyHelperClass();
        dbfWriter.postProcess();
        try {
            MyHelperClass dbf = new MyHelperClass();
            short originalEncoding =(short)(Object) dbf.getDbaseHeader().getLanguageID();
            MyHelperClass fTemp = new MyHelperClass();
            File dbfFile =(File)(Object) fTemp;
            FileChannel fcinDbf =(FileChannel)(Object) (new FileInputStream(dbfFile).getChannel());
            MyHelperClass file = new MyHelperClass();
            FileChannel fcoutDbf =(FileChannel)(Object) (new FileOutputStream((String)(Object)file).getChannel());
            MyHelperClass DriverUtilities = new MyHelperClass();
            DriverUtilities.copy(fcinDbf, fcoutDbf);
//            MyHelperClass fTemp = new MyHelperClass();
            fTemp.delete();
            close();
            RandomAccessFile fo = new RandomAccessFile((String)(Object)file, "rw");
            fo.seek(29);
            fo.writeByte(originalEncoding);
            fo.close();
            open(file);
        } catch (FileNotFoundException e) {
            throw new StopWriterVisitorException(getName(), e);
        } catch (IOException e) {
            throw new StopWriterVisitorException(getName(), e);
        } catch (UncheckedIOException e) {
            throw new StopWriterVisitorException(getName(),(IOException)(Object) e);
        } catch (ArithmeticException e) {
            throw new StopWriterVisitorException(getName(),(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass postProcess(){ return null; }
	public MyHelperClass getDbaseHeader(){ return null; }
	public MyHelperClass copy(FileChannel o0, FileChannel o1){ return null; }
	public MyHelperClass getLanguageID(){ return null; }
	public MyHelperClass delete(){ return null; }}

class StopWriterVisitorException extends Exception{
	public StopWriterVisitorException(String errorMessage) { super(errorMessage); }
	StopWriterVisitorException(MyHelperClass o0, IOException o1){}
	StopWriterVisitorException(MyHelperClass o0, FileNotFoundException o1){}
	StopWriterVisitorException(MyHelperClass o0, OpenDriverException o1){}
	StopWriterVisitorException(){}
	StopWriterVisitorException(MyHelperClass o0, CloseDriverException o1){}
}

class FileChannel {

}

class CloseDriverException extends Exception{
	public CloseDriverException(String errorMessage) { super(errorMessage); }
}

class OpenDriverException extends Exception{
	public OpenDriverException(String errorMessage) { super(errorMessage); }
}
