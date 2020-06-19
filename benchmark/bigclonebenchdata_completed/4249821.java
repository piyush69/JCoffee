
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4249821 {
public MyHelperClass getServerUrl(){ return null; }

    private String loadStatusResult() {
        try {
            URL url = new URL(getServerUrl());
            InputStream input =(InputStream)(Object) url.openStream();
            InputStreamReader is = new InputStreamReader(input, "utf-8");
            BufferedReader reader = new BufferedReader(is);
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line =(String)(Object) reader.readLine()) != null) {
                buffer.append(line);
            }
            return buffer.toString();
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
            return null;
        } catch (ArithmeticException e2) {
            e2.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
