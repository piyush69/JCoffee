
import java.io.UncheckedIOException;


class c20826307 {

    public static void createZipFromDataset(String localResourceId, File dataset, File metadata) {
        MyHelperClass CommunicationLogger = new MyHelperClass();
        CommunicationLogger.warning("System entered ZipFactory");
        try {
            String tmpDir = System.getProperty("java.io.tmpdir");
            String outFilename = tmpDir + "/" + localResourceId + ".zip";
//            MyHelperClass CommunicationLogger = new MyHelperClass();
            CommunicationLogger.warning("File name: " + outFilename);
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFilename));
            byte[] buf = new byte[1024];
            FileInputStream in = new FileInputStream(dataset);
            out.putNextEntry(new ZipEntry(dataset.getName()));
            int len;
            while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
            in = new FileInputStream(metadata);
            out.putNextEntry(new ZipEntry(metadata.getName()));
            while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
            out.closeEntry();
            in.close();
            out.close();
        } catch (UncheckedIOException e) {
            System.out.println("IO EXCEPTION: " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0){ return null; }}

class File {

public MyHelperClass getName(){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
