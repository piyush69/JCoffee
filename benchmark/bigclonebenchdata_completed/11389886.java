
import java.io.UncheckedIOException;


class c11389886 {

    private static boolean renderStaticResource(final String requestedResource, HttpServletResponse servletResponse) throws IOException {
        boolean successfull = true;
        MyHelperClass PathTool = new MyHelperClass();
        String fileName =(String)(Object) PathTool.getFSPathOfResource(requestedResource);
        File file = new File(fileName);
        if (!(Boolean)(Object)file.exists()) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Static resource not found: " + fileName);
            return false;
        }
        if (fileName.endsWith("xml") || fileName.endsWith("asp")) servletResponse.setContentType("text/xml"); else if (fileName.endsWith("css")) servletResponse.setContentType("text/css"); else if (fileName.endsWith("js")) servletResponse.setContentType("text/javascript");
        InputStream in = null;
        try {
            in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(file));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, servletResponse.getOutputStream());
            MyHelperClass logger = new MyHelperClass();
            logger.debug("Static resource rendered: ".concat(fileName));
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Static resource not found: " + fileName);
            successfull = false;
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
        return successfull;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass getFSPathOfResource(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class InputStream {

}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
