
import java.io.UncheckedIOException;


class c5519971 {
public MyHelperClass getDisplay(){ return null; }

    public void setImage(String imageUrl) {
        try {
            MyHelperClass ProjectManager = new MyHelperClass();
            InputStream url =(InputStream)(Object) ProjectManager.getCurrentProject().getUrl(imageUrl).openStream();
            Image im = new Image(getDisplay(), url);
            if (im != null) setImage((String)(Object)im);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getCurrentProject(){ return null; }
	public MyHelperClass getUrl(String o0){ return null; }}

class InputStream {

}

class Image {

Image(MyHelperClass o0, InputStream o1){}
	Image(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
