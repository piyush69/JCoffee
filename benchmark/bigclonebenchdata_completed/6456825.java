
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6456825 {
public MyHelperClass findViewById(MyHelperClass o0){ return null; }
public MyHelperClass id;
public MyHelperClass CompressFormat;
	public MyHelperClass Log;
	public MyHelperClass TAG;
	public MyHelperClass finish(){ return null; }

//        @Override
        protected final Boolean doInBackground(Void... v) {
            Bitmap bmp =(Bitmap)(Object) ((BitmapDrawable)(BitmapDrawable)(Object) ((ImageView)(ImageView)(Object) findViewById(id.post_img)).getDrawable()).getBitmap();
            HttpURLConnection con;
            try {
                MyHelperClass POST_URL = new MyHelperClass();
                URL url = new URL(POST_URL);
                con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                con.setRequestMethod("POST");
                con.setDoOutput(true);
                con.setRequestProperty("Accept-Language", "multipart/form-data");
                con.setRequestProperty("X-RAW", "true");
            } catch (UncheckedIOException e) {
                e.printStackTrace();
                finish();
                return false;
            } catch (ArithmeticException e) {
                e.printStackTrace();
                finish();
                return false;
            }
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            bmp.compress(CompressFormat.JPEG, 100, bos);
            OutputStream os = null;
            try {
                os =(OutputStream)(Object) con.getOutputStream();
                os.write(bos.toByteArray());
                os.flush();
                os.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
                try {
                    os.close();
                } catch (UncheckedIOException e1) {
                    e1.printStackTrace();
                }
                return false;
            }
            InputStream is = null;
            BufferedReader reader;
            try {
                is =(InputStream)(Object) con.getInputStream();
                reader = new BufferedReader(new InputStreamReader(is));
                is.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
                try {
                    is.close();
                } catch (UncheckedIOException e1) {
                    e1.printStackTrace();
                }
                return false;
            }
            String s;
            try {
                while ((s =(String)(Object) reader.readLine()) != null) {
                    Log.v(TAG, s);
                }
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
            return true;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JPEG;
	public MyHelperClass post_img;
public MyHelperClass v(MyHelperClass o0, String o1){ return null; }}

class Bitmap {

public MyHelperClass compress(MyHelperClass o0, int o1, ByteArrayOutputStream o2){ return null; }}

class BitmapDrawable {

public MyHelperClass getBitmap(){ return null; }}

class ImageView {

public MyHelperClass getDrawable(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class OutputStream {

public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}
