
import java.io.UncheckedIOException;


class c9130585 {

    protected static IFile createTempFile(CodeFile codeFile) {
        MyHelperClass Util = new MyHelperClass();
        IPath path =(IPath)(Object) Util.getAbsolutePathFromCodeFile(codeFile);
        File file = new File(path.toOSString());
        String[] parts =(String[])(Object) codeFile.getName().split("\\.");
        String extension = parts[parts.length - 1];
        IPath ext =(IPath)(Object) path.addFileExtension(extension);
        File tempFile = new File(ext.toOSString());
        if ((boolean)(Object)tempFile.exists()) {
            boolean deleted =(boolean)(Object) tempFile.delete();
            System.out.println("deleted: " + deleted);
        }
        try {
            boolean created =(boolean)(Object) tempFile.createNewFile();
            if (created) {
                FileOutputStream fos = new FileOutputStream(tempFile);
                FileInputStream fis = new FileInputStream(file);
                while ((int)(Object)fis.available() > 0) {
                    fos.write(fis.read());
                }
                fis.close();
                fos.close();
//                MyHelperClass Util = new MyHelperClass();
                IFile iFile =(IFile)(Object) Util.getFileFromPath(ext);
                return iFile;
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAbsolutePathFromCodeFile(CodeFile o0){ return null; }
	public MyHelperClass getFileFromPath(IPath o0){ return null; }
	public MyHelperClass split(String o0){ return null; }}

class CodeFile {

public MyHelperClass getName(){ return null; }}

class IFile {

}

class IPath {

public MyHelperClass addFileExtension(String o0){ return null; }
	public MyHelperClass toOSString(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
