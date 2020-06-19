
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21583226 {

    public String getMessageofTheDay(String id) {
        StringBuffer mod = new StringBuffer();
        int serverModId = 0;
        int clientModId = 0;
        BufferedReader input = null;
        try {
            MyHelperClass FlyShareApp = new MyHelperClass();
            URL url = new URL(FlyShareApp.BASE_WEBSITE_URL + "/mod.txt");
            input = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            inputLine =(String)(Object) input.readLine();
            try {
                clientModId = Integer.parseInt(id);
                serverModId = Integer.parseInt(inputLine);
            } catch (NumberFormatException e) {
            }
            if (clientModId < serverModId || clientModId == 0) {
                mod.append(serverModId);
                mod.append('|');
                while ((inputLine =(String)(Object) input.readLine()) != null) mod.append(inputLine);
            }
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        } finally {
            try {
                input.close();
            } catch (Exception e) {
            }
        }
        return mod.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BASE_WEBSITE_URL;
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
