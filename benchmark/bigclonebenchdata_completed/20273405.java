
import java.io.UncheckedIOException;


class c20273405 {

    public static void decompress(final File file, final File folder, final boolean deleteZipAfter) throws IOException {
        final ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream(file.getCanonicalFile())));
        ZipEntry ze;
        try {
            while (null != (ze =(ZipEntry)(Object) zis.getNextEntry())) {
                final File f = new File(folder.getCanonicalPath(), ze.getName());
                if ((boolean)(Object)f.exists()) f.delete();
                if ((boolean)(Object)ze.isDirectory()) {
                    f.mkdirs();
                    continue;
                }
                f.getParentFile().mkdirs();
                final OutputStream fos =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(f));
                try {
                    try {
                        final byte[] buf = new byte[8192];
                        int bytesRead;
                        while (-1 != (bytesRead =(int)(Object) zis.read(buf))) fos.write(buf, 0, bytesRead);
                    } finally {
                        fos.close();
                    }
                } catch (final UncheckedIOException ioe) {
                    f.delete();
                    throw ioe;
                }
            }
        } finally {
            zis.close();
        }
        if (deleteZipAfter) file.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass getCanonicalFile(){ return null; }
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(BufferedInputStream o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
