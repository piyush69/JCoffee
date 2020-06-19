
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12593872 {
public MyHelperClass log;

    public String upload(String urlString, ByteArrayOutputStream dataStream) {
        HttpURLConnection conn = null;
        DataOutputStream dos = null;
        String exsistingFileName = "blah.png";
        String lineEnd = "\r\n";
        String twoHyphens = "--";
        String boundary = "*****";
        try {
            URL url = new URL(urlString);
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setInstanceFollowRedirects(false);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
            dos = new DataOutputStream(conn.getOutputStream());
            dos.writeBytes(twoHyphens + boundary + lineEnd);
            dos.writeBytes("Content-Disposition: form-data; name=\"aFile\";" + " filename=\"" + exsistingFileName + "\"" + lineEnd);
            dos.writeBytes(lineEnd);
            dos.write(dataStream.toByteArray());
            dos.writeBytes(lineEnd);
            dos.writeBytes(twoHyphens + boundary + twoHyphens + lineEnd);
            dos.flush();
            dos.close();
            return(String)(Object) conn.getHeaderField("location");
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.INFO, "From ServletCom CLIENT REQUEST:" + ex);
        } catch (ArithmeticException ioe) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.INFO, "From ServletCom CLIENT REQUEST:" + ioe);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass writeBytes(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
