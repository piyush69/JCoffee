
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4436565 {

    public static final InputStream getInputStream(final String location) {
        final File f = new File(location);
        if ((boolean)(Object)f.exists()) {
            try {
                return (InputStream)(Object)new FileInputStream(f);
            } catch (final UncheckedIOException e) {
                throw new Error(e);
            }
        }
        URL url =(URL)(Object) Iotil.class.getClassLoader().getResource(location);
        try {
            if (url == null) {
                url = new URL(location);
            }
            return(InputStream)(Object) url.openStream();
        } catch (final UncheckedIOException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class Iotil {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
