


class c12490148 {
public MyHelperClass writeTextFile(IProgressMonitor o0, StringBuilder o1, MyHelperClass o2){ return null; }
public MyHelperClass Path;
	public MyHelperClass exportableBundles;
	public MyHelperClass PLUGIN_NATURE_ID;
	public MyHelperClass MessageFormat;
	public MyHelperClass JavaCore;
	public MyHelperClass modelManager;
	public MyHelperClass workspaceRoot;
	public MyHelperClass readArchiveFile(String o0){ return null; }

    private void createIDocPluginProject(IProgressMonitor monitor, String sourceFileName, String pluginName, String pluginNameJCo) throws CoreException, IOException {
        MyHelperClass Messages = new MyHelperClass();
        monitor.subTask(MessageFormat.format((String)(Object)Messages.ProjectGenerator_CreatePluginTaskDescription, pluginName));
        final Map files =(Map)(Object) readArchiveFile(sourceFileName);
        monitor.worked(10);
        IProject project =(IProject)(Object) workspaceRoot.getProject(pluginName);
        if ((boolean)(Object)project.exists()) {
            project.delete(true, true, new SubProgressMonitor(monitor, 5));
        } else {
            monitor.worked(5);
        }
        project.create(new SubProgressMonitor(monitor, 5));
        project.open(new SubProgressMonitor(monitor, 5));
        IProjectDescription description =(IProjectDescription)(Object) project.getDescription();
        description.setNatureIds(new String[] {(String)(Object) JavaCore.NATURE_ID,(String)(Object) PLUGIN_NATURE_ID });
        project.setDescription(description, new SubProgressMonitor(monitor, 5));
        IJavaProject javaProject =(IJavaProject)(Object) JavaCore.create(project);
        IFolder binDir =(IFolder)(Object) project.getFolder("bin");
        IPath binPath =(IPath)(Object) binDir.getFullPath();
        javaProject.setOutputLocation(binPath, new SubProgressMonitor(monitor, 5));
        project.getFile("sapidoc3.jar").create(new ByteArrayInputStream(files.get("sapidoc3.jar")), true, new SubProgressMonitor(monitor, 15));
        IFolder metaInfFolder =(IFolder)(Object) project.getFolder("META-INF");
        metaInfFolder.create(true, true, new SubProgressMonitor(monitor, 5));
        StringBuilder manifest = new StringBuilder();
        manifest.append("Manifest-Version: 1.0\n");
        manifest.append("Bundle-ManifestVersion: 2\n");
        manifest.append("Bundle-Name: SAP IDoc Library v3\n");
        manifest.append(MessageFormat.format("Bundle-SymbolicName: {0}\n", pluginName));
        manifest.append("Bundle-Version: 7.11.0\n");
        manifest.append("Bundle-ClassPath: bin/,\n");
        manifest.append(" sapidoc3.jar\n");
        manifest.append("Bundle-Vendor: SAP AG, Walldorf (packaged using RCER)\n");
        manifest.append("Bundle-RequiredExecutionEnvironment: J2SE-1.5\n");
        manifest.append("Export-Package: com.sap.conn.idoc,\n");
        manifest.append(" com.sap.conn.idoc.jco,\n");
        manifest.append(" com.sap.conn.idoc.rt.cp,\n");
        manifest.append(" com.sap.conn.idoc.rt.record,\n");
        manifest.append(" com.sap.conn.idoc.rt.record.impl,\n");
        manifest.append(" com.sap.conn.idoc.rt.trace,\n");
        manifest.append(" com.sap.conn.idoc.rt.util,\n");
        manifest.append(" com.sap.conn.idoc.rt.xml\n");
        manifest.append("Bundle-ActivationPolicy: lazy\n");
        manifest.append(MessageFormat.format("Require-Bundle: {0}\n", pluginNameJCo));
        writeTextFile(monitor, manifest, metaInfFolder.getFile("MANIFEST.MF"));
        final IPath jcoPath =(IPath)(Object) new Path(MessageFormat.format("/{0}/sapidoc3.jar", pluginName));
        IClasspathEntry jcoEntry =(IClasspathEntry)(Object) JavaCore.newLibraryEntry(jcoPath, Path.EMPTY, Path.EMPTY, true);
        javaProject.setRawClasspath(new IClasspathEntry[] { jcoEntry }, new SubProgressMonitor(monitor, 5));
        StringBuilder buildProperties = new StringBuilder();
        buildProperties.append("bin.includes = META-INF/,\\\n");
        buildProperties.append("               sapidoc3.jar,\\\n");
        buildProperties.append("               .\n");
        writeTextFile(monitor, buildProperties, project.getFile("build.properties"));
        exportableBundles.add(modelManager.findModel(project));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EMPTY;
	public MyHelperClass NATURE_ID;
	public MyHelperClass ProjectGenerator_CreatePluginTaskDescription;
public MyHelperClass create(ByteArrayInputStream o0, boolean o1, SubProgressMonitor o2){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass format(String o0, String o1){ return null; }
	public MyHelperClass getProject(String o0){ return null; }
	public MyHelperClass create(IProject o0){ return null; }
	public MyHelperClass newLibraryEntry(IPath o0, MyHelperClass o1, MyHelperClass o2, boolean o3){ return null; }
	public MyHelperClass findModel(IProject o0){ return null; }}

class IProgressMonitor {

public MyHelperClass subTask(MyHelperClass o0){ return null; }
	public MyHelperClass worked(int o0){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Map {

public MyHelperClass get(String o0){ return null; }}

class IProject {

public MyHelperClass getFile(String o0){ return null; }
	public MyHelperClass create(SubProgressMonitor o0){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass delete(boolean o0, boolean o1, SubProgressMonitor o2){ return null; }
	public MyHelperClass open(SubProgressMonitor o0){ return null; }
	public MyHelperClass setDescription(IProjectDescription o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass getFolder(String o0){ return null; }}

class SubProgressMonitor {

SubProgressMonitor(IProgressMonitor o0, int o1){}
	SubProgressMonitor(){}}

class IProjectDescription {

public MyHelperClass setNatureIds(String[] o0){ return null; }}

class IJavaProject {

public MyHelperClass setOutputLocation(IPath o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass setRawClasspath(IClasspathEntry[] o0, SubProgressMonitor o1){ return null; }}

class IFolder {

public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass getFile(String o0){ return null; }
	public MyHelperClass create(boolean o0, boolean o1, SubProgressMonitor o2){ return null; }}

class IPath {

}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}

class Path {

Path(MyHelperClass o0){}
	Path(){}}

class IClasspathEntry {

}
