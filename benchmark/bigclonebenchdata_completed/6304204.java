
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6304204 {
public MyHelperClass error;

    public void copyURLToFile(TmpFile p_TmpFile) {
        byte[] l_Buffer;
        URLConnection l_Connection = null;
        DataInputStream l_IN = null;
        DataOutputStream l_Out = null;
        FileOutputStream l_FileOutStream = null;
        try {
            System.gc();
            MyHelperClass noError = new MyHelperClass();
            if ((int)(Object)error.compareTo(noError) == 0) {
                MyHelperClass urlHome = new MyHelperClass();
                l_Connection =(URLConnection)(Object) urlHome.openConnection();
                l_FileOutStream = new FileOutputStream(p_TmpFile.getAbsolutePath());
                l_Out = new DataOutputStream(l_FileOutStream);
                l_IN = new DataInputStream(l_Connection.getInputStream());
                l_Buffer = new byte[8192];
                int bytes = 0;
                while ((bytes =(int)(Object) l_IN.read(l_Buffer)) > 0) {
                    l_Out.write(l_Buffer, 0, bytes);
                }
            }
        } catch (UncheckedIOException mue) {
            String error;// = new String();
            error = "MalformedURLException in connecting url was " + mue.getMessage();
        } catch (ArithmeticException io) {
            String error;// = new String();
            error = "IOException in connecting url was " + io.getMessage();
        } catch (Exception e) {
            String error;// = new String();
            error = "Exception in connecting url was " + e.getMessage();
        } finally {
            try {
                l_IN.close();
                l_Out.flush();
                l_FileOutStream.flush();
                l_FileOutStream.close();
                l_Out.close();
            } catch (Exception e) {
                String error;// = new String();
                error = "Exception in connecting url was " + e.getMessage();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass compareTo(MyHelperClass o0){ return null; }}

class TmpFile {

public MyHelperClass getAbsolutePath(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class DataInputStream {

DataInputStream(MyHelperClass o0){}
	DataInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(FileOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
