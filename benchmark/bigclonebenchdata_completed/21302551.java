import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21302551 {
public static MyHelperClass getTransformerByName(String o0, boolean o1){ return null; }
public MyHelperClass log;
//	public MyHelperClass getTransformerByName(String o0, boolean o1){ return null; }

    public static Document convertHtmlToXml(final InputStream htmlInputStream, final String classpathXsltResource, final String encoding)  throws Throwable {
        Parser p = new Parser();
        javax.xml.parsers.DocumentBuilder db;
        try {
            db = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("", e);
            throw new RuntimeException();
        }
        Document document =(Document[])(Object)(Document[])(Object)(Document[])(Object)(Document[])(Object)(Document[])(Object)(Document[])(Object)(Document[])(Object)(Document[])(Object)(Document)(Object) db.newDocument();
        InputStream is = htmlInputStream;
        MyHelperClass log = new MyHelperClass();
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)log.isDebugEnabled()) {
            ByteArrayOutputStream baos;
            baos = new ByteArrayOutputStream();
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, baos);
            } catch (IOException e) {
//                MyHelperClass log = new MyHelperClass();
                log.error("Fail to make input stream copy.", e);
            }
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(is);
            ByteArrayInputStream byteArrayInputStream;
            byteArrayInputStream = new ByteArrayInputStream(baos.toByteArray());
            try {
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.toString(new ByteArrayInputStream(baos.toByteArray()), "UTF-8");
            } catch (IOException e) {
//                MyHelperClass log = new MyHelperClass();
                log.error("", e);
            }
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(byteArrayInputStream);
            is = new ByteArrayInputStream(baos.toByteArray());
        }
        try {
            InputSource iSource = new InputSource(is);
            iSource.setEncoding(encoding);
            Source transformerSource =(Source)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new SAXSource(p, iSource);
            Result result =(Result)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new DOMResult(document);
            Transformer xslTransformer =(Transformer)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getTransformerByName(classpathXsltResource, false);
            try {
                xslTransformer.transform(transformerSource, result);
            } catch (TransformerException e) {
                throw new RuntimeException(e);
            }
        } finally {
            try {
                is.close();
            } catch (Exception e) {
                log.warn("", e);
            }
        }
        return document;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, Exception o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(ByteArrayInputStream o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass error(String o0, ParserConfigurationException o1){ return null; }}

class Document {

}

class Parser {

}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}
	public MyHelperClass setEncoding(String o0){ return null; }}

class Source {

}

class SAXSource {

SAXSource(Parser o0, InputSource o1){}
	SAXSource(){}}

class Result {

}

class DOMResult {

DOMResult(Document o0){}
	DOMResult(){}}

class Transformer {

public MyHelperClass transform(Source o0, Result o1){ return null; }}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(ByteArrayInputStream o0, String o1){ return null; }}
