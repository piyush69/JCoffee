
import java.io.UncheckedIOException;


class c9793280 {
public MyHelperClass init(MyHelperClass o0, IDbDialect o1, boolean o2, String o3, Map o4){ return null; }
public MyHelperClass LogLevel;
	public MyHelperClass IoUtils;
	public MyHelperClass log;
	public MyHelperClass fileName;

    public void SqlScript(URL url, IDbDialect platform, boolean failOnError, String delimiter, Map replacementTokens) {
        try {
            fileName = url.getFile();
            fileName = fileName.substring((int)(Object)fileName.lastIndexOf("/") + 1);
            log.log(LogLevel.INFO, "Loading sql from script %s", fileName);
            init(IoUtils.readLines(new InputStreamReader(url.openStream(), "UTF-8")), platform, failOnError, delimiter, replacementTokens);
        } catch (UncheckedIOException ex) {
            log.error((IOException)(Object)ex);
            throw new RuntimeException(ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
public MyHelperClass readLines(InputStreamReader o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }}

class URL {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class IDbDialect {

}

class Map {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
