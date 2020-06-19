
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20026764 {
public MyHelperClass addField(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass langDetection(int o0, MyHelperClass o1){ return null; }
public MyHelperClass StringUtils;

//    @Override
    protected void parseContent(StreamLimiter streamLimiter, LanguageEnum lang) throws IOException {
        MyHelperClass File = new MyHelperClass();
        File tempFile =(File)(Object) File.createTempFile("oss", ".pptx");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(tempFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(streamLimiter.getNewInputStream(), fos);
            fos.close();
        } catch (UncheckedIOException e) {
            MyHelperClass IOUtils = new MyHelperClass();
            if (fos != null) IOUtils.closeQuietly(fos);
            throw e;
        }
        try {
            XSLFSlideShow pptSlideShow = new XSLFSlideShow(tempFile.getAbsolutePath());
            XSLFPowerPointExtractor poiExtractor = new XSLFPowerPointExtractor(pptSlideShow);
            CoreProperties info =(CoreProperties)(Object) poiExtractor.getCoreProperties();
            if (info != null) {
                MyHelperClass ParserFieldEnum = new MyHelperClass();
                addField(ParserFieldEnum.title, info.getTitle());
//                MyHelperClass ParserFieldEnum = new MyHelperClass();
                addField(ParserFieldEnum.creator, info.getCreator());
//                MyHelperClass ParserFieldEnum = new MyHelperClass();
                addField(ParserFieldEnum.subject, info.getSubject());
//                MyHelperClass ParserFieldEnum = new MyHelperClass();
                addField(ParserFieldEnum.description, info.getDescription());
//                MyHelperClass ParserFieldEnum = new MyHelperClass();
                addField(ParserFieldEnum.keywords, info.getKeywords());
            }
            String content =(String)(Object) poiExtractor.getText(true, true);
            MyHelperClass ParserFieldEnum = new MyHelperClass();
            addField(ParserFieldEnum.content, StringUtils.replaceConsecutiveSpaces(content, " "));
//            MyHelperClass ParserFieldEnum = new MyHelperClass();
            langDetection(10000, ParserFieldEnum.content);
        } catch (UncheckedIOException e) {
            throw new IOException((String)(Object)e);
        } catch (ArithmeticException e) {
            throw new IOException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass description;
	public MyHelperClass subject;
	public MyHelperClass creator;
	public MyHelperClass content;
	public MyHelperClass title;
	public MyHelperClass keywords;
public MyHelperClass replaceConsecutiveSpaces(String o0, String o1){ return null; }
	public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class StreamLimiter {

public MyHelperClass getNewInputStream(){ return null; }}

class LanguageEnum {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class XSLFSlideShow {

XSLFSlideShow(){}
	XSLFSlideShow(MyHelperClass o0){}}

class XSLFPowerPointExtractor {

XSLFPowerPointExtractor(){}
	XSLFPowerPointExtractor(XSLFSlideShow o0){}
	public MyHelperClass getText(boolean o0, boolean o1){ return null; }
	public MyHelperClass getCoreProperties(){ return null; }}

class CoreProperties {

public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getKeywords(){ return null; }
	public MyHelperClass getSubject(){ return null; }
	public MyHelperClass getCreator(){ return null; }}

class OpenXML4JException extends Exception{
	public OpenXML4JException(String errorMessage) { super(errorMessage); }
}

class XmlException extends Exception{
	public XmlException(String errorMessage) { super(errorMessage); }
}
