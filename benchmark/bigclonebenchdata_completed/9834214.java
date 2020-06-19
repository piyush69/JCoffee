


class c9834214 {
public MyHelperClass VText;
	public MyHelperClass SVGReader;
	public MyHelperClass mSpace;
	public MyHelperClass previousLocations;
	public MyHelperClass rView;
	public MyHelperClass mainView;

    void loadSVG(String svgFileURL) {
        try {
            URL url = new URL(svgFileURL);
            URLConnection c =(URLConnection)(Object) url.openConnection();
            c.setRequestProperty("Accept-Encoding", "gzip");
            InputStream is =(InputStream)(Object) c.getInputStream();
            String encoding =(String)(Object) c.getContentEncoding();
            if ("gzip".equals(encoding) || "x-gzip".equals(encoding) || svgFileURL.toLowerCase().endsWith(".svgz")) {
                is =(InputStream)(Object) new GZIPInputStream(is);
            }
            is =(InputStream)(Object) new BufferedInputStream(is);
            MyHelperClass AppletUtils = new MyHelperClass();
            Document svgDoc =(Document)(Object) AppletUtils.parse(is, false);
            if (svgDoc != null) {
                if (mainView.isBlank() == null) {
                    MyHelperClass cfgMngr = new MyHelperClass();
                    mainView.setBlank(cfgMngr.backgroundColor);
                }
                MyHelperClass grMngr = new MyHelperClass();
                SVGReader.load(svgDoc, grMngr.mSpace, true, svgFileURL);
//                MyHelperClass grMngr = new MyHelperClass();
                grMngr.seekBoundingBox();
//                MyHelperClass grMngr = new MyHelperClass();
                grMngr.buildLogicalStructure();
                MyHelperClass ConfigManager = new MyHelperClass();
                ConfigManager.defaultFont = VText.getMainFont();
//                MyHelperClass grMngr = new MyHelperClass();
                grMngr.reveal();
                if ((int)(Object)previousLocations.size() == 1) {
                    previousLocations.removeElementAt(0);
                }
//                MyHelperClass grMngr = new MyHelperClass();
                if (grMngr.rView != null) {
                    rView.getGlobalView(mSpace.getCamera(1), 100);
                }
//                MyHelperClass grMngr = new MyHelperClass();
                grMngr.cameraMoved(null, null, 0);
            } else {
                System.err.println("An error occured while loading file " + svgFileURL);
            }
        } catch (Exception ex) {
            MyHelperClass grMngr = new MyHelperClass();
            grMngr.reveal();
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass backgroundColor;
	public MyHelperClass defaultFont;
	public MyHelperClass mSpace;
	public MyHelperClass rView;
public MyHelperClass buildLogicalStructure(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass getMainFont(){ return null; }
	public MyHelperClass seekBoundingBox(){ return null; }
	public MyHelperClass reveal(){ return null; }
	public MyHelperClass cameraMoved(Object o0, Object o1, int o2){ return null; }
	public MyHelperClass getGlobalView(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass parse(InputStream o0, boolean o1){ return null; }
	public MyHelperClass isBlank(){ return null; }
	public MyHelperClass load(Document o0, MyHelperClass o1, boolean o2, String o3){ return null; }
	public MyHelperClass getCamera(int o0){ return null; }
	public MyHelperClass setBlank(MyHelperClass o0){ return null; }
	public MyHelperClass removeElementAt(int o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}}

class Document {

}
