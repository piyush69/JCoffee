
import java.io.UncheckedIOException;


class c21321505 {
public MyHelperClass os;
	public MyHelperClass IOUtils;

        public void run() {
            try {
                MyHelperClass is = new MyHelperClass();
                IOUtils.copy(is, os);
                MyHelperClass os = new MyHelperClass();
                os.flush();
            } catch (UncheckedIOException ioe) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Unable to copy",(IOException)(Object) ioe);
            } finally {
                MyHelperClass is = new MyHelperClass();
                IOUtils.closeQuietly(is);
                MyHelperClass os = new MyHelperClass();
                IOUtils.closeQuietly(os);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass closeQuietly(MyHelperClass o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass flush(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
