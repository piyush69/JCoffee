
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6430125 {
public MyHelperClass INSTANCE;
	public MyHelperClass imageFolderPath;
	public MyHelperClass SWT;
	public MyHelperClass UUID;

    protected Object openDialogBox(Control cellEditorWindow) {
        MyHelperClass parent = new MyHelperClass();
        FileDialog dialog = new FileDialog(parent.getShell(), SWT.OPEN);
        dialog.setFilterExtensions(new String[] { "*.jpg;*.JPG;*.JPEG;*.gif;*.GIF;*.png;*.PNG", "*.jpg;*.JPG;*.JPEG", "*.gif;*.GIF", "*.png;*.PNG" });
        dialog.setFilterNames(new String[] { "All", "Joint Photographic Experts Group (JPEG)", "Graphics Interchange Format (GIF)", "Portable Network Graphics (PNG)" });
        String imagePath =(String)(Object) dialog.open();
        if (imagePath == null) return null;
        MyHelperClass ProjectManager = new MyHelperClass();
        IProject project =(IProject)(Object) ProjectManager.getInstance().getCurrentProject();
        String projectFolderPath =(String)(Object) project.getLocation().toOSString();
        File imageFile = new File(imagePath);
        String fileName =(String)(Object) imageFile.getName();
        ImageData imageData = null;
        try {
            imageData = new ImageData(imagePath);
        } catch (UncheckedIOException e) {
            MyHelperClass PropertyHandler = new MyHelperClass();
            UserErrorException error = new UserErrorException(PropertyHandler.getInstance().getProperty("_invalid_image_title"), PropertyHandler.getInstance().getProperty("_invalid_image_text"));
            INSTANCE.showError(error);
            return null;
        }
        if (imageData == null) {
            MyHelperClass PropertyHandler = new MyHelperClass();
            UserErrorException error = new UserErrorException(PropertyHandler.getInstance().getProperty("_invalid_image_title"), PropertyHandler.getInstance().getProperty("_invalid_image_text"));
            INSTANCE.showError(error);
            return null;
        }
        MyHelperClass File = new MyHelperClass();
        File copiedImageFile = new File(projectFolderPath + File.separator + imageFolderPath + File.separator + fileName);
        if ((boolean)(Object)copiedImageFile.exists()) {
            Path path = new Path(copiedImageFile.getPath());
//            MyHelperClass File = new MyHelperClass();
            copiedImageFile = new File(projectFolderPath + File.separator + imageFolderPath + File.separator + UUID.randomUUID().toString() + "." + path.getFileExtension());
        }
        try {
            copiedImageFile.createNewFile();
        } catch (UncheckedIOException e1) {
            INSTANCE.handleException((IOException)(Object)e1);
            copiedImageFile = null;
        }
        if (copiedImageFile == null) {
//            MyHelperClass File = new MyHelperClass();
            copiedImageFile = new File(projectFolderPath + File.separator + imageFolderPath + File.separator + UUID.randomUUID().toString());
            try {
                copiedImageFile.createNewFile();
            } catch (UncheckedIOException e) {
                INSTANCE.handleException((IOException)(Object)e);
                return "";
            }
        }
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader(imageFile);
            out = new FileWriter(copiedImageFile);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
        } catch (UncheckedIOException e) {
            INSTANCE.handleException((IOException)(Object)e);
            return "";
        } catch (ArithmeticException e) {
            INSTANCE.handleException((IOException)(Object)e);
            return "";
        }
        MyHelperClass imageFolderPath = new MyHelperClass();
        return(int)(Object) imageFolderPath + (int)(Object)File.separator + (int)(Object)copiedImageFile.getName();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
	public MyHelperClass OPEN;
public MyHelperClass getShell(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass getCurrentProject(){ return null; }
	public MyHelperClass toOSString(){ return null; }
	public MyHelperClass showError(UserErrorException o0){ return null; }
	public MyHelperClass randomUUID(){ return null; }
	public MyHelperClass handleException(IOException o0){ return null; }
	public MyHelperClass handleException(FileNotFoundException o0){ return null; }}

class Control {

}

class FileDialog {

FileDialog(){}
	FileDialog(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass open(){ return null; }
	public MyHelperClass setFilterNames(String[] o0){ return null; }
	public MyHelperClass setFilterExtensions(String[] o0){ return null; }}

class IProject {

public MyHelperClass getLocation(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class ImageData {

ImageData(String o0){}
	ImageData(){}}

class SWTException extends Exception{
	public SWTException(String errorMessage) { super(errorMessage); }
}

class UserErrorException extends Exception{
	public UserErrorException(String errorMessage) { super(errorMessage); }
	UserErrorException(){}
	UserErrorException(MyHelperClass o0, MyHelperClass o1){}
}

class Path {

Path(){}
	Path(MyHelperClass o0){}
	public MyHelperClass getFileExtension(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileReader {

FileReader(){}
	FileReader(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileWriter {

FileWriter(){}
	FileWriter(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
