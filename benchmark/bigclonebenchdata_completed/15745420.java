import java.io.*;
import java.lang.*;
import java.util.*;



class c15745420 {

    private void download(String address, String localFileName) throws UrlNotFoundException, Exception {
        MyHelperClass G_File = new MyHelperClass();
        String ext =(String)(Object) G_File.getExtensao(address);
        if (ext.equals("jsp")) {
            throw new Exception("Erro ao baixar pagina JSP, tipo negado." + address);
        }
        File temp = new File(localFileName + ".tmp");
        if (temp.exists()) temp.delete();
        OutputStream out = null;
        URLConnection conn = null;
        InputStream in = null;
        try {
            try {
                URL url = new URL(address);
                conn =(URLConnection)(Object) url.openConnection();
                in =(InputStream)(Object) conn.getInputStream();
            } catch (UncheckedIOException e2) {
                throw new UrlNotFoundException();
            }
            out = new BufferedOutputStream(new FileOutputStream(temp));
            byte[] buffer = new byte[1024];
            int numRead;
            long numWritten = 0;
            while ((numRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, numRead);
                numWritten += numRead;
            }
        } catch (UrlNotFoundException exception) {
            throw exception;
        } catch (Exception exception) {
            throw exception;
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioe) {
            }
        }
        File oldArq = new File(localFileName);
        if (oldArq.exists()) {
            oldArq.delete();
        }
        oldArq = null;
        File nomeFinal = new File(localFileName);
        temp.renameTo(nomeFinal);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getExtensao(String o0){ return null; }}

class UrlNotFoundException extends Exception{
	public UrlNotFoundException(String errorMessage) { super(errorMessage); }
	UrlNotFoundException(){}
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}
