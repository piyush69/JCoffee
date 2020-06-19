
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14727720 {
public MyHelperClass logger;

    private byte[] rawHttpPost(URL serverTimeStamp, Hashtable reqProperties, byte[] postData) {
        MyHelperClass Arrays = new MyHelperClass();
        logger.info("[rawHttpPost.in]:: " + Arrays.asList(new Object[] { serverTimeStamp, reqProperties, postData }));
        URLConnection urlConn;
        DataOutputStream printout;
        DataInputStream input;
        byte[] responseBody = null;
        try {
            urlConn =(URLConnection)(Object) serverTimeStamp.openConnection();
            urlConn.setDoInput(true);
            urlConn.setDoOutput(true);
            urlConn.setUseCaches(false);
            Iterator iter =(Iterator)(Object) reqProperties.entrySet().iterator();
            while ((boolean)(Object)iter.hasNext()) {
                Entry entry = (Entry)(Entry)(Object) iter.next();
                urlConn.setRequestProperty((String)(String)(Object) entry.getKey(), (String)(String)(Object) entry.getValue());
            }
            MyHelperClass logger = new MyHelperClass();
            logger.debug("POSTing to: " + serverTimeStamp + " ...");
            printout = new DataOutputStream(urlConn.getOutputStream());
            printout.write(postData);
            printout.flush();
            printout.close();
            input = new DataInputStream(urlConn.getInputStream());
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            while ((bytesRead =(int)(Object) input.read(buffer, 0, buffer.length)) >= 0) {
                baos.write(buffer, 0, bytesRead);
            }
            input.close();
            responseBody =(byte[])(Object) baos.toByteArray();
        } catch (UncheckedIOException me) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("[rawHttpPost]:: ",(MalformedURLException)(Object) me);
        } catch (ArithmeticException ioe) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("[rawHttpPost]:: ",(MalformedURLException)(Object) ioe);
        }
        return responseBody;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass warn(String o0, MalformedURLException o1){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass asList(Object[] o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class Hashtable {

public MyHelperClass entrySet(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class DataInputStream {

DataInputStream(){}
	DataInputStream(MyHelperClass o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class Iterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Entry {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass getKey(){ return null; }}
