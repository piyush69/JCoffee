
import java.io.UncheckedIOException;


class c1457394 {
public MyHelperClass fireDownloadCompleted(String o0){ return null; }
	public MyHelperClass createFile(String o0){ return null; }
	public MyHelperClass fireDownloadUpdate(String o0, int o1, int o2){ return null; }
	public MyHelperClass fireDownloadInterrupted(String o0){ return null; }
	public MyHelperClass fireDownloadStarted(String o0){ return null; }

    private File download(String filename, URL url) {
        int size = -1;
        int received = 0;
        try {
            fireDownloadStarted(filename);
            File file =(File)(Object) createFile(filename);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
            System.out.println("������Դ��" + filename + ", url=" + url);
            InputStream bis =(InputStream)(Object) url.openStream();
            byte[] buf = new byte[1024];
            int count = 0;
            long lastUpdate = 0;
            size =(int)(Object) bis.available();
            while ((count =(int)(Object) bis.read(buf)) != -1) {
                bos.write(buf, 0, count);
                received += count;
                long now = System.currentTimeMillis();
                if (now - lastUpdate > 500) {
                    fireDownloadUpdate(filename, size, received);
                    lastUpdate = now;
                }
            }
            bos.close();
            System.out.println("��Դ������ϣ�" + filename);
            fireDownloadCompleted(filename);
            return file;
        } catch (UncheckedIOException e) {
            System.out.println("������Դʧ�ܣ�" + filename + ", error=" + e.getMessage());
            fireDownloadInterrupted(filename);
            if (!((FileNotFoundException)(Object)e instanceof FileNotFoundException)) {
                e.printStackTrace();
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass available(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
