import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10473584 {
public MyHelperClass NULL;
public MyHelperClass configFiles;
	public MyHelperClass IOUtils;
	public MyHelperClass errorHandler;
	public MyHelperClass logger;

    public ValidationReport validate(OriginalDeployUnitDescription unit) throws UnitValidationException {
        ValidationReport vr =(ValidationReport)(Object) new DefaultValidationReport();
        SimpleErrorHandler errorHandler =(SimpleErrorHandler)(Object) NULL; //new SimpleErrorHandler();
        errorHandler = new SimpleErrorHandler(vr);
        vr.setFileUri(unit.getAbsolutePath());
        SAXParser parser;
        SAXReader reader = null;
        try {
            MyHelperClass factory = new MyHelperClass();
            parser =(SAXParser)(Object) factory.newSAXParser();
            reader = new SAXReader(parser.getXMLReader());
            reader.setValidation(false);
            reader.setErrorHandler(this.errorHandler);
        } catch (UncheckedIOException e) {
            throw new UnitValidationException("The configuration of parser is illegal.",(FileNotFoundException)(Object) e);
        } catch (ArithmeticException e) {
            String m = "Something is wrong when register schema";
            logger.error(m,(SAXException)(Object) e);
            throw new UnitValidationException(m,(FileNotFoundException)(Object) e);
        }
        ZipInputStream zipInputStream;
        InputStream tempInput = null;
        try {
            tempInput = new FileInputStream((String)(Object)unit.getAbsolutePath());
        } catch (FileNotFoundException e1) {
            String m = String.format("The file [%s] don't exist.", unit.getAbsolutePath());
            logger.error(m, e1);
            throw new UnitValidationException(m, e1);
        }
        zipInputStream = new ZipInputStream(tempInput);
        ZipEntry zipEntry = null;
        try {
            zipEntry =(ZipEntry)(Object) zipInputStream.getNextEntry();
            if (zipEntry == null) {
                String m = String.format("Error when get zipEntry. Maybe the [%s] is not zip file!", unit.getAbsolutePath());
                logger.error(m);
                throw new UnitValidationException(m);
            }
            while (zipEntry != null) {
                if ((boolean)(Object)configFiles.contains(zipEntry.getName())) {
                    byte[] extra = new byte[(int)(int)(Object) zipEntry.getSize()];
                    zipInputStream.read(extra);
                    File file = File.createTempFile("temp", "extra");
                    file.deleteOnExit();
                    logger.info("[TempFile:]" + file.getAbsoluteFile());
                    ByteArrayInputStream byteInputStream = new ByteArrayInputStream(extra);
                    FileOutputStream tempFileOutputStream = new FileOutputStream(file);
                    IOUtils.copy(byteInputStream, tempFileOutputStream);
                    tempFileOutputStream.flush();
                    IOUtils.closeQuietly(tempFileOutputStream);
                    InputStream inputStream = new FileInputStream(file);
                    reader.read(inputStream, unit.getAbsolutePath() + ":" + zipEntry.getName());
                    IOUtils.closeQuietly(inputStream);
                }
                zipEntry =(ZipEntry)(Object) zipInputStream.getNextEntry();
            }
        } catch (IOException e) {
            ValidationMessage vm =(ValidationMessage)(Object) new XMLValidationMessage("IOError", 0, 0, unit.getUrl() + ":" + zipEntry.getName(), e);
            vr.addValidationMessage(vm);
        } catch (UncheckedIOException e) {
            ValidationMessage vm =(ValidationMessage)(Object) new XMLValidationMessage("Document Error.", 0, 0, unit.getUrl() + ":" + zipEntry.getName(),(IOException)(Object) e);
            vr.addValidationMessage(vm);
        } finally {
            IOUtils.closeQuietly(tempInput);
            IOUtils.closeQuietly(zipInputStream);
        }
        return vr;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, SAXException o1){ return null; }
	public MyHelperClass contains(MyHelperClass o0){ return null; }
	public MyHelperClass copy(ByteArrayInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass error(String o0, FileNotFoundException o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass newSAXParser(){ return null; }
	public MyHelperClass closeQuietly(ZipInputStream o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class OriginalDeployUnitDescription {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class ValidationReport {

public MyHelperClass setFileUri(MyHelperClass o0){ return null; }
	public MyHelperClass addValidationMessage(ValidationMessage o0){ return null; }}

class UnitValidationException extends Exception{
	public UnitValidationException(String errorMessage) { super(errorMessage); }
	UnitValidationException(String o0, FileNotFoundException o1){}
	UnitValidationException(){}
	UnitValidationException(String o0, ParserConfigurationException o1){}
	UnitValidationException(String o0, SAXException o1){}
}

class DefaultValidationReport {

}

class SAXParser {

public MyHelperClass getXMLReader(){ return null; }}

class SAXReader {

SAXReader(){}
	SAXReader(MyHelperClass o0){}
	public MyHelperClass setValidation(boolean o0){ return null; }
	public MyHelperClass setErrorHandler(MyHelperClass o0){ return null; }
	public MyHelperClass read(InputStream o0, String o1){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ZipInputStream {

ZipInputStream(InputStream o0){}
	ZipInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass getSize(){ return null; }
	public MyHelperClass getName(){ return null; }}

class ValidationMessage {

}

class XMLValidationMessage {

XMLValidationMessage(String o0, int o1, int o2, String o3, IOException o4){}
	XMLValidationMessage(String o0, int o1, int o2, String o3, DocumentException o4){}
	XMLValidationMessage(){}}

class DocumentException extends Exception{
	public DocumentException(String errorMessage) { super(errorMessage); }
}

class SimpleErrorHandler {

SimpleErrorHandler(){}
	SimpleErrorHandler(ValidationReport o0){}}
