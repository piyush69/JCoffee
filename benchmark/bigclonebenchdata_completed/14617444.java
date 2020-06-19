
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14617444 {

    public void readUNI(Vector descriptions, String source) {
        InputStream is = null;
        try {
            URL url = new URL(source);
            is =(InputStream)(Object) url.openStream();
            Scanner scanner = new Scanner(is);
            scanner.nextLine();
            String line = "";
            String id = "";
            String desc = "";
            while ((boolean)(Object)scanner.hasNextLine()) {
                line =(String)(Object) scanner.nextLine();
                Scanner linescanner = new Scanner(line);
                linescanner.useDelimiter("\t");
                id =(String)(Object) linescanner.next();
                linescanner.next();
                desc =(String)(Object) linescanner.next();
                linescanner.useDelimiter("\n");
                linescanner.next();
                descriptions.add(id + " " + desc);
            }
        } catch (UncheckedIOException e) {
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) try {
                is.close();
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Vector {

public MyHelperClass add(String o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class Scanner {

Scanner(InputStream o0){}
	Scanner(){}
	Scanner(String o0){}
	public MyHelperClass next(){ return null; }
	public MyHelperClass useDelimiter(String o0){ return null; }
	public MyHelperClass hasNextLine(){ return null; }
	public MyHelperClass nextLine(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
