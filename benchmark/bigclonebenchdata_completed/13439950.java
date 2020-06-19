
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13439950 {

    public String readRemoteFile() throws IOException {
        String response = "";
        boolean eof = false;
        MyHelperClass StaticData = new MyHelperClass();
        URL url = new URL(StaticData.remoteFile);
        InputStream is =(InputStream)(Object) url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String s;
        s =(String)(Object) br.readLine();
        response = s;
        while (!eof) {
            try {
                s =(String)(Object) br.readLine();
                if (s == null) {
                    eof = true;
                    br.close();
                } else response += s;
            } catch (UncheckedIOException eo) {
                eof = true;
            } catch (ArithmeticException e) {
                System.out.println("IO Error : " + e.getMessage());
            }
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass remoteFile;
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class EOFException extends Exception{
	public EOFException(String errorMessage) { super(errorMessage); }
}
