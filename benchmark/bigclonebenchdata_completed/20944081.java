
import java.io.UncheckedIOException;


class c20944081 {
public MyHelperClass log;

    Hashtable loadDriverDB() {
        Hashtable d = new Hashtable();
        InputStream instream = null;
        try {
            String dbURL = System.getProperty("org.osgi.service.basicdriverlocator.dburl");
            if (dbURL != null && !dbURL.equals("")) {
                if (dbURL.indexOf(":") == -1) {
                    MyHelperClass jarbase = new MyHelperClass();
                    dbURL = jarbase + dbURL;
                }
                URL url = new URL(dbURL);
                MyHelperClass log = new MyHelperClass();
                log.info("read external props file: " + dbURL);
                instream =(InputStream)(Object) url.openStream();
            } else {
                MyHelperClass dbResourceName = new MyHelperClass();
                log.info("read internal props file: " + dbResourceName);
//                MyHelperClass dbResourceName = new MyHelperClass();
                instream =(InputStream)(Object) getClass().getResourceAsStream((String)(Object)dbResourceName);
            }
            Properties db = new Properties();
            db.load(instream);
            int nCount = Integer.parseInt((String)(String)(Object) db.get("count"));
            for (int i = 0; i < nCount; i++) {
                try {
                    DriverInfo di = new DriverInfo(db, i);
                    d.put(di.id, di);
                } catch (Exception e) {
                    MyHelperClass log = new MyHelperClass();
                    log.error("Failed to initialize driver entry " + i, e);
                }
            }
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Can't load driverDB: ", e);
            e.printStackTrace();
        } finally {
            try {
                if (instream != null) instream.close();
            } catch (UncheckedIOException e2) {
            }
        }
        return d;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class Hashtable {

public MyHelperClass put(MyHelperClass o0, DriverInfo o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class DriverInfo {
public MyHelperClass id;
DriverInfo(Properties o0, int o1){}
	DriverInfo(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
