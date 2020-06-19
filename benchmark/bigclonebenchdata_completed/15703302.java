import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15703302 {
public MyHelperClass INPROC;
	public MyHelperClass COMBINE;
	public MyHelperClass State;
	public MyHelperClass SubState;

//    @HttpAction(name = "map.calibrate", method = { HttpAction.Method.post }, responseType = "text/plain", parameters = { @HttpParameter(name = "user"), @HttpParameter(name = "guid"), @HttpParameter(name = "uploadFile"), @HttpParameter(name = "mapUrl"), @HttpParameter(name = "mapSource"), @HttpParameter(name = "south"), @HttpParameter(name = "west"), @HttpParameter(name = "north"), @HttpParameter(name = "east") })
//    @HttpAuthentication(method = { HttpAuthentication.Method.WSSE })
    public String calibrate(User user, String guid, Collection<FileItem> uploadFile, String mapUrl, String mapSource, String south, String west, String north, String east) throws Throwable, HttpRpcException {
        MyHelperClass DAOFactory = new MyHelperClass();
        GenericDAO dao = DAOFactory.createDAO(UserMapOriginal.class);
        try {
            MyHelperClass TransactionManager = new MyHelperClass();
            TransactionManager.beginTransaction();
        } catch (Throwable e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e);
            return "FAIL";
        }
        try {
            MyHelperClass Expression = new MyHelperClass();
            final UserMapOriginal mapOriginal = dao.findUniqueByCriteria(Expression.eq("guid", guid));
            MyHelperClass ErrorConstant = new MyHelperClass();
            if (mapOriginal == null) throw new HttpRpcException(ErrorConstant.ERROR_NOT_FOUND, "map");
            if (INPROC.equals(mapOriginal.getSubstate())) throw new HttpRpcException(ErrorConstant.ERROR_ILLEGAL_OBJECT_STATE, "map");
            if (COMBINE.equals(mapOriginal.getState())) throw new HttpRpcException(ErrorConstant.ERROR_ILLEGAL_OBJECT_STATE, "map");
//            MyHelperClass ErrorConstant = new MyHelperClass();
            if (!"download".equals(mapSource) && !"upload".equals(mapSource) && !"current".equals(mapSource)) throw new HttpRpcException(ErrorConstant.ERROR_INVALID_OBJECT, "mapSource");
            try {
                mapOriginal.setSWLat(Double.parseDouble(south));
            } catch (Throwable t) {
//                MyHelperClass ErrorConstant = new MyHelperClass();
                throw new HttpRpcException(ErrorConstant.ERROR_INVALID_OBJECT, "south");
            }
            try {
                mapOriginal.setSWLon(Double.parseDouble(west));
            } catch (Throwable t) {
//                MyHelperClass ErrorConstant = new MyHelperClass();
                throw new HttpRpcException(ErrorConstant.ERROR_INVALID_OBJECT, "west");
            }
            try {
                mapOriginal.setNELat(Double.parseDouble(north));
            } catch (Throwable t) {
//                MyHelperClass ErrorConstant = new MyHelperClass();
                throw new HttpRpcException(ErrorConstant.ERROR_INVALID_OBJECT, "north");
            }
            try {
                mapOriginal.setNELon(Double.parseDouble(east));
            } catch (Throwable t) {
//                MyHelperClass ErrorConstant = new MyHelperClass();
                throw new HttpRpcException(ErrorConstant.ERROR_INVALID_OBJECT, "east");
            }
            mapOriginal.setState(State.CALIBRATE);
            mapOriginal.setSubstate(SubState.INPROC);
            MyHelperClass Configuration = new MyHelperClass();
            final XFile mapStorage = new XFile(new XFile(Configuration.getInstance().getPrivateMapStorage().toString()), mapOriginal.getGuid());
            mapStorage.mkdir();
            if ("download".equals(mapSource)) {
                final XFile tmpFile;
                final URI uri = new URI(mapUrl);
                MyHelperClass StringUtils = new MyHelperClass();
                String query = ((boolean)(Object)StringUtils.isEmpty(uri.getQuery())) ? "?BBOX=" : "&BBOX=";
                query += west + "," + south + "," + east + "," + north;
                URLConnection con = (new URL(mapUrl + query)).openConnection();
//                MyHelperClass ErrorConstant = new MyHelperClass();
                if (con == null || con.getContentLength() == 0) throw new HttpRpcException(ErrorConstant.ERROR_INVALID_RESOURCE, "mapUrl");
//                MyHelperClass ErrorConstant = new MyHelperClass();
                if (!con.getContentType().startsWith("image/")) throw new HttpRpcException(ErrorConstant.ERROR_INVALID_OBJECT_TYPE, "mapUrl");
                tmpFile = new XFile(mapStorage, mapOriginal.getGuid());
                XFileOutputStream out = new XFileOutputStream(tmpFile);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(con.getInputStream(), out);
                out.flush();
                out.close();
            } else if ("upload".equals(mapSource)) {
                final XFile tmpFile;
                final FileItem file = uploadFile.iterator().next();
//                MyHelperClass ErrorConstant = new MyHelperClass();
                if (file == null ||(int)(Object) file.getSize() == 0) throw new HttpRpcException(ErrorConstant.ERROR_INVALID_RESOURCE, "uploadFile");
//                MyHelperClass ErrorConstant = new MyHelperClass();
                if (!file.getContentType().startsWith("image/")) throw new HttpRpcException(ErrorConstant.ERROR_INVALID_OBJECT_TYPE, "uploadFile");
                tmpFile = new XFile(mapStorage, mapOriginal.getGuid());
                XFileOutputStream out = new XFileOutputStream(tmpFile);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy((InputStream)(Object)file.getInputStream(), out);
                out.flush();
                out.close();
            } else if ("current".equals(mapSource)) {
            }
            dao.update(mapOriginal);
            MyHelperClass TransactionManager = new MyHelperClass();
            TransactionManager.commitTransaction();
            try {
                MyHelperClass PoolFactory = new MyHelperClass();
                PoolClientInterface pool = PoolFactory.getInstance().getClientPool();
//                MyHelperClass ErrorConstant = new MyHelperClass();
                if (pool == null) throw(Throwable)(Object) ErrorConstant.EXCEPTION_INTERNAL;
                pool.put(mapOriginal, new StatesStack(new byte[] { 0x00, 0x18 }), GeneralCompleteStrategy.class);
            } catch (Throwable t) {
                MyHelperClass logger = new MyHelperClass();
                logger.error(t);
            }
            return "SUCCESS";
        } catch (HttpRpcException e) {
            MyHelperClass TransactionManager = new MyHelperClass();
            TransactionManager.rollbackTransaction();
            MyHelperClass logger = new MyHelperClass();
            logger.error(e);
            return "FAIL";
        } catch (Throwable e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e);
            MyHelperClass TransactionManager = new MyHelperClass();
            TransactionManager.rollbackTransaction();
            return "FAIL";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INPROC;
	public MyHelperClass ERROR_NOT_FOUND;
	public MyHelperClass CALIBRATE;
	public MyHelperClass ERROR_ILLEGAL_OBJECT_STATE;
	public MyHelperClass EXCEPTION_INTERNAL;
	public MyHelperClass ERROR_INVALID_RESOURCE;
	public MyHelperClass ERROR_INVALID_OBJECT_TYPE;
	public MyHelperClass ERROR_INVALID_OBJECT;
public MyHelperClass rollbackTransaction(){ return null; }
	public MyHelperClass commitTransaction(){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass createDAO(Class<UserMapOriginal o0){ return null; }
	public MyHelperClass copy(InputStream o0, XFileOutputStream o1){ return null; }
	public MyHelperClass beginTransaction(){ return null; }
	public MyHelperClass getClientPool(){ return null; }
	public MyHelperClass error(HttpRpcException o0){ return null; }
	public MyHelperClass error(Throwable o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getPrivateMapStorage(){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass eq(String o0, String o1){ return null; }}

class User {

}

class FileItem {

public MyHelperClass getSize(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class HttpRpcException extends Exception{
	public HttpRpcException(String errorMessage) { super(errorMessage); }
	HttpRpcException(MyHelperClass o0, String o1){}
	HttpRpcException(){}
}

class HttpAction {

}

class HttpAuthentication {

}

class GenericDAO {

public MyHelperClass update(UserMapOriginal o0){ return null; }
	public MyHelperClass findUniqueByCriteria(MyHelperClass o0){ return null; }}

class UserMapOriginal {

public MyHelperClass getSubstate(){ return null; }
	public MyHelperClass setSWLat(double o0){ return null; }
	public MyHelperClass getGuid(){ return null; }
	public MyHelperClass setNELon(double o0){ return null; }
	public MyHelperClass getState(){ return null; }
	public MyHelperClass setNELat(double o0){ return null; }
	public MyHelperClass setSWLon(double o0){ return null; }}

class XFile {

XFile(XFile o0, MyHelperClass o1){}
	XFile(){}
	public MyHelperClass mkdir(){ return null; }}

class XFileOutputStream {

XFileOutputStream(){}
	XFileOutputStream(XFile o0){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }}

class PoolClientInterface {

public MyHelperClass put(UserMapOriginal o0, StatesStack o1, Class<GeneralCompleteStrategy o2){ return null; }}

class StatesStack {

StatesStack(byte[] o0){}
	StatesStack(){}}

class GeneralCompleteStrategy {

}
