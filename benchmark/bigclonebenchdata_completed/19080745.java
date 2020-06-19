


class c19080745 {
public static MyHelperClass getImage(InputStream o0){ return null; }
//public MyHelperClass getImage(InputStream o0){ return null; }
	public static MyHelperClass getPluginImageURL(Object o0, String o1){ return null; }
//public MyHelperClass getPluginImageURL(Object o0, String o1){ return null; }

    public static Image getPluginImage(Object plugin, String name) {
        try {
            URL url =(URL)(Object) getPluginImageURL(plugin, name);
            InputStream is =(InputStream)(Object) url.openStream();
            Image image;
            try {
                image =(Image)(Object) getImage(is);
            } finally {
                is.close();
            }
            return image;
        } catch (Throwable e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Image {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
