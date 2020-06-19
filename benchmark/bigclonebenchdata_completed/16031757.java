import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16031757 {
public MyHelperClass Platform;
	public MyHelperClass FileUtils;
	public MyHelperClass launchNewTestWizard(IFolder o0){ return null; }

    private void createProject(IProgressMonitor monitor, boolean launchNewTestWizard)  throws Throwable {
        try {
            MyHelperClass ResourcesPlugin = new MyHelperClass();
            IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
            MyHelperClass namePage = new MyHelperClass();
            IProject project = root.getProject(namePage.getProjectName());
//            MyHelperClass ResourcesPlugin = new MyHelperClass();
            IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(project.getName());
//            MyHelperClass namePage = new MyHelperClass();
            if (!Platform.getLocation().equals(namePage.getLocationPath())) description.setLocation(namePage.getLocationPath());
            MyHelperClass JavaCore = new MyHelperClass();
            description.setNatureIds(new String[] { JavaCore.NATURE_ID });
            ICommand buildCommand = description.newCommand();
//            MyHelperClass JavaCore = new MyHelperClass();
            buildCommand.setBuilderName(JavaCore.BUILDER_ID);
            description.setBuildSpec(new ICommand[] { buildCommand });
            project.create(description, monitor);
            project.open(monitor);
//            MyHelperClass JavaCore = new MyHelperClass();
            IJavaProject javaProject = JavaCore.create(project);
            IFolder testFolder = project.getFolder("tests");
            testFolder.create(false, true, monitor);
            IFolder srcFolder = project.getFolder("src");
            srcFolder.create(false, true, monitor);
            IFolder binFolder = project.getFolder("bin");
            binFolder.create(false, true, monitor);
            IFolder libFolder = project.getFolder("lib");
            libFolder.create(false, true, monitor);
            try {
                MyHelperClass CubicTestPlugin = new MyHelperClass();
                FileUtils.copyFile(new Path(Platform.asLocalURL(CubicTestPlugin.getDefault().find(new Path("lib/CubicTestElementAPI.jar"))).getPath()).toFile(), libFolder.getFile("CubicTestElementAPI.jar").getLocation().toFile());
//                MyHelperClass CubicTestPlugin = new MyHelperClass();
                FileUtils.copyFile(new Path(Platform.asLocalURL(CubicTestPlugin.getDefault().find(new Path("lib/CubicUnit.jar"))).getPath()).toFile(), libFolder.getFile("CubicUnit.jar").getLocation().toFile());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            javaProject.setOutputLocation(binFolder.getFullPath(), monitor);
            IClasspathEntry[] classpath;
//            MyHelperClass JavaCore = new MyHelperClass();
            classpath = new IClasspathEntry[] { JavaCore.newSourceEntry(srcFolder.getFullPath()), JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER")), JavaCore.newLibraryEntry(libFolder.getFile("CubicTestElementAPI.jar").getFullPath(), null, null), JavaCore.newLibraryEntry(libFolder.getFile("CubicUnit.jar").getFullPath(), null, null) };
            javaProject.setRawClasspath(classpath, binFolder.getFullPath(), monitor);
            ResourceNavigator navigator = null;
            MyHelperClass workbench = new MyHelperClass();
            IViewPart viewPart = workbench.getActiveWorkbenchWindow().getActivePage().getViewReferences()[0].getView(false);
            if ((ResourceNavigator)(Object)viewPart instanceof ResourceNavigator) {
                navigator = (ResourceNavigator)(ResourceNavigator)(Object) viewPart;
            }
            if (launchNewTestWizard) {
                launchNewTestWizard(testFolder);
                if (navigator != null && testFolder.members().length > 0) {
                    navigator.selectReveal(new StructuredSelection(testFolder.members()[0]));
                }
            }
            MyHelperClass IResource = new MyHelperClass();
            project.refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BUILDER_ID;
	public MyHelperClass NATURE_ID;
	public MyHelperClass DEPTH_INFINITE;
public MyHelperClass getProjectName(){ return null; }
	public MyHelperClass getLocationPath(){ return null; }
	public MyHelperClass getActiveWorkbenchWindow(){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass create(IProject o0){ return null; }}

class IProgressMonitor {

}

class IWorkspaceRoot {

}

class IProject {

public MyHelperClass create(IProjectDescription o0, IProgressMonitor o1){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getFolder(String o0){ return null; }
	public MyHelperClass open(IProgressMonitor o0){ return null; }}

class IProjectDescription {

public MyHelperClass setNatureIds(String[] o0){ return null; }
	public MyHelperClass newCommand(){ return null; }
	public MyHelperClass setBuildSpec(ICommand[] o0){ return null; }}

class ICommand {

}

class IJavaProject {

}

class IFolder {

public MyHelperClass members(){ return null; }
	public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass getFile(String o0){ return null; }
	public MyHelperClass create(boolean o0, boolean o1, IProgressMonitor o2){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class IClasspathEntry {

}

class ResourceNavigator {

}

class IViewPart {

}

class StructuredSelection {

}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}
