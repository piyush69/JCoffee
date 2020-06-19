
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8301284 {

    public static String loadUrl(URL url, String charset) throws MyException {
        try {
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            InputStream urlin =(InputStream)(Object) conn.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(urlin, charset));
            StringBuffer buff = new StringBuffer();
            char[] cbuf = new char[1028];
            int count;
            while ((count =(int)(Object) in.read(cbuf)) != -1) {
                buff.append(new String(cbuf, 0, count));
            }
            return buff.toString();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            MyHelperClass MyException = new MyHelperClass();
            throw new MyException(MyException.ERROR_FILENOTFOUND, e.getMessage());
        } catch (ArithmeticException e) {
            e.printStackTrace();
            MyHelperClass MyException = new MyHelperClass();
            throw new MyException(MyException.ERROR_IO, e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_FILENOTFOUND;
	public MyHelperClass ERROR_IO;
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class MyException extends Exception{
	public MyException(String errorMessage) { super(errorMessage); }
	MyException(){}
	MyException(MyHelperClass o0, String o1){}
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(InputStreamReader o0){}
	BufferedReader(){}
	public MyHelperClass read(char[] o0){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
