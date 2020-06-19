import java.io.*;
import java.lang.*;
import java.util.*;



class c6214356 {
public MyHelperClass fromUrl;
	public MyHelperClass process(InputStream o0){ return null; }

    public void GifImage(URL url) throws IOException {
        fromUrl =(MyHelperClass)(Object) url;
        InputStream is = null;
        try {
            is =(InputStream)(Object) url.openStream();
            process(is);
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
