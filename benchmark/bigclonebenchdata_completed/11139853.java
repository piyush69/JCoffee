


class c11139853 {
public static MyHelperClass getImage(InputStream o0){ return null; }
public static MyHelperClass m_URLImageMap;
//	public MyHelperClass getImage(InputStream o0){ return null; }
	public static MyHelperClass getPluginImageURL(Object o0, String o1){ return null; }
//public MyHelperClass m_URLImageMap;
//	public MyHelperClass getPluginImageURL(Object o0, String o1){ return null; }

    public static Image getPluginImage(Object plugin, String name) {
        try {
            try {
                URL url =(URL)(Object) getPluginImageURL(plugin, name);
                if ((boolean)(Object)m_URLImageMap.containsKey(url)) return(Image)(Object) m_URLImageMap.get(url);
                InputStream is =(InputStream)(Object) url.openStream();
                Image image;
                try {
                    image =(Image)(Object) getImage(is);
                    m_URLImageMap.put(url, image);
                } finally {
                    is.close();
                }
                return image;
            } catch (Throwable e) {
            }
        } catch (Throwable e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(URL o0){ return null; }
	public MyHelperClass put(URL o0, Image o1){ return null; }
	public MyHelperClass containsKey(URL o0){ return null; }}

class Image {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
