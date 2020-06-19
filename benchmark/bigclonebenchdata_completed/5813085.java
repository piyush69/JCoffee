
import java.io.UncheckedIOException;


class c5813085 {
public MyHelperClass assertFalse(MyHelperClass o0){ return null; }
public MyHelperClass assertNotNull(CameraInfo o0){ return null; }

    public void testBasic() {
        MyHelperClass C328rCameraInfo = new MyHelperClass();
        CameraInfo ci =(CameraInfo)(Object) C328rCameraInfo.getInstance();
        assertNotNull(ci);
        assertNotNull((CameraInfo)(Object)ci.getCapabilities());
        assertFalse(ci.getCapabilities().isEmpty());
        System.out.println(ci.getUrl());
        URL url =(URL)(Object) ci.getUrl();
        try {
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.connect();
            InputStream is =(InputStream)(Object) conn.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line =(String)(Object) br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class CameraInfo {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getCapabilities(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
