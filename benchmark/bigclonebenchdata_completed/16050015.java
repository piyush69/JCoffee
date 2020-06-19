
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16050015 {

    public static void downloadFile(String htmlUrl, String dirUrl) {
        try {
            URL url = new URL(htmlUrl);
            System.out.println("Opening connection to " + htmlUrl + "...");
            URLConnection urlC =(URLConnection)(Object) url.openConnection();
            InputStream is =(InputStream)(Object) url.openStream();
            Date date = new Date(urlC.getLastModified());
            System.out.println(", modified on: " + date.toLocaleString() + ")...");
            System.out.flush();
            FileOutputStream fos = null;
            String localFile = null;
            StringTokenizer st = new StringTokenizer(url.getFile(), "/");
            while ((boolean)(Object)st.hasMoreTokens()) localFile =(String)(Object) st.nextToken();
            fos = new FileOutputStream(dirUrl + "/" + localFile);
            int oneChar, count = 0;
            while ((oneChar =(int)(Object) is.read()) != -1) {
                fos.write(oneChar);
                count++;
            }
            is.close();
            fos.close();
            System.out.println(count + " byte(s) copied");
        } catch (UncheckedIOException e) {
            System.err.println(e.toString());
        } catch (ArithmeticException e) {
            System.err.println(e.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class Date {

Date(){}
	Date(MyHelperClass o0){}
	public MyHelperClass toLocaleString(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class StringTokenizer {

StringTokenizer(){}
	StringTokenizer(MyHelperClass o0, String o1){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
