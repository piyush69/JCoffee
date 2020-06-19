
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20326462 {

    public void bindDownload(Download download) throws BindingException {
        List chunks =(List)(Object) download.getChunks();
        File destination =(File)(Object) download.getFile();
        FileOutputStream fos = null;
        try {
            MyHelperClass FileUtils = new MyHelperClass();
            fos =(FileOutputStream)(Object) FileUtils.openOutputStream(destination);
            for (ChunkDownload chunk :(ChunkDownload[])(Object) (Object[])(Object)chunks) {
                String filePath =(String)(Object) chunk.getChunkFilePath();
                InputStream ins = null;
                try {
                    File chunkFile = new File(filePath);
//                    MyHelperClass FileUtils = new MyHelperClass();
                    ins =(InputStream)(Object) FileUtils.openInputStream(chunkFile);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(ins, fos);
                    chunkFile.delete();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                } finally {
                    ins.close();
                }
            }
            download.getWorkDir().delete();
            download.complete();
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("IO Exception while copying the chunk " + e.getMessage(),(IOException)(Object) e);
            e.printStackTrace();
            throw new BindingException("IO Exception while copying the chunk " + e.getMessage(),(IOException)(Object) e);
        } finally {
            try {
                fos.close();
            } catch (UncheckedIOException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("IO Exception while copying closing stream of the target file " + e.getMessage(),(IOException)(Object) e);
                e.printStackTrace();
                throw new BindingException("IO Exception while copying closing stream of the target file " + e.getMessage(),(IOException)(Object) e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass openOutputStream(File o0){ return null; }
	public MyHelperClass openInputStream(File o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class Download {

public MyHelperClass getChunks(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass complete(){ return null; }
	public MyHelperClass getWorkDir(){ return null; }}

class BindingException extends Exception{
	public BindingException(String errorMessage) { super(errorMessage); }
	BindingException(String o0, IOException o1){}
	BindingException(){}
}

class List {

}

class ChunkDownload {

public MyHelperClass getChunkFilePath(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }}

class FileOutputStream {

public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
