
import java.io.UncheckedIOException;


class c17456434 {
public static MyHelperClass createHttpClient(UsernamePasswordCredentials o0){ return null; }
//public MyHelperClass createHttpClient(UsernamePasswordCredentials o0){ return null; }

    public static void copyHttpContent(final String url, final File outputFile, UsernamePasswordCredentials creds) throws IOException {
        if ((Boolean)(Object)outputFile.exists() && (Boolean)(Object)outputFile.isDirectory()) return;
        String outputFilePath =(String)(Object) outputFile.getAbsolutePath();
        String outputFilePathTemp = outputFilePath + ".tmp";
        MyHelperClass FileUtil = new MyHelperClass();
        File tmpDownloadFile =(File)(Object) FileUtil.createNewFile(outputFilePathTemp, false);
        if (!(Boolean)(Object)tmpDownloadFile.isFile()) return;
        MyHelperClass ShareConstants = new MyHelperClass();
        MyFileLock fl =(MyFileLock)(Object) FileUtil.tryLockTempFile(tmpDownloadFile, 1000, ShareConstants.connectTimeout);
        if (fl != null) {
            try {
                long contentLength = -1;
                long lastModified = -1;
                OutputStream out = null;
                InputStream in = null;
                HttpClient httpclient =(HttpClient)(Object) createHttpClient(creds);
                try {
                    HttpGet httpget = new HttpGet(url);
                    HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpget);
                    StatusLine statusLine =(StatusLine)(Object) response.getStatusLine();
                    int status =(int)(Object) statusLine.getStatusCode() / 100;
                    if (status == 2) {
                        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                        if (entity != null) {
                            Header lastModifiedHeader =(Header)(Object) response.getFirstHeader("Last-Modified");
                            Header contentLengthHeader =(Header)(Object) response.getFirstHeader("Content-Length");
                            if (contentLengthHeader != null) {
                                contentLength = Integer.parseInt((String)(Object)contentLengthHeader.getValue());
                            }
                            if (lastModifiedHeader != null) {
                                SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
                                MyHelperClass Locale = new MyHelperClass();
                                formatter.setDateFormatSymbols(new DateFormatSymbols(Locale.US));
                                try {
                                    lastModified =(long)(Object) formatter.parse(lastModifiedHeader.getValue()).getTime();
                                } catch (UncheckedIOException e) {
                                    MyHelperClass logger = new MyHelperClass();
                                    logger.error((ParseException)(Object)e);
                                }
                            }
                            in =(InputStream)(Object) entity.getContent();
                            out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(tmpDownloadFile));
                            MyHelperClass IOUtil = new MyHelperClass();
                            IOUtil.copyStreams(in, out);
                        }
                    }
                } catch (Exception e) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.error("Get HTTP File ERROR:" + url, e);
                } finally {
                    MyHelperClass IOUtil = new MyHelperClass();
                    IOUtil.close(in);
//                    MyHelperClass IOUtil = new MyHelperClass();
                    IOUtil.close(out);
                    httpclient.getConnectionManager().shutdown();
                }
                if ((boolean)(Object)tmpDownloadFile.isFile()) {
                    if ((contentLength == -1 &&(int)(Object) tmpDownloadFile.length() > 0) ||(long)(Object) tmpDownloadFile.length() == contentLength) {
                        MyHelperClass IOUtil = new MyHelperClass();
                        IOUtil.copyFile(tmpDownloadFile, outputFile);
                        if (lastModified > 0) outputFile.setLastModified(lastModified);
                    }
                }
            } finally {
                tmpDownloadFile.delete();
                fl.release();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass US;
	public MyHelperClass connectTimeout;
public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass createNewFile(String o0, boolean o1){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass error(ParseException o0){ return null; }
	public MyHelperClass copyStreams(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass tryLockTempFile(File o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(OutputStream o0){ return null; }
	public MyHelperClass close(InputStream o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass shutdown(){ return null; }}

class File {

public MyHelperClass setLastModified(long o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class UsernamePasswordCredentials {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MyFileLock {

public MyHelperClass release(){ return null; }}

class OutputStream {

}

class InputStream {

}

class HttpClient {

public MyHelperClass getConnectionManager(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getFirstHeader(String o0){ return null; }}

class StatusLine {

public MyHelperClass getStatusCode(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass parse(MyHelperClass o0){ return null; }
	public MyHelperClass setDateFormatSymbols(DateFormatSymbols o0){ return null; }}

class DateFormatSymbols {

DateFormatSymbols(){}
	DateFormatSymbols(MyHelperClass o0){}}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}
