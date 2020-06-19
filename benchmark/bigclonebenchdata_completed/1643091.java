
import java.io.UncheckedIOException;


class c1643091 {
public static MyHelperClass handleRedirectUrl(URL o0){ return null; }
//public MyHelperClass handleRedirectUrl(URL o0){ return null; }

    private static void download(String urlString) throws IOException {
        URL url = new URL(urlString);
        url =(URL)(Object) handleRedirectUrl(url);
        URLConnection cn =(URLConnection)(Object) url.openConnection();
        MyHelperClass Utils = new MyHelperClass();
        Utils.setHeader(cn);
        long fileLength =(long)(Object) cn.getContentLength();
        MyHelperClass Statics = new MyHelperClass();
        Statics.getInstance().setFileLength(fileLength);
        MyHelperClass THREAD_COUNT = new MyHelperClass();
        long packageLength = fileLength / (long)(Object)THREAD_COUNT;
//        MyHelperClass THREAD_COUNT = new MyHelperClass();
        long leftLength = fileLength % (long)(Object)THREAD_COUNT;
//        MyHelperClass Utils = new MyHelperClass();
        String fileName =(String)(Object) Utils.decodeURLFileName(url);
        RandomAccessFile file = new RandomAccessFile(fileName, "rw");
//        MyHelperClass Utils = new MyHelperClass();
        System.out.println("File: " + fileName + ", Size: " + Utils.calSize(fileLength));
//        MyHelperClass THREAD_COUNT = new MyHelperClass();
        CountDownLatch latch = new CountDownLatch((int)(Object)THREAD_COUNT + 1);
        long pos = 0;
//        MyHelperClass THREAD_COUNT = new MyHelperClass();
        for (int i = 0; i < (int)(Object)THREAD_COUNT; i++) {
            long endPos = pos + packageLength;
            if (leftLength > 0) {
                endPos++;
                leftLength--;
            }
            new Thread((Runnable)(Object)new DownloadThread(latch, url, file, pos, endPos)).start();
            pos = endPos;
        }
        new Thread((Runnable)(Object)new MoniterThread(latch)).start();
        try {
            latch.await();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass decodeURLFileName(URL o0){ return null; }
	public MyHelperClass calSize(long o0){ return null; }
	public MyHelperClass setFileLength(long o0){ return null; }
	public MyHelperClass setHeader(URLConnection o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }}

class RandomAccessFile {

RandomAccessFile(String o0, String o1){}
	RandomAccessFile(){}}

class CountDownLatch {

CountDownLatch(int o0){}
	CountDownLatch(){}
	public MyHelperClass await(){ return null; }}

class DownloadThread {

DownloadThread(){}
	DownloadThread(CountDownLatch o0, URL o1, RandomAccessFile o2, long o3, long o4){}}

class MoniterThread {

MoniterThread(CountDownLatch o0){}
	MoniterThread(){}}
