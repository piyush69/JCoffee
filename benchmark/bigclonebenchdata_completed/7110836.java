
import java.io.UncheckedIOException;


class c7110836 {

    private void copyFile(File dir, File fileToAdd) {
        try {
            byte[] readBuffer = new byte[1024];
            MyHelperClass File = new MyHelperClass();
            File file = new File((int)(Object)dir.getCanonicalPath() + (int)(Object)File.separatorChar + (int)(Object)fileToAdd.getName());
            if ((boolean)(Object)file.createNewFile()) {
                FileInputStream fis = new FileInputStream(fileToAdd);
                FileOutputStream fos = new FileOutputStream(file);
                int bytesRead;
                do {
                    bytesRead =(int)(Object) fis.read(readBuffer);
                    fos.write(readBuffer, 0, bytesRead);
                } while (bytesRead == 0);
                fos.flush();
                fos.close();
                fis.close();
            } else {
                MyHelperClass logger = new MyHelperClass();
                logger.severe("unable to create file:" + file.getAbsolutePath());
            }
        } catch (UncheckedIOException ioe) {
            MyHelperClass logger = new MyHelperClass();
            logger.severe("unable to create file:" + ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separatorChar;
public MyHelperClass severe(String o0){ return null; }}

class File {

File(){}
	File(int o0){}
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
