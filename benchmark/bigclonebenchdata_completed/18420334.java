
import java.io.UncheckedIOException;


class c18420334 {

    private static boolean loadResources(String ext) {
        InputStream in;
        try {
            URL url =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource("bg/plambis/dict/local/i18n" + ext + ".xml");
            if (url == null) return false;
            in =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
            return false;
        }
        try {
            Serializer serializer =(Serializer)(Object) new Persister();
            MyHelperClass resources = new MyHelperClass();
            resources = serializer.read(TextResource.class, in);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Serializer {

public MyHelperClass read(Class<TextResource> o0, InputStream o1){ return null; }}

class Persister {

}

class TextResource {

}
