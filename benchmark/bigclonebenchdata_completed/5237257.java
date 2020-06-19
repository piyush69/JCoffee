
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5237257 {

    private void download(String fileName) {
        MyHelperClass Activator = new MyHelperClass();
        String filePath =(String)(Object) Activator.showSaveDialog(fileName, new String[] { ".xls" });
        if (filePath != null) {
            InputStream in = null;
            OutputStream out = null;
            try {
                in =(InputStream)(Object) this.getClass().getResourceAsStream("/" + fileName);
                out =(OutputStream)(Object) new FileOutputStream(filePath);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
            } catch (UncheckedIOException ioe) {
//                MyHelperClass Activator = new MyHelperClass();
                Activator.showExceptionDialog((IOException)(Object)ioe);
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (UncheckedIOException e1) {
//                        MyHelperClass Activator = new MyHelperClass();
                        Activator.showExceptionDialog((IOException)(Object)e1);
                    }
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (UncheckedIOException e1) {
//                        MyHelperClass Activator = new MyHelperClass();
                        Activator.showExceptionDialog((IOException)(Object)e1);
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass showSaveDialog(String o0, String[] o1){ return null; }
	public MyHelperClass showExceptionDialog(IOException o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
