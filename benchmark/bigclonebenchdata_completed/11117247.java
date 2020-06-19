
import java.io.UncheckedIOException;


class c11117247 {
public MyHelperClass Assert;
	public MyHelperClass getInputParams(){ return null; }
	public MyHelperClass getBaseServletURL(){ return null; }

    HttpURLConnection getHttpURLConnection(String bizDocToExecute, boolean doom, boolean cmt) {
        StringBuffer servletURL = new StringBuffer();
        servletURL.append(getBaseServletURL());
        servletURL.append("?_BIZVIEW=").append(bizDocToExecute);
        if (doom) {
            servletURL.append("&_DOOM=TRUE");
        }
        if (cmt) {
            servletURL.append("&_CMT=TRUE");
        }
        Map inputParms =(Map)(Object) getInputParams();
        if (inputParms != null) {
            Set entrySet =(Set)(Object) inputParms.entrySet();
            for (Entry entry :(Entry[])(Object) (Object[])(Object)entrySet) {
                String name =(String)(Object) entry.getKey();
                String value = entry.getValue().toString();
                servletURL.append("&").append(name).append("=").append(value);
            }
        }
        HttpURLConnection connection = null;
        try {
            URL url = new URL(servletURL.toString());
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        } catch (UncheckedIOException e) {
            Assert.fail("Failed to connect to the test servlet: " + e);
        }
        return connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fail(String o0){ return null; }}

class HttpURLConnection {

}

class Map {

public MyHelperClass entrySet(){ return null; }}

class Set {

}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
