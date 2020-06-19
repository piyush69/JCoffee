import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1686479 {
public MyHelperClass uploadDiretory(){ return null; }

//    @SuppressWarnings("static-access")
//    @RequestMapping(value = "/upload/upload.html", method = RequestMethod.POST)
    protected void save(HttpServletRequest request, HttpServletResponse response) throws Throwable, ServletException {
        MyHelperClass UPLOAD_DIRECTORY = new MyHelperClass();
        UPLOAD_DIRECTORY = uploadDiretory();
//        MyHelperClass UPLOAD_DIRECTORY = new MyHelperClass();
        File diretorioUsuario = new File((String)(Object)UPLOAD_DIRECTORY);
        boolean diretorioCriado = false;
        if (!diretorioUsuario.exists()) {
            diretorioCriado = diretorioUsuario.mkdir();
            if (!diretorioCriado) throw new RuntimeException("Não foi possível criar o diretório do usuário");
        }
        PrintWriter writer = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            writer =(PrintWriter)(Object) response.getWriter();
        } catch (ArithmeticException ex) {
            System.err.println(FileUploadController.class.getName() + "has thrown an exception: " + ex.getMessage());
        }
        String filename =(String)(Object) request.getHeader("X-File-Name");
        try {
            is =(InputStream)(Object) request.getInputStream();
//            MyHelperClass UPLOAD_DIRECTORY = new MyHelperClass();
            fos = new FileOutputStream(new File(UPLOAD_DIRECTORY + filename));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, fos);
            response.setStatus(response.SC_OK);
            writer.print("{success: true}");
        } catch (FileNotFoundException ex) {
            response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
            writer.print("{success: false}");
            System.err.println(FileUploadController.class.getName() + "has thrown an exception: " + ex.getMessage());
        } catch (IOException ex) {
            response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
            writer.print("{success: false}");
            System.err.println(FileUploadController.class.getName() + "has thrown an exception: " + ex.getMessage());
        } finally {
            try {
                fos.close();
                is.close();
            } catch (IOException ignored) {
            }
        }
        writer.flush();
        writer.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class HttpServletResponse {
public MyHelperClass SC_INTERNAL_SERVER_ERROR;
	public MyHelperClass SC_OK;
public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getWriter(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class RequestMapping {

}

class FileUploadController {

}
