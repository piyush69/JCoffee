
import java.io.UncheckedIOException;


class c6396264 {

    private static void addFromResource(String resource, OutputStream out) {
        URL url =(URL)(Object) OpenOfficeDocumentCreator.class.getResource(resource);
        try {
            InputStream in =(InputStream)(Object) url.openStream();
            byte[] buffer = new byte[256];
            synchronized (in) {
                synchronized (out) {
                    while (true) {
                        int bytesRead =(int)(Object) in.read(buffer);
                        if (bytesRead == -1) break;
                        out.write(buffer, 0, bytesRead);
                    }
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class OpenOfficeDocumentCreator {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
