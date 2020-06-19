
import java.io.UncheckedIOException;


class c17901734 {
public static MyHelperClass Pattern;
	public static MyHelperClass getTracUrl(){ return null; }
//public MyHelperClass Pattern;
//	public MyHelperClass getTracUrl(){ return null; }

    public static void track(String strUserName, String strShortDescription, String strLongDescription, String strPriority, String strComponent) {
        String strFromToken = "";
        try {
            URL url = new URL(getTracUrl() + "newticket");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String buffer =(String)(Object) reader.readLine();
            while (buffer != null) {
                if (buffer.contains("__FORM_TOKEN")) {
                    Pattern pattern =(Pattern)(Object) Pattern.compile("value=\"[^\"]*\"");
                    Matcher matcher =(Matcher)(Object) pattern.matcher(buffer);
                    int start = 0;
                    matcher.find(start);
                    int von =(int)(Object) matcher.start() + 7;
                    int bis =(int)(Object) matcher.end() - 1;
                    strFromToken = buffer.substring(von, bis);
                }
                buffer =(String)(Object) reader.readLine();
            }
            HttpClient client = new HttpClient();
            PostMethod method = new PostMethod(getTracUrl() + "newticket");
            method.setRequestHeader("Cookie", "trac_form_token=" + strFromToken);
            method.addParameter("__FORM_TOKEN", strFromToken);
            method.addParameter("reporter", strUserName);
            method.addParameter("summary", strShortDescription);
            method.addParameter("type", "Fehler");
            method.addParameter("description", strLongDescription);
            method.addParameter("action", "create");
            method.addParameter("status", "new");
            method.addParameter("priority", strPriority);
            method.addParameter("milestone", "");
            method.addParameter("component", strComponent);
            method.addParameter("keywords", "BugReporter");
            method.addParameter("cc", "");
            method.addParameter("version", "");
            client.executeMethod(method);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass find(int o0){ return null; }
	public MyHelperClass end(){ return null; }
	public MyHelperClass start(){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(PostMethod o0){ return null; }}

class PostMethod {

PostMethod(String o0){}
	PostMethod(){}
	public MyHelperClass addParameter(String o0, String o1){ return null; }
	public MyHelperClass setRequestHeader(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
