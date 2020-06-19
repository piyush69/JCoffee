import java.io.*;
import java.lang.*;
import java.util.*;



class c8535390 {
public static MyHelperClass getVirtualRequestUrlFromUrlAndRequest(URL o0, String o1){ return null; }
	public static MyHelperClass getPreviousDownloadedURL(URL o0, boolean o1){ return null; }
	public static MyHelperClass addDownloadedURL(URL o0, String o1){ return null; }
public static MyHelperClass logger;
	public static MyHelperClass downloadedFiles;
//	public MyHelperClass getPreviousDownloadedURL(URL o0, boolean o1){ return null; }
	public static MyHelperClass normalizeFileName(String o0){ return null; }
//	public MyHelperClass addDownloadedURL(URL o0, String o1){ return null; }
//	public MyHelperClass getVirtualRequestUrlFromUrlAndRequest(URL o0, String o1){ return null; }
//public MyHelperClass logger;
//	public MyHelperClass downloadedFiles;
	public MyHelperClass tempDirectoryPath;
//	public MyHelperClass normalizeFileName(String o0){ return null; }

    public static File doRequestPost(URL url, String req, String fName, boolean override) throws ArcImsException {
        File f = null;
        URL virtualUrl =(URL)(Object) getVirtualRequestUrlFromUrlAndRequest(url, req);
        if ((f =(File)(Object) getPreviousDownloadedURL(virtualUrl, override)) == null) {
            MyHelperClass tempDirectoryPath = new MyHelperClass();
            File tempDirectory = new File((String)(Object)tempDirectoryPath);
            if (!tempDirectory.exists()) {
                tempDirectory.mkdir();
            }
            String nfName =(String)(Object) normalizeFileName(fName);
            f = new File(tempDirectoryPath + "/" + nfName);
            f.deleteOnExit();
            logger.info("downloading '" + url.toString() + "' to: " + f.getAbsolutePath());
            try {
                HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
                conn.setRequestProperty("Content-length", "" + req.length());
                OutputStreamWriter wr = new OutputStreamWriter((OutputStream)(Object)conn.getOutputStream());
                wr.write(req);
                wr.flush();
                DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
                byte[] buffer = new byte[1024 * 256];
                InputStream is =(InputStream)(Object) conn.getInputStream();
                long readed = 0;
                for (int i = is.read(buffer); i > 0; i = is.read(buffer)) {
                    dos.write(buffer, 0, i);
                    readed += i;
                }
                dos.close();
                is.close();
                wr.close();
                addDownloadedURL(virtualUrl, f.getAbsolutePath());
            } catch (UncheckedIOException ce) {
                logger.error("Timed out error",(ConnectException)(Object) ce);
                throw new ArcImsException("arcims_server_timeout");
            } catch (FileNotFoundException fe) {
                logger.error("FileNotFound Error", fe);
                throw new ArcImsException("arcims_server_error");
            } catch (IOException e) {
                logger.error("IO Error", e);
                throw new ArcImsException("arcims_server_error");
            }
        }
        if (!f.exists()) {
            downloadedFiles.remove(virtualUrl);
            f = doRequestPost(url, req, fName, override);
        }
        return f;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, ConnectException o1){ return null; }
	public MyHelperClass error(String o0, FileNotFoundException o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass remove(URL o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class ArcImsException extends Exception{
	public ArcImsException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }}

class ConnectException extends Exception{
	public ConnectException(String errorMessage) { super(errorMessage); }
}
