
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2099972 {

    public static void copyResource(String args) {
        try {
            URL url =(URL)(Object) copyURL.class.getResource(args);
            InputStream is =(InputStream)(Object) url.openStream();
            System.out.flush();
            FileOutputStream fos = null;
            fos = new FileOutputStream(System.getProperty("user.home") + "/JavaCPC/" + args);
            int oneChar, count = 0;
            while ((oneChar =(int)(Object) is.read()) != -1) {
                fos.write(oneChar);
                count++;
            }
            is.close();
            fos.close();
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

public MyHelperClass openStream(){ return null; }}

class copyURL {

}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
