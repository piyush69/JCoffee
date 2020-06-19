


class c21980807 {
public MyHelperClass ds;
	public MyHelperClass retrieveModelData(HttpURLConnection o0, MyHelperClass o1){ return null; }

    public void checkAndDownload(String statsUrl, RDFStatsUpdatableModelExt stats, Date lastDownload, boolean onlyIfNewer) throws DataSourceMonitorException {
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isInfoEnabled()) log.info("Checking if update required for statistics of " + ds + "...");
        HttpURLConnection urlConnection;
        try {
            URL url = new URL(statsUrl);
            urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass CONNECT_TIMEOUT = new MyHelperClass();
            urlConnection.setConnectTimeout(CONNECT_TIMEOUT);
            MyHelperClass READ_TIMEOUT = new MyHelperClass();
            urlConnection.setReadTimeout(READ_TIMEOUT);
            int statusCode =(int)(Object) urlConnection.getResponseCode();
            if (statusCode / 100 != 2) {
                String msg =(String)(Object) urlConnection.getResponseMessage();
                throw new DataSourceMonitorException(statsUrl + " returned HTTP " + statusCode + (msg != null ? msg : "") + ".");
            }
        } catch (Exception e) {
            throw new DataSourceMonitorException("Failed to connect to " + statsUrl + ".", e);
        }
        long lastModified =(long)(Object) urlConnection.getLastModified();
        MyHelperClass TIMING_GAP = new MyHelperClass();
        boolean newer = lastDownload == null || lastModified == 0 || lastModified - (long)(Object)TIMING_GAP > (long)(Object)lastDownload.getTime();
        if (newer || !onlyIfNewer) {
            MyHelperClass ds = new MyHelperClass();
            Model newStats =(Model)(Object) retrieveModelData(urlConnection, ds);
            MyHelperClass Calendar = new MyHelperClass();
            Date retrievedTimestamp =(Date)(Object) Calendar.getInstance().getTime();
            Date modifiedTimestamp = ((int)(Object)urlConnection.getLastModified() > 0) ? new Date(urlConnection.getLastModified()) : null;
//            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isInfoEnabled()) log.info("Attempt to import up-to-date " + ((modifiedTimestamp != null) ? "(from " + modifiedTimestamp + ") " : "") + "statistics for " + ds + ".");
            try {
                MyHelperClass RDFStatsModelFactory = new MyHelperClass();
                if ((boolean)(Object)stats.updateFrom(RDFStatsModelFactory.create(newStats), onlyIfNewer)) stats.setLastDownload(ds.getSPARQLEndpointURL(), retrievedTimestamp);
            } catch (Exception e) {
//                MyHelperClass ds = new MyHelperClass();
                throw new DataSourceMonitorException("Failed to import statistics and set last download for " + ds + ".", e);
            }
        } else {
//            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isInfoEnabled()) log.info("Statistics for " + ds + " are up-to-date" + ((lastDownload != null) ? " (" + lastDownload + ")" : ""));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSPARQLEndpointURL(){ return null; }
	public MyHelperClass isInfoEnabled(){ return null; }
	public MyHelperClass create(Model o0){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class RDFStatsUpdatableModelExt {

public MyHelperClass setLastDownload(MyHelperClass o0, Date o1){ return null; }
	public MyHelperClass updateFrom(MyHelperClass o0, boolean o1){ return null; }}

class Date {

Date(MyHelperClass o0){}
	Date(){}
	public MyHelperClass getTime(){ return null; }}

class DataSourceMonitorException extends Exception{
	public DataSourceMonitorException(String errorMessage) { super(errorMessage); }
	DataSourceMonitorException(String o0, Exception o1){}
	DataSourceMonitorException(){}
}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getLastModified(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class Model {

}
