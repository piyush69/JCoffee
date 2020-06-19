


class c22368133 {
public static MyHelperClass testIfModified(){ return null; }
	public static MyHelperClass testIfNoneMatch(){ return null; }
public MyHelperClass c;
//	public MyHelperClass testIfNoneMatch(){ return null; }
//	public MyHelperClass testIfModified(){ return null; }

    public static void testMapSource(MapSource mapSource, EastNorthCoordinate coordinate) {
        try {
            System.out.println("Testing " + mapSource.toString());
            int zoom =(int)(Object) mapSource.getMinZoom() + (((int)(Object)mapSource.getMaxZoom() - (int)(Object)mapSource.getMinZoom()) / 2);
            MapSpace mapSpace =(MapSpace)(Object) mapSource.getMapSpace();
            int tilex =(int)(Object) mapSpace.cLonToX(coordinate.lon, zoom) / (int)(Object)mapSpace.getTileSize();
            int tiley =(int)(Object) mapSpace.cLatToY(coordinate.lat, zoom) / (int)(Object)mapSpace.getTileSize();
            URL url;// = new URL();
            url = new URL(mapSource.getTileUrl(zoom, tilex, tiley));
//            MyHelperClass url = new MyHelperClass();
            System.out.println("Sample url: " + url);
            HttpURLConnection c;// = new HttpURLConnection();
            c = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            System.out.println("Connecting...");
//            MyHelperClass c = new MyHelperClass();
            c.connect();
//            MyHelperClass c = new MyHelperClass();
            System.out.println("Connection established - response HTTP " + c.getResponseCode());
//            MyHelperClass c = new MyHelperClass();
            if ((int)(Object)c.getResponseCode() != 200) return;
//            MyHelperClass c = new MyHelperClass();
            String contentType =(String)(Object) c.getContentType();
            System.out.print("Image format          : ");
            if ("image/png".equals(contentType)) System.out.println("png"); else if ("image/jpeg".equals(contentType)) System.out.println("jpg"); else System.out.println("unknown");
//            MyHelperClass c = new MyHelperClass();
            String eTag =(String)(Object) c.getHeaderField("ETag");
            boolean eTagSupported = (eTag != null);
            if (eTagSupported) {
                System.out.println("eTag                  : " + eTag);
                testIfNoneMatch();
            } else System.out.println("eTag                  : -");
            long date =(long)(Object) c.getDate();
            if (date == 0) System.out.println("Date time             : -"); else System.out.println("Date time             : " + new Date(date));
            long exp =(long)(Object) c.getExpiration();
            if (exp == 0) System.out.println("Expiration time       : -"); else System.out.println("Expiration time       : " + new Date(exp));
            long modified =(long)(Object) c.getLastModified();
            if (modified == 0) System.out.println("Last modified time    : not set"); else System.out.println("Last modified time    : " + new Date(modified));
            testIfModified();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getExpiration(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getDate(){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class MapSource {

public MyHelperClass getMaxZoom(){ return null; }
	public MyHelperClass getMinZoom(){ return null; }
	public MyHelperClass getTileUrl(int o0, int o1, int o2){ return null; }
	public MyHelperClass getMapSpace(){ return null; }}

class EastNorthCoordinate {
public MyHelperClass lon;
	public MyHelperClass lat;
}

class MapSpace {

public MyHelperClass cLatToY(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass getTileSize(){ return null; }
	public MyHelperClass cLonToX(MyHelperClass o0, int o1){ return null; }}

class Date {

Date(){}
	Date(long o0){}}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getExpiration(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getDate(){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}
