


class c12516574 {

    public static Image getImage(URL url) throws IOException {
        InputStream is = null;
        try {
            is =(InputStream)(Object) url.openStream();
            Image img = getImage((URL)(Object)is);
            img.setUrl(url);
            return img;
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Image {

public MyHelperClass setUrl(URL o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}
