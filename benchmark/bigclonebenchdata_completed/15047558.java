
import java.io.UncheckedIOException;


class c15047558 {
public MyHelperClass INSTANCE;
	public MyHelperClass NATURE_ID;
	public MyHelperClass EclipseUtil;

    protected void ensureProjectExists(String projectName) {
        List classpathEntries =(List)(Object) new UniqueEList();
        MyHelperClass ResourcesPlugin = new MyHelperClass();
        IProject project =(IProject)(Object) ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
        try {
            boolean isEmptyProject = true;
            IProjectDescription projectDescription = null;
            MyHelperClass JavaCore = new MyHelperClass();
            IJavaProject javaProject =(IJavaProject)(Object) JavaCore.create(project);
            if (!(Boolean)(Object)project.exists()) {
//                MyHelperClass ResourcesPlugin = new MyHelperClass();
                projectDescription =(IProjectDescription)(Object) ResourcesPlugin.getWorkspace().newProjectDescription(projectName);
                project.create(new NullProgressMonitor());
            } else {
                isEmptyProject = false;
                projectDescription =(IProjectDescription)(Object) project.getDescription();
                MyHelperClass Arrays = new MyHelperClass();
                classpathEntries.addAll(Arrays.asList(javaProject.getRawClasspath()));
            }
            String[] natureIds =(String[])(Object) projectDescription.getNatureIds();
            if (natureIds == null) {
//                MyHelperClass JavaCore = new MyHelperClass();
                natureIds = new String[] {(String)(Object) JavaCore.NATURE_ID };
            } else {
                boolean hasJavaNature = false;
                boolean hasPDENature = false;
                for (int i = 0; i < natureIds.length; ++i) {
                    if (NATURE_ID.equals(natureIds[i])) {
                        hasJavaNature = true;
                    }
                    if ("org.eclipse.pde.PluginNature".equals(natureIds[i])) {
                        hasPDENature = true;
                    }
                }
                if (!hasJavaNature) {
                    String[] oldNatureIds = natureIds;
                    natureIds = new String[oldNatureIds.length + 1];
                    System.arraycopy(oldNatureIds, 0, natureIds, 0, oldNatureIds.length);
//                    MyHelperClass JavaCore = new MyHelperClass();
                    natureIds[oldNatureIds.length] =(String)(Object) JavaCore.NATURE_ID;
                }
                if (!hasPDENature) {
                    String[] oldNatureIds = natureIds;
                    natureIds = new String[oldNatureIds.length + 1];
                    System.arraycopy(oldNatureIds, 0, natureIds, 0, oldNatureIds.length);
                    natureIds[oldNatureIds.length] = "org.eclipse.pde.PluginNature";
                }
            }
            projectDescription.setNatureIds(natureIds);
            ICommand[] builders =(ICommand[])(Object) projectDescription.getBuildSpec();
            if (builders == null) {
                builders = new ICommand[0];
            }
            boolean hasManifestBuilder = false;
            boolean hasSchemaBuilder = false;
            for (int i = 0; i < builders.length; ++i) {
                if ("org.eclipse.pde.ManifestBuilder".equals(builders[i].getBuilderName())) {
                    hasManifestBuilder = true;
                }
                if ("org.eclipse.pde.SchemaBuilder".equals(builders[i].getBuilderName())) {
                    hasSchemaBuilder = true;
                }
            }
            if (!hasManifestBuilder) {
                ICommand[] oldBuilders = builders;
                builders = new ICommand[oldBuilders.length + 1];
                System.arraycopy(oldBuilders, 0, builders, 0, oldBuilders.length);
                builders[oldBuilders.length] =(ICommand)(Object) projectDescription.newCommand();
                builders[oldBuilders.length].setBuilderName("org.eclipse.pde.ManifestBuilder");
            }
            if (!hasSchemaBuilder) {
                ICommand[] oldBuilders = builders;
                builders = new ICommand[oldBuilders.length + 1];
                System.arraycopy(oldBuilders, 0, builders, 0, oldBuilders.length);
                builders[oldBuilders.length] =(ICommand)(Object) projectDescription.newCommand();
                builders[oldBuilders.length].setBuilderName("org.eclipse.pde.SchemaBuilder");
            }
            projectDescription.setBuildSpec(builders);
            project.open(new NullProgressMonitor());
            project.setDescription(projectDescription, new NullProgressMonitor());
            if (isEmptyProject) {
                IFolder sourceContainer =(IFolder)(Object) project.getFolder("src");
                sourceContainer.create(false, true, new NullProgressMonitor());
//                MyHelperClass JavaCore = new MyHelperClass();
                IClasspathEntry sourceClasspathEntry =(IClasspathEntry)(Object) JavaCore.newSourceEntry(new Path("/" + projectName + "/src"));
                classpathEntries.add(0, sourceClasspathEntry);
                MyHelperClass JavaRuntime = new MyHelperClass();
                String jreContainer =(String)(Object) JavaRuntime.JRE_CONTAINER;
                String complianceLevel =(String)(Object) EclipseUtil.getJavaComplianceLevel(project);
                if ("1.5".equals(complianceLevel)) {
                    jreContainer += "/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/J2SE-1.5";
                } else if ("1.6".equals(complianceLevel)) {
                    jreContainer += "/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.6";
                }
//                MyHelperClass JavaCore = new MyHelperClass();
                classpathEntries.add(JavaCore.newContainerEntry(new Path(jreContainer)));
//                MyHelperClass JavaCore = new MyHelperClass();
                classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));
                javaProject.setOutputLocation(new Path("/" + projectName + "/bin"), new NullProgressMonitor());
            }
            javaProject.setRawClasspath(classpathEntries.toArray(new IClasspathEntry[(int)(Object)classpathEntries.size()]), new NullProgressMonitor());
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            INSTANCE.log((CoreException)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JRE_CONTAINER;
	public MyHelperClass NATURE_ID;
public MyHelperClass log(CoreException o0){ return null; }
	public MyHelperClass getProject(String o0){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass newProjectDescription(String o0){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass create(IProject o0){ return null; }
	public MyHelperClass asList(MyHelperClass o0){ return null; }
	public MyHelperClass newContainerEntry(Path o0){ return null; }
	public MyHelperClass getJavaComplianceLevel(IProject o0){ return null; }
	public MyHelperClass newSourceEntry(Path o0){ return null; }}

class List {

public MyHelperClass size(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass addAll(MyHelperClass o0){ return null; }
	public MyHelperClass add(int o0, IClasspathEntry o1){ return null; }
	public MyHelperClass toArray(IClasspathEntry[] o0){ return null; }}

class IClasspathEntry {

}

class UniqueEList {

}

class IProject {

public MyHelperClass create(NullProgressMonitor o0){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getFolder(String o0){ return null; }
	public MyHelperClass open(NullProgressMonitor o0){ return null; }
	public MyHelperClass setDescription(IProjectDescription o0, NullProgressMonitor o1){ return null; }}

class IProjectDescription {

public MyHelperClass newCommand(){ return null; }
	public MyHelperClass getBuildSpec(){ return null; }
	public MyHelperClass setBuildSpec(ICommand[] o0){ return null; }
	public MyHelperClass getNatureIds(){ return null; }
	public MyHelperClass setNatureIds(String[] o0){ return null; }}

class IJavaProject {

public MyHelperClass getRawClasspath(){ return null; }
	public MyHelperClass setRawClasspath(MyHelperClass o0, NullProgressMonitor o1){ return null; }
	public MyHelperClass setOutputLocation(Path o0, NullProgressMonitor o1){ return null; }}

class NullProgressMonitor {

}

class ICommand {

public MyHelperClass getBuilderName(){ return null; }
	public MyHelperClass setBuilderName(String o0){ return null; }}

class IFolder {

public MyHelperClass create(boolean o0, boolean o1, NullProgressMonitor o2){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}
