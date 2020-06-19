
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4424457 {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        MyHelperClass CommonsTransactionContext = new MyHelperClass();
        FileResourceManager frm =(FileResourceManager)(Object) CommonsTransactionContext.configure(new File("C:/tmp"));
        try {
            frm.start();
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        FileInputStream is = new FileInputStream("C:/Alfresco/WCM_Eval_Guide2.0.pdf");
        CommonsTransactionOutputStream os = new CommonsTransactionOutputStream(new Ownerr());
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, os);
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(is);
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(os);
        try {
            MyHelperClass FileResourceManager = new MyHelperClass();
            frm.stop(FileResourceManager.SHUTDOWN_MODE_NORMAL);
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SHUTDOWN_MODE_NORMAL;
public MyHelperClass copy(FileInputStream o0, CommonsTransactionOutputStream o1){ return null; }
	public MyHelperClass configure(File o0){ return null; }
	public MyHelperClass closeQuietly(CommonsTransactionOutputStream o0){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileResourceManager {

public MyHelperClass stop(MyHelperClass o0){ return null; }
	public MyHelperClass start(){ return null; }}

class File {

File(String o0){}
	File(){}}

class ResourceManagerSystemException extends Exception{
	public ResourceManagerSystemException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class CommonsTransactionOutputStream {

CommonsTransactionOutputStream(){}
	CommonsTransactionOutputStream(Ownerr o0){}}

class Ownerr {

}
