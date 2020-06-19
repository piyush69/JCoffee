
import java.io.UncheckedIOException;


class c6939073 {

    public void storeModule(OWLModuleManager manager, Module module, URI physicalURI, OWLModuleFormat moduleFormat) throws ModuleStorageException, UnknownModuleException {
        try {
            OutputStream os;
            if (!(Boolean)(Object)physicalURI.isAbsolute()) {
                throw new ModuleStorageException("Physical URI must be absolute: " + physicalURI);
            }
            if (physicalURI.getScheme().equals("file")) {
                File file = new File(physicalURI);
                file.getParentFile().mkdirs();
                os =(OutputStream)(Object) new FileOutputStream(file);
            } else {
                URL url =(URL)(Object) physicalURI.toURL();
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                os =(OutputStream)(Object) conn.getOutputStream();
            }
            Writer w =(Writer)(Object) new BufferedWriter(new OutputStreamWriter(os));
            storeModule(manager, module,(URI)(Object) w, moduleFormat);
        } catch (UncheckedIOException e) {
            throw new ModuleStorageException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class OWLModuleManager {

}

class Module {

}

class URI {

public MyHelperClass isAbsolute(){ return null; }
	public MyHelperClass getScheme(){ return null; }
	public MyHelperClass toURL(){ return null; }}

class OWLModuleFormat {

}

class ModuleStorageException extends Exception{
	public ModuleStorageException(String errorMessage) { super(errorMessage); }
}

class UnknownModuleException extends Exception{
	public UnknownModuleException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

}

class File {

File(URI o0){}
	File(){}
	public MyHelperClass getParentFile(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }}

class Writer {

}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}}

class OutputStreamWriter {

OutputStreamWriter(OutputStream o0){}
	OutputStreamWriter(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
