
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21232043 {
public MyHelperClass logger;
public MyHelperClass file;
	public MyHelperClass Level;
	public MyHelperClass setProgress(long o0){ return null; }

//    @Override
    public File call() throws IOException {
        HttpURLConnection conn = null;
        ReadableByteChannel fileDownloading = null;
        FileChannel fileWriting = null;
        try {
            MyHelperClass url = new MyHelperClass();
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass size = new MyHelperClass();
            if ((int)(Object)size == -1) {
//                MyHelperClass size = new MyHelperClass();
                size = conn.getContentLength();
            }
            MyHelperClass Channels = new MyHelperClass();
            fileDownloading =(ReadableByteChannel)(Object) Channels.newChannel(conn.getInputStream());
            MyHelperClass file = new MyHelperClass();
            fileWriting =(FileChannel)(Object) (new FileOutputStream(file).getChannel());
//            MyHelperClass size = new MyHelperClass();
            long left =(long)(Object) size;
            MyHelperClass BLOCK_SIZE = new MyHelperClass();
            long chunkSize =(long)(Object) BLOCK_SIZE;
//            MyHelperClass size = new MyHelperClass();
            for (long downloaded = 0; downloaded < (long)(Object)size; left =(long)(Object) size - downloaded) {
//                MyHelperClass BLOCK_SIZE = new MyHelperClass();
                if (left < (long)(Object)BLOCK_SIZE) {
                    chunkSize = left;
                }
                fileWriting.transferFrom(fileDownloading, downloaded, chunkSize);
                downloaded += chunkSize;
                setProgress(downloaded);
            }
        } finally {
            if (file != null) {
                file.deleteOnExit();
            }
            if (conn != null) {
                conn.disconnect();
            }
            if (fileDownloading != null) {
                try {
                    fileDownloading.close();
                } catch (UncheckedIOException ioe) {
                    logger.log(Level.SEVERE, "Не удалось закрыть поток скачивания",(IOException)(Object) ioe);
                }
            }
            if (fileWriting != null) {
                try {
                    fileWriting.close();
                } catch (UncheckedIOException ioe) {
                    logger.log(Level.SEVERE, "Не удалось закрыть поток записи в файл",(IOException)(Object) ioe);
                }
            }
        }
        return (File)(Object)file;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass openConnection(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass newChannel(MyHelperClass o0){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class ReadableByteChannel {

public MyHelperClass close(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(ReadableByteChannel o0, long o1, long o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}
