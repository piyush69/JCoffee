
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19721715 {
public MyHelperClass StringUtils;
	public MyHelperClass JeeServiceComponentUIPlugin;
	public MyHelperClass IStatus;
	public MyHelperClass getXsdFolder(){ return null; }

    protected void handleHttp(String path, IProgressMonitor monitor, SchemaGeneratorContext ctx) throws CoreException, DuplicateFileException {
        InputStream is = null;
        try {
            URL url = new URL(path);
            is =(InputStream)(Object) url.openStream();
            IFolder folder =(IFolder)(Object) getXsdFolder();
            String _path =(String)(Object) url.getPath();
            String[] contents =(String[])(Object) StringUtils.tokenizeToStringArray(_path, "/");
            String file = contents[contents.length - 1];
            if (file.indexOf(".") > -1) {
                IFile f =(IFile)(Object) folder.getFile(file);
                if (!(Boolean)(Object)f.exists()) {
                    f.create(is, false, monitor);
                    String schemaFile =(String)(Object) f.getLocation().toFile().getAbsolutePath();
                    ctx.setSchemaFiles(schemaFile);
                    return;
                }
                throw new DuplicateFileException("File " + file + " already exists");
            }
            IStatus status =(IStatus)(Object) new Status(IStatus.ERROR, JeeServiceComponentUIPlugin.PLUGIN_ID, IStatus.OK, "I/O Exception", new FileNotFoundException("No file associated to " + url));
            throw new CoreException((String)(Object)status);
        } catch (UncheckedIOException e) {
            IStatus status =(IStatus)(Object) new Status(IStatus.ERROR, JeeServiceComponentUIPlugin.PLUGIN_ID, IStatus.OK, "Malformed URL Exception",(MalformedURLException)(Object) e);
            throw new CoreException((String)(Object)status);
        } catch (ArithmeticException e) {
            IStatus status =(IStatus)(Object) new Status(IStatus.ERROR, JeeServiceComponentUIPlugin.PLUGIN_ID, IStatus.OK, "I/O Exception",(MalformedURLException)(Object) e);
            throw new CoreException((String)(Object)status);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PLUGIN_ID;
	public MyHelperClass OK;
	public MyHelperClass ERROR;
public MyHelperClass toFile(){ return null; }
	public MyHelperClass tokenizeToStringArray(String o0, String o1){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class IProgressMonitor {

}

class SchemaGeneratorContext {

public MyHelperClass setSchemaFiles(String o0){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class DuplicateFileException extends Exception{
	public DuplicateFileException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class IFolder {

public MyHelperClass getFile(String o0){ return null; }}

class IFile {

public MyHelperClass exists(){ return null; }
	public MyHelperClass create(InputStream o0, boolean o1, IProgressMonitor o2){ return null; }
	public MyHelperClass getLocation(){ return null; }}

class IStatus {

}

class Status {

Status(){}
	Status(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, String o3, MalformedURLException o4){}
	Status(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, String o3, FileNotFoundException o4){}
	Status(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, String o3, IOException o4){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
