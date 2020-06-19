import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1169642 {
public MyHelperClass GeoType;
	public MyHelperClass dataSource;
	public MyHelperClass x;
	public MyHelperClass logger;
	public MyHelperClass y;
	public MyHelperClass z;
	public MyHelperClass lauchedHTTPRequests;
	public MyHelperClass getKey(){ return null; }

//    @Override
    public void run()  throws Throwable {
        String key =(String)(Object) getKey();
        synchronized (this.lauchedHTTPRequests) {
            if ((boolean)(Object)this.lauchedHTTPRequests.contains(key)) return;
            this.lauchedHTTPRequests.add(key);
        }
        String st =(String)(Object) this.dataSource.getTileURL(this.x, this.y, this.z);
        URL url;
        try {
            url = new URL(st);
        } catch (MalformedURLException e1) {
            logger.warning("Error in URL: " + st);
            return;
        }
        String geoJSON = "";
        try {
            InputStream is;
            if ("file".equals(url.getProtocol())) is = new FileInputStream(url.getFile()); else if ("http".equals(url.getProtocol())) is = url.openStream(); else {
                logger.warning("Impossible to load settings from " + url + ". Unsupported protocol " + url.getProtocol());
                return;
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = in.readLine()) != null) geoJSON += line;
            in.close();
        } catch (FileNotFoundException e) {
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        VectorTile tile = new VectorTile(geoJSON, x, y, z);
        Geometry[] geoms = new Geometry[(int)(Object)tile.getPieces().size()];
        int i = 0;
        for (MfGeo geo :(MfGeo[])(Object) (Object[])(Object)tile.getPieces()) {
            if (geo.getGeoType() == GeoType.GEOMETRY) {
                geoms[i++] =(Geometry)(Object) ((MfGeometry)(MfGeometry)(Object) geo).getInternalGeometry();
            } else if (geo.getGeoType() == GeoType.FEATURE) {
                MfFeature mf = (MfFeature)(MfFeature)(Object) geo;
                geoms[i++] =(Geometry)(Object) mf.getMfGeometry().getInternalGeometry();
            }
        }
        GeometryCollection gc = (GeometryCollection)(Object)new GeometryFactory().createGeometryCollection(geoms);
        this.dataSource.getDataLoader().add((String)(Object)new OpenCartoFeature(this.dataSource.getLayer(), new Rep(gc), this.z));
        this.dataSource.getLayer().getDisplayCacheLoader().coin();
        synchronized (this.lauchedHTTPRequests) {
            this.lauchedHTTPRequests.remove(key);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FEATURE;
	public MyHelperClass GEOMETRY;
public MyHelperClass size(){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass remove(String o0){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass getDataLoader(){ return null; }
	public MyHelperClass getLayer(){ return null; }
	public MyHelperClass getInternalGeometry(){ return null; }
	public MyHelperClass coin(){ return null; }
	public MyHelperClass getDisplayCacheLoader(){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass getTileURL(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class VectorTile {

VectorTile(){}
	VectorTile(String o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){}
	public MyHelperClass getPieces(){ return null; }}

class Geometry {

}

class MfGeo {

public MyHelperClass getGeoType(){ return null; }}

class MfGeometry {

public MyHelperClass getInternalGeometry(){ return null; }}

class MfFeature {

public MyHelperClass getMfGeometry(){ return null; }}

class GeometryCollection {

}

class GeometryFactory {

public MyHelperClass createGeometryCollection(Geometry[] o0){ return null; }}

class OpenCartoFeature {

OpenCartoFeature(){}
	OpenCartoFeature(MyHelperClass o0, Rep o1, MyHelperClass o2){}}

class Rep {

Rep(){}
	Rep(GeometryCollection o0){}}
