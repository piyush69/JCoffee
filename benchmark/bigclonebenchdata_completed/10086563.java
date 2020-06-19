import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10086563 {
public MyHelperClass addProfile(P o0){ return null; }
public MyHelperClass FORMAT_SEARCH_TO_XSL;
	public MyHelperClass MINIMAL_LEGACY_CSWCLIENT;
public MyHelperClass Val;
	public MyHelperClass DocumentBuilderFactory;
	public MyHelperClass XPathFactory;
	public MyHelperClass getConfigurationFolderPath(){ return null; }

    public void loadProfilefromConfig(String filename, P xslProfileClass, String profileTag) throws Throwable, ParserConfigurationException, SAXException, IOException, XPathExpressionException {
        MyHelperClass Val = new MyHelperClass();
        if (Val.chkStr(profileTag).equals("")) {
            profileTag = "Profile";
        }
        String configuration_folder_path =(String)(Object) this.getConfigurationFolderPath();
        if (configuration_folder_path == null || configuration_folder_path.length() == 0) {
            Properties properties = new Properties();
            final URL url = CswProfiles.class.getResource("CswCommon.properties");
            properties.load(url.openStream());
            configuration_folder_path = properties.getProperty("DEFAULT_CONFIGURATION_FOLDER_PATH");
        }
        DocumentBuilder builder =(DocumentBuilder)(Object) DocumentBuilderFactory.newInstance().newDocumentBuilder();
        ResourcePath rscPath = new ResourcePath();
        InputSource configFile =(InputSource)(Object) rscPath.makeInputSource(configuration_folder_path + filename);
        if (configFile == null) {
            configFile =(InputSource)(Object) rscPath.makeInputSource("/" + configuration_folder_path + filename);
        }
        Document doc =(Document)(Object) builder.parse(configFile);
        NodeList profileNodes =(NodeList)(Object) doc.getElementsByTagName(profileTag);
        for (int i = 0; i < (int)(Object)profileNodes.getLength(); i++) {
            Node currProfile =(Node)(Object) profileNodes.item(i);
            XPath xpath =(XPath)(Object) XPathFactory.newInstance().newXPath();
            String id =(String)(Object) Val.chkStr((String)(Object)xpath.evaluate("ID", currProfile));
            String name =(String)(Object) Val.chkStr((String)(Object)xpath.evaluate("Name", currProfile));
            String description =(String)(Object) Val.chkStr((String)(Object)xpath.evaluate("Description", currProfile));
            String requestXslt =(String)(Object) Val.chkStr((String)(Object)xpath.evaluate("GetRecords/XSLTransformations/Request", currProfile));
            String expectedGptXmlOutput =(String)(Object) Val.chkStr((String)(Object)xpath.evaluate("GetRecords/XSLTransformations/Request/@expectedGptXmlOutput", currProfile));
            if (expectedGptXmlOutput.equals("")) {
                expectedGptXmlOutput = MINIMAL_LEGACY_CSWCLIENT.toString();
            }
            String responseXslt =(String)(Object) Val.chkStr((String)(Object)xpath.evaluate("GetRecords/XSLTransformations/Response", currProfile));
            String requestKVPs =(String)(Object) Val.chkStr((String)(Object)xpath.evaluate("GetRecordByID/RequestKVPs", currProfile));
            String metadataXslt =(String)(Object) Val.chkStr((String)(Object)xpath.evaluate("GetRecordByID/XSLTransformations/Response", currProfile));
            boolean extentSearch = Boolean.parseBoolean((String)(Object)Val.chkStr((String)(Object)xpath.evaluate("SupportSpatialQuery", currProfile)));
            boolean liveDataMaps = Boolean.parseBoolean((String)(Object)Val.chkStr((String)(Object)xpath.evaluate("SupportContentTypeQuery", currProfile)));
            boolean extentDisplay = Boolean.parseBoolean((String)(Object)Val.chkStr((String)(Object)xpath.evaluate("SupportSpatialBoundary", currProfile)));
            boolean harvestable = Boolean.parseBoolean((String)(Object)Val.chkStr((String)(Object)xpath.evaluate("Harvestable", currProfile)));
            requestXslt = configuration_folder_path + requestXslt;
            responseXslt = configuration_folder_path + responseXslt;
            metadataXslt = configuration_folder_path + metadataXslt;
            SearchXslProfile profile = null;
            try {
                profile =(SearchXslProfile)(Object) xslProfileClass.getClass().newInstance();
                profile.setId(id);
                profile.setName(name);
                profile.setDescription(description);
                profile.setRequestxslt(requestXslt);
                profile.setResponsexslt(responseXslt);
                profile.setMetadataxslt(metadataXslt);
                profile.setSupportsContentTypeQuery(liveDataMaps);
                profile.setSupportsSpatialBoundary(extentDisplay);
                profile.setSupportsSpatialQuery(extentSearch);
                profile.setKvp(requestKVPs);
                profile.setHarvestable(harvestable);
                profile.setFormatRequestToXsl(FORMAT_SEARCH_TO_XSL.valueOf(expectedGptXmlOutput));
                profile.setFilter_extentsearch(extentSearch);
                profile.setFilter_livedatamap(liveDataMaps);
                addProfile((P)(P)(Object) profile);
            } catch (InstantiationException e) {
                throw new IOException("Could not instantiate profile class" + e.getMessage());
            } catch (IllegalAccessException e) {
                throw new IOException("Could not instantiate profile class" + e.getMessage());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass valueOf(String o0){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass newXPath(){ return null; }
	public MyHelperClass chkStr(String o0){ return null; }}

class P {

}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class XPathExpressionException extends Exception{
	public XPathExpressionException(String errorMessage) { super(errorMessage); }
}

class CswProfiles {

}

class DocumentBuilder {

public MyHelperClass parse(InputSource o0){ return null; }}

class ResourcePath {

public MyHelperClass makeInputSource(String o0){ return null; }}

class InputSource {

}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass getLength(){ return null; }
	public MyHelperClass item(int o0){ return null; }}

class Node {

}

class XPath {

public MyHelperClass evaluate(String o0, Node o1){ return null; }}

class SearchXslProfile {

public MyHelperClass setSupportsContentTypeQuery(boolean o0){ return null; }
	public MyHelperClass setSupportsSpatialBoundary(boolean o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setSupportsSpatialQuery(boolean o0){ return null; }
	public MyHelperClass setMetadataxslt(String o0){ return null; }
	public MyHelperClass setResponsexslt(String o0){ return null; }
	public MyHelperClass setFilter_extentsearch(boolean o0){ return null; }
	public MyHelperClass setFilter_livedatamap(boolean o0){ return null; }
	public MyHelperClass setDescription(String o0){ return null; }
	public MyHelperClass setFormatRequestToXsl(MyHelperClass o0){ return null; }
	public MyHelperClass setRequestxslt(String o0){ return null; }
	public MyHelperClass setId(String o0){ return null; }
	public MyHelperClass setKvp(String o0){ return null; }
	public MyHelperClass setHarvestable(boolean o0){ return null; }}
