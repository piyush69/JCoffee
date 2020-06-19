
import java.io.UncheckedIOException;


class c21182766 {

    public static Properties load(String propsName) {
        Properties props = new Properties();
        URL url =(URL)(Object) ClassLoader.getSystemResource(propsName);
        try {
            props.load(url.openStream());
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return props;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Properties {

public MyHelperClass load(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
