import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1658193 {
public MyHelperClass createProjectDir(MyHelperClass o0){ return null; }
public MyHelperClass Dirs;
public MyHelperClass activatorClass;
	public MyHelperClass Activator;
	public MyHelperClass JavaCore;
	public MyHelperClass javaProject;
	public MyHelperClass IResource;
	public MyHelperClass ResourcesPlugin;
	public MyHelperClass prj;
	public MyHelperClass getProjectClassPath(){ return null; }

    public void ForkJavaProject(String projectName, Class<?> activatorClass) {
        this.activatorClass =(MyHelperClass)(Object) activatorClass;
        try {
            IWorkspaceRoot rootWorkspace =(IWorkspaceRoot)(Object) ResourcesPlugin.getWorkspace().getRoot();
            this.prj = rootWorkspace.getProject(projectName);
            if ((boolean)(Object)this.prj.exists()) {
                this.prj.delete(true, true, new NullProgressMonitor());
            }
            this.prj.create(new NullProgressMonitor());
            this.prj.open(new NullProgressMonitor());
            IProjectDescription description =(IProjectDescription)(Object) this.prj.getDescription();
            description.setNatureIds(new String[] { "org.eclipse.jdt.core.javanature" });
            this.prj.setDescription(description, new NullProgressMonitor());
            createProjectDir(Dirs.DIR_MAIN_JAVA);
            createProjectDir(Dirs.DIR_CONFIG);
            createProjectDir(Dirs.DIR_MAIN_RESOURCES);
            createProjectDir(Dirs.DIR_MODELS);
            createProjectDir(Dirs.DIR_TESTS_JAVA);
            createProjectDir(Dirs.DIR_TESTS_RESOURCES);
            createProjectDir(Dirs.DIR_CLASSES);
            createProjectDir(Dirs.DIR_LIB);
            this.prj.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
            this.javaProject = JavaCore.create(this.prj);
            if ((boolean)(Object)this.javaProject.exists() && !(Boolean)(Object)this.javaProject.isOpen()) {
                this.javaProject.open(new NullProgressMonitor());
            }
            File javaHome = new File(System.getProperty("java.home"));
            IPath jreLibPath = (IPath)(Object)new Path(javaHome.getPath()).append("lib").append("rt.jar");
            this.javaProject.setOutputLocation(prj.getFolder(Dirs.DIR_CLASSES).getFullPath(), new NullProgressMonitor());
            JavaCore.setClasspathVariable("JRE_LIB", jreLibPath, new NullProgressMonitor());
            this.javaProject.setRawClasspath(getProjectClassPath(), new NullProgressMonitor());
        } catch (UncheckedIOException e) {
            Activator.getDefault().logError("An exception has been thrown while creating Project",(CoreException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DIR_MODELS;
	public MyHelperClass DIR_LIB;
	public MyHelperClass DIR_CLASSES;
	public MyHelperClass DIR_TESTS_RESOURCES;
	public MyHelperClass DEPTH_INFINITE;
	public MyHelperClass DIR_TESTS_JAVA;
	public MyHelperClass DIR_MAIN_RESOURCES;
	public MyHelperClass DIR_MAIN_JAVA;
	public MyHelperClass DIR_CONFIG;
public MyHelperClass create(MyHelperClass o0){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass logError(String o0, CoreException o1){ return null; }
	public MyHelperClass delete(boolean o0, boolean o1, NullProgressMonitor o2){ return null; }
	public MyHelperClass getFolder(MyHelperClass o0){ return null; }
	public MyHelperClass setClasspathVariable(String o0, IPath o1, NullProgressMonitor o2){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass setRawClasspath(MyHelperClass o0, NullProgressMonitor o1){ return null; }
	public MyHelperClass refreshLocal(MyHelperClass o0, NullProgressMonitor o1){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass open(NullProgressMonitor o0){ return null; }
	public MyHelperClass setOutputLocation(MyHelperClass o0, NullProgressMonitor o1){ return null; }
	public MyHelperClass isOpen(){ return null; }
	public MyHelperClass setDescription(IProjectDescription o0, NullProgressMonitor o1){ return null; }
	public MyHelperClass create(NullProgressMonitor o0){ return null; }
	public MyHelperClass exists(){ return null; }}

class IWorkspaceRoot {

public MyHelperClass getProject(String o0){ return null; }}

class NullProgressMonitor {

}

class IProjectDescription {

public MyHelperClass setNatureIds(String[] o0){ return null; }}

class IPath {

}

class Path {

Path(String o0){}
	Path(){}
	public MyHelperClass append(String o0){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}
