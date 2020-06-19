
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6276684 {
public static MyHelperClass LOG;
//public MyHelperClass LOG;

    public static VersionMinorMajor fetchVersion() throws BusinessException {
        MyHelperClass WEB_URL = new MyHelperClass();
        LOG.info("Fetching version from url '" + WEB_URL + "'.");
        URL url = null;
        try {
//            MyHelperClass WEB_URL = new MyHelperClass();
            url = new URL(WEB_URL);
            assert ((boolean)(Object)url.getProtocol().equalsIgnoreCase("HTTP"));
        } catch (UncheckedIOException e) {
//            MyHelperClass WEB_URL = new MyHelperClass();
            LOG.warn("Invalid url '" + WEB_URL + "' specified!",(MalformedURLException)(Object) e);
//            MyHelperClass WEB_URL = new MyHelperClass();
            throw new BusinessException("Tried to fetch most current version from invalid url: " + WEB_URL);
        }
        try {
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("Opening connection to webserver.");
            final URLConnection connection =(URLConnection)(Object) url.openConnection();
            final Scanner scanner = new Scanner(connection.getInputStream());
            MyHelperClass END_OF_INPUT = new MyHelperClass();
            scanner.useDelimiter(END_OF_INPUT);
            final String versionString =(String)(Object) scanner.next();
            try {
                VersionMinorMajor version = new VersionMinorMajor(versionString);
//                MyHelperClass LOG = new MyHelperClass();
                LOG.debug("Successfully fetched version '" + version + "' from web.");
                return version;
            } catch (Exception e) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.error("Stored version string '" + versionString + "' is invalid!", e);
//                MyHelperClass WEB_URL = new MyHelperClass();
                throw new BusinessException("Could not construct VersionMinorMajor by string '" + versionString + "' (url was: " + WEB_URL + ")!");
            }
        } catch (UncheckedIOException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.info("Fetching application version failed!",(IOException)(Object) e);
//            MyHelperClass WEB_URL = new MyHelperClass();
            throw new BusinessException("Could not get contents of url '" + WEB_URL + "'!",(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass warn(String o0, MalformedURLException o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass info(String o0, IOException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class VersionMinorMajor {

VersionMinorMajor(String o0){}
	VersionMinorMajor(){}}

class BusinessException extends Exception{
	public BusinessException(String errorMessage) { super(errorMessage); }
	BusinessException(String o0, IOException o1){}
	BusinessException(){}
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class Scanner {

Scanner(MyHelperClass o0){}
	Scanner(){}
	public MyHelperClass next(){ return null; }
	public MyHelperClass useDelimiter(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
