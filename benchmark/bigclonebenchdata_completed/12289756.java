
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12289756 {

    public String loadURL(URL url) {
        String retVal = "";
        try {
            InputStream inputStream =(InputStream)(Object) url.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line =(String)(Object) bufferedReader.readLine();
            retVal += line + "\n";
            while (line != null) {
                System.out.println(line);
                line =(String)(Object) bufferedReader.readLine();
                if (line != null) retVal += line + "\n";
            }
            bufferedReader.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            retVal = e.getMessage();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            retVal = e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
            retVal = e.getMessage();
        }
        return retVal;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

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

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
