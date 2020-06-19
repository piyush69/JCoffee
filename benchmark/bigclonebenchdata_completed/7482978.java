
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7482978 {
public static MyHelperClass Toolkit;
//public MyHelperClass Toolkit;

    public static boolean BMPfromURL(URL url, MainClass mc) {
        TextField TF =(TextField)(Object) mc.TF;
        PixCanvas canvas =(PixCanvas)(Object) mc.canvas;
        Image image = null;
        try {
            MyHelperClass BMPReader = new MyHelperClass();
            image =(Image)(Object) Toolkit.getDefaultToolkit().createImage(BMPReader.getBMPImage(url.openStream()));
        } catch (UncheckedIOException e) {
            return false;
        }
        if (image == null) {
            TF.setText("Error not a typical image BMP format");
            return false;
        }
        MediaTracker tr = new MediaTracker(canvas);
        tr.addImage(image, 0);
        try {
            tr.waitForID(0);
        } catch (UncheckedIOException e) {
        }
        ;
        if ((boolean)(Object)tr.isErrorID(0)) {
            MyHelperClass Tools = new MyHelperClass();
            Tools.debug(OpenOther.class, "Tracker error " + tr.getErrorsAny().toString());
            return false;
        }
        PixObject po = new PixObject(url, image, canvas, false, null);
        mc.vimages.addElement(po);
        TF.setText(url.toString());
        canvas.repaint();
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDefaultToolkit(){ return null; }
	public MyHelperClass debug(Class<OpenOther> o0, String o1){ return null; }
	public MyHelperClass createImage(MyHelperClass o0){ return null; }
	public MyHelperClass addElement(PixObject o0){ return null; }
	public MyHelperClass getBMPImage(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class MainClass {
public MyHelperClass vimages;
	public MyHelperClass TF;
	public MyHelperClass canvas;
}

class TextField {

public MyHelperClass setText(String o0){ return null; }}

class PixCanvas {

public MyHelperClass repaint(){ return null; }}

class Image {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MediaTracker {

MediaTracker(){}
	MediaTracker(PixCanvas o0){}
	public MyHelperClass waitForID(int o0){ return null; }
	public MyHelperClass getErrorsAny(){ return null; }
	public MyHelperClass isErrorID(int o0){ return null; }
	public MyHelperClass addImage(Image o0, int o1){ return null; }}

class OpenOther {

}

class PixObject {

PixObject(URL o0, Image o1, PixCanvas o2, boolean o3, Object o4){}
	PixObject(){}}
