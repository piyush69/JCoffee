


class c23677151 {

	public static IProject CreateJavaProject(String name, IPath classpath) throws CoreException {
		// Create and Open New Project in Workspace
  MyHelperClass ResourcesPlugin = new MyHelperClass();
		IWorkspace workspace =(IWorkspace)(Object) ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root =(IWorkspaceRoot)(Object) workspace.getRoot();
		IProject project =(IProject)(Object) root.getProject(name);
		project.create(null);
		project.open(null);
		
		// Add Java Nature to new Project
		IProjectDescription desc =(IProjectDescription)(Object) project.getDescription();
  MyHelperClass JavaCore = new MyHelperClass();
		desc.setNatureIds(new String[] {(String)(Object) JavaCore.NATURE_ID});
		project.setDescription(desc, null);
		
		// Get Java Project Object
//  MyHelperClass JavaCore = new MyHelperClass();
		IJavaProject javaProj =(IJavaProject)(Object) JavaCore.create(project);
		
		// Set Output Folder
		IFolder binDir =(IFolder)(Object) project.getFolder("bin");
		IPath binPath =(IPath)(Object) binDir.getFullPath();
		javaProj.setOutputLocation(binPath, null);
		
		// Set Project's Classpath
//  MyHelperClass JavaCore = new MyHelperClass();
		IClasspathEntry cpe =(IClasspathEntry)(Object) JavaCore.newLibraryEntry(classpath, null, null);
		javaProj.setRawClasspath(new IClasspathEntry[] {cpe}, null);
		
		return project;
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NATURE_ID;
public MyHelperClass create(IProject o0){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass newLibraryEntry(IPath o0, Object o1, Object o2){ return null; }}

class IPath {

}

class IProject {

public MyHelperClass create(Object o0){ return null; }
	public MyHelperClass setDescription(IProjectDescription o0, Object o1){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getFolder(String o0){ return null; }
	public MyHelperClass open(Object o0){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class IWorkspace {

public MyHelperClass getRoot(){ return null; }}

class IWorkspaceRoot {

public MyHelperClass getProject(String o0){ return null; }}

class IProjectDescription {

public MyHelperClass setNatureIds(String[] o0){ return null; }}

class IJavaProject {

public MyHelperClass setOutputLocation(IPath o0, Object o1){ return null; }
	public MyHelperClass setRawClasspath(IClasspathEntry[] o0, Object o1){ return null; }}

class IFolder {

public MyHelperClass getFullPath(){ return null; }}

class IClasspathEntry {

}
