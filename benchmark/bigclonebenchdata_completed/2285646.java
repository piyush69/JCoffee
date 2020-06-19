
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2285646 {
public MyHelperClass serializeDocument(FileOutputStream o0, Document o1){ return null; }

    protected void sendDoc(File indir, File outdir, File orig, Document doc, ServiceEndpoint ep) {
        ep.setMethod("simpleDocumentTransfer");
        Document response = null;
        try {
            MyHelperClass protocolHandler = new MyHelperClass();
            response =(Document)(Object) protocolHandler.sendMessage(ep, doc);
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("Message was not accepted, will try again later");
            return;
        }
        String serial = String.valueOf(System.currentTimeMillis());
        File origCopy = new File(outdir, orig.getName() + "." + serial);
        File respDrop = new File(outdir, orig.getName() + "." + serial + ".resp");
        FileOutputStream respos = null;
        try {
            respos = new FileOutputStream(respDrop);
            serializeDocument(respos, response);
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("Failed to dump response");
            return;
        } finally {
            try {
                respos.close();
            } catch (UncheckedIOException ignored) {
            }
        }
        FileInputStream in = null;
        FileOutputStream out = null;
        byte[] buffer = new byte[2048];
        try {
            in = new FileInputStream(orig);
            out = new FileOutputStream(origCopy);
            int bytesread = 0;
            while ((bytesread =(int)(Object) in.read(buffer)) > 0) {
                out.write(buffer, 0, bytesread);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("Failed to copy original");
            return;
        } finally {
            try {
                in.close();
                out.close();
            } catch (UncheckedIOException ignored) {
            }
        }
        orig.delete();
        MyHelperClass logger = new MyHelperClass();
        logger.info("File processed: " + orig.getName());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass sendMessage(ServiceEndpoint o0, Document o1){ return null; }}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass delete(){ return null; }}

class Document {

}

class ServiceEndpoint {

public MyHelperClass setMethod(String o0){ return null; }}

class TransportException extends Exception{
	public TransportException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
