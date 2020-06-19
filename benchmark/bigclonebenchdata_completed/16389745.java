import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16389745 {
public MyHelperClass logger;
	public MyHelperClass SubState;
	public MyHelperClass Expression;
	public MyHelperClass State;

    private void doIt() throws Throwable {
        MyHelperClass DAOFactory = new MyHelperClass();
        GenericDAO dao = DAOFactory.createDAO(User.class);
        try {
            MyHelperClass login = new MyHelperClass();
            final User user = dao.findUniqueByCriteria(Expression.eq("login", login));
            if (user == null) throw new IllegalArgumentException("Specified user isn't exist");
            MyHelperClass srcDir = new MyHelperClass();
            if (srcDir.isDirectory() && (Boolean)(Object)srcDir.exists()) {
//                MyHelperClass srcDir = new MyHelperClass();
                final String[] fileList = srcDir.list(new XFilenameFilter() {

                    public boolean accept(XFile dir, String file) {
                        String[] fNArr = file.split("\\.");
                        return (fNArr.length > 1 && (fNArr[fNArr.length - 1].equalsIgnoreCase("map") || fNArr[fNArr.length - 1].equalsIgnoreCase("plt") || fNArr[fNArr.length - 1].equalsIgnoreCase("wpt")));
                    }
                });
                int pointsCounter = 0;
                int tracksCounter = 0;
                int mapsCounter = 0;
                for (final String fName : fileList) {
                    try {
                        MyHelperClass TransactionManager = new MyHelperClass();
                        TransactionManager.beginTransaction();
                    } catch (Throwable e) {
                        MyHelperClass logger = new MyHelperClass();
                        logger.error(e);
                        throw e;
                    }
//                    MyHelperClass srcDir = new MyHelperClass();
                    final XFile file = new XFile(srcDir, fName);
                    InputStream in =(InputStream)(Object) new XFileInputStream(file);
                    try {
                        ArrayList<UserMapOriginal> maps = new ArrayList<UserMapOriginal>();
                        ArrayList<MapTrackPointsScaleRequest> tracks = new ArrayList<MapTrackPointsScaleRequest>();
                        final byte[] headerBuf = new byte[1024];
                        if (in.read(headerBuf) <= 0) continue;
                        final String fileHeader = new String(headerBuf);
                        final boolean isOziWPT = (fileHeader.indexOf("OziExplorer Waypoint File") >= 0);
                        final boolean isOziPLT = (fileHeader.indexOf("OziExplorer Track Point File") >= 0);
                        final boolean isOziMAP = (fileHeader.indexOf("OziExplorer Map Data File") >= 0);
                        final boolean isKML = (fileHeader.indexOf("<kml xmlns=") >= 0);
                        if (isOziMAP || isOziPLT || isOziWPT || isKML) {
                            in.close();
                            in =(InputStream)(Object) new XFileInputStream(file);
                        } else continue;
                        WPTPoint wp;
                        if (isOziWPT) {
                            try {
                                wp = new WPTPointParser(in, "Cp1251").parse();
                            } catch (Throwable t) {
                                wp = null;
                            }
                            if (wp != null) {
                                Set<WayPointRow> rows =(Set<WayPointRow>)(Object) wp.getPoints();
                                for (WayPointRow row : rows) {
                                    MyHelperClass BeanFactory = new MyHelperClass();
                                    final UserMapPoint p =(UserMapPoint)(Object) BeanFactory.createUserPoint(row, user);
                                    MyHelperClass logger = new MyHelperClass();
                                    logger.info("point:" + p.getGuid());
                                }
                                pointsCounter += rows.size();
                            }
                        } else if (isOziPLT) {
                            PLTTrack plt;
                            try {
                                plt = new PLTTrackParser(in, "Cp1251").parse();
                            } catch (Throwable t) {
                                plt = null;
                            }
                            if (plt != null) {
                                MyHelperClass BeanFactory = new MyHelperClass();
                                final UserMapTrack t =(UserMapTrack)(Object) BeanFactory.createUserTrack(plt, user);
                                tracks.add(new MapTrackPointsScaleRequest(t));
                                tracksCounter++;
                                MyHelperClass logger = new MyHelperClass();
                                logger.info("track:" + t.getGuid());
                            }
                        } else if (isOziMAP) {
                            MapProjection projection;
                            MAPParser parser = new MAPParser(in, "Cp1251");
                            try {
                                projection =(MapProjection)(Object) parser.parse();
                            } catch (Throwable t) {
                                projection = null;
                            }
                            if (projection != null && projection.getPoints() != null && projection.getPoints().size() >= 2) {
//                                MyHelperClass DAOFactory = new MyHelperClass();
                                GenericDAO mapDao = DAOFactory.createDAO(UserMapOriginal.class);
                                final UserMapOriginal mapOriginal = new UserMapOriginal();
                                mapOriginal.setName(projection.getTitle());
                                mapOriginal.setUser(user);
                                mapOriginal.setState(State.UPLOAD);
                                mapOriginal.setSubstate(SubState.COMPLETE);
                                MyHelperClass MapManager = new MyHelperClass();
                                MapManager.updateProjection(projection, mapOriginal);
//                                MyHelperClass srcDir = new MyHelperClass();
                                final XFile srcFile = new XFile(srcDir,(String)(Object) projection.getPath());
                                if (!(Boolean)(Object)srcFile.exists() || !srcFile.isFile()) throw new IllegalArgumentException("file: " + srcFile.getPath() + " not found");
                                MyHelperClass Configuration = new MyHelperClass();
                                final XFile mapStorage = new XFile(new XFile(Configuration.getInstance().getPrivateMapStorage().toString()), mapOriginal.getGuid());
                                mapStorage.mkdir();
                                XFile dstFile = new XFile((MyHelperClass)(Object)mapStorage, mapOriginal.getGuid());
                                XFileOutputStream out = new XFileOutputStream(dstFile);
                                XFileInputStream inImg = new XFileInputStream(srcFile);
                                MyHelperClass IOUtils = new MyHelperClass();
                                IOUtils.copy(inImg, out);
                                out.flush();
                                out.close();
                                inImg.close();
                                mapDao.save(mapOriginal);
                                maps.add(mapOriginal);
                                srcFile.delete();
                                mapsCounter++;
                                MyHelperClass logger = new MyHelperClass();
                                logger.info("map:" + mapOriginal.getGuid());
                            }
                        MyHelperClass logger = new MyHelperClass();
                        } else logger.warn("unsupported file format: " + file.getName());
                        MyHelperClass TransactionManager = new MyHelperClass();
                        TransactionManager.commitTransaction();
                        for (MapTrackPointsScaleRequest track : tracks) {
                            if (track != null) {
                                try {
                                    MyHelperClass PoolFactory = new MyHelperClass();
                                    PoolClientInterface pool = PoolFactory.getInstance().getClientPool();
                                    if (pool == null) throw new IllegalStateException("pool not found");
                                    pool.put(track, new StatesStack(new byte[] { 0x00, 0x11 }), GeneralCompleteStrategy.class);
                                } catch (Throwable t) {
                                    MyHelperClass logger = new MyHelperClass();
                                    logger.error(t);
                                }
                            }
                        }
                    } catch (Throwable e) {
                        MyHelperClass logger = new MyHelperClass();
                        logger.error("Error importing", e);
                        MyHelperClass TransactionManager = new MyHelperClass();
                        TransactionManager.rollbackTransaction();
                    } finally {
                        in.close();
                        file.delete();
                    }
                }
                MyHelperClass logger = new MyHelperClass();
                logger.info("waypoints: " + pointsCounter + "\ntracks: " + tracksCounter + "\nmaps: " + mapsCounter);
            }
        } catch (Throwable e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error importing", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UPLOAD;
	public MyHelperClass COMPLETE;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass list(<anonymous XFilenameFilter> o0){ return null; }
	public MyHelperClass rollbackTransaction(){ return null; }
	public MyHelperClass copy(XFileInputStream o0, XFileOutputStream o1){ return null; }
	public MyHelperClass commitTransaction(){ return null; }
	public MyHelperClass createDAO(Class<User o0){ return null; }
	public MyHelperClass createUserPoint(WayPointRow o0, User o1){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass updateProjection(MapProjection o0, UserMapOriginal o1){ return null; }
	public MyHelperClass createDAO(Class<UserMapOriginal o0){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass list(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass beginTransaction(){ return null; }
	public MyHelperClass getClientPool(){ return null; }
	public MyHelperClass error(Throwable o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass createUserTrack(PLTTrack o0, User o1){ return null; }
	public MyHelperClass getPrivateMapStorage(){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass eq(String o0, MyHelperClass o1){ return null; }}

class GenericDAO {

public MyHelperClass save(UserMapOriginal o0){ return null; }}

class User {

}

class XFilenameFilter {

}

class XFile {

XFile(MyHelperClass o0, String o1){}
	XFile(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass mkdir(){ return null; }}

class XFileInputStream {

XFileInputStream(){}
	XFileInputStream(XFile o0){}
	public MyHelperClass close(){ return null; }}

class UserMapOriginal {

public MyHelperClass getGuid(){ return null; }
	public MyHelperClass setUser(User o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }}

class MapTrackPointsScaleRequest {

MapTrackPointsScaleRequest(UserMapTrack o0){}
	MapTrackPointsScaleRequest(){}}

class WPTPoint {

public MyHelperClass getPoints(){ return null; }}

class WPTPointParser {

WPTPointParser(InputStream o0, String o1){}
	WPTPointParser(){}
	public MyHelperClass parse(){ return null; }}

class WayPointRow {

}

class UserMapPoint {

public MyHelperClass getGuid(){ return null; }}

class PLTTrack {

}

class PLTTrackParser {

PLTTrackParser(InputStream o0, String o1){}
	PLTTrackParser(){}
	public MyHelperClass parse(){ return null; }}

class UserMapTrack {

public MyHelperClass getGuid(){ return null; }}

class MapProjection {

public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getPoints(){ return null; }}

class MAPParser {

MAPParser(InputStream o0, String o1){}
	MAPParser(){}
	public MyHelperClass parse(){ return null; }}

class XFileOutputStream {

XFileOutputStream(){}
	XFileOutputStream(XFile o0){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }}

class PoolClientInterface {

public MyHelperClass put(MapTrackPointsScaleRequest o0, StatesStack o1, Class<GeneralCompleteStrategy o2){ return null; }}

class StatesStack {

StatesStack(byte[] o0){}
	StatesStack(){}}

class GeneralCompleteStrategy {

}
