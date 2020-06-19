


class c5891092 {

    public static IProject createSimplemodelEnabledJavaProject() throws CoreException {
        MyHelperClass ResourcesPlugin = new MyHelperClass();
        IWorkspaceDescription desc =(IWorkspaceDescription)(Object) ResourcesPlugin.getWorkspace().getDescription();
        desc.setAutoBuilding(false);
//        MyHelperClass ResourcesPlugin = new MyHelperClass();
        ResourcesPlugin.getWorkspace().setDescription(desc);
        String name = "TestProject";
        for (int i = 0; i < 1000; i++) {
//            MyHelperClass ResourcesPlugin = new MyHelperClass();
            IProject project =(IProject)(Object) ResourcesPlugin.getWorkspace().getRoot().getProject(name + i);
            if ((boolean)(Object)project.exists()) continue;
            project.create(null);
            project.open(null);
            IProjectDescription description =(IProjectDescription)(Object) project.getDescription();
            String[] natures =(String[])(Object) description.getNatureIds();
            String[] newNatures = new String[natures.length + 2];
            System.arraycopy(natures, 0, newNatures, 0, natures.length);
            MyHelperClass JavaCore = new MyHelperClass();
            newNatures[natures.length] =(String)(Object) JavaCore.NATURE_ID;
            MyHelperClass SimplemodelNature = new MyHelperClass();
            newNatures[natures.length + 1] =(String)(Object) SimplemodelNature.NATURE_ID;
            description.setNatureIds(newNatures);
            project.setDescription(description, null);
//            MyHelperClass JavaCore = new MyHelperClass();
            IJavaProject javaProject =(IJavaProject)(Object) JavaCore.create(project);
            Set entries =(Set)(Object) new HashSet();
            MyHelperClass JavaRuntime = new MyHelperClass();
            IVMInstall vmInstall =(IVMInstall)(Object) JavaRuntime.getDefaultVMInstall();
//            MyHelperClass JavaRuntime = new MyHelperClass();
            Path containerPath = new Path((String)(Object)JavaRuntime.JRE_CONTAINER);
            IPath vmPath =(IPath)(Object) containerPath.append(vmInstall.getVMInstallType().getId()).append((Path)(Object)vmInstall.getName());
//            MyHelperClass JavaCore = new MyHelperClass();
            entries.add(JavaCore.newContainerEntry(vmPath));
//            MyHelperClass JavaRuntime = new MyHelperClass();
            LibraryLocation[] locations =(LibraryLocation[])(Object) JavaRuntime.getLibraryLocations(vmInstall);
            for (LibraryLocation element : locations) {
//                MyHelperClass JavaCore = new MyHelperClass();
                entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
            }
            final Path srcPath = new Path("src");
            final IFolder src =(IFolder)(Object) project.getFolder(srcPath);
            final Path binPath = new Path("bin");
            final IFolder bin =(IFolder)(Object) project.getFolder(binPath);
            src.create(true, true, null);
            bin.create(true, true, null);
//            MyHelperClass JavaCore = new MyHelperClass();
            entries.add(JavaCore.newSourceEntry(project.getFullPath().append(srcPath)));
            javaProject.setOutputLocation(project.getFullPath().append(binPath), null);
            javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[(int)(Object)entries.size()]), null);
            return project;
        }
        throw new RuntimeException("Failed");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JRE_CONTAINER;
	public MyHelperClass NATURE_ID;
public MyHelperClass setDescription(IWorkspaceDescription o0){ return null; }
	public MyHelperClass newLibraryEntry(MyHelperClass o0, Object o1, Object o2){ return null; }
	public MyHelperClass getProject(String o0){ return null; }
	public MyHelperClass getLibraryLocations(IVMInstall o0){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass create(IProject o0){ return null; }
	public MyHelperClass getDefaultVMInstall(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass newContainerEntry(IPath o0){ return null; }
	public MyHelperClass append(Path o0){ return null; }
	public MyHelperClass newSourceEntry(MyHelperClass o0){ return null; }}

class IProject {

public MyHelperClass create(Object o0){ return null; }
	public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass setDescription(IProjectDescription o0, Object o1){ return null; }
	public MyHelperClass open(Object o0){ return null; }
	public MyHelperClass getFolder(Path o0){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class IWorkspaceDescription {

public MyHelperClass setAutoBuilding(boolean o0){ return null; }}

class IProjectDescription {

public MyHelperClass getNatureIds(){ return null; }
	public MyHelperClass setNatureIds(String[] o0){ return null; }}

class IJavaProject {

public MyHelperClass setOutputLocation(MyHelperClass o0, Object o1){ return null; }
	public MyHelperClass setRawClasspath(MyHelperClass o0, Object o1){ return null; }}

class Set {

public MyHelperClass toArray(IClasspathEntry[] o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class IClasspathEntry {

}

class HashSet {

}

class IVMInstall {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getVMInstallType(){ return null; }}

class Path {

Path(String o0){}
	Path(){}
	public MyHelperClass append(MyHelperClass o0){ return null; }}

class IPath {

}

class LibraryLocation {

public MyHelperClass getSystemLibraryPath(){ return null; }}

class IFolder {

public MyHelperClass create(boolean o0, boolean o1, Object o2){ return null; }}
