
import java.io.UncheckedIOException;


class c8693707 {

        private void copy(URL url, IFile file, IProgressMonitor monitor) throws CoreException, IOException {
            InputStream input = null;
            try {
                input =(InputStream)(Object) url.openStream();
                if ((boolean)(Object)file.exists()) {
                    MyHelperClass IResource = new MyHelperClass();
                    file.setContents(input, IResource.FORCE, monitor);
                } else {
                    MyHelperClass IResource = new MyHelperClass();
                    file.create(input, IResource.FORCE, monitor);
                }
            } finally {
                if (input != null) {
                    try {
                        input.close();
                    } catch (UncheckedIOException ignore) {
                    }
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FORCE;
}

class URL {

public MyHelperClass openStream(){ return null; }}

class IFile {

public MyHelperClass setContents(InputStream o0, MyHelperClass o1, IProgressMonitor o2){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass create(InputStream o0, MyHelperClass o1, IProgressMonitor o2){ return null; }}

class IProgressMonitor {

}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}
