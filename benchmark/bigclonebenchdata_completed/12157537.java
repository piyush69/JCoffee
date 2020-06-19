import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12157537 {

    private IProject createCopyProject(IProject project, IWorkspace ws, IProgressMonitor pm) throws Throwable, CoreException {
        pm.beginTask("Creating temp project", 1);
        final String pName = "translation_" + project.getName() + "_" + new Date().toString().replace(" ", "_").replace(":", "_");
        final IProgressMonitor npm = new NullProgressMonitor();
        final IPath destination = new Path(pName);
        project.copy(destination, false, npm);
        MyHelperClass JavaCore = new MyHelperClass();
        final IJavaProject oldJavaproj = JavaCore.create(project);
        final IClasspathEntry[] classPath = oldJavaproj.getRawClasspath();
        MyHelperClass ResourcesPlugin = new MyHelperClass();
        final IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject("NewProjectName");
        final IProjectDescription desc = project.getDescription();
        MyHelperClass JavaCore = new MyHelperClass();
        desc.setNatureIds(new String[] { JavaCore.NATURE_ID });
        project.setDescription(desc, null);
        MyHelperClass JavaCore = new MyHelperClass();
        final IJavaProject javaproj = JavaCore.create(newProject);
        javaproj.setOutputLocation(project.getFullPath(), null);
        final List<IClasspathEntry> newClassPath = new ArrayList<IClasspathEntry>();
        for (final IClasspathEntry cEntry : newClassPath) {
            switch(cEntry.getContentKind()) {
                MyHelperClass IClasspathEntry = new MyHelperClass();
                case IClasspathEntry.CPE_SOURCE:
                    System.out.println("Source folder " + cEntry.getPath());
                    break;
                default:
                    newClassPath.add(cEntry);
            }
        }
        javaproj.setRawClasspath(classPath, pm);
        final IProject newP = ws.getRoot().getProject(pName);
        return newP;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IProject {

}

class IWorkspace {

}

class IProgressMonitor {

}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class NullProgressMonitor {

}

class IPath {

}

class Path {

}

class IJavaProject {

}

class IClasspathEntry {

}

class IProjectDescription {

}
