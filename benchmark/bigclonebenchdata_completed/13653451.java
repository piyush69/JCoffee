import java.io.*;
import java.lang.*;
import java.util.*;



class c13653451 {
public MyHelperClass VIEW_INIT_CONFIG;
	public MyHelperClass log;
	public MyHelperClass config;

    public void ViewInitListener() throws IOException {
        URL url =(URL)(Object) this.getClass().getResource((String)(Object)VIEW_INIT_CONFIG);
        log.debug("Loading configuration from: " + url);
        config =(MyHelperClass)(Object) new Properties();
        InputStream in =(InputStream)(Object) url.openStream();
        config.load(in);
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
