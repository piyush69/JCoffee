
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17001260 {

    public static void getGPX(String gpxURL, String fName) {
        try {
            URL url = new URL(gpxURL);
            HttpURLConnection urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoOutput(true);
            urlConnection.connect();
            MyHelperClass mContext = new MyHelperClass();
            File storage =(File)(Object) mContext.getExternalFilesDir(null);
            File file = new File(storage, fName);
            FileOutputStream os = new FileOutputStream(file);
            InputStream is =(InputStream)(Object) urlConnection.getInputStream();
            byte[] buffer = new byte[1024];
            int bufferLength = 0;
            while ((bufferLength =(int)(Object) is.read(buffer)) > 0) {
                os.write(buffer, 0, bufferLength);
            }
            os.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getExternalFilesDir(Object o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class File {

File(File o0, String o1){}
	File(){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
