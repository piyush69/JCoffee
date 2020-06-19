import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18989018 {
public MyHelperClass setInput(IEditorInput o0){ return null; }
public MyHelperClass Platform;
	public MyHelperClass ImageUI;
	public MyHelperClass setDocument(IDocument o0){ return null; }

    protected void doSetInput(IEditorInput input, IProgressMonitor monitor) throws Throwable, CoreException {
        MyHelperClass ResourcesPlugin = new MyHelperClass();
        IWorkspaceRoot root =(IWorkspaceRoot)(Object) ResourcesPlugin.getWorkspace().getRoot();
        IFileFormat format = null;
        Object source = null;
        InputStream in = null;
        try {
            IPath path;
            if ((IStorageEditorInput)(Object)input instanceof IStorageEditorInput) {
                IStorage s =(IStorage)(Object) ((IStorageEditorInput)(IStorageEditorInput)(Object) input).getStorage();
                in =(InputStream)(Object) s.getContents();
                if ((IFile)(Object)s instanceof IFile) {
                    IFile file = (IFile)(IFile)(Object) s;
                    path =(IPath)(Object) file.getRawLocation();
                    if ((boolean)(Object)root.exists(path)) {
                        path =(IPath)(Object) root.getLocation().append(path);
                    }
                    source = path.toFile();
                }
            } else if ((IPathEditorInput)(Object)input instanceof IPathEditorInput) {
                path =(IPath)(Object) ((IPathEditorInput)(IPathEditorInput)(Object) input).getPath();
                source = path.toFile();
            } else if ((IURIEditorInput)(Object)input instanceof IURIEditorInput) {
                URI uri =(URI)(Object) ((IURIEditorInput)(IURIEditorInput)(Object) input).getURI();
                MyHelperClass URIUtil = new MyHelperClass();
                if ((boolean)(Object)URIUtil.isFileURI(uri)) {
//                    MyHelperClass URIUtil = new MyHelperClass();
                    source = URIUtil.toFile(uri);
                } else {
//                    MyHelperClass URIUtil = new MyHelperClass();
                    URL url =(URL)(Object) URIUtil.toURL(uri);
                    in = url.openStream();
                }
            }
            if (source == null) {
                if (!in.markSupported()) {
                    in = new BufferedInputStream(in);
                }
                in.mark(10);
                source = in;
            }
            MyHelperClass ImageCore = new MyHelperClass();
            IContentDescription cd =(IContentDescription)(Object) Platform.getContentTypeManager().getDescriptionFor(in, input.getName(), new QualifiedName[] {(QualifiedName)(Object) ImageCore.VALID_FORMATS });
            if (in != null) {
                in.reset();
            }
//            MyHelperClass ImageCore = new MyHelperClass();
            Collection<?> valid = (Collection<?>) cd.getProperty(ImageCore.VALID_FORMATS);
            MyHelperClass Status = new MyHelperClass();
            if (valid.isEmpty()) throw new CoreException((String)(Object)new Status(Status.ERROR, ImageUI.PLUGIN_ID, "Unsupported file format."));
            MyHelperClass ImageIO = new MyHelperClass();
            ImageInputStream stream =(ImageInputStream)(Object) ImageIO.createImageInputStream(source);
            format = (IFileFormat) valid.iterator().next();
            IDocument document =(IDocument)(Object) format.decode(stream, monitor);
            setDocument(document);
        } catch (IOException e) {
            MyHelperClass Status = new MyHelperClass();
            Status status = new Status(Status.ERROR, ImageUI.PLUGIN_ID, "IO Error", e);
            throw new CoreException((String)(Object)status);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
        }
        this.setInput(input);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PLUGIN_ID;
	public MyHelperClass VALID_FORMATS;
	public MyHelperClass ERROR;
public MyHelperClass isFileURI(URI o0){ return null; }
	public MyHelperClass createImageInputStream(Object o0){ return null; }
	public MyHelperClass toFile(URI o0){ return null; }
	public MyHelperClass getContentTypeManager(){ return null; }
	public MyHelperClass append(IPath o0){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass getDescriptionFor(InputStream o0, MyHelperClass o1, QualifiedName[] o2){ return null; }
	public MyHelperClass toURL(URI o0){ return null; }}

class IEditorInput {

public MyHelperClass getName(){ return null; }}

class IProgressMonitor {

}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class IWorkspaceRoot {

public MyHelperClass exists(IPath o0){ return null; }
	public MyHelperClass getLocation(){ return null; }}

class IFileFormat {

public MyHelperClass decode(ImageInputStream o0, IProgressMonitor o1){ return null; }}

class IPath {

public MyHelperClass toFile(){ return null; }}

class IStorageEditorInput {

public MyHelperClass getStorage(){ return null; }}

class IStorage {

public MyHelperClass getContents(){ return null; }}

class IFile {

public MyHelperClass getRawLocation(){ return null; }}

class IPathEditorInput {

public MyHelperClass getPath(){ return null; }}

class IURIEditorInput {

public MyHelperClass getURI(){ return null; }}

class IContentDescription {

public MyHelperClass getProperty(MyHelperClass o0){ return null; }}

class QualifiedName {

}

class Status {

Status(){}
	Status(MyHelperClass o0, MyHelperClass o1, String o2){}
	Status(MyHelperClass o0, MyHelperClass o1, String o2, IOException o3){}}

class ImageInputStream {

}

class IDocument {

}
