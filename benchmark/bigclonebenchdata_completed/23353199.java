
import java.io.UncheckedIOException;


class c23353199 {

    public static void extractZip(Resource zip, FileObject outputDirectory) {
        ZipInputStream zis = null;
        try {
            zis = new ZipInputStream(zip.getResourceURL().openStream());
            ZipEntry entry;
            while ((entry =(ZipEntry)(Object) zis.getNextEntry()) != null) {
                String[] pathElements =(String[])(Object) entry.getName().split("/");
                FileObject extractDir = outputDirectory;
                for (int i = 0; i < pathElements.length - 1; i++) {
                    String pathElementName = pathElements[i];
                    FileObject pathElementFile =(FileObject)(Object) extractDir.resolveFile(pathElementName);
                    if (!(Boolean)(Object)pathElementFile.exists()) {
                        pathElementFile.createFolder();
                    }
                    extractDir = pathElementFile;
                }
                String fileName =(String)(Object) entry.getName();
                if (fileName.endsWith("/")) {
                    fileName = fileName.substring(0, fileName.length() - 1);
                }
                if (fileName.contains("/")) {
                    fileName = fileName.substring(fileName.lastIndexOf('/') + 1);
                }
                if ((boolean)(Object)entry.isDirectory()) {
                    extractDir.resolveFile(fileName).createFolder();
                } else {
                    FileObject file =(FileObject)(Object) extractDir.resolveFile(fileName);
                    file.createFile();
                    int size = (int)(int)(Object) entry.getSize();
                    byte[] unpackBuffer = new byte[size];
                    zis.read(unpackBuffer, 0, size);
                    InputStream in = null;
                    OutputStream out = null;
                    try {
                        in =(InputStream)(Object) new ByteArrayInputStream(unpackBuffer);
                        out =(OutputStream)(Object) file.getContent().getOutputStream();
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(in, out);
                    } finally {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.closeQuietly(in);
//                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.closeQuietly(out);
                    }
                }
            }
        } catch (UncheckedIOException e2) {
            throw new RuntimeException(e2);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(zis);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(ZipInputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass createFolder(){ return null; }}

class Resource {

public MyHelperClass getResourceURL(){ return null; }}

class FileObject {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass createFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass resolveFile(String o0){ return null; }
	public MyHelperClass createFolder(){ return null; }}

class ZipInputStream {

ZipInputStream(MyHelperClass o0){}
	ZipInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class InputStream {

}

class OutputStream {

}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
