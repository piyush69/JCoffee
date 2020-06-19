import java.io.*;
import java.lang.*;
import java.util.*;



class c11711888 {
public MyHelperClass readConfiguration(InputStream o0){ return null; }

    public synchronized void readConfiguration() throws IOException, SecurityException {
        String path;
        InputStream inputStream;
        path = System.getProperty("java.util.logging.config.file");
        if ((path == null) || (path.length() == 0)) {
            String url = (System.getProperty("gnu.classpath.home.url") + "/logging.properties");
            inputStream =(InputStream)(Object) (new URL(url).openStream());
        } else inputStream = new java.io.FileInputStream(path);
        try {
            readConfiguration(inputStream);
        } finally {
            inputStream.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}
