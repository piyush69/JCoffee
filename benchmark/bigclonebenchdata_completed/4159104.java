
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4159104 {
public MyHelperClass HTMLuserpage;
	public MyHelperClass userAgent;
	public MyHelperClass stopTimer(){ return null; }
	public MyHelperClass dauerMs(){ return null; }
	public MyHelperClass startTimer(){ return null; }
	public MyHelperClass setStatus(String o0){ return null; }

    public String GetUserPage(String User, int pagetocrawl) {
        int page = pagetocrawl;
        URL url;
        String line, finalstring;
        StringBuffer buffer = new StringBuffer();
        setStatus("Start moling....");
        startTimer();
        try {
            url = new URL(HTMLuserpage + User + "?setcount=100&page=" + page);
            HttpURLConnection connect = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connect.addRequestProperty("User-Agent", userAgent);
            System.out.println("moling: page " + page + " of " + User);
            BufferedReader input = new BufferedReader(new InputStreamReader(connect.getInputStream()));
            while ((line =(String)(Object) input.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
            }
            input.close();
            connect.disconnect();
            stopTimer();
            setStatus("Dauer : " + dauerMs() + " ms");
            finalstring = buffer.toString();
            return finalstring;
        } catch (UncheckedIOException e) {
            System.err.println("Bad URL: " + e);
            return null;
        } catch (ArithmeticException io) {
            System.err.println("IOException: " + io);
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass addRequestProperty(String o0, MyHelperClass o1){ return null; }}

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
