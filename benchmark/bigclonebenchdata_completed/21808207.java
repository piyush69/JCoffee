
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21808207 {
public static MyHelperClass Calendar;
	public static MyHelperClass addToCounter(String o0){ return null; }
//public MyHelperClass Calendar;
//	public MyHelperClass addToCounter(String o0){ return null; }

    public static void test() {
        addToCounter("computeracces.html");
        try {
            JFrame jfr = new JFrame("Webconnect");
            URL url = new URL("http://apps.sourceforge.net/piwik/lyricscatcher/piwik.php?idsite=1");
            JEditorPane jep = new JEditorPane();
            jfr.add(jep);
            String urlstr = "http://apps.sourceforge.net/piwik/lyricscatcher/piwik.php?url=http%3a%2f%2flyricscatcher.sourceforge.net%2fpiwik.php&action_name=&idsite=1&res=1440x900&h=";
            Calendar cal =(Calendar)(Object) Calendar.getInstance();
            urlstr += cal.get(Calendar.HOUR_OF_DAY);
            urlstr += "&m=";
            urlstr += cal.get(Calendar.MINUTE);
            urlstr += "&s=";
            urlstr += cal.get(Calendar.SECOND);
            urlstr += "&fla=1&dir=1&qt=1&realp=1&pdf=1&wma=1&java=1&cookie=0&title=JAVAACCESS&urlref=http%3a%2f%2flyricscatcher.sourceforge.net%2fcomputeraccespage.html";
            System.out.println(urlstr);
            URL nurl = new URL(urlstr);
            InputStream ist =(InputStream)(Object) nurl.openStream();
            InputStreamReader isr = new InputStreamReader(ist);
            BufferedReader in = new BufferedReader(isr);
            String line = "";
            String inputline = "";
            while ((inputline =(String)(Object) in.readLine()) != null) {
                line += inputline + "\n";
            }
            System.out.println("finished: length of correct url=" + line.length());
            URL myurl = new URL(urlstr);
            URLConnection urlc =(URLConnection)(Object) myurl.openConnection();
            urlc.getContent();
            System.out.println(urlc.getLastModified());
            System.out.println(urlc.getPermission());
            System.out.println(urlc.getRequestProperties());
            System.out.println(urlc.getContentEncoding());
            System.out.println(urlc.getContentLength());
            urlc.connect();
            InputStream dist =(InputStream)(Object) myurl.openStream();
            while ((int)(Object)ist.available() >= 0) {
                ist.read();
            }
            ist.close();
            Document d =(Document)(Object) jep.getEditorKitForContentType("html").createDefaultDocument();
            d.getDefaultRootElement();
            jep.setContentType("text/html");
            jep.setText("<html><img src=\"http://apps.sourceforge.net/piwik/lyricscatcher/piwik.php?idsite=1\" alt=\"there's a problem...\"/><img src=\"" + urlstr + "\" alt=\"Another problem\" style=\"border:0\" /></html>");
            jfr.setLocationByPlatform(true);
            jfr.setSize(100, 100);
            jfr.show();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HOUR_OF_DAY;
	public MyHelperClass SECOND;
	public MyHelperClass MINUTE;
public MyHelperClass getInstance(){ return null; }
	public MyHelperClass createDefaultDocument(){ return null; }}

class JFrame {

JFrame(String o0){}
	JFrame(){}
	public MyHelperClass show(){ return null; }
	public MyHelperClass setLocationByPlatform(boolean o0){ return null; }
	public MyHelperClass add(JEditorPane o0){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class JEditorPane {

public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass getEditorKitForContentType(String o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class Calendar {

public MyHelperClass get(MyHelperClass o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass read(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class URLConnection {

public MyHelperClass getRequestProperties(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getPermission(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class Document {

public MyHelperClass getDefaultRootElement(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
