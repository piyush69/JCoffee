


class c10535319 {
public static MyHelperClass getToplevelXmlFilename(MyHelperClass o0){ return null; }
public static MyHelperClass IOUtils;
//	public MyHelperClass getToplevelXmlFilename(MyHelperClass o0){ return null; }
//public MyHelperClass IOUtils;

    private static Collection createTopLevelFiles(Configuration configuration, Collections collections, Sets sets) throws FlickrException, SAXException, IOException, JDOMException, TransformerException {
        Collection createdFiles =(Collection)(Object) new HashSet();
        File toplevelXmlFilename =(File)(Object) getToplevelXmlFilename(configuration.photosBaseDirectory);
        MyHelperClass Logger = new MyHelperClass();
        Logger.getLogger(FlickrDownload.class).info("Creating XML file " + toplevelXmlFilename.getAbsolutePath());
        MediaIndexer indexer =(MediaIndexer)(Object) new XmlMediaIndexer(configuration);
        MyHelperClass XmlUtils = new MyHelperClass();
        Element toplevel =(Element)(Object) (new Element("flickr").addContent(XmlUtils.createApplicationXml()).addContent(XmlUtils.createUserXml(configuration)).addContent(collections.createTopLevelXml()).addContent(sets.createTopLevelXml()).addContent(new Stats(sets).createStatsXml(indexer)));
        createdFiles.addAll(indexer.writeIndex());
//        MyHelperClass XmlUtils = new MyHelperClass();
        XmlUtils.outputXmlFile(toplevelXmlFilename, toplevel);
        createdFiles.add(toplevelXmlFilename.getName());
//        MyHelperClass Logger = new MyHelperClass();
        Logger.getLogger(FlickrDownload.class).info("Copying support files and performing XSLT transformations");
        MyHelperClass PHOTOS_CSS_FILENAME = new MyHelperClass();
        IOUtils.copyToFileAndCloseStreams((InputStream)(Object)XmlUtils.class.getResourceAsStream("xslt/" + PHOTOS_CSS_FILENAME), new File(configuration.photosBaseDirectory, PHOTOS_CSS_FILENAME));
//        MyHelperClass PHOTOS_CSS_FILENAME = new MyHelperClass();
        createdFiles.add(PHOTOS_CSS_FILENAME);
        MyHelperClass PLAY_ICON_FILENAME = new MyHelperClass();
        IOUtils.copyToFileAndCloseStreams((InputStream)(Object)XmlUtils.class.getResourceAsStream("xslt/" + PLAY_ICON_FILENAME), new File(configuration.photosBaseDirectory, PLAY_ICON_FILENAME));
//        MyHelperClass PLAY_ICON_FILENAME = new MyHelperClass();
        createdFiles.add(PLAY_ICON_FILENAME);
        MyHelperClass ALL_SETS_HTML_FILENAME = new MyHelperClass();
        XmlUtils.performXsltTransformation(configuration, "all_sets.xsl", toplevelXmlFilename, new File(configuration.photosBaseDirectory, ALL_SETS_HTML_FILENAME));
//        MyHelperClass ALL_SETS_HTML_FILENAME = new MyHelperClass();
        createdFiles.add(ALL_SETS_HTML_FILENAME);
        MyHelperClass ALL_COLLECTIONS_HTML_FILENAME = new MyHelperClass();
        XmlUtils.performXsltTransformation(configuration, "all_collections.xsl", toplevelXmlFilename, new File(configuration.photosBaseDirectory, ALL_COLLECTIONS_HTML_FILENAME));
//        MyHelperClass ALL_COLLECTIONS_HTML_FILENAME = new MyHelperClass();
        createdFiles.add(ALL_COLLECTIONS_HTML_FILENAME);
        MyHelperClass Collections = new MyHelperClass();
        createdFiles.add(Collections.COLLECTIONS_ICON_DIRECTORY);
        MyHelperClass STATS_HTML_FILENAME = new MyHelperClass();
        XmlUtils.performXsltTransformation(configuration, "stats.xsl", toplevelXmlFilename, new File(configuration.photosBaseDirectory, STATS_HTML_FILENAME));
//        MyHelperClass STATS_HTML_FILENAME = new MyHelperClass();
        createdFiles.add(STATS_HTML_FILENAME);
        sets.performXsltTransformation();
        for (AbstractSet set :(AbstractSet[])(Object) (Object[])(Object)sets.getSets()) {
            createdFiles.add(set.getSetId());
        }
        return createdFiles;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass COLLECTIONS_ICON_DIRECTORY;
public MyHelperClass performXsltTransformation(Configuration o0, String o1, File o2, File o3){ return null; }
	public MyHelperClass createUserXml(Configuration o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copyToFileAndCloseStreams(InputStream o0, File o1){ return null; }
	public MyHelperClass addContent(MyHelperClass o0){ return null; }
	public MyHelperClass outputXmlFile(File o0, Element o1){ return null; }
	public MyHelperClass getLogger(Class<FlickrDownload> o0){ return null; }
	public MyHelperClass createApplicationXml(){ return null; }}

class Configuration {
public MyHelperClass photosBaseDirectory;
}

class Collections {

public MyHelperClass createTopLevelXml(){ return null; }}

class Sets {

public MyHelperClass getSets(){ return null; }
	public MyHelperClass performXsltTransformation(){ return null; }
	public MyHelperClass createTopLevelXml(){ return null; }}

class Collection {

public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass addAll(MyHelperClass o0){ return null; }}

class FlickrException extends Exception{
	public FlickrException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JDOMException extends Exception{
	public JDOMException(String errorMessage) { super(errorMessage); }
}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class HashSet {

}

class File {

File(){}
	File(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class FlickrDownload {

}

class MediaIndexer {

public MyHelperClass writeIndex(){ return null; }}

class XmlMediaIndexer {

XmlMediaIndexer(){}
	XmlMediaIndexer(Configuration o0){}}

class Element {

Element(String o0){}
	Element(){}
	public MyHelperClass addContent(MyHelperClass o0){ return null; }}

class Stats {

Stats(){}
	Stats(Sets o0){}
	public MyHelperClass createStatsXml(MediaIndexer o0){ return null; }}

class AbstractSet {

public MyHelperClass getSetId(){ return null; }}

class XmlUtils {

}

class InputStream {

}
