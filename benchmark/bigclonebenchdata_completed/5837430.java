
import java.io.UncheckedIOException;


class c5837430 {
public MyHelperClass load(MyHelperClass o0, String o1){ return null; }

    public Configuration load(URL url) throws ConfigurationException {
        MyHelperClass LOG = new MyHelperClass();
        LOG.info("Configuring from url : " + url.toString());
        try {
            return(Configuration)(Object) load(url.openStream(), url.toString());
        } catch (UncheckedIOException ioe) {
            throw new ConfigurationException("Could not configure from URL : " + url,(IOException)(Object) ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Configuration {

}

class ConfigurationException extends Exception{
	public ConfigurationException(String errorMessage) { super(errorMessage); }
	ConfigurationException(String o0, IOException o1){}
	ConfigurationException(){}
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
