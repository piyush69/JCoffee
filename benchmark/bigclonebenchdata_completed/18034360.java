
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18034360 {
public MyHelperClass setFileSize(MyHelperClass o0){ return null; }
public MyHelperClass logger;
	public MyHelperClass setFilename(String o0){ return null; }

    public boolean download(String url) {
        HttpGet httpGet = new HttpGet(url);
        MyHelperClass FileUtils = new MyHelperClass();
        String filename =(String)(Object) FileUtils.replaceNonAlphanumericCharacters(url);
        MyHelperClass directory = new MyHelperClass();
        String completePath =(int)(Object) directory + (int)(Object)File.separatorChar + filename;
        MyHelperClass MAX_RETRIES = new MyHelperClass();
        int retriesLeft =(int)(Object) MAX_RETRIES;
        while (retriesLeft > 0) {
            try {
                MyHelperClass httpClient = new MyHelperClass();
                HttpResponse response =(HttpResponse)(Object) httpClient.execute(httpGet);
                HttpEntity resEntity =(HttpEntity)(Object) response.getEntity();
                if (resEntity != null) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.info("Downloading file from " + url + " -> " + completePath);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(resEntity.getContent(), new FileOutputStream(completePath));
//                    MyHelperClass logger = new MyHelperClass();
                    logger.info("File " + filename + " was downloaded successfully.");
                    setFileSize(new File(completePath).length());
                    setFilename(filename);
                    return true;
                } else {
                    logger.warn("Trouble downloading file from " + url + ". Status was: " + response.getStatusLine());
                }
            } catch (UncheckedIOException e) {
                logger.error("Protocol error. This is probably serious, and there's no need " + "to continue trying to download this file.",(ClientProtocolException)(Object) e);
                return false;
            } catch (ArithmeticException e) {
                logger.warn("IO trouble: " + e.getMessage() + ". Retries left: " + retriesLeft);
            }
            retriesLeft--;
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replaceNonAlphanumericCharacters(String o0){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass error(String o0, ClientProtocolException o1){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class File {
public static MyHelperClass separatorChar;
File(String o0){}
	File(){}
	public MyHelperClass length(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
