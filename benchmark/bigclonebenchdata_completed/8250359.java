


class c8250359 {
public static MyHelperClass logger;
	public static MyHelperClass geoNamesServer;
//public MyHelperClass geoNamesServer;
//	public MyHelperClass logger;

    private static synchronized InputStream tryFailoverServer(String url, String currentlyActiveServer, int status, IOException e) throws MalformedURLException, IOException {
        MyHelperClass Level = new MyHelperClass();
        logger.log(Level.WARNING, "problems connecting to geonames server " + currentlyActiveServer, e);
        MyHelperClass geoNamesServerFailover = new MyHelperClass();
        if (geoNamesServerFailover == null || currentlyActiveServer.equals(geoNamesServerFailover)) {
//            MyHelperClass geoNamesServerFailover = new MyHelperClass();
            if (currentlyActiveServer.equals(geoNamesServerFailover)) {
                int timeOfLastFailureMainServer;// = new int();
                timeOfLastFailureMainServer = 0;
            }
            throw e;
        }
        long timeOfLastFailureMainServer;// = new long();
        timeOfLastFailureMainServer = System.currentTimeMillis();
//        MyHelperClass geoNamesServerFailover = new MyHelperClass();
        logger.info("trying to connect to failover server " + geoNamesServerFailover);
//        MyHelperClass geoNamesServerFailover = new MyHelperClass();
        URLConnection conn =(URLConnection)(Object) (new URL(geoNamesServerFailover + url).openConnection());
        MyHelperClass USER_AGENT = new MyHelperClass();
        String userAgent = USER_AGENT + " failover from " + geoNamesServer;
        if (status != 0) {
            userAgent += " " + status;
        }
        conn.setRequestProperty("User-Agent", userAgent);
        InputStream in =(InputStream)(Object) conn.getInputStream();
        return in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
