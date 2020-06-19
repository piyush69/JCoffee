
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8046690 {
public MyHelperClass JOptionPane;
	public MyHelperClass RSLink;
	public MyHelperClass log(String o0){ return null; }

    private Object[] retrieveSecondURL(URL url, RSLink link) {
        MyHelperClass RSLink = new MyHelperClass();
        link.setStatus(RSLink.STATUS_WAITING);
        Object[] result = new Object[2];
        HttpURLConnection httpConn = null;
        BufferedReader inr = null;
        DataOutputStream outs = null;
        MyHelperClass Pattern = new MyHelperClass();
        Pattern mirrorLinePattern =(Pattern)(Object) Pattern.compile("'<input.+checked.+type=\"radio\".+name=\"mirror\".+\\\\'.+\\\\'");
//        MyHelperClass Pattern = new MyHelperClass();
        Pattern mirrorUrlPattern =(Pattern)(Object) Pattern.compile("\\\\'.+\\\\'");
//        MyHelperClass Pattern = new MyHelperClass();
        Pattern counterPattern =(Pattern)(Object) Pattern.compile("var c=[0-9]+;");
//        MyHelperClass Pattern = new MyHelperClass();
        Pattern counterIntPattern =(Pattern)(Object) Pattern.compile("[0-9]+");
        try {
            String line = null;
            String urlLine = null;
            Integer counter = null;
            MyHelperClass URLEncoder = new MyHelperClass();
            String postData = URLEncoder.encode("dl.start", "UTF-8") + "=" + URLEncoder.encode("Free", "UTF-8");
            httpConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            httpConn.setRequestMethod("POST");
            httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpConn.setRequestProperty("Content-Length", "" + Integer.toString(postData.getBytes().length));
            httpConn.setRequestProperty("Content-Language", "en-US");
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            outs = new DataOutputStream(httpConn.getOutputStream());
            outs.writeBytes(postData);
            outs.flush();
            inr = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
            Matcher matcher = null;
            while ((line =(String)(Object) inr.readLine()) != null) {
                matcher =(Matcher)(Object) mirrorLinePattern.matcher(line);
                if ((boolean)(Object)matcher.find()) {
                    matcher =(Matcher)(Object) mirrorUrlPattern.matcher(line);
                    if ((boolean)(Object)matcher.find()) {
                        urlLine =(String)(Object) matcher.group().substring(2,(int)(Object) matcher.group().length() - 2);
                        result[0] = new URL(urlLine);
                    }
                }
                matcher =(Matcher)(Object) counterPattern.matcher(line);
                if ((boolean)(Object)matcher.find()) {
                    matcher =(Matcher)(Object) counterIntPattern.matcher(line);
                    if ((boolean)(Object)matcher.find()) {
                        counter = new Integer((int)(Object)matcher.group());
                        result[1] = counter;
                    }
                }
            }
        } catch (UncheckedIOException ex) {
            log("I/O Exception!");
        } finally {
            try {
                if (outs != null) outs.close();
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
	public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass compile(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class RSLink {

public MyHelperClass setStatus(MyHelperClass o0){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeBytes(String o0){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Matcher {

public MyHelperClass group(){ return null; }
	public MyHelperClass find(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
