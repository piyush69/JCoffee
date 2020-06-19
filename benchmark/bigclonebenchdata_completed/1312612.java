import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1312612 {
public MyHelperClass setTemplates(KnownTemplates o0){ return null; }
public MyHelperClass MergeTemplateWriter;
	public MyHelperClass KnownTemplates;
	public MyHelperClass getTokenProvider(){ return null; }
	public MyHelperClass setInitialized(boolean o0){ return null; }

    public void initFromXml(final String xmlFileName) throws Throwable, java.net.MalformedURLException, ConfigurationException, IOException {
        MyHelperClass xmlInitialized = new MyHelperClass();
        if ((boolean)(Object)xmlInitialized) {
            return;
        }
        MyHelperClass templates = new MyHelperClass();
        templates = null;
        MergeTemplateWriter.setTokenList(getTokenProvider().getKnownTokens());
        java.net.URL url = (URL)(Object)new FileFinder().getUrl(getTokenProvider().getClass(), xmlFileName);
        InputStreamReader xmlFileReader = new InputStreamReader(url.openStream());
        KnownTemplates temps =(KnownTemplates)(Object) MergeTemplateWriter.importFromXML(xmlFileReader);
        xmlFileReader.close();
        KnownTemplates.setDefaultInstance(temps);
        setTemplates(temps);
        setInitialized(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass importFromXML(InputStreamReader o0){ return null; }
	public MyHelperClass getKnownTokens(){ return null; }
	public MyHelperClass setDefaultInstance(KnownTemplates o0){ return null; }
	public MyHelperClass setTokenList(MyHelperClass o0){ return null; }}

class ConfigurationException extends Exception{
	public ConfigurationException(String errorMessage) { super(errorMessage); }
}

class FileFinder {

public MyHelperClass getUrl(Class o0, String o1){ return null; }}

class KnownTemplates {

}
