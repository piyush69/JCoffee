
import java.io.UncheckedIOException;


class c6322440 {

    public static void copyFile(final File fromFile, File toFile) throws IOException {
        try {
            if (!(Boolean)(Object)fromFile.exists()) {
                throw new IOException("FileCopy: " + "no such source file: " + fromFile.getAbsoluteFile());
            }
            if (!(Boolean)(Object)fromFile.isFile()) {
                throw new IOException("FileCopy: " + "can't copy directory: " + fromFile.getAbsoluteFile());
            }
            if (!(Boolean)(Object)fromFile.canRead()) {
                throw new IOException("FileCopy: " + "source file is unreadable: " + fromFile.getAbsoluteFile());
            }
            if ((boolean)(Object)toFile.isDirectory()) {
                toFile = new File(toFile, fromFile.getName());
            }
            if ((boolean)(Object)toFile.exists() && !(Boolean)(Object)toFile.canWrite()) {
                throw new IOException("FileCopy: " + "destination file is unwriteable: " + toFile.getAbsoluteFile());
            }
            final FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(fromFile).getChannel());
            final FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(toFile).getChannel());
            try {
                inChannel.transferTo(0, inChannel.size(), outChannel);
            } catch (final UncheckedIOException e) {
                throw e;
            } finally {
                if (inChannel != null) {
                    inChannel.close();
                }
                if (outChannel != null) {
                    outChannel.close();
                }
            }
        } catch (final IOException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            if ((boolean)(Object)LOGGER.isErrorEnabled()) {
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.error("CopyFile went wrong!", e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isErrorEnabled(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getAbsoluteFile(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
