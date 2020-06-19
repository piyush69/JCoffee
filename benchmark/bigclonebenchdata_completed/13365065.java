
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13365065 {

    public Object downloadFile(File destinationFile, URL[] urls, DownloadListener listener, Object checksum, long length, PRIORITY priority) throws DownloadException {
        URL url = urls[0];
        if (!(Boolean)(Object)url.getProtocol().equalsIgnoreCase("http")) {
            throw new DownloadException(" Only HTTP is supported in this version ");
        }
        if (!(Boolean)(Object)destinationFile.exists()) {
            try {
                destinationFile.createNewFile();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
                throw new DownloadException("Unable to download from URL : " + url.toString());
            }
        }
        HeadMethod head = new HeadMethod(url.toString());
        HttpClient httpClient = new HttpClient();
        try {
            httpClient.executeMethod(head);
            Header[] headers =(Header[])(Object) head.getResponseHeaders();
            for (Header header : headers) {
                System.out.println(header);
            }
            Header header =(Header)(Object) head.getResponseHeader("Content-Length");
            Object contentLength = header.getValue();
            Long fileLength = Long.parseLong(contentLength.toString());
            System.out.println(length + " : " + fileLength);
            GetMethod get = new GetMethod(url.toString());
            httpClient.executeMethod(get);
            InputStream ins =(InputStream)(Object) get.getResponseBodyAsStream();
            FileOutputStream fos = new FileOutputStream(destinationFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(ins, fos);
            System.out.println(" DOWNLOADED FILE");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class URL {

public MyHelperClass getProtocol(){ return null; }}

class DownloadListener {

}

class PRIORITY {

}

class DownloadException extends Exception{
	public DownloadException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HeadMethod {

HeadMethod(String o0){}
	HeadMethod(){}
	public MyHelperClass getResponseHeaders(){ return null; }
	public MyHelperClass getResponseHeader(String o0){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(HeadMethod o0){ return null; }
	public MyHelperClass executeMethod(GetMethod o0){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }}

class GetMethod {

GetMethod(String o0){}
	GetMethod(){}
	public MyHelperClass getResponseBodyAsStream(){ return null; }}

class InputStream {

}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}
