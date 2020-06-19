


class c23376481 {
public MyHelperClass Trace;
	public MyHelperClass createURL(String o0){ return null; }

    public URL getURL(String fragment) {
        URL url = null;
        try {
            url =(URL)(Object) createURL(fragment);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        if (url == null) return null;
        try {
            InputStream is =(InputStream)(Object) url.openStream();
            if (is != null) {
                is.close();
                return url;
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace((java.io.PrintStream)(Object)(PrintStream)(Object)Trace.out);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass out;
}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class PrintStream {

}
