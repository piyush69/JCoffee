
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c301804 {
public static MyHelperClass readPackageList(MyHelperClass o0, String o1, boolean o2){ return null; }
//public MyHelperClass readPackageList(MyHelperClass o0, String o1, boolean o2){ return null; }
public static MyHelperClass isRelativePath(String o0){ return null; }
	public static MyHelperClass getText(String o0, String o1){ return null; }
//public MyHelperClass isRelativePath(String o0){ return null; }
//	public MyHelperClass getText(String o0, String o1){ return null; }

    static String fetchURLComposeExternPackageList(String urlpath, String pkglisturlpath) {
        String link = pkglisturlpath + "package-list";
        try {
            boolean relative =(boolean)(Object) isRelativePath(urlpath);
            readPackageList((new URL(link)).openStream(), urlpath, relative);
        } catch (UncheckedIOException exc) {
            return(String)(Object) getText("doclet.MalformedURL", link);
        } catch (ArithmeticException exc) {
            return(String)(Object) getText("doclet.URL_error", link);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
