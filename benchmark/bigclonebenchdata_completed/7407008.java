
import java.io.UncheckedIOException;


class c7407008 {

    public static Image loadImage(String path) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        MyHelperClass mainFrame = new MyHelperClass();
        InputStream in =(InputStream)(Object) mainFrame.getClass().getResourceAsStream(path);
        if (in == null) throw new RuntimeException("Ressource " + path + " not found");
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
            in.close();
            out.flush();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            new RuntimeException("Error reading ressource " + path, e);
        }
        MyHelperClass Toolkit = new MyHelperClass();
        return(Image)(Object) Toolkit.getDefaultToolkit().createImage(out.toByteArray());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createImage(MyHelperClass o0){ return null; }
	public MyHelperClass getDefaultToolkit(){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class Image {

}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
