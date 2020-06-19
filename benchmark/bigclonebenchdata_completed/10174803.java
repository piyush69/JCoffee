import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10174803 {

//    @SuppressWarnings({ "serial", "unchecked" })
    private static IProject createCopyProject(IProject project, String pName, IWorkspace ws, IProgressMonitor pm) throws Throwable, Exception {
        pm.beginTask("Creating temp project", 1);
        final IPath destination = new Path(pName);
        MyHelperClass JavaCore = new MyHelperClass();
        final IJavaProject oldJavaproj = JavaCore.create(project);
        final IClasspathEntry[] classPath = oldJavaproj.getRawClasspath();
        MyHelperClass ResourcesPlugin = new MyHelperClass();
        final IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(pName);
        newProject.create(null);
        newProject.open(null);
        final IProjectDescription desc = newProject.getDescription();
        MyHelperClass JavaCore = new MyHelperClass();
        desc.setNatureIds(new String[] { JavaCore.NATURE_ID });
        newProject.setDescription(desc, null);
        final List<IClasspathEntry> newClassPath = new ArrayList<IClasspathEntry>();
        for (final IClasspathEntry cEntry : classPath) {
            switch(cEntry.getEntryKind()) {
                MyHelperClass IClasspathEntry = new MyHelperClass();
                case IClasspathEntry.CPE_SOURCE:
                    System.out.println("Source folder " + cEntry.getPath());
                    newClassPath.add(copySourceFolder(project, newProject, cEntry, destination));
                    break;
                MyHelperClass IClasspathEntry = new MyHelperClass();
                case IClasspathEntry.CPE_LIBRARY:
                    System.out.println("library folder " + cEntry.getPath());
                    newClassPath.add(cEntry);
                    break;
                MyHelperClass IClasspathEntry = new MyHelperClass();
                case IClasspathEntry.CPE_PROJECT:
                    System.out.println("project folder " + cEntry.getPath());
                    newClassPath.add(cEntry);
                    break;
                MyHelperClass IClasspathEntry = new MyHelperClass();
                case IClasspathEntry.CPE_VARIABLE:
                    System.out.println("variable folder " + cEntry.getPath());
                    newClassPath.add(cEntry);
                    break;
                default:
                    System.out.println("container folder " + cEntry.getPath());
                    newClassPath.add(cEntry);
            }
        }
        copyDir(project.getLocation().toString(), "/translator", newProject.getLocation().toString(), "", new ArrayList<String>() {

            {
                add("generated");
                add("classes");
                add(".svn");
            }
        });
        MyHelperClass IResource = new MyHelperClass();
        newProject.refreshLocal(IResource.DEPTH_INFINITE, pm);
        MyHelperClass IncrementalProjectBuilder = new MyHelperClass();
        newProject.build(IncrementalProjectBuilder.AUTO_BUILD, pm);
        newProject.touch(pm);
        MyHelperClass JavaCore = new MyHelperClass();
        final IJavaProject javaproj = JavaCore.create(newProject);
        javaproj.setOutputLocation(new Path("/" + newProject.getName() + "/classes/bin"), null);
        javaproj.setRawClasspath(newClassPath.toArray(new IClasspathEntry[newClassPath.size()]), pm);
        final Map opts = oldJavaproj.getOptions(true);
        javaproj.setOptions(opts);
        javaproj.makeConsistent(pm);
        javaproj.save(pm, true);
        return newProject;
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
