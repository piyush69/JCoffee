import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9970377 {
public MyHelperClass IDE;
	public MyHelperClass MessageDialog;
	public MyHelperClass path;
	public MyHelperClass EFS;

    public void doWrite()  throws Throwable {
        System.out.print("\nSerializing...");
        try {
            IFile ifile = null;
            File file = null;
            MyHelperClass method = new MyHelperClass();
            if (null != method.getResource()) {
                MyHelperClass Statics = new MyHelperClass();
                ifile =(IFile)(Object) method.getJavaProject().getResource().getProject().getFile((int)(Object)Statics.CFG_DIR + (int)(Object)Statics.SEPARATOR + (int)(Object)path.substring(path.lastIndexOf(Statics.SEPARATOR)));
            }
            MyHelperClass path = new MyHelperClass();
            file = new File((String)(Object)path);
            if (file.exists()) {
                MyHelperClass wb = new MyHelperClass();
                boolean ans =(boolean)(Object) MessageDialog.openQuestion(wb.getSite().getShell(), "Flow Plug-in", "File already exists. Do you want to overwrite it?");
                if (ans) {
                    file.delete();
                }
            }
            if (!file.exists()) {
//                MyHelperClass path = new MyHelperClass();
                FileOutputStream fos = new FileOutputStream((String)(Object)path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                BufferedOutputStream bo = new BufferedOutputStream(oos);
                MyHelperClass anode = new MyHelperClass();
                oos.writeObject(anode);
                oos.flush();
                oos.close();
//                MyHelperClass path = new MyHelperClass();
                InputStream is = new FileInputStream((String)(Object)path);
                if (null != ifile) {
                    if ((boolean)(Object)ifile.exists()) ifile.delete(true, null);
                    MyHelperClass IResource = new MyHelperClass();
                    ifile.create(is, IResource.NONE, null);
                }
//                MyHelperClass path = new MyHelperClass();
                Path fullpath = new Path(path);
                MyHelperClass wb = new MyHelperClass();
                IDE.openEditorOnFileStore(wb.getSite().getPage(), EFS.getLocalFileSystem().getStore(fullpath));
//                MyHelperClass method = new MyHelperClass();
                method.getResource().refreshLocal(10, null);
                System.out.println("Serializing ...Done!");
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NONE;
	public MyHelperClass SEPARATOR;
	public MyHelperClass CFG_DIR;
public MyHelperClass getFile(int o0){ return null; }
	public MyHelperClass substring(MyHelperClass o0){ return null; }
	public MyHelperClass getResource(){ return null; }
	public MyHelperClass getShell(){ return null; }
	public MyHelperClass getJavaProject(){ return null; }
	public MyHelperClass getLocalFileSystem(){ return null; }
	public MyHelperClass openQuestion(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass getProject(){ return null; }
	public MyHelperClass getPage(){ return null; }
	public MyHelperClass lastIndexOf(MyHelperClass o0){ return null; }
	public MyHelperClass openEditorOnFileStore(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getStore(Path o0){ return null; }
	public MyHelperClass refreshLocal(int o0, Object o1){ return null; }
	public MyHelperClass getSite(){ return null; }}

class IFile {

public MyHelperClass create(InputStream o0, MyHelperClass o1, Object o2){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass delete(boolean o0, Object o1){ return null; }}

class Path {

Path(MyHelperClass o0){}
	Path(){}}

class PartInitException extends Exception{
	public PartInitException(String errorMessage) { super(errorMessage); }
}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}
