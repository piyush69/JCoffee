
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21808206 {

    public static void main(String args[]) {
        try {
            URL url = new URL("http://dev.activeanalytics.ca/piwik.php?url=http%3a%2f%2flyricscatcher.sourceforge.net%2fpiwik.php&action_name=&idsite=1&res=1440x900&h=17&m=2&s=16&fla=1&dir=1&qt=1&realp=1&pdf=1&wma=1&java=1&cookie=0&title=JAVAACCESS&urlref=http%3a%2f%2flyricscatcher.sourceforge.net%2fcomputeraccespage.html");
            InputStream ist =(InputStream)(Object) url.openStream();
            InputStreamReader isr = new InputStreamReader(ist);
            BufferedReader in = new BufferedReader(isr);
            String line = "";
            String inputline = "";
            while ((inputline =(String)(Object) in.readLine()) != null) {
                line += inputline + "\n";
            }
            System.out.println("finished: length=" + line.length() + "line=" + line);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        try {
            URL url = new URL("http://apps.sourceforge.net/piwik/lyricscatcher/piwik.php?url=http%3a%2f%2flyricscatcher.sourceforge.net%2fpiwik.php&action_name=&idsite=1&res=1440x900&h=0&m=22&s=1&fla=1&dir=1&qt=1&realp=1&pdf=1&wma=1&java=1&cookie=0&title=JAVAACCESS&urlref=http%3a%2f%2flyricscatcher.sourceforge.net%2fcomputeraccespage.html");
            InputStream ist =(InputStream)(Object) url.openStream();
            InputStreamReader isr = new InputStreamReader(ist);
            BufferedReader in = new BufferedReader(isr);
            String line = "";
            String inputline = "";
            while ((inputline =(String)(Object) in.readLine()) != null) {
                line += inputline + "\n";
            }
            System.out.println("finished: length=" + line.length() + "line=" + line);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        try {
            URL url = new URL("http://apps.sourceforge.net/piwik/lyricscatcher/piwik.php?url=http%3A%2F%2Flyricscatcher.sourceforge.net%2Fcomputeracces.html&action_name=&idsite=1&res=1440x900&h=0&m=28&s=36&fla=1&dir=1&qt=1&realp=0&pdf=1&wma=1&java=1&cookie=1&title=&urlref=");
            InputStream ist =(InputStream)(Object) url.openStream();
            InputStreamReader isr = new InputStreamReader(ist);
            BufferedReader in = new BufferedReader(isr);
            String line = "";
            String inputline = "";
            while ((inputline =(String)(Object) in.readLine()) != null) {
                line += inputline + "\n";
            }
            System.out.println("finished: length=" + line.length() + "line=" + line);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

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
