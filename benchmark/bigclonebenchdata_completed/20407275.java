import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20407275 {
public MyHelperClass configFilename;
public MyHelperClass logger;
	public MyHelperClass properties;
	public MyHelperClass lastModifiedByUs;
	public MyHelperClass Level;

//    @NotNull
    private Properties loadProperties()  throws Throwable {
        MyHelperClass homeLocator = new MyHelperClass();
        File file = new File((String)(Object)homeLocator.getHomeDir(),(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) configFilename);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException("IOException while creating \"" + file.getAbsolutePath() + "\".", e);
            }
        }
        if (!file.canRead() || !file.canWrite()) {
            throw new RuntimeException("Cannot read and write from file: " + file.getAbsolutePath());
        }
        MyHelperClass lastModifiedByUs = new MyHelperClass();
        if ((long)(Object)lastModifiedByUs < file.lastModified()) {
            MyHelperClass Level = new MyHelperClass();
            if ((boolean)(Object)logger.isLoggable(Level.FINE)) {
                MyHelperClass logger = new MyHelperClass();
                logger.fine("File \"" + file + "\" is newer on disk. Read it ...");
            }
            Properties properties = new Properties();
            try {
                FileInputStream in = new FileInputStream(file);
                try {
                    properties.loadFromXML(in);
                } catch (InvalidPropertiesFormatException e) {
                    FileOutputStream out = new FileOutputStream(file);
                    try {
                        MyHelperClass comment = new MyHelperClass();
                        properties.storeToXML(out,(String)(Object) comment);
                    } finally {
                        out.close();
                    }
                } finally {
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException("IOException while reading from \"" + file.getAbsolutePath() + "\".", e);
            }
            this.lastModifiedByUs =(MyHelperClass)(Object) file.lastModified();
            this.properties =(MyHelperClass)(Object) properties;
            if ((boolean)(Object)logger.isLoggable(Level.FINE)) {
                logger.fine("... read done.");
            }
        }
        assert this.properties != null;
        return(Properties)(Object) this.properties;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINE;
public MyHelperClass getHomeDir(){ return null; }
	public MyHelperClass isLoggable(MyHelperClass o0){ return null; }
	public MyHelperClass fine(String o0){ return null; }}

class NotNull {

}
