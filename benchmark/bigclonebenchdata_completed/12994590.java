import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12994590 {
public MyHelperClass PoolFactory;
	public MyHelperClass MapState;

//    @HttpAction(name = "map.saveOrUpdate", method = { HttpAction.Method.post }, responseType = "text/plain")
//    @HttpAuthentication(method = { HttpAuthentication.Method.WSSE })
    public String saveOrUpdate(FileItem file, User user, MapOriginal map) throws Throwable, HttpRpcException {
        File tmpFile;
        MyHelperClass DAOFactory = new MyHelperClass();
        GenericDAO mapDao = DAOFactory.createDAO(MapOriginal.class);
        try {
            assert (file != null);
            String jobid = null;
            if (file.getContentType().startsWith("image/")) {
                tmpFile = File.createTempFile("gmap", "img");
                OutputStream out = new FileOutputStream(tmpFile);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(file.getInputStream(), out);
                out.flush();
                out.close();
                map.setState(MapState.UPLOAD);
                map.setUser(user);
                map.setMapPath(tmpFile.getPath());
                map.setThumbnailUrl("/map/inproc.gif");
                map.setMimeType(file.getContentType());
                mapDao.saveOrUpdate(map);
                MyHelperClass TaskState = new MyHelperClass();
                jobid = PoolFactory.getClientPool().put(map, TaskState.STATE_MO_FINISH, MapOverrideStrategy.class);
            }
            return jobid;
        } catch (IOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e);
            MyHelperClass ERROR_INTERNAL = new MyHelperClass();
            throw(Throwable)(Object) ERROR_INTERNAL;
        } catch (DAOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e);
            MyHelperClass ERROR_INTERNAL = new MyHelperClass();
            throw(Throwable)(Object) ERROR_INTERNAL;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UPLOAD;
	public MyHelperClass STATE_MO_FINISH;
public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass getClientPool(){ return null; }
	public MyHelperClass createDAO(Class<MapOriginal o0){ return null; }
	public MyHelperClass error(DAOException o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass error(IOException o0){ return null; }}

class FileItem {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class User {

}

class MapOriginal {

public MyHelperClass setMimeType(MyHelperClass o0){ return null; }
	public MyHelperClass setThumbnailUrl(String o0){ return null; }
	public MyHelperClass setUser(User o0){ return null; }
	public MyHelperClass setMapPath(String o0){ return null; }}

class HttpRpcException extends Exception{
	public HttpRpcException(String errorMessage) { super(errorMessage); }
}

class HttpAction {

}

class HttpAuthentication {

}

class GenericDAO {

public MyHelperClass saveOrUpdate(MapOriginal o0){ return null; }}

class DAOException extends Exception{
	public DAOException(String errorMessage) { super(errorMessage); }
}

class MapOverrideStrategy {

}
