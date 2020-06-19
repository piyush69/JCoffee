import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10504714 {

    private MediaWikiResult getFromUri(String url) throws OntologyServiceException {
        try {
            MyHelperClass logger = new MyHelperClass();
            logger.info("getting " + url);
            HttpURLConnection connection = (java.net.HttpURLConnection) new URL(url).openConnection();
            connection.setRequestProperty("User-Agent", "OntoCat-" + Math.random());
            BufferedInputStream bin = new BufferedInputStream(connection.getInputStream());
            MyHelperClass JAXBContext = new MyHelperClass();
            JAXBContext jaxbContext =(JAXBContext)(Object) JAXBContext.newInstance("uk.ac.ebi.ontocat.mediawiki.jaxb");
            Unmarshaller unmarshaller =(Unmarshaller)(Object) jaxbContext.createUnmarshaller();
            return (MediaWikiResult)(MediaWikiResult)(Object) unmarshaller.unmarshal(bin);
        } catch (Exception e) {
            e.printStackTrace();
            throw new OntologyServiceException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass newInstance(String o0){ return null; }}

class MediaWikiResult {

}

class OntologyServiceException extends Exception{
	public OntologyServiceException(String errorMessage) { super(errorMessage); }
}

class JAXBContext {

public MyHelperClass createUnmarshaller(){ return null; }}

class Unmarshaller {

public MyHelperClass unmarshal(BufferedInputStream o0){ return null; }}
