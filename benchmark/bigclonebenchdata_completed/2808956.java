
import java.io.UncheckedIOException;


class c2808956 {
public MyHelperClass SourceCache;

                    public void run() {
                        try {
                            MyHelperClass url = new MyHelperClass();
                            OutputStream out =(OutputStream)(Object) SourceCache.startCaching(url);
//                            MyHelperClass url = new MyHelperClass();
                            InputStream is =(InputStream)(Object) url.openStream();
                            byte[] buffer = new byte[100000];
                            while (true) {
                                int amountRead =(int)(Object) is.read(buffer);
                                if (amountRead == -1) {
                                    break;
                                }
                                MyHelperClass forParser = new MyHelperClass();
                                forParser.write(buffer, 0, amountRead);
                                out.write(buffer, 0, amountRead);
                            }
                            MyHelperClass forParser = new MyHelperClass();
                            forParser.close();
                            out.close();
//                            MyHelperClass url = new MyHelperClass();
                            SourceCache.finish(url);
                        } catch (UncheckedIOException e) {
                            e.printStackTrace();
                        }
                    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass finish(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass startCaching(MyHelperClass o0){ return null; }
	public MyHelperClass openStream(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
