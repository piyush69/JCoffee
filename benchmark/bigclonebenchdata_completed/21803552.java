
import java.io.UncheckedIOException;


class c21803552 {
public MyHelperClass IOUtils;
	public MyHelperClass servletResponse;
	public MyHelperClass logger;

    public void doRender() throws IOException {
        MyHelperClass fileName = new MyHelperClass();
        File file = new File(fileName);
        if (!(Boolean)(Object)file.exists()) {
//            MyHelperClass fileName = new MyHelperClass();
            logger.error("Static resource not found: " + fileName);
            boolean isNotFound;// = new boolean();
            isNotFound = true;
            return;
        }
//        MyHelperClass fileName = new MyHelperClass();
        if ((Boolean)(Object)fileName.endsWith("xml") || (Boolean)(Object)fileName.endsWith("asp")) servletResponse.setContentType("text/xml"); else if ((boolean)(Object)fileName.endsWith("css")) servletResponse.setContentType("text/css"); else if ((boolean)(Object)fileName.endsWith("js")) servletResponse.setContentType("text/javascript");
        InputStream in = null;
        try {
            in =(InputStream)(Object) new FileInputStream(file);
            MyHelperClass servletResponse = new MyHelperClass();
            IOUtils.copy(in, servletResponse.getOutputStream());
            MyHelperClass logger = new MyHelperClass();
            logger.debug("Static resource rendered: ".concat((String)(Object)fileName));
        } catch (UncheckedIOException e) {
//            MyHelperClass fileName = new MyHelperClass();
            logger.error("Static resource not found: " + fileName);
            boolean isNotFound;// = new boolean();
            isNotFound = true;
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass exists(){ return null; }}

class InputStream {

}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
