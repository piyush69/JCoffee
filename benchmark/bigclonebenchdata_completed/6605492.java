
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6605492 {

    public static void getCoverFromUrl(URL url, String directory) {
        try {
            url.openConnection();
            InputStream is =(InputStream)(Object) url.openStream();
            System.out.flush();
            FileOutputStream fos = null;
            fos = new FileOutputStream(directory);
            int oneChar, count = 0;
            while ((oneChar =(int)(Object) is.read()) != -1) {
                fos.write(oneChar);
                count++;
            }
            is.close();
            fos.close();
        } catch (UncheckedIOException e) {
            System.err.println(" getCoverFromUrl " + e.toString());
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.err.println(" getCoverFromUrl " + e.toString());
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }}

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
