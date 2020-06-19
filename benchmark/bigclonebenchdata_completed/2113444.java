
import java.io.UncheckedIOException;


class c2113444 {
public MyHelperClass ClassPathUtils;

    private VelocityEngine newVelocityEngine() {
        VelocityEngine velocityEngine = null;
        InputStream is = null;
        try {
            MyHelperClass VELOCITY_PROPS_FILE = new MyHelperClass();
            URL url =(URL)(Object) ClassPathUtils.getResource(VELOCITY_PROPS_FILE);
            is =(InputStream)(Object) url.openStream();
            Properties props = new Properties();
            props.load(is);
            velocityEngine = new VelocityEngine(props);
            velocityEngine.init();
        } catch (Exception e) {
            MyHelperClass VELOCITY_PROPS_FILE = new MyHelperClass();
            throw new RuntimeException("can not find velocity props file, file=" + VELOCITY_PROPS_FILE, e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (UncheckedIOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return velocityEngine;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(MyHelperClass o0){ return null; }}

class VelocityEngine {

VelocityEngine(){}
	VelocityEngine(Properties o0){}
	public MyHelperClass init(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
