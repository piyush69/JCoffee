
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19604083 {

//    @Override
    public String fetchURL(String urlString) throws ServiceException {
        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String content = "";
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                content += line + "\n";
            }
            reader.close();
            return content;
        } catch (UncheckedIOException e) {
            throw new ServiceException(e.getMessage());
        } catch (ArithmeticException e) {
            throw new ServiceException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ServiceException extends Exception{
	public ServiceException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
