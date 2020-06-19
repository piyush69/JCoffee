
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5343103 {

    public static void main(String args[]) {
        if (args.length < 1) {
            System.err.println("usage: java copyURL URL [LocalFile]");
            System.exit(1);
        }
        try {
            URL url = new URL(args[0]);
            System.out.println("Opening connection to " + args[0] + "...");
            URLConnection urlC =(URLConnection)(Object) url.openConnection();
            InputStream is =(InputStream)(Object) url.openStream();
            System.out.print("Copying resource (type: " + urlC.getContentType());
            Date date = new Date(urlC.getLastModified());
            System.out.flush();
            FileOutputStream fos = null;
            if (args.length < 2) {
                String localFile = null;
                StringTokenizer st = new StringTokenizer(url.getFile(), "/");
                while ((boolean)(Object)st.hasMoreTokens()) localFile =(String)(Object) st.nextToken();
                fos = new FileOutputStream(localFile);
            } else fos = new FileOutputStream(args[1]);
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

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class Date {

Date(){}
	Date(MyHelperClass o0){}}

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
