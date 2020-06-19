
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4240389 {
public MyHelperClass assertNotNull(String o0, InputStream o1){ return null; }
public MyHelperClass IOUtils;
	public MyHelperClass assertTrue(boolean o0){ return null; }

    private void copyResource(final String resourceName, final File file) throws IOException {
        assertTrue(resourceName.startsWith("/"));
        InputStream in = null;
        boolean suppressExceptionOnClose = true;
        try {
            in =(InputStream)(Object) this.getClass().getResourceAsStream(resourceName);
            assertNotNull("Resource '" + resourceName + "' not found.", in);
            OutputStream out = null;
            try {
                out =(OutputStream)(Object) new FileOutputStream(file);
                IOUtils.copy(in, out);
                suppressExceptionOnClose = false;
            } finally {
                try {
                    if (out != null) {
                        out.close();
                    }
                } catch (final UncheckedIOException e) {
                    if (!suppressExceptionOnClose) {
                        throw e;
                    }
                }
            }
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (final UncheckedIOException e) {
                if (!suppressExceptionOnClose) {
                    throw e;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
