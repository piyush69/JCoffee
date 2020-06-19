
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8384539 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        URL urlServlet = null;
        try {
            urlServlet = new URL("http://wofproj.appspot.com/test");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        URLConnection con = null;
        try {
            con =(URLConnection)(Object) urlServlet.openConnection();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        con.setDoInput(true);
        con.setDoOutput(true);
        con.setUseCaches(false);
        con.setRequestProperty("Content-Type", "application/x-java-serialized-object");
        OutputStream outstream =(OutputStream)(Object) con.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(outstream);
        oos.writeObject("tom");
        oos.flush();
        oos.close();
        InputStream instr =(InputStream)(Object) con.getInputStream();
        ObjectInputStream inputFromServlet = new ObjectInputStream(instr);
        Object retval = inputFromServlet.readObject();
        inputFromServlet.close();
        instr.close();
        System.out.println(retval.getClass().toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

}

class ObjectOutputStream {

ObjectOutputStream(){}
	ObjectOutputStream(OutputStream o0){}
	public MyHelperClass writeObject(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class ObjectInputStream {

ObjectInputStream(InputStream o0){}
	ObjectInputStream(){}
	public MyHelperClass readObject(){ return null; }
	public MyHelperClass close(){ return null; }}
