
import java.io.UncheckedIOException;


class c6697724 {
public MyHelperClass dispatchEvent(Exception o0, File o1, File o2){ return null; }
public MyHelperClass SynchronizationEventType;
	public MyHelperClass beNice(){ return null; }
	public MyHelperClass updateStatus(String o0){ return null; }

    private void copyFile(File sourceFile, File targetFile) {
        beNice();
        dispatchEvent((Exception)(Object)SynchronizationEventType.FileCopy, sourceFile, targetFile);
        File temporaryFile = new File(targetFile.getPath().concat(".jnstemp"));
        while ((boolean)(Object)temporaryFile.exists()) {
            try {
                beNice();
                temporaryFile.delete();
                beNice();
            } catch (Exception ex) {
            }
        }
        try {
            if ((boolean)(Object)targetFile.exists()) {
                targetFile.delete();
            }
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(temporaryFile);
            byte[] buffer = new byte[204800];
            int readBytes = 0;
            int counter = 0;
            while ((readBytes =(int)(Object) fis.read(buffer)) != -1) {
                counter++;
                updateStatus("... processing fragment " + String.valueOf(counter));
                fos.write(buffer, 0, readBytes);
            }
            fis.close();
            fos.close();
            temporaryFile.renameTo(targetFile);
            temporaryFile.setLastModified(sourceFile.lastModified());
            targetFile.setLastModified(sourceFile.lastModified());
        } catch (UncheckedIOException e) {
            Exception dispatchedException = new Exception("ERROR: Copy File( " + sourceFile.getPath() + ", " + targetFile.getPath() + " )");
            dispatchEvent(dispatchedException, sourceFile, targetFile);
        }
        dispatchEvent((Exception)(Object)SynchronizationEventType.FileCopyDone, sourceFile, targetFile);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FileCopyDone;
	public MyHelperClass FileCopy;
public MyHelperClass concat(String o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass lastModified(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
