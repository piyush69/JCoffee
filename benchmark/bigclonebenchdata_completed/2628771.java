
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2628771 {

    private void initialize(Resource location) {
        MyHelperClass _log = new MyHelperClass();
        if ((boolean)(Object)_log.isDebugEnabled()) _log.debug("loading messages from location: " + location);
        String descriptorName =(String)(Object) location.getName();
        int dotx = descriptorName.lastIndexOf('.');
        String baseName = descriptorName.substring(0, dotx);
        String suffix = descriptorName.substring(dotx + 1);
        MyHelperClass _locale = new MyHelperClass();
        LocalizedNameGenerator g = new LocalizedNameGenerator(baseName, _locale, "." + suffix);
        List urls =(List)(Object) new ArrayList();
        while ((boolean)(Object)g.more()) {
            String name =(String)(Object) g.next();
            Resource l =(Resource)(Object) location.getRelativeResource(name);
            URL url =(URL)(Object) l.getResourceURL();
            if (url != null) urls.add(url);
        }
        XMLProperties _properties;// = new XMLProperties();
        _properties = new XMLProperties();
        int count =(int)(Object) urls.size();
        boolean loaded = false;
        for (int i = count - 1; i >= 0 && !loaded; i--) {
            URL url = (URL)(URL)(Object) urls.get(i);
            InputStream stream = null;
            try {
                stream =(InputStream)(Object) url.openStream();
//                MyHelperClass _properties = new MyHelperClass();
                _properties.load(stream);
                loaded = true;
//                MyHelperClass _log = new MyHelperClass();
                if ((boolean)(Object)_log.isDebugEnabled()) _log.debug("Messages loaded from URL: " + url);
            } catch (UncheckedIOException ex) {
//                MyHelperClass _log = new MyHelperClass();
                if ((boolean)(Object)_log.isDebugEnabled()) _log.debug("Unable to load messages from URL: " + url,(IOException)(Object) ex);
            } finally {
                if (stream != null) try {
                    stream.close();
                } catch (UncheckedIOException ioe) {
                }
            }
        }
        if (!loaded) {
//            MyHelperClass _log = new MyHelperClass();
            _log.error("Messages can not be loaded from location: " + location);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass debug(String o0, IOException o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class Resource {

public MyHelperClass getRelativeResource(String o0){ return null; }
	public MyHelperClass getResourceURL(){ return null; }
	public MyHelperClass getName(){ return null; }}

class LocalizedNameGenerator {

LocalizedNameGenerator(String o0, MyHelperClass o1, String o2){}
	LocalizedNameGenerator(){}
	public MyHelperClass more(){ return null; }
	public MyHelperClass next(){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(URL o0){ return null; }}

class ArrayList {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class XMLProperties {

public MyHelperClass load(InputStream o0){ return null; }}
