import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18810216 {
public MyHelperClass west;
	public MyHelperClass north;
	public MyHelperClass east;

    private void doIt() throws Throwable {
        int numCachedTiles = 0;
        try {
            List<MapTile> backTiles = new ArrayList<MapTile>();
            MyHelperClass south = new MyHelperClass();
            final LatLngRectangle bounds = new LatLngRectangle(new LatLngPoint(south, west), new LatLngPoint(north, east));
            final String backMapGuid = "gst";
            MyHelperClass Configuration = new MyHelperClass();
            final XFile dstDir = new XFile(new XFile(Configuration.getInstance().getPublicMapStorage().toString()), backMapGuid);
            dstDir.mkdir();
            MyHelperClass Tile = new MyHelperClass();
            for (int z = Math.min((int)(Object)Tile.getOptimalZoom(bounds, 768), 9); z <= 17; z++) {
                final Tile tileStart = new Tile(bounds.getSouthWest().getLat(), bounds.getSouthWest().getLng(), z);
                final Tile tileEnd = new Tile(bounds.getNorthEast().getLat(), bounds.getNorthEast().getLng(), z);
                for (double y =(double)(Object) tileEnd.getTileCoord().getY(); y <= tileStart.getTileCoord().getY(); y++) for (double x = tileStart.getTileCoord().getX(); x <= tileEnd.getTileCoord().getX(); x++) {
                    NASAMapTile tile = new NASAMapTile((int) x, (int) y, z);
                    XFile file = new XFile(dstDir, tile.toKeyString());
                    if ((Boolean)(Object)file.exists() && (Boolean)(Object)file.isFile()) continue;
                    backTiles.add((MapTile)(Object)tile);
                }
            }
            MyHelperClass logger = new MyHelperClass();
            logger.info(backTiles.size() + " tiles to cache");
            for (MapTile tile : backTiles) {
                InputStream in = null;
                OutputStream out = null;
                final URL url = new URL((String)(Object)tile.getPath());
                try {
                    int i = 4;
                    while (--i > 0) {
                        final XFile outFile = new XFile(dstDir, tile.toKeyString());
                        final URLConnection conn = url.openConnection();
                        if (conn == null || !conn.getContentType().startsWith("image")) {
//                            MyHelperClass logger = new MyHelperClass();
                            logger.error("onearth.jpl.nasa.gov service returns non-image file, " + "content-type='" + conn.getContentType() + "'");
                            Thread.sleep(1000L * (long) Math.pow(2, 8 - i));
                            continue;
                        }
                        in = conn.getInputStream();
                        if (in != null) {
                            out =(OutputStream)(Object) new XFileOutputStream(outFile);
                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.copy(in, out);
                            break;
                        } else throw new IllegalStateException("opened stream is null");
                    }
                } finally {
                    if (out != null) {
                        out.flush();
                        out.close();
                    }
                    if (in != null) in.close();
                }
                if (++numCachedTiles % 10 == 0) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.info(numCachedTiles + " tiles cached");
                    MyHelperClass sleep = new MyHelperClass();
                    Thread.sleep((long)(Object)sleep);
                }
            }
        } catch (Throwable e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("map tile caching has failed: ", e);
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLat(){ return null; }
	public MyHelperClass getPublicMapStorage(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getOptimalZoom(LatLngRectangle o0, int o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getX(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getLng(){ return null; }
	public MyHelperClass getY(){ return null; }}

class MapTile {

public MyHelperClass toKeyString(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class LatLngRectangle {

LatLngRectangle(){}
	LatLngRectangle(LatLngPoint o0, LatLngPoint o1){}
	public MyHelperClass getNorthEast(){ return null; }
	public MyHelperClass getSouthWest(){ return null; }}

class LatLngPoint {

LatLngPoint(MyHelperClass o0, MyHelperClass o1){}
	LatLngPoint(){}}

class XFile {

XFile(XFile o0, MyHelperClass o1){}
	XFile(){}
	XFile(String o0){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass mkdir(){ return null; }}

class Tile {

Tile(){}
	Tile(MyHelperClass o0, MyHelperClass o1, int o2){}
	public MyHelperClass getTileCoord(){ return null; }}

class NASAMapTile {

NASAMapTile(){}
	NASAMapTile(int o0, int o1, int o2){}
	public MyHelperClass toKeyString(){ return null; }}

class XFileOutputStream {

XFileOutputStream(){}
	XFileOutputStream(XFile o0){}}
