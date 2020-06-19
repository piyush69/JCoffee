
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11647643 {

        public void actionPerformed(ActionEvent e) {
            try {
                URL url = new URL("http://mailsomething.sf.net/helppages.xml");
                try {
                    MyHelperClass File = new MyHelperClass();
                    File file =(File)(Object) File.createTempFile("temp", "xml");
                    InputStream in =(InputStream)(Object) new BufferedInputStream(url.openStream());
                    OutputStream out =(OutputStream)(Object) new FileOutputStream(file);
                    byte[] buf = new byte[1024];
                    int n;
                    while ((n =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, n);
                    out.flush();
                    out.close();
                    MyHelperClass module = new MyHelperClass();
                    module.merge(file);
                } catch (UncheckedIOException f) {
                }
            } catch (UncheckedIOException f) {
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass merge(File o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class ActionEvent {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class File {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
