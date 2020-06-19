
import java.io.UncheckedIOException;


class c15306466 {
public static MyHelperClass Configuration;
	public static MyHelperClass parseXMLFromURL(URL o0){ return null; }
//public MyHelperClass Configuration;
//	public MyHelperClass parseXMLFromURL(URL o0){ return null; }
	public static MyHelperClass parseXMLFromString(String o0){ return null; }
//public MyHelperClass parseXMLFromString(String o0){ return null; }

    public static Document tidyHTML(URL url) throws XMLHelperException {
        try {
            URLConnection inConnection =(URLConnection)(Object) url.openConnection();
            if ((Boolean)(Object)inConnection.getContentType().startsWith("text/xml") || (Boolean)(Object)inConnection.getContentType().startsWith("text/xhtml")) {
                return(Document)(Object) parseXMLFromURL(url);
            } else if ((boolean)(Object)inConnection.getContentType().startsWith("text/html")) {
                InputStream is =(InputStream)(Object) inConnection.getInputStream();
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                int totalBytes = 0;
                byte[] buffer = new byte[65536];
                while (true) {
                    int bytesRead =(int)(Object) is.read(buffer, 0, buffer.length);
                    if (bytesRead < 0) break;
                    for (int i = 0; i < bytesRead; i++) {
                        byte b = buffer[i];
                        if (b < 32 && b != 10 && b != 13 && b != 9) b = 32;
                        buffer[i] = b;
                    }
                    out.write(buffer, 0, bytesRead);
                    totalBytes += bytesRead;
                }
                is.close();
                out.close();
                String outContent = out.toString();
                InputStream in =(InputStream)(Object) new ByteArrayInputStream(out.toByteArray());
                Tidy tidy = new Tidy();
                tidy.setShowWarnings(false);
                tidy.setXmlOut(true);
                tidy.setXmlPi(false);
                tidy.setDocType("omit");
                tidy.setXHTML(false);
                tidy.setRawOut(true);
                tidy.setNumEntities(true);
                tidy.setQuiet(true);
                tidy.setFixComments(true);
                tidy.setIndentContent(true);
                tidy.setCharEncoding(Configuration.ASCII);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                org.w3c.dom.Document tNode = (org.w3c.dom.Document) tidy.parseDOM(in, baos);
                String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + baos.toString();
                int startIndex = 0;
                int endIndex = 0;
                if ((startIndex = result.indexOf("<!DOCTYPE")) >= 0) {
                    endIndex = result.indexOf(">", startIndex);
                    result = result.substring(0, startIndex) + result.substring(endIndex + 1, result.length());
                }
                while ((startIndex = result.indexOf("<script")) >= 0) {
                    endIndex = result.indexOf("</script>");
                    result = result.substring(0, startIndex) + result.substring(endIndex + 9, result.length());
                }
                in.close();
                baos.close();
                return(Document)(Object) parseXMLFromString(result);
            } else {
                throw new XMLHelperException("Unable to tidy content type: " + inConnection.getContentType());
            }
        } catch (UncheckedIOException ioe) {
            throw new XMLHelperException("Unable to perform input/output",(IOException)(Object) ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ASCII;
public MyHelperClass startsWith(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class Document {

}

class XMLHelperException extends Exception{
	public XMLHelperException(String errorMessage) { super(errorMessage); }
	XMLHelperException(){}
	XMLHelperException(String o0, IOException o1){}
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(MyHelperClass o0){}}

class Tidy {

public MyHelperClass setDocType(String o0){ return null; }
	public MyHelperClass setFixComments(boolean o0){ return null; }
	public MyHelperClass setCharEncoding(MyHelperClass o0){ return null; }
	public MyHelperClass parseDOM(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass setXmlOut(boolean o0){ return null; }
	public MyHelperClass setXmlPi(boolean o0){ return null; }
	public MyHelperClass setShowWarnings(boolean o0){ return null; }
	public MyHelperClass setNumEntities(boolean o0){ return null; }
	public MyHelperClass setQuiet(boolean o0){ return null; }
	public MyHelperClass setRawOut(boolean o0){ return null; }
	public MyHelperClass setXHTML(boolean o0){ return null; }
	public MyHelperClass setIndentContent(boolean o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
