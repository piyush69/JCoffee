
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18613811 {
public MyHelperClass DasExceptionHandler;
	public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass store(OutputStream o0, String o1){ return null; }

    public void readPersistentProperties() {
        try {
            String file = System.getProperty("user.home") + System.getProperty("file.separator") + ".das2rc";
            File f = new File(file);
            if ((boolean)(Object)f.canRead()) {
                try {
                    InputStream in =(InputStream)(Object) new FileInputStream(f);
                    load(in);
                    in.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                    DasExceptionHandler.handle((IOException)(Object)e);
                }
            } else {
                if (!(Boolean)(Object)f.exists() && (boolean)(Object)f.canWrite()) {
                    try {
                        OutputStream out =(OutputStream)(Object) new FileOutputStream(f);
                        store(out, "");
                        out.close();
                    } catch (UncheckedIOException e) {
                        e.printStackTrace();
                        DasExceptionHandler.handle((IOException)(Object)e);
                    }
                } else {
                    System.err.println("Unable to read or write " + file + ".  Using defaults.");
                }
            }
        } catch (SecurityException ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass handle(IOException o0){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass canWrite(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
