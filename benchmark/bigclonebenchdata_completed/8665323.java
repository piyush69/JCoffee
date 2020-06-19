
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8665323 {

    public String GetMemberName(String id) {
        String name = null;
        try {
            String line;
            MyHelperClass intvasmemberDeatails = new MyHelperClass();
            URL url = new URL(intvasmemberDeatails + "?CID=" + id);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line =(String)(Object) reader.readLine()) != null) {
                name = line;
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        String[] parts = name.split(" ");
        String rating;// = new String();
        rating = parts[2];
        return parts[0] + " " + parts[1];
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
