
import java.io.UncheckedIOException;


class c19380360 {

    private void copyPhoto(final IPhoto photo, final Entry size) {
        MyHelperClass storageService = new MyHelperClass();
        final File fileIn = new File(storageService.getPhotoPath(photo, storageService.getOriginalDir()));
//        MyHelperClass storageService = new MyHelperClass();
        final File fileOut = new File(storageService.getPhotoPath(photo, size.getKey()));
        InputStream fileInputStream;
        OutputStream fileOutputStream;
        try {
            fileInputStream =(InputStream)(Object) new FileInputStream(fileIn);
            fileOutputStream =(OutputStream)(Object) new FileOutputStream(fileOut);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(fileInputStream, fileOutputStream);
            fileInputStream.close();
            fileOutputStream.close();
        } catch (final UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("file io exception",(IOException)(Object) e);
            return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPhotoPath(IPhoto o0, MyHelperClass o1){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getOriginalDir(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class IPhoto {

}

class File {

File(MyHelperClass o0){}
	File(){}}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Entry {

public MyHelperClass getKey(){ return null; }}
