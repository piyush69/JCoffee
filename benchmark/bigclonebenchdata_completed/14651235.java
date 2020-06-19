import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c14651235 {

    public static Document getSkeleton() {
        Document doc = null;
        String filesep = System.getProperty("file.separator");
        try {
            java.net.URL url = Skeleton.class.getResource(filesep + "simplemassimeditor" + filesep + "resources" + filesep + "configskeleton.xml");
            InputStream input = url.openStream();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilder parser =(DocumentBuilder)(Object) DocumentBuilderFactory.newInstance().newDocumentBuilder();
            try {
                doc =(Document)(Object) parser.parse(input);
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass newInstance(){ return null; }}

class Document {

}

class Skeleton {

}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
