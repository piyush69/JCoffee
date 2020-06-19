import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1737313 {
public MyHelperClass assertTrue(String o0, boolean o1){ return null; }
	public MyHelperClass assertFalse(String o0, boolean o1){ return null; }
	public MyHelperClass assertEquals(String o0, MyHelperClass o1, double o2){ return null; }
	public MyHelperClass assertEquals(String o0, MyHelperClass o1, String o2){ return null; }
public MyHelperClass left;
	public MyHelperClass model;
	public MyHelperClass url;
	public MyHelperClass myloc;
	public MyHelperClass poisCheck;
	public MyHelperClass right;
	public MyHelperClass SAXParserFactory;
	public MyHelperClass pois;
	public MyHelperClass top;
	public MyHelperClass bottom;
	public MyHelperClass assertFalse(boolean o0){ return null; }

    public void sendPOIGpxNonePOIs()  throws Throwable {
        this.myloc =(MyHelperClass)(Object) new Position(45.56, 5.9);
        this.left =(double)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) myloc.getY() - 0.025;
        this.right =(double)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) myloc.getY() + 0.025;
        this.top =(double)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) myloc.getX() + 0.03;
        this.bottom =(double)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) myloc.getX() - 0.03;
        assertEquals("left test", left, (5.9 - 0.025));
        assertEquals("right test", right, (5.9 + 0.025));
        assertEquals("top test", top, (45.56 - 0.025));
        assertEquals("bottom test", left, (45.56 + 0.025));
        this.poisCheck.add("None");
        try {
            if ((int)(Object)this.poisCheck.get(0).compareTo("None") == 0) {
                model.setPointsOfInterest(new Items());
            } else {
                this.url =(MyHelperClass)(Object) new URL("http://www.informationfreeway.org/api/0.6/node[" + poisCheck.get(0) + "=*][bbox=" + left + "," + bottom + "," + right + "," + top + "]");
                assertEquals("url informationfreeway.org test", url, "http://www.informationfreeway.org/api/0.6/node[amenity=*]" + "[bbox=" + left + "," + bottom + "," + right + "," + top + "]");
                SAXParser pars = null;
                ParsePoiGpx gpxHandler = new ParsePoiGpx(poisCheck, this.model.getContext());
                pars =(SAXParser)(Object) SAXParserFactory.newInstance().newSAXParser();
                pars.getXMLReader().setFeature("http://xml.org/sax/features/namespaces", true);
                pars.parse(url.openStream(), gpxHandler);
                this.pois = gpxHandler.getPOIResultsItems();
                assertFalse("there is some pois", !this.pois.equals(0));
                assertTrue("there is some pois", this.pois.equals(0));
            }
        } catch (Exception e) {
            e.printStackTrace();
            assertFalse(!e.getCause().equals(null));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContext(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getX(){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass compareTo(String o0){ return null; }
	public MyHelperClass setFeature(String o0, boolean o1){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getY(){ return null; }
	public MyHelperClass setPointsOfInterest(Items o0){ return null; }
	public MyHelperClass newSAXParser(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class Items {

}

class SAXParser {

public MyHelperClass getXMLReader(){ return null; }
	public MyHelperClass parse(MyHelperClass o0, ParsePoiGpx o1){ return null; }}

class ParsePoiGpx {

ParsePoiGpx(MyHelperClass o0, MyHelperClass o1){}
	ParsePoiGpx(){}
	public MyHelperClass getPOIResultsItems(){ return null; }}

class Position {

Position(){}
	Position(double o0, double o1){}}
