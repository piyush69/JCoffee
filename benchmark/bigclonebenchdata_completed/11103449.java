
import java.io.UncheckedIOException;


class c11103449 {
public MyHelperClass IOUtils;
	public MyHelperClass processOutStr;

//        @Override
        public void run() {
            try {
                MyHelperClass _is = new MyHelperClass();
                IOUtils.copy(_is, processOutStr);
            } catch (final UncheckedIOException ioe) {
                MyHelperClass proc = new MyHelperClass();
                proc.destroy();
            } finally {
                MyHelperClass _is = new MyHelperClass();
                IOUtils.closeQuietly(_is);
                MyHelperClass processOutStr = new MyHelperClass();
                IOUtils.closeQuietly(processOutStr);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(MyHelperClass o0){ return null; }
	public MyHelperClass destroy(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
