


class c6240406 {
public static MyHelperClass getLoader(MyHelperClass o0){ return null; }
//public MyHelperClass getLoader(MyHelperClass o0){ return null; }

    public static Image loadImage(URL url) throws IOException {
        BufferedInputStream in = new BufferedInputStream(url.openStream());
        try {
            return(Image)(Object) getLoader(url.getFile()).loadImage(in);
        } finally {
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass loadImage(BufferedInputStream o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class Image {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }}
