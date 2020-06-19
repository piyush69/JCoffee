
import java.io.UncheckedIOException;


class c8535388 {
public static MyHelperClass logger;
	public static MyHelperClass normalizeFileName(String o0){ return null; }
//public MyHelperClass logger;
	public MyHelperClass tempDirectoryPath;
//	public MyHelperClass normalizeFileName(String o0){ return null; }

    public static File downloadFile(URL url, String filePath) throws IOException, ConnectException, UnknownHostException {
        File f = null;
        long t1 = System.currentTimeMillis();
        try {
            long t3 = System.currentTimeMillis();
            MyHelperClass tempDirectoryPath = new MyHelperClass();
            File tempDirectory = new File(tempDirectoryPath);
            if (!(Boolean)(Object)tempDirectory.exists()) {
                tempDirectory.mkdir();
            }
            String fName =(String)(Object) normalizeFileName(filePath);
            f = new File(tempDirectoryPath + "/" + fName);
            logger.info("downloading '" + url.toString() + "' to: " + f.getAbsolutePath());
            f.deleteOnExit();
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            byte[] buffer = new byte[1024 * 256];
            InputStream is =(InputStream)(Object) url.openStream();
            long readed = 0;
            for (int i =(int)(Object) is.read(buffer); i > 0; i =(int)(Object) is.read(buffer)) {
                dos.write(buffer, 0, i);
                readed += i;
            }
            dos.close();
            long t4 = System.currentTimeMillis();
            logger.debug("Download time: " + (t4 - t3));
        } catch (UncheckedIOException io) {
            io.printStackTrace();
        }
        long t2 = System.currentTimeMillis();
        logger.debug("Total download method time: " + (t2 - t1));
        return f;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	File(String o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ConnectException extends Exception{
	public ConnectException(String errorMessage) { super(errorMessage); }
}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(BufferedOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}
