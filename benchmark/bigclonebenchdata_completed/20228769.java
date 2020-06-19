import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20228769 {
public MyHelperClass ConnectionPool;
	public MyHelperClass log;
	public MyHelperClass Settings;
	public MyHelperClass readDataSet(InputStream o0){ return null; }

    public Vector getData(DataDescription descr, Station station, DateInterval dateInterval, int sampling) throws Throwable, ApiException {
        Connection con = null;
        Statement stmt = null;
        String table = (descr != null) ? descr.getTable() : null;
        Vector dsList = new Vector();
        try {
            MyHelperClass Settings = new MyHelperClass();
            String wsflag =(String)(Object) Settings.get(table + ".useWebService");
            if ("yes".equals(wsflag) || "true".equals(wsflag)) {
//                MyHelperClass Settings = new MyHelperClass();
                String serviceUrl =(String)(Object) Settings.get(table + ".dataServiceUrl");
//                MyHelperClass Settings = new MyHelperClass();
                String serviceUser =(String)(Object) Settings.get(table + ".dataServiceUser");
//                MyHelperClass Settings = new MyHelperClass();
                String servicePassword =(String)(Object) Settings.get(table + ".dataServicePassword");
                Call call = (Call)(Call)(Object) (new Service()).createCall();
                call.setTargetEndpointAddress(serviceUrl);
                call.setOperationName("getData");
                if (serviceUser != null) {
                    call.setUsername(serviceUser);
                    if (servicePassword != null) {
                        call.setPassword(servicePassword);
                    }
                }
                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isDebugEnabled()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("Service " + serviceUrl + " authentication user=" + serviceUser + " passwd=" + servicePassword + " call method getData" + " for table " + table + " station " + ((station != null) ? station.getStn() : "") + " element " + ((descr != null && descr.getElement() != null) ? descr.getElement() : "") + " dateFrom " + dateInterval.getDateFrom().getDayId() + " dateTo " + dateInterval.getDateTo().getDayId() + " sampling " + sampling);
                }
                String dssUrl = (String)(String)(Object) call.invoke(new Object[] { table, ((station != null) ? station.getStn() : ""), ((descr != null && descr.getElement() != null) ? descr.getElement() : ""), "" + dateInterval.getDateFrom().getDayId(), "" + dateInterval.getDateTo().getDayId(), "", "" + sampling });
//                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isDebugEnabled()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("Service return url '" + dssUrl + "'");
                }
                if (dssUrl != null && !"".equals(dssUrl)) {
                    URL dataurl = new URL(dssUrl);
                    DataSequenceSet dsstmp =(DataSequenceSet)(Object) readDataSet(dataurl.openStream());
                    if (dsstmp != null &&(int)(Object) dsstmp.size() > 0) {
                        dsList.addAll((Collection)(Object)dsstmp);
                        if ((boolean)(Object)log.isDebugEnabled()) {
                            log.debug("Data set list size is " + dsstmp.size());
                        }
                    } else {
                        if ((boolean)(Object)log.isDebugEnabled()) {
                            log.debug("Data set list is empty");
                        }
                    }
                }
            } else {
                con =(Connection)(Object) ConnectionPool.getConnection(table);
                stmt =(Statement)(Object) con.createStatement();
                String className =(String)(Object) Settings.get(table + ".classGetter");
                if (className == null) {
                    throw new ApiException("Undefined classGetter field for table '" + table + "'");
                }
                dsList =(Vector)(Object) ((DBAccess) Class.forName(className).newInstance()).getDataSequence(stmt, descr, station, dateInterval, sampling);
            }
            return dsList;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ApiException("Data are not available: " + e.toString());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
            }
            ConnectionPool.releaseConnection(con);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(String o0){ return null; }
	public MyHelperClass getDayId(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass releaseConnection(Connection o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class DataDescription {

public MyHelperClass getTable(){ return null; }
	public MyHelperClass getElement(){ return null; }}

class Station {

public MyHelperClass getStn(){ return null; }}

class DateInterval {

public MyHelperClass getDateTo(){ return null; }
	public MyHelperClass getDateFrom(){ return null; }}

class ApiException extends Exception{
	public ApiException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }}

class Call {

public MyHelperClass setPassword(String o0){ return null; }
	public MyHelperClass setUsername(String o0){ return null; }
	public MyHelperClass setOperationName(String o0){ return null; }
	public MyHelperClass invoke(Object[] o0){ return null; }
	public MyHelperClass setTargetEndpointAddress(String o0){ return null; }}

class Service {

public MyHelperClass createCall(){ return null; }}

class DataSequenceSet {

public MyHelperClass size(){ return null; }}

class DBAccess {

public MyHelperClass getDataSequence(Statement o0, DataDescription o1, Station o2, DateInterval o3, int o4){ return null; }}
