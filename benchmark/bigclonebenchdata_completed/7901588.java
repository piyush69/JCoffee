import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7901588 {

    public static long removePropertyInOpenXMLDocument(String ext, InputStream in, OutputStreamProvider outProvider, String propriete)  throws Throwable {
        in = new BufferedInputStream(in);
        try {
            File tempPptx = null;
            POIXMLDocument doc;
            if (ext.toLowerCase().equals("docx")) {
                doc =(POIXMLDocument)(Object) new XWPFDocument(in);
            } else if (ext.toLowerCase().equals("xlsx")) {
                doc =(POIXMLDocument)(Object) new XSSFWorkbook(in);
            } else if (ext.toLowerCase().equals("pptx")) {
                tempPptx = File.createTempFile("temp", "pptx");
                OutputStream tempPptxOut = new FileOutputStream(tempPptx);
                tempPptxOut = new BufferedOutputStream(tempPptxOut);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, tempPptxOut);
                tempPptxOut.close();
                doc =(POIXMLDocument)(Object) new XSLFSlideShow(tempPptx.getAbsolutePath());
            } else {
                throw new IllegalArgumentException("Writing properties for a " + ext + " file is not supported");
            }
            CoreProperties coreProperties =(CoreProperties)(Object) doc.getProperties().getCoreProperties();
            MyHelperClass Metadata = new MyHelperClass();
            if (propriete.equals(Metadata.TITLE)) {
                coreProperties.setTitle("");
//            MyHelperClass Metadata = new MyHelperClass();
            } else if (propriete.equals(Metadata.AUTHOR)) {
                coreProperties.setCreator("");
//            MyHelperClass Metadata = new MyHelperClass();
            } else if (propriete.equals(Metadata.KEYWORDS)) {
                coreProperties.getUnderlyingProperties().setKeywordsProperty("");
//            MyHelperClass Metadata = new MyHelperClass();
            } else if (propriete.equals(Metadata.COMMENTS)) {
                coreProperties.setDescription("");
//            MyHelperClass Metadata = new MyHelperClass();
            } else if (propriete.equals(Metadata.SUBJECT)) {
                coreProperties.setSubjectProperty("");
//            MyHelperClass Metadata = new MyHelperClass();
            } else if (propriete.equals(Metadata.COMPANY)) {
                doc.getProperties().getExtendedProperties().getUnderlyingProperties().setCompany("");
            } else {
                CustomProperties customProperties =(CustomProperties)(Object) doc.getProperties().getCustomProperties();
                if ((boolean)(Object)customProperties.contains(propriete)) {
                    int index = 0;
                    for (CTProperty prop :(CTProperty[])(Object) (Object[])(Object)customProperties.getUnderlyingProperties().getPropertyArray()) {
                        if (prop.getName().equals(propriete)) {
                            customProperties.getUnderlyingProperties().removeProperty(index);
                            break;
                        }
                        index++;
                    }
                }
            }
            in.close();
            File tempOpenXMLDocumentFile = File.createTempFile("temp", "tmp");
            OutputStream tempOpenXMLDocumentOut = new FileOutputStream(tempOpenXMLDocumentFile);
            tempOpenXMLDocumentOut = new BufferedOutputStream(tempOpenXMLDocumentOut);
            doc.write(tempOpenXMLDocumentOut);
            tempOpenXMLDocumentOut.close();
            long length = tempOpenXMLDocumentFile.length();
            InputStream tempOpenXMLDocumentIn = new FileInputStream(tempOpenXMLDocumentFile);
            tempOpenXMLDocumentIn = new BufferedInputStream(tempOpenXMLDocumentIn);
            OutputStream out = null;
            try {
                out =(OutputStream)(Object) outProvider.getOutputStream();
                out = new BufferedOutputStream(out);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(tempOpenXMLDocumentIn, out);
                out.flush();
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(out);
            }
            MyHelperClass FileUtils = new MyHelperClass();
            if (!(Boolean)(Object)FileUtils.deleteQuietly(tempOpenXMLDocumentFile)) {
                tempOpenXMLDocumentFile.deleteOnExit();
            }
//            MyHelperClass FileUtils = new MyHelperClass();
            if (tempPptx != null && !(Boolean)(Object)FileUtils.deleteQuietly(tempPptx)) {
                tempPptx.deleteOnExit();
            }
            return length;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        } catch (ArrayStoreException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TITLE;
	public MyHelperClass COMPANY;
	public MyHelperClass COMMENTS;
	public MyHelperClass SUBJECT;
	public MyHelperClass KEYWORDS;
	public MyHelperClass AUTHOR;
public MyHelperClass deleteQuietly(File o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass setKeywordsProperty(String o0){ return null; }
	public MyHelperClass getExtendedProperties(){ return null; }
	public MyHelperClass getPropertyArray(){ return null; }
	public MyHelperClass getCustomProperties(){ return null; }
	public MyHelperClass getCoreProperties(){ return null; }
	public MyHelperClass getUnderlyingProperties(){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass setCompany(String o0){ return null; }
	public MyHelperClass removeProperty(int o0){ return null; }}

class OutputStreamProvider {

public MyHelperClass getOutputStream(){ return null; }}

class POIXMLDocument {

public MyHelperClass getProperties(){ return null; }
	public MyHelperClass write(OutputStream o0){ return null; }}

class XWPFDocument {

XWPFDocument(InputStream o0){}
	XWPFDocument(){}}

class XSSFWorkbook {

XSSFWorkbook(InputStream o0){}
	XSSFWorkbook(){}}

class XSLFSlideShow {

XSLFSlideShow(String o0){}
	XSLFSlideShow(){}}

class CoreProperties {

public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass setDescription(String o0){ return null; }
	public MyHelperClass getUnderlyingProperties(){ return null; }
	public MyHelperClass setCreator(String o0){ return null; }
	public MyHelperClass setSubjectProperty(String o0){ return null; }}

class CTProperty {

public MyHelperClass getName(){ return null; }}

class InvalidFormatException extends Exception{
	public InvalidFormatException(String errorMessage) { super(errorMessage); }
}

class OpenXML4JException extends Exception{
	public OpenXML4JException(String errorMessage) { super(errorMessage); }
}

class XmlException extends Exception{
	public XmlException(String errorMessage) { super(errorMessage); }
}

class CustomProperties {

public MyHelperClass getUnderlyingProperties(){ return null; }
	public MyHelperClass contains(String o0){ return null; }}
