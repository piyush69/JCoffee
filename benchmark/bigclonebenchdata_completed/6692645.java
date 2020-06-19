import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6692645 {
public MyHelperClass tableId;
	public MyHelperClass EntityUtils;
	public MyHelperClass Level;
	public MyHelperClass xstream;
	public MyHelperClass logger;
	public MyHelperClass ip;

    public LOCKSSDaemonStatusTableTO getDataFromDaemonStatusTableByHttps() throws Throwable, HttpResponseException {
        LOCKSSDaemonStatusTableXmlStreamParser ldstxp = null;
        LOCKSSDaemonStatusTableTO ldstTO = null;
        HttpEntity entity = null;
        HttpGet httpget = null;
        MyHelperClass XStream = new MyHelperClass();
        xstream.setMode(XStream.NO_REFERENCES);
        MyHelperClass xstream = new MyHelperClass();
        xstream.alias("HttpClientDAO",(HttpClientDAO)(Object) HttpClientDAO.class);
        try {
            MyHelperClass dataUrl = new MyHelperClass();
            httpget = new HttpGet(dataUrl);
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.INFO, "executing request {0}", httpget.getURI());
            MyHelperClass httpClient = new MyHelperClass();
            HttpResponse resp =(HttpResponse)(Object) httpClient.execute(httpget);
            int statusCode =(int)(Object) resp.getStatusLine().getStatusCode();
            MyHelperClass HttpStatus = new MyHelperClass();
            if (statusCode != (int)(Object)HttpStatus.SC_OK) {
//                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.WARNING, "response to the request is not OK: skip this IP: status code={0}", statusCode);
                httpget.abort();
                ldstTO = new LOCKSSDaemonStatusTableTO();
                ldstTO.setBoxHttpStatusOK(false);
                return ldstTO;
            }
            entity =(HttpEntity)(Object) resp.getEntity();
            InputStream is =(InputStream)(Object) entity.getContent();
            ldstxp = new LOCKSSDaemonStatusTableXmlStreamParser();
            ldstxp.read(new BufferedInputStream(is));
            ldstTO =(LOCKSSDaemonStatusTableTO)(Object) ldstxp.getLOCKSSDaemonStatusTableTO();
            ldstTO.setIpAddress(this.ip);
            logger.log(Level.INFO, "After parsing [{0}] table", this.tableId);
            logger.log(Level.FINEST, "After parsing {0}: contents of ldstTO:\n{1}", new Object[] { this.tableId, ldstTO });
            if ((boolean)(Object)ldstTO.hasIncompleteRows) {
                logger.log(Level.WARNING, "!!!!!!!!! incomplete rows are found for {0}", tableId);
                if (ldstTO.getTableData() != null &&(int)(Object) ldstTO.getTableData().size() > 0) {
                    logger.log(Level.FINE, "incomplete rows: table(map) data dump =[\n{0}\n]", xstream.toXML(ldstTO.getTableData()));
                }
            } else {
                logger.log(Level.INFO, "All rows are complete for {0}", tableId);
            }
        } catch (ArithmeticException ce) {
            logger.log(Level.WARNING, "ConnectTimeoutException occurred",(ConnectTimeoutException)(Object) ce);
            ldstTO = new LOCKSSDaemonStatusTableTO();
            ldstTO.setBoxHttpStatusOK(false);
            if (httpget != null) {
                httpget.abort();
            }
            return ldstTO;
        } catch (ArrayIndexOutOfBoundsException se) {
            logger.log(Level.WARNING, "SocketTimeoutException occurred",(ConnectTimeoutException)(Object) se);
            ldstTO = new LOCKSSDaemonStatusTableTO();
            ldstTO.setBoxHttpStatusOK(false);
            if (httpget != null) {
                httpget.abort();
            }
            return ldstTO;
        } catch (ArrayStoreException pe) {
            logger.log(Level.SEVERE, "The protocol was not http; https is suspected",(ConnectTimeoutException)(Object) pe);
            ldstTO = new LOCKSSDaemonStatusTableTO();
            ldstTO.setBoxHttpStatusOK(false);
            ldstTO.setHttpProtocol(false);
            if (httpget != null) {
                httpget.abort();
            }
            return ldstTO;
        } catch (ClassCastException ex) {
            logger.log(Level.SEVERE, "IO exception occurs",(ConnectTimeoutException)(Object) ex);
            ldstTO = new LOCKSSDaemonStatusTableTO();
            ldstTO.setBoxHttpStatusOK(false);
            if (httpget != null) {
                httpget.abort();
            }
            return ldstTO;
        } finally {
            if (entity != null) {
                try {
                    EntityUtils.consume(entity);
                } catch (IllegalArgumentException ex) {
                    logger.log(Level.SEVERE, "io exception when entity was to be" + "consumed",(ConnectTimeoutException)(Object) ex);
                }
            }
        }
        return ldstTO;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
	public MyHelperClass SEVERE;
	public MyHelperClass FINE;
	public MyHelperClass INFO;
	public MyHelperClass FINEST;
	public MyHelperClass SC_OK;
	public MyHelperClass NO_REFERENCES;
public MyHelperClass log(MyHelperClass o0, String o1, ConnectTimeoutException o2){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass alias(String o0, HttpClientDAO o1){ return null; }
	public MyHelperClass consume(HttpEntity o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Object[] o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, int o2){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass toXML(MyHelperClass o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, SocketTimeoutException o2){ return null; }
	public MyHelperClass setMode(MyHelperClass o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, ClientProtocolException o2){ return null; }}

class LOCKSSDaemonStatusTableTO {
public MyHelperClass hasIncompleteRows;
public MyHelperClass setBoxHttpStatusOK(boolean o0){ return null; }
	public MyHelperClass setHttpProtocol(boolean o0){ return null; }
	public MyHelperClass getTableData(){ return null; }
	public MyHelperClass setIpAddress(MyHelperClass o0){ return null; }}

class HttpResponseException extends Exception{
	public HttpResponseException(String errorMessage) { super(errorMessage); }
}

class LOCKSSDaemonStatusTableXmlStreamParser {

public MyHelperClass getLOCKSSDaemonStatusTableTO(){ return null; }
	public MyHelperClass read(BufferedInputStream o0){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(){}
	public MyHelperClass getURI(){ return null; }
	public MyHelperClass abort(){ return null; }}

class HttpClientDAO {

}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class ConnectTimeoutException extends Exception{
	public ConnectTimeoutException(String errorMessage) { super(errorMessage); }
}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}
