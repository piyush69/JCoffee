import java.io.*;
import java.lang.*;
import java.util.*;



class c8080017 {
public static MyHelperClass logger;
	public static MyHelperClass getInstanceMetadata(String o0){ return null; }
//public MyHelperClass logger;
//	public MyHelperClass getInstanceMetadata(String o0){ return null; }

    public static Map<String, String> getInstanceMetadata() {
        HashMap<String, String> result = new HashMap<String, String>();
        int retries = 0;
        while (true) {
            try {
                URL url = new URL("http://169.254.169.254/latest/meta-data/");
                BufferedReader rdr = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String line = rdr.readLine();
                while (line != null) {
                    try {
                        String val =(String)(Object) getInstanceMetadata(line);
                        result.put(line, val);
                    } catch (UncheckedIOException ex) {
                        logger.error("Problem fetching piece of instance metadata!",(IOException)(Object) ex);
                    }
                    line = rdr.readLine();
                }
                return result;
            } catch (IOException ex) {
                if (retries == 5) {
                    logger.debug("Problem getting instance data, retries exhausted...");
                    return result;
                } else {
                    logger.debug("Problem getting instance data, retrying...");
                    try {
                        Thread.sleep((int) Math.pow(2.0, retries) * 1000);
                    } catch (InterruptedException e) {
                    }
                    retries++;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}
