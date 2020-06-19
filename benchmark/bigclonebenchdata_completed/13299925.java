
import java.io.UncheckedIOException;


class c13299925 {
public MyHelperClass startUpdater(){ return null; }

                public void run() {
                    try {
                        MyHelperClass file = new MyHelperClass();
                        FileChannel in =(FileChannel)(Object) (new FileInputStream(file)).getChannel();
                        MyHelperClass updaterFile = new MyHelperClass();
                        FileChannel out =(FileChannel)(Object) (new FileOutputStream(updaterFile)).getChannel();
//                        MyHelperClass file = new MyHelperClass();
                        in.transferTo(0, file.length(), out);
                        MyHelperClass updater = new MyHelperClass();
                        updater.setProgress(50);
                        in.close();
                        out.close();
                    } catch (UncheckedIOException e) {
                        e.printStackTrace();
                    }
                    startUpdater();
                }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setProgress(int o0){ return null; }
	public MyHelperClass length(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
