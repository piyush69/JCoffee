
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8046689 {
public MyHelperClass JOptionPane;
	public MyHelperClass RSLink;
	public MyHelperClass log(String o0){ return null; }

    private URL retrieveFirstURL(URL url, RSLink link) {
        MyHelperClass RSLink = new MyHelperClass();
        link.setStatus(RSLink.STATUS_WAITING);
        URL result = null;
        HttpURLConnection httpConn = null;
        BufferedReader inr = null;
        MyHelperClass Pattern = new MyHelperClass();
        Pattern formStartPattern =(Pattern)(Object) Pattern.compile("<form.+action=\"");
//        MyHelperClass Pattern = new MyHelperClass();
        Pattern freeUserPattern =(Pattern)(Object) Pattern.compile("input type=\"submit\" value=\"Free user\"");
//        MyHelperClass Pattern = new MyHelperClass();
        Pattern formEndPattern =(Pattern)(Object) Pattern.compile("</form>");
//        MyHelperClass Pattern = new MyHelperClass();
        Pattern urlString =(Pattern)(Object) Pattern.compile("http://[a-zA-Z0-9\\.\\-/_]+");
        try {
            httpConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            httpConn.setDoOutput(false);
            httpConn.setDoInput(true);
            inr = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
            String line = null;
            String urlLine = null;
            boolean freeUser = false;
            Matcher matcher = null;
            while ((line =(String)(Object) inr.readLine()) != null) {
                if (urlLine == null) {
                    matcher =(Matcher)(Object) formStartPattern.matcher(line);
                    if ((boolean)(Object)matcher.find()) {
                        urlLine = line;
                    }
                } else {
                    matcher =(Matcher)(Object) formEndPattern.matcher(line);
                    if ((boolean)(Object)matcher.find()) {
                        urlLine = null;
                    } else {
                        matcher =(Matcher)(Object) freeUserPattern.matcher(line);
                        if ((boolean)(Object)matcher.find()) {
                            freeUser = true;
                            break;
                        }
                    }
                }
            }
            if (freeUser) {
                matcher =(Matcher)(Object) urlString.matcher(urlLine);
                if ((boolean)(Object)matcher.find()) {
                    result = new URL(matcher.group());
                }
            }
        } catch (UncheckedIOException ex) {
            log("Malformed URL Exception!");
        } catch (ArithmeticException ex) {
            log("I/O Exception!");
        } finally {
            try {
                if (inr != null) inr.close();
            } catch (UncheckedIOException ex) {
                JOptionPane.showMessageDialog(null, "Can not close some connections:\n" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            if (httpConn != null) httpConn.disconnect();
            link.setStatus(RSLink.STATUS_NOTHING);
            return result;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass STATUS_WAITING;
	public MyHelperClass STATUS_NOTHING;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass compile(String o0){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class RSLink {

public MyHelperClass setStatus(MyHelperClass o0){ return null; }}

class HttpURLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
