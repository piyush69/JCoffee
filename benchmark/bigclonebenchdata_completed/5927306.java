
import java.io.UncheckedIOException;


class c5927306 {
public MyHelperClass Toast;
	public MyHelperClass string;

    boolean createSessionArchive(String archiveFilename) {
        byte[] buffer = new byte[1024];
        try {
            ZipOutputStream archive = new ZipOutputStream(new FileOutputStream(archiveFilename));
            MyHelperClass mAnnotationsCursor = new MyHelperClass();
            for (mAnnotationsCursor.moveToFirst(); !(Boolean)(Object)mAnnotationsCursor.isAfterLast(); mAnnotationsCursor.moveToNext()) {
                MyHelperClass ANNOTATIONS_FILE_NAME = new MyHelperClass();
                FileInputStream in = new FileInputStream(mAnnotationsCursor.getString(ANNOTATIONS_FILE_NAME));
//                MyHelperClass mAnnotationsCursor = new MyHelperClass();
                archive.putNextEntry(new ZipEntry("audio" + ((int)(Object)mAnnotationsCursor.getPosition() + 1) + ".3gpp"));
                int length;
                while ((length =(int)(Object) in.read(buffer)) > 0) archive.write(buffer, 0, length);
                archive.closeEntry();
                in.close();
            }
            archive.close();
        } catch (UncheckedIOException e) {
            MyHelperClass mActivity = new MyHelperClass();
            Toast.makeText(mActivity, mActivity.getString(string.error_zip) + " " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass error_zip;
	public MyHelperClass LENGTH_SHORT;
public MyHelperClass show(){ return null; }
	public MyHelperClass moveToFirst(){ return null; }
	public MyHelperClass getPosition(){ return null; }
	public MyHelperClass isAfterLast(){ return null; }
	public MyHelperClass moveToNext(){ return null; }
	public MyHelperClass makeText(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
