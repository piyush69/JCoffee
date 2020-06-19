
import java.io.UncheckedIOException;


class c5685389 {

    private void extractSpecifications(String id, File specification) {
        Object resource = getClass().getResource(id + ".xml");
        if (resource instanceof URL) {
            URL url = (URL) resource;
            try {
                InputStream istream =(InputStream)(Object) url.openStream();
                try {
                    OutputStream ostream =(OutputStream)(Object) new FileOutputStream(specification);
                    try {
                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length =(int)(Object) istream.read(buffer)) > 0) {
                            ostream.write(buffer, 0, length);
                        }
                    } finally {
                        ostream.close();
                    }
                } finally {
                    istream.close();
                }
            } catch (UncheckedIOException ex) {
                throw new RuntimeException("Failed to open " + url, ex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
