import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16749958 {
public MyHelperClass TaskState;

    public byte process(ProcessorContext context) throws Throwable, InterruptedException, ProcessorException {
        MyHelperClass logger = new MyHelperClass();
        logger.info("MapTileChacheTask:process");
        PublishRequest req = context.getItem().getEntity();
        MyHelperClass StringUtils = new MyHelperClass();
        if (StringUtils.isEmpty(req.getBackMap())) return(byte)(Object) TaskState.STATE_TILE_CACHED;
        final PublicMapPost post;
        MyHelperClass DAOFactory = new MyHelperClass();
        final GenericDAO postDao = DAOFactory.createDAO(PublicMapPost.class);
        try {
            MyHelperClass ReadOnlyTransaction = new MyHelperClass();
            ReadOnlyTransaction.beginTransaction();
        } catch (DatabaseException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("error", e);
            throw new ProcessorException((String)(Object)e);
        }
        int numCachedTiles = 0;
        try {
            List<MapTile> backTiles = new ArrayList<MapTile>();
            MyHelperClass Expression = new MyHelperClass();
            post = postDao.findUniqueByCriteria(Expression.eq("guid", req.getPostGuid()));
            final LatLngRectangle bounds = new LatLngRectangle(new LatLngPoint(post.getSWLat(), post.getSWLon()), new LatLngPoint(post.getNELat(), post.getNELon()));
            final String backMapGuid = "gst";
            MyHelperClass Configuration = new MyHelperClass();
            final XFile dstDir = new XFile(new XFile(Configuration.getInstance().getPublicMapStorage().toString()), backMapGuid);
            dstDir.mkdir();
            MyHelperClass Tile = new MyHelperClass();
            for (int z = Math.min((int)(Object)Tile.getOptimalZoom(bounds, 768), 9); z <= 17; z++) {
                final Tile tileStart = new Tile(bounds.getSouthWest().getLat(), bounds.getSouthWest().getLng(), z);
                final Tile tileEnd = new Tile(bounds.getNorthEast().getLat(), bounds.getNorthEast().getLng(), z);
                for (double y = tileEnd.getTileCoord().getY(); y <= tileStart.getTileCoord().getY(); y++) for (double x = tileStart.getTileCoord().getX(); x <= tileEnd.getTileCoord().getX(); x++) {
                    NASAMapTile tile = new NASAMapTile((int) x, (int) y, z);
                    XFile file = new XFile(dstDir, tile.toKeyString());
                    if (file.exists() && (Boolean)(Object)file.isFile()) continue;
                    backTiles.add((MapTile)(Object)tile);
                }
            }
            try {
                for (MapTile tile : backTiles) {
                    InputStream in = null;
                    OutputStream out = null;
                    final URL url = new URL((String)(Object)tile.getPath());
                    try {
                        final XFile outFile = new XFile(dstDir, tile.toKeyString());
                        final URLConnection conn = url.openConnection();
                        if (conn == null || !conn.getContentType().startsWith("image")) throw new IllegalAccessException("onearth.jpl.nasa.gov service returns non-image file, " + "content-type='" + conn.getContentType() + "'");
                        in = conn.getInputStream();
                        if (in != null) {
                            out =(OutputStream)(Object) new XFileOutputStream(outFile);
                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.copy(in, out);
                        } else throw new IllegalStateException("opened stream is null");
                    } finally {
                        if (out != null) {
                            out.flush();
                            out.close();
                        }
                        if (in != null) in.close();
                    }
                    if (++numCachedTiles % 100 == 0) {
//                        MyHelperClass logger = new MyHelperClass();
                        logger.info(numCachedTiles + " tiles cached");
                    }
                }
            } catch (Throwable e) {
//                MyHelperClass logger = new MyHelperClass();
                logger.error("map tile caching has failed: ", e);
                throw new ProcessorException((String)(Object)e);
            }
        } catch (ProcessorException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("map tile caching has failed: ", e);
            throw e;
        } catch (Throwable e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("map tile caching has failed: ", e);
            throw new ProcessorException((String)(Object)e);
        } finally {
            MyHelperClass ReadOnlyTransaction = new MyHelperClass();
            ReadOnlyTransaction.closeTransaction();
//            MyHelperClass logger = new MyHelperClass();
            logger.info(numCachedTiles + " tiles cached");
        }
        MyHelperClass TaskState = new MyHelperClass();
        return(byte)(Object) TaskState.STATE_TILE_CACHED;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STATE_TILE_CACHED;
public MyHelperClass getLat(){ return null; }
	public MyHelperClass error(String o0, ProcessorException o1){ return null; }
	public MyHelperClass createDAO(Class<PublicMapPost o0){ return null; }
	public MyHelperClass beginTransaction(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass getPublicMapStorage(){ return null; }
	public MyHelperClass getOptimalZoom(LatLngRectangle o0, int o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass eq(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass closeTransaction(){ return null; }
	public MyHelperClass isEmpty(MyHelperClass o0){ return null; }
	public MyHelperClass getX(){ return null; }
	public MyHelperClass getLng(){ return null; }
	public MyHelperClass getY(){ return null; }
	public MyHelperClass error(String o0, DatabaseException o1){ return null; }}

class ProcessorContext {

public MyHelperClass getItem(){ return null; }}

class PublishRequest {

public MyHelperClass getBackMap(){ return null; }
	public MyHelperClass getPostGuid(){ return null; }}

class ProcessorException extends Exception{
	public ProcessorException(String errorMessage) { super(errorMessage); }
}

class PublicMapPost {

public MyHelperClass getNELat(){ return null; }
	public MyHelperClass getSWLon(){ return null; }
	public MyHelperClass getSWLat(){ return null; }
	public MyHelperClass getNELon(){ return null; }}

class GenericDAO {

}

class DatabaseException extends Exception{
	public DatabaseException(String errorMessage) { super(errorMessage); }
}

class MapTile {

public MyHelperClass toKeyString(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class LatLngRectangle {

public MyHelperClass getNorthEast(){ return null; }
	public MyHelperClass getSouthWest(){ return null; }}

class LatLngPoint {

LatLngPoint(MyHelperClass o0, MyHelperClass o1){}
	LatLngPoint(){}}

class XFile {

XFile(XFile o0, MyHelperClass o1){}
	XFile(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass mkdir(){ return null; }}

class Tile {

public MyHelperClass getTileCoord(){ return null; }}

class NASAMapTile {

NASAMapTile(){}
	NASAMapTile(int o0, int o1, int o2){}
	public MyHelperClass toKeyString(){ return null; }}

class XFileOutputStream {

XFileOutputStream(){}
	XFileOutputStream(XFile o0){}}
