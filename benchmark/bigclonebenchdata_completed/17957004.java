
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17957004 {
public MyHelperClass generateUrlString(String o0, String o1, String o2, MyHelperClass o3){ return null; }

//    @Override
    public List getArtifactTypes(String organisationName, String artifactName, String version) {
        MyHelperClass cache = new MyHelperClass();
        if (cache != null) {
            Date d;
            try {
//                MyHelperClass cache = new MyHelperClass();
                d =(Date)(Object) cache.getTypesLastUpdate(organisationName, artifactName, version);
                MyHelperClass cacheExpirationDate = new MyHelperClass();
                if ((int)(Object)d.compareTo(cacheExpirationDate) >= 0) {
//                    MyHelperClass cache = new MyHelperClass();
                    return(List)(Object) cache.getTypes(organisationName, artifactName, version);
                }
            } catch (UncheckedIOException e) {
                MyHelperClass log = new MyHelperClass();
                log.warn("cannot access cache",(CacheAccessException)(Object) e);
            }
        }
        List types =(List)(Object) new ArrayList();
        MyHelperClass Type = new MyHelperClass();
        String urlString =(String)(Object) generateUrlString(organisationName, artifactName, version, Type.JAR);
        try {
            new URL(urlString).openStream();
//            MyHelperClass Type = new MyHelperClass();
            types.add(Type.JAR);
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
//        MyHelperClass Type = new MyHelperClass();
        urlString =(String)(Object) generateUrlString(organisationName, artifactName, version, Type.SRC);
        try {
            new URL(urlString).openStream();
//            MyHelperClass Type = new MyHelperClass();
            types.add(Type.SRC);
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
//        MyHelperClass Type = new MyHelperClass();
        urlString =(String)(Object) generateUrlString(organisationName, artifactName, version, Type.WAR);
        try {
            new URL(urlString).openStream();
//            MyHelperClass Type = new MyHelperClass();
            types.add(Type.WAR);
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
//        MyHelperClass Type = new MyHelperClass();
        urlString =(String)(Object) generateUrlString(organisationName, artifactName, version, Type.ZIP);
        try {
            new URL(urlString).openStream();
//            MyHelperClass Type = new MyHelperClass();
            types.add(Type.ZIP);
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
//        MyHelperClass cache = new MyHelperClass();
        if (cache != null) {
            try {
//                MyHelperClass cache = new MyHelperClass();
                cache.updateTypes(organisationName, artifactName, version, types);
            } catch (UncheckedIOException e) {
                MyHelperClass log = new MyHelperClass();
                log.warn("cannot access cache",(CacheAccessException)(Object) e);
            }
        }
        return types;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WAR;
	public MyHelperClass JAR;
	public MyHelperClass ZIP;
	public MyHelperClass SRC;
public MyHelperClass getTypes(String o0, String o1, String o2){ return null; }
	public MyHelperClass warn(String o0, CacheAccessException o1){ return null; }
	public MyHelperClass getTypesLastUpdate(String o0, String o1, String o2){ return null; }
	public MyHelperClass updateTypes(String o0, String o1, String o2, List o3){ return null; }}

class List {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class Type {

}

class Date {

public MyHelperClass compareTo(MyHelperClass o0){ return null; }}

class CacheAccessException extends Exception{
	public CacheAccessException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

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
