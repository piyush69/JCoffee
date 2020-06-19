
import java.io.UncheckedIOException;


class c11980725 {
public MyHelperClass ModuloLauncherPlugin;
	public MyHelperClass fMainPage;
	public MyHelperClass ModuloClasspathContainer;
	public MyHelperClass JavaRuntime;

            public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                int remainingWorkUnits = 10;
                monitor.beginTask("New Modulo Project Creation", remainingWorkUnits);
                MyHelperClass ResourcesPlugin = new MyHelperClass();
                IWorkspace ws =(IWorkspace)(Object) ResourcesPlugin.getWorkspace();
                MyHelperClass newProject = new MyHelperClass();
                newProject = fMainPage.getProjectHandle();
//                MyHelperClass newProject = new MyHelperClass();
                IProjectDescription description =(IProjectDescription)(Object) ws.newProjectDescription(newProject.getName());
                MyHelperClass JavaCore = new MyHelperClass();
                String[] natures = {(String)(Object) JavaCore.NATURE_ID,(String)(Object) ModuloLauncherPlugin.NATURE_ID };
                description.setNatureIds(natures);
                ICommand command =(ICommand)(Object) description.newCommand();
//                MyHelperClass JavaCore = new MyHelperClass();
                command.setBuilderName(JavaCore.BUILDER_ID);
                ICommand[] commands = { command };
                description.setBuildSpec(commands);
//                MyHelperClass newProject = new MyHelperClass();
                IJavaProject jproject =(IJavaProject)(Object) JavaCore.create(newProject);
                ModuloProject modProj = new ModuloProject();
                modProj.setJavaProject(jproject);
                try {
//                    MyHelperClass newProject = new MyHelperClass();
                    newProject.create(description, new SubProgressMonitor(monitor, 1));
//                    MyHelperClass newProject = new MyHelperClass();
                    newProject.open(new SubProgressMonitor(monitor, 1));
//                    MyHelperClass newProject = new MyHelperClass();
                    IFolder srcFolder =(IFolder)(Object) newProject.getFolder("src");
                    IFolder javaFolder =(IFolder)(Object) srcFolder.getFolder("java");
//                    MyHelperClass newProject = new MyHelperClass();
                    IFolder buildFolder =(IFolder)(Object) newProject.getFolder("build");
                    IFolder classesFolder =(IFolder)(Object) buildFolder.getFolder("classes");
                    modProj.createFolder(srcFolder);
                    modProj.createFolder(javaFolder);
                    modProj.createFolder(buildFolder);
                    modProj.createFolder(classesFolder);
//                    MyHelperClass newProject = new MyHelperClass();
                    IPath buildPath =(IPath)(Object) newProject.getFolder("build/classes").getFullPath();
                    jproject.setOutputLocation(buildPath, new SubProgressMonitor(monitor, 1));
//                    MyHelperClass newProject = new MyHelperClass();
                    IClasspathEntry[] entries = new IClasspathEntry[] {(IClasspathEntry)(Object) JavaCore.newSourceEntry(newProject.getFolder("src/java").getFullPath()),(IClasspathEntry)(Object) JavaCore.newContainerEntry(new Path(JavaRuntime.JRE_CONTAINER)),(IClasspathEntry)(Object) JavaCore.newContainerEntry(new Path(ModuloClasspathContainer.CONTAINER_ID)) };
                    jproject.setRawClasspath(entries, new SubProgressMonitor(monitor, 1));
                    ModuleDefinition definition = new ModuleDefinition();
                    MyHelperClass fModuloPage = new MyHelperClass();
                    definition.setId(fModuloPage.getPackageName());
                    definition.setVersion(new VersionNumber(1, 0, 0));
//                    MyHelperClass fModuloPage = new MyHelperClass();
                    definition.setMetaName(fModuloPage.getModuleName());
//                    MyHelperClass fModuloPage = new MyHelperClass();
                    definition.setMetaDescription("The " + fModuloPage.getModuleName() + " Module.");
//                    MyHelperClass fModuloPage = new MyHelperClass();
                    definition.setModuleClassName(fModuloPage.getPackageName() + "." + fModuloPage.getModuleClassName());
//                    MyHelperClass fModuloPage = new MyHelperClass();
                    if ((boolean)(Object)fModuloPage.isConfigSelectioned()) definition.setConfigurationClassName(fModuloPage.getPackageName() + "." + fModuloPage.getConfigClassName());
//                    MyHelperClass fModuloPage = new MyHelperClass();
                    if ((boolean)(Object)fModuloPage.isStatSelectioned()) definition.setStatisticsClassName(fModuloPage.getPackageName() + "." + fModuloPage.getStatClassName());
                    modProj.setDefinition(definition);
                    modProj.createPackage();
                    modProj.createModuleXML();
                    modProj.createMainClass();
//                    MyHelperClass fModuloPage = new MyHelperClass();
                    if ((boolean)(Object)fModuloPage.isConfigSelectioned()) modProj.createConfigClass();
//                    MyHelperClass fModuloPage = new MyHelperClass();
                    if ((boolean)(Object)fModuloPage.isStatSelectioned()) modProj.createStatClass();
                    modProj.createModuleProperties();
                    modProj.createMessagesProperties();
//                    MyHelperClass newProject = new MyHelperClass();
                    IFolder binFolder =(IFolder)(Object) newProject.getFolder("bin");
                    binFolder.delete(true, new SubProgressMonitor(monitor, 1));
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                } finally {
                    monitor.done();
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BUILDER_ID;
	public MyHelperClass CONTAINER_ID;
	public MyHelperClass JRE_CONTAINER;
	public MyHelperClass NATURE_ID;
public MyHelperClass getModuleClassName(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getPackageName(){ return null; }
	public MyHelperClass isStatSelectioned(){ return null; }
	public MyHelperClass create(MyHelperClass o0){ return null; }
	public MyHelperClass getFolder(String o0){ return null; }
	public MyHelperClass newContainerEntry(Path o0){ return null; }
	public MyHelperClass isConfigSelectioned(){ return null; }
	public MyHelperClass getModuleName(){ return null; }
	public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass create(IProjectDescription o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass getStatClassName(){ return null; }
	public MyHelperClass getProjectHandle(){ return null; }
	public MyHelperClass open(SubProgressMonitor o0){ return null; }
	public MyHelperClass getConfigClassName(){ return null; }
	public MyHelperClass newSourceEntry(MyHelperClass o0){ return null; }}

class IProgressMonitor {

public MyHelperClass beginTask(String o0, int o1){ return null; }
	public MyHelperClass done(){ return null; }}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
}

class IWorkspace {

public MyHelperClass newProjectDescription(MyHelperClass o0){ return null; }}

class IProjectDescription {

public MyHelperClass setNatureIds(String[] o0){ return null; }
	public MyHelperClass newCommand(){ return null; }
	public MyHelperClass setBuildSpec(ICommand[] o0){ return null; }}

class ICommand {

public MyHelperClass setBuilderName(MyHelperClass o0){ return null; }}

class IJavaProject {

public MyHelperClass setOutputLocation(IPath o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass setRawClasspath(IClasspathEntry[] o0, SubProgressMonitor o1){ return null; }}

class ModuloProject {

public MyHelperClass createMessagesProperties(){ return null; }
	public MyHelperClass createFolder(IFolder o0){ return null; }
	public MyHelperClass createPackage(){ return null; }
	public MyHelperClass createConfigClass(){ return null; }
	public MyHelperClass setDefinition(ModuleDefinition o0){ return null; }
	public MyHelperClass setJavaProject(IJavaProject o0){ return null; }
	public MyHelperClass createStatClass(){ return null; }
	public MyHelperClass createModuleProperties(){ return null; }
	public MyHelperClass createMainClass(){ return null; }
	public MyHelperClass createModuleXML(){ return null; }}

class SubProgressMonitor {

SubProgressMonitor(IProgressMonitor o0, int o1){}
	SubProgressMonitor(){}}

class IFolder {

public MyHelperClass delete(boolean o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass getFolder(String o0){ return null; }}

class IPath {

}

class IClasspathEntry {

}

class ModuleDefinition {

public MyHelperClass setMetaName(MyHelperClass o0){ return null; }
	public MyHelperClass setId(MyHelperClass o0){ return null; }
	public MyHelperClass setModuleClassName(String o0){ return null; }
	public MyHelperClass setMetaDescription(String o0){ return null; }
	public MyHelperClass setVersion(VersionNumber o0){ return null; }
	public MyHelperClass setStatisticsClassName(String o0){ return null; }
	public MyHelperClass setConfigurationClassName(String o0){ return null; }}

class VersionNumber {

VersionNumber(){}
	VersionNumber(int o0, int o1, int o2){}}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class Path {

Path(MyHelperClass o0){}
	Path(){}}
