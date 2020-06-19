
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15506300 {
public MyHelperClass log(String o0){ return null; }

    @SuppressWarnings("static-access")
//    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        PrintWriter writer = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            writer =(PrintWriter)(Object) response.getWriter();
        } catch (UncheckedIOException ex) {
            log(OctetStreamReader.class.getName() + "has thrown an exception: " + ex.getMessage());
        }
        String filename =(String)(Object) request.getHeader("X-File-Name");
        try {
            MyHelperClass URLDecoder = new MyHelperClass();
            filename =(String)(Object) URLDecoder.decode(filename, "utf-8");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        try {
            is =(InputStream)(Object) request.getInputStream();
            MyHelperClass realPath = new MyHelperClass();
            File newFile = new File(realPath + filename);
            if (!(Boolean)(Object)newFile.exists()) {
//                MyHelperClass realPath = new MyHelperClass();
                fos = new FileOutputStream(new File(realPath + filename));
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, fos);
                response.setStatus(response.SC_OK);
                writer.print("{success: true,detailMsg}");
            } else {
                response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
                writer.print("{success: false,detailMsg:'文件已经存在！请重命名后上传！'}");
                log(OctetStreamReader.class.getName() + "has thrown an exception: " + filename + " has existed!");
            }
        } catch (UncheckedIOException ex) {
            response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
            writer.print("{success: false}");
            log(OctetStreamReader.class.getName() + "has thrown an exception: " + ex.getMessage());
        } catch (ArithmeticException ex) {
            response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
            writer.print("{success: false}");
            log(OctetStreamReader.class.getName() + "has thrown an exception: " + ex.getMessage());
        } finally {
            try {
                fos.close();
                is.close();
            } catch (UncheckedIOException ignored) {
            }
        }
        writer.flush();
        writer.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass decode(String o0, String o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class HttpServletResponse {
public MyHelperClass SC_OK;
	public MyHelperClass SC_INTERNAL_SERVER_ERROR;
public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class PrintWriter {

public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OctetStreamReader {

}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
