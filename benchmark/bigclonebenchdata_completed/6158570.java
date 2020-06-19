
import java.io.UncheckedIOException;


class c6158570 {
public MyHelperClass IoUtils;
	public MyHelperClass getPath(String o0){ return null; }

    public void download(String contentUuid, File path) throws WebServiceClientException {
        try {
            URL url = new URL(getPath("/download/" + contentUuid));
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            InputStream inputStream =(InputStream)(Object) connection.getInputStream();
            OutputStream output =(OutputStream)(Object) new FileOutputStream(path);
            IoUtils.copyBytes(inputStream, output);
            IoUtils.close(inputStream);
            IoUtils.close(output);
        } catch (UncheckedIOException ioex) {
            throw new WebServiceClientException("Could not download or saving content to path [" + path.getAbsolutePath() + "]", ioex);
        } catch (Exception ex) {
            throw new WebServiceClientException("Could not download content from web service.", ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyBytes(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass close(InputStream o0){ return null; }
	public MyHelperClass close(OutputStream o0){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class WebServiceClientException extends Exception{
	public WebServiceClientException(String errorMessage) { super(errorMessage); }
	WebServiceClientException(String o0, Exception o1){}
	WebServiceClientException(){}
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
