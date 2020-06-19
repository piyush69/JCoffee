
import java.io.UncheckedIOException;


class c20939940 {
public MyHelperClass JavaRuntime;
	public MyHelperClass fail(String o0){ return null; }

    private IProject createJavaProject() {
        MyHelperClass ResourcesPlugin = new MyHelperClass();
        IProject proj =(IProject)(Object) ResourcesPlugin.getWorkspace().getRoot().getProject("DefaultFolderPropertiesTest");
        if (!(Boolean)(Object)proj.exists()) {
            try {
                proj.create(null);
                proj.open(null);
                IProjectDescription desc =(IProjectDescription)(Object) proj.getDescription();
                MyHelperClass JavaCore = new MyHelperClass();
                desc.setNatureIds(new String[] {(String)(Object) JavaCore.NATURE_ID });
                proj.setDescription(desc, null);
//                MyHelperClass JavaCore = new MyHelperClass();
                IJavaProject javaProject =(IJavaProject)(Object) JavaCore.create(proj);
                javaProject.open(null);
                IFolder srcFolder1 =(IFolder)(Object) proj.getFolder(new Path("src"));
                srcFolder1.create(true, true, null);
                IFolder srcFolder2 =(IFolder)(Object) proj.getFolder(new Path("custom_src"));
                srcFolder2.create(true, true, null);
//                MyHelperClass JavaCore = new MyHelperClass();
                IClasspathEntry[] classpathEntries = new IClasspathEntry[] {(IClasspathEntry)(Object) JavaCore.newSourceEntry(srcFolder1.getFullPath()),(IClasspathEntry)(Object) JavaCore.newSourceEntry(srcFolder2.getFullPath()),(IClasspathEntry)(Object) JavaRuntime.getDefaultJREContainerEntry() };
                javaProject.setRawClasspath(classpathEntries, null);
                IFolder binFolder =(IFolder)(Object) proj.getFolder(new Path("bin"));
                if (!(Boolean)(Object)binFolder.exists()) {
                    binFolder.create(true, true, null);
                }
                javaProject.setOutputLocation(binFolder.getFullPath(), null);
                IFolder testFolder =(IFolder)(Object) proj.getFolder(new Path("test"));
                testFolder.create(true, true, null);
                IFolder resultFolder =(IFolder)(Object) proj.getFolder(new Path("result"));
                resultFolder.create(true, true, null);
            } catch (UncheckedIOException e) {
                fail(e.getMessage());
            }
        }
        return proj;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NATURE_ID;
public MyHelperClass getDefaultJREContainerEntry(){ return null; }
	public MyHelperClass getProject(String o0){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass create(IProject o0){ return null; }
	public MyHelperClass newSourceEntry(MyHelperClass o0){ return null; }}

class IProject {

public MyHelperClass create(Object o0){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass setDescription(IProjectDescription o0, Object o1){ return null; }
	public MyHelperClass open(Object o0){ return null; }
	public MyHelperClass getFolder(Path o0){ return null; }}

class IProjectDescription {

public MyHelperClass setNatureIds(String[] o0){ return null; }}

class IJavaProject {

public MyHelperClass setOutputLocation(MyHelperClass o0, Object o1){ return null; }
	public MyHelperClass setRawClasspath(IClasspathEntry[] o0, Object o1){ return null; }
	public MyHelperClass open(Object o0){ return null; }}

class IFolder {

public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass create(boolean o0, boolean o1, Object o2){ return null; }
	public MyHelperClass exists(){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class IClasspathEntry {

}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}
