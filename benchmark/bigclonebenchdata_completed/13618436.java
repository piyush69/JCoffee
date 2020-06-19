


class c13618436 {
public MyHelperClass INSTANCE;

//    @Override
    protected IProject createProject(String projectName, IProgressMonitor monitor) throws CoreException {
        monitor.beginTask(INSTANCE.getString("_UI_CreateJavaProject_message", new String[] { projectName }), 5);
        IProject project = this.createProject(projectName,(IProgressMonitor)(Object) new SubProgressMonitor(monitor, 1));
        if (project != null) {
            IProjectDescription description =(IProjectDescription)(Object) project.getDescription();
            MyHelperClass JavaCore = new MyHelperClass();
            if (!(Boolean)(Object)description.hasNature(JavaCore.NATURE_ID)) {
//                MyHelperClass JavaCore = new MyHelperClass();
                IJavaProject javaProject =(IJavaProject)(Object) JavaCore.create(project);
                if (javaProject != null) {
                    String[] natures =(String[])(Object) description.getNatureIds();
                    String[] javaNatures = new String[natures.length + 1];
                    System.arraycopy(natures, 0, javaNatures, 0, natures.length);
//                    MyHelperClass JavaCore = new MyHelperClass();
                    javaNatures[natures.length] =(String)(Object) JavaCore.NATURE_ID;
                    description.setNatureIds(javaNatures);
                    project.setDescription(description, new SubProgressMonitor(monitor, 1));
                    MyHelperClass SOURCE_FOLDER = new MyHelperClass();
                    IFolder sourceFolder =(IFolder)(Object) project.getFolder(SOURCE_FOLDER);
                    if (!(Boolean)(Object)sourceFolder.exists()) {
                        sourceFolder.create(true, true, new SubProgressMonitor(monitor, 1));
                    }
                    MyHelperClass OUTPUT_FOLDER = new MyHelperClass();
                    javaProject.setOutputLocation(project.getFolder(OUTPUT_FOLDER).getFullPath(), new SubProgressMonitor(monitor, 1));
//                    MyHelperClass JavaCore = new MyHelperClass();
                    IClasspathEntry[] entries = new IClasspathEntry[] {(IClasspathEntry)(Object) JavaCore.newSourceEntry(sourceFolder.getFullPath()),(IClasspathEntry)(Object) JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER")) };
                    javaProject.setRawClasspath(entries, new SubProgressMonitor(monitor, 1));
                }
            }
        }
        monitor.done();
        return project;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NATURE_ID;
public MyHelperClass getString(String o0, String[] o1){ return null; }
	public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass create(IProject o0){ return null; }
	public MyHelperClass newContainerEntry(Path o0){ return null; }
	public MyHelperClass newSourceEntry(MyHelperClass o0){ return null; }}

class IProgressMonitor {

public MyHelperClass beginTask(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass done(){ return null; }}

class IProject {

public MyHelperClass getFolder(MyHelperClass o0){ return null; }
	public MyHelperClass setDescription(IProjectDescription o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass getDescription(){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class SubProgressMonitor {

SubProgressMonitor(IProgressMonitor o0, int o1){}
	SubProgressMonitor(){}}

class IProjectDescription {

public MyHelperClass getNatureIds(){ return null; }
	public MyHelperClass setNatureIds(String[] o0){ return null; }
	public MyHelperClass hasNature(MyHelperClass o0){ return null; }}

class IJavaProject {

public MyHelperClass setOutputLocation(MyHelperClass o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass setRawClasspath(IClasspathEntry[] o0, SubProgressMonitor o1){ return null; }}

class IFolder {

public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass create(boolean o0, boolean o1, SubProgressMonitor o2){ return null; }
	public MyHelperClass exists(){ return null; }}

class IClasspathEntry {

}

class Path {

Path(String o0){}
	Path(){}}
