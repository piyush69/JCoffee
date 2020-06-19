
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17076233 {
public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
public MyHelperClass assertNotNull(String o0, URL o1){ return null; }

    private void unzipResource(final String resourceName, final File targetDirectory) throws IOException {
        final URL resource =(URL)(Object) this.getClass().getResource(resourceName);
        assertNotNull("Expected '" + resourceName + "' not found.", resource);
        assertTrue(targetDirectory.isAbsolute());
        MyHelperClass FileUtils = new MyHelperClass();
        FileUtils.deleteDirectory(targetDirectory);
        assertTrue(targetDirectory.mkdirs());
        ZipInputStream in = null;
        boolean suppressExceptionOnClose = true;
        try {
            in = new ZipInputStream(resource.openStream());
            ZipEntry e;
            while ((e =(ZipEntry)(Object) in.getNextEntry()) != null) {
                if ((boolean)(Object)e.isDirectory()) {
                    continue;
                }
                final File dest = new File(targetDirectory, e.getName());
                assertTrue(dest.isAbsolute());
                OutputStream out = null;
                try {
//                    MyHelperClass FileUtils = new MyHelperClass();
                    out =(OutputStream)(Object) FileUtils.openOutputStream(dest);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, out);
                    suppressExceptionOnClose = false;
                } finally {
                    try {
                        if (out != null) {
                            out.close();
                        }
                        suppressExceptionOnClose = true;
                    } catch (final UncheckedIOException ex) {
                        if (!suppressExceptionOnClose) {
                            throw ex;
                        }
                    }
                }
                in.closeEntry();
            }
            suppressExceptionOnClose = false;
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

public MyHelperClass openOutputStream(File o0){ return null; }
	public MyHelperClass deleteDirectory(File o0){ return null; }
	public MyHelperClass copy(ZipInputStream o0, OutputStream o1){ return null; }}

class File {

File(File o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass isAbsolute(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(MyHelperClass o0){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}
