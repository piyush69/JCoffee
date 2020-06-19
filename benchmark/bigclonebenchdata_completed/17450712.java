


class c17450712 {
public MyHelperClass File;
	public MyHelperClass unmarshal(InputStream o0){ return null; }
public MyHelperClass map;
	public MyHelperClass makeUrl(String o0){ return null; }

    public Map readMap(String filename) throws Exception {
        String xmlPath;// = new String();
        xmlPath = filename.substring(0, filename.lastIndexOf((int)(Object)File.separatorChar) + 1);
        String xmlFile =(String)(Object) makeUrl(filename);
        URL url = new URL(xmlFile);
        InputStream is =(InputStream)(Object) url.openStream();
        if (filename.endsWith(".gz")) {
            is =(InputStream)(Object) new GZIPInputStream(is);
        }
        Map unmarshalledMap =(Map)(Object) unmarshal(is);
        unmarshalledMap.setFilename(filename);
        map = null;
        return unmarshalledMap;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separatorChar;
}

class Map {

public MyHelperClass setFilename(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(InputStream o0){}}
