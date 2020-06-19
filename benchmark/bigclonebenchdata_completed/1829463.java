
import java.io.UncheckedIOException;


class c1829463 {

    public boolean createProject(String projectName, String export) {
        IProgressMonitor progressMonitor =(IProgressMonitor)(Object) new NullProgressMonitor();
        MyHelperClass ResourcesPlugin = new MyHelperClass();
        IWorkspaceRoot root =(IWorkspaceRoot)(Object) ResourcesPlugin.getWorkspace().getRoot();
        IProject project =(IProject)(Object) root.getProject(projectName);
        try {
            if (!(Boolean)(Object)project.exists()) {
                project.create(progressMonitor);
            }
            project.open(progressMonitor);
            IProjectDescription description =(IProjectDescription)(Object) project.getDescription();
            MyHelperClass JavaCore = new MyHelperClass();
            description.setNatureIds(new String[] {(String)(Object) JavaCore.NATURE_ID });
            project.setDescription(description, progressMonitor);
//            MyHelperClass JavaCore = new MyHelperClass();
            IJavaProject javaProject =(IJavaProject)(Object) JavaCore.create(project);
            IFolder binFolder =(IFolder)(Object) project.getFolder("bin");
            IFolder outputFolder =(IFolder)(Object) project.getFolder(export);
            if (!(Boolean)(Object)binFolder.exists()) {
                binFolder.create(false, true, null);
            }
            javaProject.setOutputLocation(outputFolder.getFullPath(), progressMonitor);
            List entries =(List)(Object) new ArrayList();
            MyHelperClass JavaRuntime = new MyHelperClass();
            IVMInstall vmInstall =(IVMInstall)(Object) JavaRuntime.getDefaultVMInstall();
//            MyHelperClass JavaRuntime = new MyHelperClass();
            LibraryLocation[] locations =(LibraryLocation[])(Object) JavaRuntime.getLibraryLocations(vmInstall);
            for (LibraryLocation element : locations) {
//                MyHelperClass JavaCore = new MyHelperClass();
                entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
            }
            javaProject.setRawClasspath((IClasspathEntry[])(Object)entries.toArray(new IClasspathEntry[(int)(Object)entries.size()]), null);
            IFolder sourceFolder =(IFolder)(Object) project.getFolder("src");
            if (!(Boolean)(Object)sourceFolder.exists()) {
                sourceFolder.create(false, true, null);
            }
            IPackageFragmentRoot rootfolder =(IPackageFragmentRoot)(Object) javaProject.getPackageFragmentRoot(sourceFolder);
            IClasspathEntry[] oldEntries =(IClasspathEntry[])(Object) javaProject.getRawClasspath();
            IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
            System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
//            MyHelperClass JavaCore = new MyHelperClass();
            newEntries[oldEntries.length] =(IClasspathEntry)(Object) JavaCore.newSourceEntry(rootfolder.getPath());
            javaProject.setRawClasspath(newEntries, null);
            IPackageFragment pack;
            if (rootfolder.getPackageFragment("") == null) {
                pack =(IPackageFragment)(Object) rootfolder.createPackageFragment("", true, progressMonitor);
            } else {
                pack =(IPackageFragment)(Object) rootfolder.getPackageFragment("");
            }
            StringBuffer buffer = new StringBuffer();
            buffer.append("\n");
            MyHelperClass source = new MyHelperClass();
            buffer.append(source);
            ICompilationUnit cu =(ICompilationUnit)(Object) pack.createCompilationUnit("ProcessingApplet.java", buffer.toString(), false, null);
            return true;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NATURE_ID;
public MyHelperClass getLibraryLocations(IVMInstall o0){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass create(IProject o0){ return null; }
	public MyHelperClass getDefaultVMInstall(){ return null; }
	public MyHelperClass newLibraryEntry(MyHelperClass o0, Object o1, Object o2){ return null; }
	public MyHelperClass newSourceEntry(MyHelperClass o0){ return null; }}

class IProgressMonitor {

}

class NullProgressMonitor {

}

class IWorkspaceRoot {

public MyHelperClass getProject(String o0){ return null; }}

class IProject {

public MyHelperClass create(IProgressMonitor o0){ return null; }
	public MyHelperClass open(IProgressMonitor o0){ return null; }
	public MyHelperClass setDescription(IProjectDescription o0, IProgressMonitor o1){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getFolder(String o0){ return null; }}

class IProjectDescription {

public MyHelperClass setNatureIds(String[] o0){ return null; }}

class IJavaProject {

public MyHelperClass getRawClasspath(){ return null; }
	public MyHelperClass getPackageFragmentRoot(IFolder o0){ return null; }
	public MyHelperClass setOutputLocation(MyHelperClass o0, IProgressMonitor o1){ return null; }
	public MyHelperClass setRawClasspath(IClasspathEntry[] o0, Object o1){ return null; }}

class IFolder {

public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass create(boolean o0, boolean o1, Object o2){ return null; }
	public MyHelperClass exists(){ return null; }}

class List {

public MyHelperClass toArray(IClasspathEntry[] o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class IClasspathEntry {

}

class ArrayList {

}

class IVMInstall {

}

class LibraryLocation {

public MyHelperClass getSystemLibraryPath(){ return null; }}

class IPackageFragmentRoot {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass createPackageFragment(String o0, boolean o1, IProgressMonitor o2){ return null; }
	public MyHelperClass getPackageFragment(String o0){ return null; }}

class IPackageFragment {

public MyHelperClass createCompilationUnit(String o0, String o1, boolean o2, Object o3){ return null; }}

class ICompilationUnit {

}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}
