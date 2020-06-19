
import java.io.UncheckedIOException;


class c10669537 {
public MyHelperClass logAndThrow(String o0){ return null; }

    String processURLInput(String inputURL) throws SoaplabException {
        try {
            MyHelperClass File = new MyHelperClass();
            File tmpFile =(File)(Object) File.createTempFile("gowlab.", null);
            tmpFile.deleteOnExit();
            MyHelperClass inputs = new MyHelperClass();
            Object data = inputs.get(inputURL);
            URL url = new URL(data.toString());
            if (url.getProtocol().equals("file")) logAndThrow("Trying to get local file '" + url.toString() + "' is not allowed.");
            URLConnection uc =(URLConnection)(Object) url.openConnection();
            uc.connect();
            InputStream in =(InputStream)(Object) uc.getInputStream();
            byte[] buffer = new byte[256];
            DataOutputStream fileout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(tmpFile)));
            int bytesRead;
            while ((bytesRead =(int)(Object) in.read(buffer)) != -1) {
                fileout.write(buffer, 0, bytesRead);
            }
            fileout.close();
            return(String)(Object) tmpFile.getAbsolutePath();
        } catch (UncheckedIOException e) {
            logAndThrow("In processURLData: " + e.toString());
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, Object o1){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class SoaplabException extends Exception{
	public SoaplabException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(BufferedOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
