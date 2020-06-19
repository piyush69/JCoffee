
import java.io.UncheckedIOException;


class c15362793 {
public static MyHelperClass ReadInputStream(InputStream o0, boolean o1){ return null; }
//public MyHelperClass ReadInputStream(InputStream o0, boolean o1){ return null; }

    public static String ReadURL(URL url, boolean textonly) {
        try {
            URLConnection uconn =(URLConnection)(Object) url.openConnection();
            Object ucont = uconn.getContent();
            if (ucont instanceof InputStream) return(String)(Object) ReadInputStream((InputStream)(Object)(java.io.InputStream) ucont, textonly); else return "" + ucont;
        } catch (java.io.UncheckedIOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContent(){ return null; }}

class InputStream {

}
