
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17197906 {
public MyHelperClass TheAskedFile;
	public MyHelperClass LogPrinter;

    public void run() {
        MyHelperClass Level = new MyHelperClass();
        LogPrinter.log(Level.FINEST, "Started Download at : {0, date, long}", new Date());
        MyHelperClass PipeConnected = new MyHelperClass();
        if (!(Boolean)(Object)PipeConnected) {
            throw new IllegalStateException("You should connect the pipe before with getInputStream()");
        }
        InputStream ins = null;
        MyHelperClass IsAlreadyDownloaded = new MyHelperClass();
        if ((boolean)(Object)IsAlreadyDownloaded) {
//            MyHelperClass Level = new MyHelperClass();
            LogPrinter.log(Level.FINEST, "The file already Exists open and foward the byte");
            try {
                int ContentLength;// = new int();
                ContentLength = (int)(int)(Object) TheAskedFile.length();
                MyHelperClass ContentType = new MyHelperClass();
                ContentType = URLConnection.getFileNameMap().getContentTypeFor(TheAskedFile.getName());
                MyHelperClass TheAskedFile = new MyHelperClass();
                ins =(InputStream)(Object) new FileInputStream(TheAskedFile);
                MyHelperClass BUFFER_SIZE = new MyHelperClass();
                byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
                int read =(int)(Object) ins.read(buffer);
                while (read >= 0) {
                    MyHelperClass Pipe = new MyHelperClass();
                    Pipe.write(buffer, 0, read);
                    read =(int)(Object) ins.read(buffer);
                }
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } finally {
                if (ins != null) {
                    try {
                        ins.close();
                    } catch (UncheckedIOException e) {
                    }
                }
            }
        } else {
//            MyHelperClass Level = new MyHelperClass();
            LogPrinter.log(Level.FINEST, "the file does not exist locally so we try to download the thing");
            MyHelperClass TheAskedFile = new MyHelperClass();
            File theDir =(File)(Object) TheAskedFile.getParentFile();
            if (!(Boolean)(Object)theDir.exists()) {
                theDir.mkdirs();
            }
            MyHelperClass ListFastest = new MyHelperClass();
            for (URL url :(URL[])(Object) (Object[])(Object)ListFastest) {
                FileOutputStream fout = null;
                boolean OnError = false;
                long timestart = System.currentTimeMillis();
                long bytecount = 0;
                try {
                    MyHelperClass RequestedFile = new MyHelperClass();
                    URL newUrl = new URL(url.toString() + RequestedFile);
//                    MyHelperClass Level = new MyHelperClass();
                    LogPrinter.log(Level.FINEST, "the download URL = {0}", newUrl);
                    URLConnection conn =(URLConnection)(Object) newUrl.openConnection();
                    MyHelperClass ContentType = new MyHelperClass();
                    ContentType = conn.getContentType();
                    MyHelperClass ContentLength = new MyHelperClass();
                    ContentLength = conn.getContentLength();
                    ins =(InputStream)(Object) conn.getInputStream();
//                    MyHelperClass TheAskedFile = new MyHelperClass();
                    fout = new FileOutputStream(TheAskedFile);
                    MyHelperClass BUFFER_SIZE = new MyHelperClass();
                    byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
                    int read =(int)(Object) ins.read(buffer);
                    while (read >= 0) {
                        fout.write(buffer, 0, read);
                        MyHelperClass Pipe = new MyHelperClass();
                        Pipe.write(buffer, 0, read);
                        read =(int)(Object) ins.read(buffer);
                        bytecount += read;
                    }
                    MyHelperClass Pipe = new MyHelperClass();
                    Pipe.flush();
                } catch (UncheckedIOException e) {
                    OnError = true;
                } finally {
                    if (ins != null) {
                        try {
                            ins.close();
                        } catch (UncheckedIOException e) {
                        }
                    }
                    if (fout != null) {
                        try {
                            fout.close();
                        } catch (UncheckedIOException e) {
                        }
                    }
                }
                long timeend = System.currentTimeMillis();
                if (OnError) {
                    continue;
                } else {
                    long timetook = timeend - timestart;
                    MyHelperClass MathContext = new MyHelperClass();
                    BigDecimal speed =(BigDecimal)(Object) (new BigDecimal(bytecount).multiply(new BigDecimal(1000)).divide(new BigDecimal(timetook), MathContext.DECIMAL32));
                    MyHelperClass Listener = new MyHelperClass();
                    for (ReportCalculatedStatistique report :(ReportCalculatedStatistique[])(Object) (Object[])(Object)Listener) {
                        report.reportUrlStat(url, speed, timetook);
                    }
                    break;
                }
            }
        }
//        MyHelperClass Level = new MyHelperClass();
        LogPrinter.log(Level.FINEST, "download finished at {0,date,long}", new Date());
        MyHelperClass Pipe = new MyHelperClass();
        if (Pipe != null) {
            try {
//                MyHelperClass Pipe = new MyHelperClass();
                Pipe.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINEST;
	public MyHelperClass DECIMAL32;
public MyHelperClass divide(BigDecimal o0, MyHelperClass o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, URL o2){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Date o2){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass getContentTypeFor(MyHelperClass o0){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public static MyHelperClass getFileNameMap(){ return null; }}

class BigDecimal {

BigDecimal(){}
	BigDecimal(int o0){}
	BigDecimal(long o0){}
	public MyHelperClass multiply(BigDecimal o0){ return null; }}

class Date {

}

class ReportCalculatedStatistique {

public MyHelperClass reportUrlStat(URL o0, BigDecimal o1, long o2){ return null; }}
