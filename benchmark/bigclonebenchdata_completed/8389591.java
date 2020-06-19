import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8389591 {

    public static void testMapSource(MapSource mapSource, EastNorthCoordinate coordinate) throws Throwable, Exception {
        int zoom =(int)(Object) mapSource.getMaxZoom();
        MapSpace mapSpace =(MapSpace)(Object) mapSource.getMapSpace();
        int tilex =(int)(Object) mapSpace.cLonToX(coordinate.lon, zoom) / (int)(Object)mapSpace.getTileSize();
        int tiley =(int)(Object) mapSpace.cLatToY(coordinate.lat, zoom) / (int)(Object)mapSpace.getTileSize();
        URL url = new URL((String)(Object)mapSource.getTileUrl(zoom, tilex, tiley));
        HttpURLConnection c = (HttpURLConnection) url.openConnection();
        c.connect();
        c.disconnect();
        if (c.getResponseCode() != 200) throw(Throwable)(Object) new MapSourceTestFailed(mapSource, c.getResponseCode());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MapSource {

public MyHelperClass getTileUrl(int o0, int o1, int o2){ return null; }
	public MyHelperClass getMapSpace(){ return null; }
	public MyHelperClass getMaxZoom(){ return null; }}

class EastNorthCoordinate {
public MyHelperClass lat;
	public MyHelperClass lon;
}

class MapSpace {

public MyHelperClass cLonToX(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass cLatToY(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass getTileSize(){ return null; }}

class MapSourceTestFailed {

MapSourceTestFailed(MapSource o0, int o1){}
	MapSourceTestFailed(){}}
