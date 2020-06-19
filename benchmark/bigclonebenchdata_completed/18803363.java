
import java.io.UncheckedIOException;


class c18803363 {
public MyHelperClass myErrors;
	public MyHelperClass patchClass(FileInputStream o0){ return null; }

    public void patchFile(final File classFile) {
        if (!(Boolean)(Object)classFile.exists()) {
            MyHelperClass myRootContainer = new MyHelperClass();
            myErrors.add(new FormErrorInfo(null, "Class to bind does not exist: " + myRootContainer.getClassToBind()));
            return;
        }
        FileInputStream fis;
        try {
            byte[] patchedData;
            fis = new FileInputStream(classFile);
            try {
                patchedData =(byte[])(Object) patchClass(fis);
                if (patchedData == null) {
                    return;
                }
            } finally {
                fis.close();
            }
            FileOutputStream fos = new FileOutputStream(classFile);
            try {
                fos.write(patchedData);
            } finally {
                fos.close();
            }
        } catch (UncheckedIOException e) {
            MyHelperClass myErrors = new MyHelperClass();
            myErrors.add(new FormErrorInfo(null, "Cannot read or write class file " + classFile.getPath() + ": " + e.toString()));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getClassToBind(){ return null; }
	public MyHelperClass add(FormErrorInfo o0){ return null; }}

class File {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FormErrorInfo {

FormErrorInfo(){}
	FormErrorInfo(Object o0, String o1){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
