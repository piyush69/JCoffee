
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11333342 {
public MyHelperClass MapMode;
	public MyHelperClass logger;

    public AssessmentItemType getAssessmentItemType(String filename) {
        if (filename.contains(" ") && (System.getProperty("os.name").contains("Windows"))) {
            File source = new File(filename);
            String tempDir = System.getenv("TEMP");
            File dest = new File(tempDir + "/temp.xml");
            logger.info("Importing from " + dest.getAbsolutePath());
            FileChannel in = null, out = null;
            try {
                in =(FileChannel)(Object) (new FileInputStream(source).getChannel());
                out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
                long size =(long)(Object) in.size();
                MappedByteBuffer buf =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, size);
                out.write(buf);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (in != null) try {
                    in.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
                if (out != null) try {
                    out.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
                filename = tempDir + "/temp.xml";
            }
        }
        AssessmentItemType assessmentItemType = null;
        JAXBElement jaxbe = null;
        try {
            MyHelperClass XMLReaderFactory = new MyHelperClass();
            XMLReader reader =(XMLReader)(Object) XMLReaderFactory.createXMLReader();
            ChangeNamespace convertfromv2p0tov2p1 = new ChangeNamespace(reader, "http://www.imsglobal.org/xsd/imsqti_v2p0", "http://www.imsglobal.org/xsd/imsqti_v2p1");
            SAXSource source = null;
            try {
                FileInputStream fis = new FileInputStream(filename);
                InputStreamReader isr = null;
                try {
                    isr = new InputStreamReader(fis, "UTF-8");
                } catch (UncheckedIOException e) {
                }
                InputSource is = new InputSource(isr);
                source = new SAXSource(convertfromv2p0tov2p1, is);
            } catch (UncheckedIOException e) {
                logger.error("SAX/getAssessmentItemType/file not found");
            }
            MyHelperClass MQModel = new MyHelperClass();
            jaxbe = (JAXBElement)(JAXBElement)(Object) MQModel.qtiCf.unmarshal(MQModel.imsqtiUnmarshaller, source);
            assessmentItemType = (AssessmentItemType)(AssessmentItemType)(Object) jaxbe.getValue();
        } catch (UncheckedIOException e) {
            logger.error("JAX/getAssessmentItemType",(SAXException)(Object) e);
        } catch (ArithmeticException e) {
            logger.error("SAX/getAssessmentItemType",(SAXException)(Object) e);
        }
        return assessmentItemType;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass qtiCf;
	public MyHelperClass imsqtiUnmarshaller;
	public MyHelperClass READ_ONLY;
public MyHelperClass createXMLReader(){ return null; }
	public MyHelperClass error(String o0, SAXException o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, JAXBException o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass unmarshal(MyHelperClass o0, SAXSource o1){ return null; }}

class AssessmentItemType {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class FileChannel {

public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	FileInputStream(String o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class MappedByteBuffer {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JAXBElement {

public MyHelperClass getValue(){ return null; }}

class XMLReader {

}

class ChangeNamespace {

ChangeNamespace(XMLReader o0, String o1, String o2){}
	ChangeNamespace(){}}

class SAXSource {

SAXSource(ChangeNamespace o0, InputSource o1){}
	SAXSource(){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(FileInputStream o0, String o1){}}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class InputSource {

InputSource(){}
	InputSource(InputStreamReader o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class JAXBException extends Exception{
	public JAXBException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
