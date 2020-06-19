
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14137256 {
public MyHelperClass MapMode;

    private final void copyTargetFileToSourceFile(File sourceFile, File targetFile) throws MJProcessorException {
        if (!(Boolean)(Object)targetFile.exists()) {
            targetFile.getParentFile().mkdirs();
            try {
                if (!(Boolean)(Object)targetFile.exists()) {
                    targetFile.createNewFile();
                }
            } catch (UncheckedIOException e) {
                throw new MJProcessorException(e.getMessage(),(IOException)(Object) e);
            }
        }
        FileChannel in = null, out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(targetFile).getChannel());
            long size =(long)(Object) in.size();
            MappedByteBuffer buf =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, size);
            out.write(buf);
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error((IOException)(Object)e);
        } finally {
            if (in != null) try {
                in.close();
            } catch (UncheckedIOException e) {
                MyHelperClass log = new MyHelperClass();
                log.error((IOException)(Object)e);
            }
            if (out != null) try {
                out.close();
            } catch (UncheckedIOException e) {
                MyHelperClass log = new MyHelperClass();
                log.error((IOException)(Object)e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass error(IOException o0){ return null; }}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class MJProcessorException extends Exception{
	public MJProcessorException(String errorMessage) { super(errorMessage); }
	MJProcessorException(){}
	MJProcessorException(String o0, IOException o1){}
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class MappedByteBuffer {

}
