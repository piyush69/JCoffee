


class c21119989 {
public static MyHelperClass findInPlugin(Bundle o0, IPath o1){ return null; }
	public static MyHelperClass findInFragments(Bundle o0, IPath o1){ return null; }
//public MyHelperClass findInFragments(Bundle o0, IPath o1){ return null; }
//	public MyHelperClass findInPlugin(Bundle o0, IPath o1){ return null; }

    public static final InputStream openStream(Bundle bundle, IPath file, boolean localized) throws IOException {
        URL url = null;
        if (!localized) {
            url =(URL)(Object) findInPlugin(bundle, file);
            if (url == null) url =(URL)(Object) findInFragments(bundle, file);
        } else {
            MyHelperClass FindSupport = new MyHelperClass();
            url =(URL)(Object) FindSupport.find(bundle, file);
        }
        if (url != null) return(InputStream)(Object) url.openStream();
        throw new IOException("Cannot find " + file.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass find(Bundle o0, IPath o1){ return null; }}

class Bundle {

}

class IPath {

}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}
