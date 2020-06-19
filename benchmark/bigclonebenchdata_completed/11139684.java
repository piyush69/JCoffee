
import java.io.UncheckedIOException;


class c11139684 {
public MyHelperClass Activator;

//    @Override
    public void decorate(Object element, IDecoration decoration) {
        if (element != null && element instanceof IProject) {
            InputStream is = null;
            try {
                IProject project = (IProject) element;
                MyHelperClass Activator = new MyHelperClass();
                IFile file =(IFile)(Object) project.getFile(Activator.PLUGIN_CONF);
                if ((boolean)(Object)file.exists()) {
                    MyHelperClass bundle = new MyHelperClass();
                    URL url =(URL)(Object) bundle.getEntry("icons/leaf4e_decorator.gif");
                    MyHelperClass FileLocator = new MyHelperClass();
                    is =(InputStream)(Object) FileLocator.toFileURL(url).openStream();
                    MyHelperClass Display = new MyHelperClass();
                    Image img = new Image(Display.getCurrent(), is);
                    MyHelperClass ImageDescriptor = new MyHelperClass();
                    ImageDescriptor id =(ImageDescriptor)(Object) ImageDescriptor.createFromImage(img);
                    MyHelperClass IDecoration = new MyHelperClass();
                    decoration.addOverlay(id, IDecoration.TOP_LEFT);
                }
            } catch (Exception e) {
                MyHelperClass IStatus = new MyHelperClass();
                Status status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, "Decorating error", e);
                MyHelperClass logger = new MyHelperClass();
                logger.log(status);
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (UncheckedIOException e) {
                        MyHelperClass IStatus = new MyHelperClass();
                        Status status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, "", e);
                        MyHelperClass logger = new MyHelperClass();
                        logger.log(status);
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
	public MyHelperClass TOP_LEFT;
	public MyHelperClass PLUGIN_CONF;
	public MyHelperClass PLUGIN_ID;
public MyHelperClass log(Status o0){ return null; }
	public MyHelperClass createFromImage(Image o0){ return null; }
	public MyHelperClass getEntry(String o0){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass toFileURL(URL o0){ return null; }
	public MyHelperClass getCurrent(){ return null; }}

class IDecoration {

public MyHelperClass addOverlay(ImageDescriptor o0, MyHelperClass o1){ return null; }}

class IProject {

public MyHelperClass getFile(MyHelperClass o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IFile {

public MyHelperClass exists(){ return null; }}

class URL {

}

class Image {

Image(MyHelperClass o0, InputStream o1){}
	Image(){}}

class ImageDescriptor {

}

class Status {

Status(MyHelperClass o0, MyHelperClass o1, String o2, IOException o3){}
	Status(){}
	Status(MyHelperClass o0, MyHelperClass o1, String o2, Exception o3){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
