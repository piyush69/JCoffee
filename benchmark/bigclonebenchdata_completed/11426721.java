
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11426721 {
public MyHelperClass iox;

    public boolean uploadToUrl(URL url, Map postData) {
        boolean success = false;
        OutputStream oStream;
        HttpURLConnection urlConn = null;
        try {
            urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlConn.setDoOutput(true);
            urlConn.setDoInput(true);
            urlConn.setUseCaches(false);
            urlConn.setAllowUserInteraction(false);
            String parametersAsString = "";
            Iterator itParams =(Iterator)(Object) postData.entrySet().iterator();
            while ((boolean)(Object)itParams.hasNext()) {
                Entry param = (Entry)(Entry)(Object) itParams.next();
                MyHelperClass URLEncoder = new MyHelperClass();
                parametersAsString += (String)(String)(Object) param.getKey() + "=" + URLEncoder.encode((String)(String)(Object) param.getValue(), "UTF-8") + "&";
            }
            byte[] parameterAsBytes = parametersAsString.getBytes();
            urlConn.setRequestProperty("Content=length", String.valueOf(parameterAsBytes.length));
            oStream =(OutputStream)(Object) urlConn.getOutputStream();
            oStream.write(parameterAsBytes);
            oStream.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
                System.err.println("Response: " + line);
            }
            oStream.close();
            rd.close();
            success = true;
        } catch (UncheckedIOException ex) {
            System.err.println(ex + " (uploadToUrl)");
            success = false;
//         } catch (java.io.ArithmeticException iox) {
            System.out.println(iox + " (uploadToUrl)");
            success = false;
        } catch (Exception generic) {
            System.out.println(generic.toString() + " (uploadToUrl)");
            success = false;
        } finally {
            success = false;
        }
        return success;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class Map {

public MyHelperClass entrySet(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class Iterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class Entry {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass getKey(){ return null; }}
