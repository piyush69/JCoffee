
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5995233 {
public MyHelperClass getName(){ return null; }

    public void postProcess() throws StopWriterVisitorException {
        MyHelperClass dxfWriter = new MyHelperClass();
        dxfWriter.postProcess();
        try {
            MyHelperClass fTemp = new MyHelperClass();
            FileChannel fcinDxf =(FileChannel)(Object) (new FileInputStream(fTemp).getChannel());
            MyHelperClass m_Fich = new MyHelperClass();
            FileChannel fcoutDxf =(FileChannel)(Object) (new FileOutputStream(m_Fich).getChannel());
            MyHelperClass DriverUtilities = new MyHelperClass();
            DriverUtilities.copy(fcinDxf, fcoutDxf);
//            MyHelperClass fTemp = new MyHelperClass();
            fTemp.delete();
        } catch (UncheckedIOException e) {
            throw new StopWriterVisitorException(getName(),(IOException)(Object) e);
        } catch (ArithmeticException e) {
            throw new StopWriterVisitorException(getName(),(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileChannel o0, FileChannel o1){ return null; }
	public MyHelperClass postProcess(){ return null; }
	public MyHelperClass delete(){ return null; }}

class StopWriterVisitorException extends Exception{
	public StopWriterVisitorException(String errorMessage) { super(errorMessage); }
	StopWriterVisitorException(){}
	StopWriterVisitorException(MyHelperClass o0, IOException o1){}
	StopWriterVisitorException(MyHelperClass o0, FileNotFoundException o1){}
}

class FileChannel {

}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
