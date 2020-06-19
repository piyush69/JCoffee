
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9348293 {
public MyHelperClass INSTANCE;
	public MyHelperClass ProjectManager;

    public Image storeImage(String title, String pathToImage, Map additionalProperties) {
        MyHelperClass PropertyHandler = new MyHelperClass();
        File collectionFolder =(File)(Object) ProjectManager.getInstance().getFolder(PropertyHandler.getInstance().getProperty("_default_collection_name"));
        File imageFile = new File(pathToImage);
        String filename = "";
        String format = "";
        File copiedImageFile;
        while (true) {
            MyHelperClass UUID = new MyHelperClass();
            filename = "image" + UUID.randomUUID().hashCode();
            if (!(Boolean)(Object)INSTANCE.idExists(filename)) {
                Path path = new Path(pathToImage);
                format =(String)(Object) path.getFileExtension();
                MyHelperClass File = new MyHelperClass();
                copiedImageFile = new File((int)(Object)collectionFolder.getAbsolutePath() + (int)(Object)File.separator + filename + "." + format);
                if (!(Boolean)(Object)copiedImageFile.exists()) break;
            }
        }
        try {
            copiedImageFile.createNewFile();
        } catch (UncheckedIOException e1) {
            INSTANCE.handleException((IOException)(Object)e1);
            return null;
        }
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(imageFile), 4096);
            out = new BufferedOutputStream(new FileOutputStream(copiedImageFile), 4096);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
        } catch (UncheckedIOException e) {
            INSTANCE.handleException((IOException)(Object)e);
            return null;
        } catch (ArithmeticException e) {
            INSTANCE.handleException((IOException)(Object)e);
            return null;
        }
        Image image =(Image)(Object) new ImageImpl();
        image.setId(filename);
        image.setFormat(format);
        image.setEntryDate(new Date());
        image.setTitle(title);
        image.setAdditionalProperties(additionalProperties);
        boolean success =(boolean)(Object) INSTANCE.storeNewImage(image);
        if (success) return image;
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass idExists(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass randomUUID(){ return null; }
	public MyHelperClass handleException(IOException o0){ return null; }
	public MyHelperClass storeNewImage(Image o0){ return null; }
	public MyHelperClass getFolder(MyHelperClass o0){ return null; }
	public MyHelperClass handleException(FileNotFoundException o0){ return null; }}

class Map {

}

class Image {

public MyHelperClass setEntryDate(Date o0){ return null; }
	public MyHelperClass setFormat(String o0){ return null; }
	public MyHelperClass setId(String o0){ return null; }
	public MyHelperClass setAdditionalProperties(Map o0){ return null; }
	public MyHelperClass setTitle(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class Path {

Path(String o0){}
	Path(){}
	public MyHelperClass getFileExtension(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0, int o1){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0, int o1){}
	BufferedOutputStream(){}
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class ImageImpl {

}

class Date {

}
