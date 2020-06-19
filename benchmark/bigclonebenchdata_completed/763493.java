import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c763493 {

//    @Override
    public DataTable generateDataTable(Query query, HttpServletRequest request) throws DataSourceException {
        MyHelperClass URL_PARAM_NAME = new MyHelperClass();
        String url =(String)(Object) request.getParameter(URL_PARAM_NAME);
        MyHelperClass StringUtils = new MyHelperClass();
        if ((boolean)(Object)StringUtils.isEmpty(url)) {
            MyHelperClass log = new MyHelperClass();
            log.error("url parameter not provided.");
            MyHelperClass ReasonType = new MyHelperClass();
            throw new DataSourceException(ReasonType.INVALID_REQUEST, "url parameter not provided");
        }
        Reader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
        } catch (MalformedURLException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("url is malformed: " + url);
            MyHelperClass ReasonType = new MyHelperClass();
            throw new DataSourceException(ReasonType.INVALID_REQUEST, "url is malformed: " + url);
        } catch (IOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Couldn't read from url: " + url, e);
            MyHelperClass ReasonType = new MyHelperClass();
            throw new DataSourceException(ReasonType.INVALID_REQUEST, "Couldn't read from url: " + url);
        }
        DataTable dataTable = null;
        MyHelperClass DataSourceHelper = new MyHelperClass();
        ULocale requestLocale =(ULocale)(Object) DataSourceHelper.getLocaleFromRequest(request);
        try {
            MyHelperClass CsvDataSourceHelper = new MyHelperClass();
            dataTable =(DataTable)(Object) CsvDataSourceHelper.read(reader, null, true, requestLocale);
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Couldn't read from url: " + url,(IOException)(Object) e);
            MyHelperClass ReasonType = new MyHelperClass();
            throw new DataSourceException(ReasonType.INVALID_REQUEST, "Couldn't read from url: " + url);
        }
        return dataTable;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INVALID_REQUEST;
public MyHelperClass getLocaleFromRequest(HttpServletRequest o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass read(Reader o0, Object o1, boolean o2, ULocale o3){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }}

class Query {

}

class HttpServletRequest {

public MyHelperClass getParameter(MyHelperClass o0){ return null; }}

class DataTable {

}

class DataSourceException extends Exception{
	public DataSourceException(String errorMessage) { super(errorMessage); }
	DataSourceException(){}
	DataSourceException(MyHelperClass o0, String o1){}
}

class ULocale {

}
