import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20832619 {
public MyHelperClass NULL;

    public void download() throws Throwable, IOException {
        MyHelperClass file = new MyHelperClass();
        new File((String)(Object)file.getPath().substring(0, file.getPath().lastIndexOf(File.separator))).mkdirs();
        MyHelperClass url = new MyHelperClass();
        URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
        int size =(int)(Object) NULL; //new int();
        size = urlConnection.getContentLength();
//        MyHelperClass file = new MyHelperClass();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream((String)(Object)file));
        InputStream inputStream = urlConnection.getInputStream();
        byte[] buffer = new byte[1024];
        int numRead;
        int fetchedSize =(int)(Object) NULL; //new int();
        fetchedSize = 0;
        long date =(long)(Object) NULL; //new long();
        date = urlConnection.getLastModified();
        MyHelperClass failed = new MyHelperClass();
        while (!(Boolean)(Object)failed && (numRead = inputStream.read(buffer)) != -1) {
//            MyHelperClass failed = new MyHelperClass();
            if ((boolean)(Object)failed) {
                throw new IOException("Download manually stopped");
            }
            bufferedOutputStream.write(buffer, 0, numRead);
//            MyHelperClass fetchedSize = new MyHelperClass();
           (int)(Object) fetchedSize += numRead;
            MyHelperClass downloadListener = new MyHelperClass();
            for (int n = 0, i =(int)(Object) downloadListener.size(); n < i; n++) {
//                MyHelperClass downloadListener = new MyHelperClass();
                synchronized (downloadListener.get(n)) {
//                    MyHelperClass downloadListener = new MyHelperClass();
                    ((DownloadListener)(DownloadListener)(Object) downloadListener.get(n)).downloadProgress(this);
                }
            }
        }
        inputStream.close();
        bufferedOutputStream.close();
//        MyHelperClass file = new MyHelperClass();
        if (file.toString().endsWith(".gz") || file.toString().endsWith(".gzip")) {
            MyHelperClass downloadListener = new MyHelperClass();
            for (int n = 0, i =(int)(Object) downloadListener.size(); n < i; n++) {
//                MyHelperClass downloadListener = new MyHelperClass();
                synchronized (downloadListener.get(n)) {
//                    MyHelperClass downloadListener = new MyHelperClass();
                    ((DownloadListener)(DownloadListener)(Object) downloadListener.get(n)).uncompressingProgress(this);
                }
            }
            try {
//                MyHelperClass file = new MyHelperClass();
                GZIPInputStream gzipInputStream = new GZIPInputStream(new FileInputStream((String)(Object)file));
//                MyHelperClass file = new MyHelperClass();
                String fileName = file.toString().substring(0, file.toString().lastIndexOf("."));
                OutputStream outputStream = new FileOutputStream(fileName);
                byte[] unpackBuffer = new byte[1024];
                int length;
                while ((length =(int)(Object) gzipInputStream.read(unpackBuffer)) > 0) {
                    outputStream.write(unpackBuffer, 0, length);
                }
                gzipInputStream.close();
                outputStream.close();
//                MyHelperClass file = new MyHelperClass();
                file.delete();
//                MyHelperClass file = new MyHelperClass();
                file =(MyHelperClass)(Object) new File(fileName);
//                MyHelperClass date = new MyHelperClass();
                file.setLastModified((MyHelperClass)(Object)date);
//                MyHelperClass failed = new MyHelperClass();
                failed =(MyHelperClass)(Object) false;
                boolean finished =(boolean)(Object) NULL; //new boolean();
                finished = true;
//                MyHelperClass downloadListener = new MyHelperClass();
                for (int n = 0, i =(int)(Object) downloadListener.size(); n < i; n++) {
//                    MyHelperClass downloadListener = new MyHelperClass();
                    synchronized (downloadListener.get(n)) {
//                        MyHelperClass downloadListener = new MyHelperClass();
                        ((DownloadListener)(DownloadListener)(Object) downloadListener.get(n)).uncompressingFinished(this);
                    }
                }
//                MyHelperClass downloadListener = new MyHelperClass();
                for (int n = 0, i =(int)(Object) downloadListener.size(); n < i; n++) {
//                    MyHelperClass downloadListener = new MyHelperClass();
                    synchronized (downloadListener.get(n)) {
//                        MyHelperClass downloadListener = new MyHelperClass();
                        ((DownloadListener)(DownloadListener)(Object) downloadListener.get(n)).downloadFinished(this);
                    }
                }
            } catch (IOException ioException) {
//                MyHelperClass file = new MyHelperClass();
                file.delete();
//                MyHelperClass failed = new MyHelperClass();
                failed =(MyHelperClass)(Object) true;
//                MyHelperClass downloadListener = new MyHelperClass();
                for (int n = 0, i =(int)(Object) downloadListener.size(); n < i; n++) {
//                    MyHelperClass downloadListener = new MyHelperClass();
                    synchronized (downloadListener.get(n)) {
//                        MyHelperClass downloadListener = new MyHelperClass();
                        ((DownloadListener)(DownloadListener)(Object) downloadListener.get(n)).exceptionWasThrown(this, ioException);
                    }
                }
            }
            try {
//                MyHelperClass file = new MyHelperClass();
                Runtime.getRuntime().exec("chmod 777 " + file.getCanonicalPath());
            } catch (Exception exception) {
            }
        } else {
//            MyHelperClass failed = new MyHelperClass();
            failed =(MyHelperClass)(Object) false;
            boolean finished =(boolean)(Object) NULL; //new boolean();
            finished = true;
//            MyHelperClass date = new MyHelperClass();
            file.setLastModified((MyHelperClass)(Object)date);
            MyHelperClass downloadListener = new MyHelperClass();
            for (int n = 0, i =(int)(Object) downloadListener.size(); n < i; n++) {
//                MyHelperClass downloadListener = new MyHelperClass();
                synchronized (downloadListener.get(n)) {
//                    MyHelperClass downloadListener = new MyHelperClass();
                    ((DownloadListener)(DownloadListener)(Object) downloadListener.get(n)).downloadFinished(this);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }}

class DownloadListener {

public MyHelperClass downloadFinished(c20832619 o0){ return null; }
	public MyHelperClass uncompressingProgress(c20832619 o0){ return null; }
	public MyHelperClass downloadProgress(c20832619 o0){ return null; }
	public MyHelperClass uncompressingFinished(c20832619 o0){ return null; }
	public MyHelperClass exceptionWasThrown(c20832619 o0, IOException o1){ return null; }}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
