


class c17267680 {
public MyHelperClass IDGenerator;

    private String transferWSDL(String wsdlURL, String userPassword) throws WiseConnectionException {
        String filePath = null;
        try {
            URL endpoint = new URL(wsdlURL);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) endpoint.openConnection();
            conn.setDoOutput(false);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "text/xml,application/xml,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5");
            conn.setRequestProperty("Connection", "close");
            if (userPassword != null) {
                conn.setRequestProperty("Authorization", "Basic " + (new BASE64Encoder()).encode(userPassword.getBytes()));
            }
            InputStream is = null;
            if ((int)(Object)conn.getResponseCode() == 200) {
                is =(InputStream)(Object) conn.getInputStream();
            } else {
                is =(InputStream)(Object) conn.getErrorStream();
                InputStreamReader isr = new InputStreamReader(is);
                StringWriter sw = new StringWriter();
                char[] buf = new char[200];
                int read = 0;
                while (read != -1) {
                    read =(int)(Object) isr.read(buf);
                    sw.write(buf);
                }
                throw new WiseConnectionException("Remote server's response is an error: " + sw.toString());
            }
            MyHelperClass tmpDeployDir = new MyHelperClass();
            File file = new File(tmpDeployDir, new StringBuffer("Wise").append(IDGenerator.nextVal()).append(".xml").toString());
            OutputStream fos =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(file));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyStream(fos, is);
            fos.close();
            is.close();
            filePath =(String)(Object) file.getPath();
        } catch (WiseConnectionException wce) {
            throw wce;
        } catch (Exception e) {
            throw new WiseConnectionException("Wsdl download failed!", e);
        }
        return filePath;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass nextVal(){ return null; }
	public MyHelperClass copyStream(OutputStream o0, InputStream o1){ return null; }}

class WiseConnectionException extends Exception{
	public WiseConnectionException(String errorMessage) { super(errorMessage); }
	WiseConnectionException(String o0, Exception o1){}
	WiseConnectionException(){}
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getErrorStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}
	public MyHelperClass read(char[] o0){ return null; }}

class StringWriter {

public MyHelperClass write(char[] o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getPath(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
