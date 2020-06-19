
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4139266 {
public MyHelperClass fileRename(String o0, String o1){ return null; }
	public MyHelperClass loadFileSize(String o0){ return null; }

    public int down(String downLoadUrl, String saveUrl) {
        int status = 1;
        long fileSize = 0;
        int len = 0;
        byte[] bt = new byte[1024];
        RandomAccessFile raFile = null;
        long totalSize = 0;
        URL url = null;
        HttpURLConnection httpConn = null;
        BufferedInputStream bis = null;
        try {
            url = new URL(downLoadUrl);
            httpConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            if (httpConn.getHeaderField("Content-Length") == null) {
                status = 500;
            } else {
                totalSize = Long.parseLong((String)(Object)httpConn.getHeaderField("Content-Length"));
                System.out.println("文件大小:" + totalSize / 1000000 + " M");
                httpConn.disconnect();
                httpConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                MyHelperClass BACK_SUFFIX = new MyHelperClass();
                fileSize =(long)(Object) loadFileSize(saveUrl + BACK_SUFFIX);
                System.out.println("已下载:" + fileSize / 1000000 + " M");
                httpConn.setRequestProperty("RANGE", "bytes=" + fileSize + "-");
                httpConn.setRequestProperty("Accept", "image/gif,image/x-xbitmap,application/msword,*/*");
//                MyHelperClass BACK_SUFFIX = new MyHelperClass();
                raFile = new RandomAccessFile(saveUrl + BACK_SUFFIX, "rw");
                raFile.seek(fileSize);
                bis = new BufferedInputStream(httpConn.getInputStream());
                while ((len =(int)(Object) bis.read(bt)) > 0) {
                    raFile.write(bt, 0, len);
                    float progress = 0.f;
                    float downSize =(float)(Object) raFile.length();
                    progress = downSize / totalSize;
                    System.out.println(progress * 100 + "%" + "\t\t" + downSize / 1000000 + "M");
                }
            }
        } catch (UncheckedIOException e) {
            status = 404;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) bis.close();
                if (raFile != null) raFile.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        MyHelperClass BACK_SUFFIX = new MyHelperClass();
        if ((long)(Object)loadFileSize(saveUrl + BACK_SUFFIX) == totalSize) {
//            MyHelperClass BACK_SUFFIX = new MyHelperClass();
            fileRename(saveUrl + BACK_SUFFIX, saveUrl);
        }
        return status;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class RandomAccessFile {

RandomAccessFile(){}
	RandomAccessFile(String o0, String o1){}
	public MyHelperClass seek(long o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass length(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
