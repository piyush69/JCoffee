
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5545050 {
public MyHelperClass IOUtils;
	public MyHelperClass getOutputStream(){ return null; }

    public void sendFile(File file, String filename, String contentType) throws SearchLibException {
        MyHelperClass response = new MyHelperClass();
        response.setContentType(contentType);
//        MyHelperClass response = new MyHelperClass();
        response.addHeader("Content-Disposition", "attachment; filename=" + filename);
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            ServletOutputStream outputStream =(ServletOutputStream)(Object) getOutputStream();
            IOUtils.copy(inputStream, outputStream);
            outputStream.close();
        } catch (UncheckedIOException e) {
            throw new SearchLibException((String)(Object)e);
        } catch (ArithmeticException e) {
            throw new SearchLibException((String)(Object)e);
        } finally {
            if (inputStream != null) IOUtils.closeQuietly(inputStream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass copy(FileInputStream o0, ServletOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }}

class File {

}

class SearchLibException extends Exception{
	public SearchLibException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class ServletOutputStream {

public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
