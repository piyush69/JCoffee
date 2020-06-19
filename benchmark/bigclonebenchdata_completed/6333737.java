import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6333737 {
public static MyHelperClass EMF_EMPTY_PROJECT_STYLE;
	public MyHelperClass JRELIB_VARIABLE;
	public static MyHelperClass INSTANCE;
	public static MyHelperClass EclipseUtil;
public MyHelperClass EclipseUtil;
	public MyHelperClass EMF_EMPTY_PROJECT_STYLE;
	public MyHelperClass INSTANCE;

        public static IProject createEMFProject(IPath javaSource, URI projectLocationURI, List<IProject> referencedProjects, Monitor monitor, int style, List<?> pluginVariables)  throws Throwable {
            MyHelperClass BasicMonitor = new MyHelperClass();
            IProgressMonitor progressMonitor =(IProgressMonitor)(Object) BasicMonitor.toIProgressMonitor(monitor);
            String projectName =(String)(Object) javaSource.segment(0);
            IProject project = null;
            try {
                List<IClasspathEntry> classpathEntries =(List<IClasspathEntry>)(Object) new UniqueEList();
                progressMonitor.beginTask("", 10);
                progressMonitor.subTask(INSTANCE.getString("_UI_CreatingEMFProject_message", new Object[] { projectName, projectLocationURI != null ? projectLocationURI.toString() : projectName }));
                MyHelperClass ResourcesPlugin = new MyHelperClass();
                IWorkspace workspace =(IWorkspace)(Object) ResourcesPlugin.getWorkspace();
                project = workspace.getRoot().getProject(projectName);
                if (!(Boolean)(Object)project.exists()) {
                    URI location = projectLocationURI;
                    if (location == null) {
                        location = URI.createFileURI(workspace.getRoot().getLocation().append(projectName).toOSString());
                    }
                    location =(URI)(Object) location.appendSegment(".project");
                    File projectFile = new File(location.toString());
                    if (projectFile.exists()) {
                        projectFile.renameTo(new File(location.toString() + ".old"));
                    }
                }
                MyHelperClass JavaCore = new MyHelperClass();
                IJavaProject javaProject =(IJavaProject)(Object) JavaCore.create(project);
                IProjectDescription projectDescription = null;
                if (!(Boolean)(Object)project.exists()) {
//                    MyHelperClass ResourcesPlugin = new MyHelperClass();
                    projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription(projectName);
                    if (projectLocationURI != null) {
                        projectDescription.setLocationURI((URI)(Object)new java.net.URI(projectLocationURI.toString()));
                    }
                    project.create(projectDescription, new SubProgressMonitor(progressMonitor, 1));
                    project.open(new SubProgressMonitor(progressMonitor, 1));
                } else {
                    projectDescription =(IProjectDescription)(Object) project.getDescription();
                    project.open(new SubProgressMonitor(progressMonitor, 1));
//                    MyHelperClass JavaCore = new MyHelperClass();
                    if (project.hasNature((String)(Object)JavaCore.NATURE_ID)) {
                        classpathEntries.addAll((Collection<? extends IClasspathEntry>)(Object)Arrays.asList(javaProject.getRawClasspath()));
                    }
                }
                boolean isInitiallyEmpty = classpathEntries.isEmpty();
                {
                    MyHelperClass EMF_PLUGIN_PROJECT_STYLE = new MyHelperClass();
                    if (referencedProjects.size() != 0 && (style & (EMF_PLUGIN_PROJECT_STYLE | (int)(Object)EMF_EMPTY_PROJECT_STYLE)) == 0) {
                        projectDescription.setReferencedProjects(referencedProjects.toArray(new IProject[referencedProjects.size()]));
                        for (IProject referencedProject : referencedProjects) {
//                            MyHelperClass JavaCore = new MyHelperClass();
                            IClasspathEntry referencedProjectClasspathEntry = JavaCore.newProjectEntry(referencedProject.getFullPath());
                            classpathEntries.add(referencedProjectClasspathEntry);
                        }
                    }
                    String[] natureIds =(String[])(Object) projectDescription.getNatureIds();
                    if (natureIds == null) {
//                        MyHelperClass JavaCore = new MyHelperClass();
                        natureIds = new String[] {(String)(Object) JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature" };
                    } else {
//                        MyHelperClass JavaCore = new MyHelperClass();
                        if (!project.hasNature((String)(Object)JavaCore.NATURE_ID)) {
                            String[] oldNatureIds = natureIds;
                            natureIds = new String[oldNatureIds.length + 1];
                            System.arraycopy(oldNatureIds, 0, natureIds, 0, oldNatureIds.length);
//                            MyHelperClass JavaCore = new MyHelperClass();
                            natureIds[oldNatureIds.length] =(String)(Object) JavaCore.NATURE_ID;
                        }
                        if (!(Boolean)(Object)project.hasNature("org.eclipse.pde.PluginNature")) {
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
                    project.setDescription(projectDescription, new SubProgressMonitor(progressMonitor, 1));
                    IContainer sourceContainer =(IContainer)(Object) project;
                    if ((int)(Object)javaSource.segmentCount() > 1) {
                        IPath sourceContainerPath = javaSource.removeFirstSegments(1).makeAbsolute();
                        sourceContainer =(IContainer)(Object) project.getFolder(sourceContainerPath);
                        if (!(Boolean)(Object)sourceContainer.exists()) {
                            for (int i =(int)(Object) sourceContainerPath.segmentCount() - 1; i >= 0; i--) {
                                sourceContainer = project.getFolder((IPath)(Object)sourceContainerPath.removeLastSegments(i));
                                if (!(Boolean)(Object)sourceContainer.exists()) {
                                    ((IFolder)(IFolder)(Object) sourceContainer).create(false, true, new SubProgressMonitor(progressMonitor, 1));
                                }
                            }
                        }
//                        MyHelperClass JavaCore = new MyHelperClass();
                        IClasspathEntry sourceClasspathEntry =(IClasspathEntry)(Object) JavaCore.newSourceEntry(javaSource);
                        for (Iterator<IClasspathEntry> i = classpathEntries.iterator(); i.hasNext(); ) {
                            IClasspathEntry classpathEntry = i.next();
                            if (classpathEntry.getPath().isPrefixOf(javaSource)) {
                                i.remove();
                            }
                        }
                        classpathEntries.add(0, sourceClasspathEntry);
                    }
                    if (isInitiallyEmpty) {
                        MyHelperClass JavaRuntime = new MyHelperClass();
                        IClasspathEntry jreClasspathEntry = JavaCore.newVariableEntry(new Path((String)(Object)JavaRuntime.JRELIB_VARIABLE), new Path(JavaRuntime.JRESRC_VARIABLE), new Path(JavaRuntime.JRESRCROOT_VARIABLE));
                        for (Iterator<IClasspathEntry> i = classpathEntries.iterator(); i.hasNext(); ) {
                            IClasspathEntry classpathEntry = i.next();
                            if (classpathEntry.getPath().isPrefixOf(jreClasspathEntry.getPath())) {
                                i.remove();
                            }
                        }
//                        MyHelperClass JavaRuntime = new MyHelperClass();
                        String jreContainer =(String)(Object) JavaRuntime.JRE_CONTAINER;
                        String complianceLevel = EclipseUtil.getJavaComplianceLevel(project);
                        if ("1.5".equals(complianceLevel)) {
                            jreContainer += "/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/J2SE-1.5";
                        } else if ("1.6".equals(complianceLevel)) {
                            jreContainer += "/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.6";
                        }
//                        MyHelperClass JavaCore = new MyHelperClass();
                        classpathEntries.add(JavaCore.newContainerEntry(new Path(jreContainer)));
                    }
                    MyHelperClass EMF_EMPTY_PROJECT_STYLE = new MyHelperClass();
                    if ((style & (int)(Object)EMF_EMPTY_PROJECT_STYLE) == 0) {
//                        MyHelperClass EMF_PLUGIN_PROJECT_STYLE = new MyHelperClass();
                        if ((style & (int)(Object)EMF_PLUGIN_PROJECT_STYLE) != 0) {
//                            MyHelperClass JavaCore = new MyHelperClass();
                            classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));
                            for (Iterator<IClasspathEntry> i = classpathEntries.iterator(); i.hasNext(); ) {
                                IClasspathEntry classpathEntry = i.next();
                                MyHelperClass IClasspathEntry = new MyHelperClass();
                                if (classpathEntry.getEntryKind() == IClasspathEntry.CPE_VARIABLE && !JRELIB_VARIABLE.equals(classpathEntry.getPath().toString()) || classpathEntry.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
                                    i.remove();
                                }
                            }
                        } else {
                            EclipseUtil.addClasspathEntries(classpathEntries, "ECLIPSE_CORE_RUNTIME", "org.eclipse.core.runtime");
                            EclipseUtil.addClasspathEntries(classpathEntries, "ECLIPSE_CORE_RESOURCES", "org.eclipse.core.resources");
                            EclipseUtil.addClasspathEntries(classpathEntries, "EMF_COMMON", "org.eclipse.emf.common");
                            EclipseUtil.addClasspathEntries(classpathEntries, "EMF_ECORE", "org.eclipse.emf.ecore");
                            MyHelperClass EMF_XML_PROJECT_STYLE = new MyHelperClass();
                            if ((style & (int)(Object)EMF_XML_PROJECT_STYLE) != 0) {
                                EclipseUtil.addClasspathEntries(classpathEntries, "EMF_ECORE_XMI", "org.eclipse.emf.ecore.xmi");
                            }
                            MyHelperClass EMF_MODEL_PROJECT_STYLE = new MyHelperClass();
                            if ((style & (int)(Object)EMF_MODEL_PROJECT_STYLE) == 0) {
                                EclipseUtil.addClasspathEntries(classpathEntries, "EMF_EDIT", "org.eclipse.emf.edit");
                                MyHelperClass EMF_EDIT_PROJECT_STYLE = new MyHelperClass();
                                if ((style & (int)(Object)EMF_EDIT_PROJECT_STYLE) == 0) {
                                    EclipseUtil.addClasspathEntries(classpathEntries, "ECLIPSE_SWT", "org.eclipse.swt");
                                    EclipseUtil.addClasspathEntries(classpathEntries, "ECLIPSE_JFACE", "org.eclipse.jface");
                                    EclipseUtil.addClasspathEntries(classpathEntries, "ECLIPSE_UI_VIEWS", "org.eclipse.ui.views");
                                    EclipseUtil.addClasspathEntries(classpathEntries, "ECLIPSE_UI_EDITORS", "org.eclipse.ui.editors");
                                    EclipseUtil.addClasspathEntries(classpathEntries, "ECLIPSE_UI_IDE", "org.eclipse.ui.ide");
                                    EclipseUtil.addClasspathEntries(classpathEntries, "ECLIPSE_UI_WORKBENCH", "org.eclipse.ui.workbench");
                                    EclipseUtil.addClasspathEntries(classpathEntries, "EMF_COMMON_UI", "org.eclipse.emf.common.ui");
                                    EclipseUtil.addClasspathEntries(classpathEntries, "EMF_EDIT_UI", "org.eclipse.emf.edit.ui");
//                                    MyHelperClass EMF_XML_PROJECT_STYLE = new MyHelperClass();
                                    if ((style & (int)(Object)EMF_XML_PROJECT_STYLE) == 0) {
                                        EclipseUtil.addClasspathEntries(classpathEntries, "EMF_ECORE_XMI", "org.eclipse.emf.ecore.xmi");
                                    }
                                }
                            }
                            MyHelperClass EMF_TESTS_PROJECT_STYLE = new MyHelperClass();
                            if ((style & (int)(Object)EMF_TESTS_PROJECT_STYLE) != 0) {
                                EclipseUtil.addClasspathEntries(classpathEntries, "JUNIT", "org.junit");
                            }
                            if (pluginVariables != null) {
                                for (Iterator<?> i = pluginVariables.iterator(); i.hasNext(); ) {
                                    Object variable = i.next();
                                    if (variable instanceof IClasspathEntry) {
                                        classpathEntries.add((IClasspathEntry) variable);
                                    } else if (variable instanceof String) {
                                        String pluginVariable = (String) variable;
                                        String name;
                                        String id;
                                        int index = pluginVariable.indexOf("=");
                                        if (index == -1) {
                                            name = pluginVariable.replace('.', '_').toUpperCase();
                                            id = pluginVariable;
                                        } else {
                                            name = pluginVariable.substring(0, index);
                                            id = pluginVariable.substring(index + 1);
                                        }
                                        EclipseUtil.addClasspathEntries(classpathEntries, name, id);
                                    }
                                }
                            }
                        }
                    }
                    javaProject.setRawClasspath(classpathEntries.toArray(new IClasspathEntry[classpathEntries.size()]), new SubProgressMonitor(progressMonitor, 1));
                }
                if (isInitiallyEmpty) {
                    javaProject.setOutputLocation(new Path("/" + javaSource.segment(0) + "/bin"), new SubProgressMonitor(progressMonitor, 1));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
                INSTANCE.log(exception);
            } finally {
                progressMonitor.done();
            }
            return project;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JRESRCROOT_VARIABLE;
	public MyHelperClass JRELIB_VARIABLE;
	public MyHelperClass CPE_PROJECT;
	public MyHelperClass NATURE_ID;
	public MyHelperClass CPE_VARIABLE;
	public MyHelperClass JRE_CONTAINER;
	public MyHelperClass JRESRC_VARIABLE;
public MyHelperClass newProjectEntry(MyHelperClass o0){ return null; }
	public MyHelperClass newSourceEntry(IPath o0){ return null; }
	public MyHelperClass isPrefixOf(MyHelperClass o0){ return null; }
	public MyHelperClass newContainerEntry(Path o0){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass log(Exception o0){ return null; }
	public MyHelperClass isPrefixOf(IPath o0){ return null; }
	public MyHelperClass newProjectDescription(String o0){ return null; }
	public MyHelperClass getString(String o0, Object[] o1){ return null; }
	public MyHelperClass makeAbsolute(){ return null; }
	public MyHelperClass create(IProject o0){ return null; }
	public MyHelperClass getProject(String o0){ return null; }
	public MyHelperClass getLocation(){ return null; }
	public MyHelperClass getJavaComplianceLevel(IProject o0){ return null; }
	public MyHelperClass toIProgressMonitor(Monitor o0){ return null; }
	public MyHelperClass addClasspathEntries(List<IClasspathEntry o0, String o1, String o2){ return null; }}

class IPath {

public MyHelperClass removeLastSegments(int o0){ return null; }
	public MyHelperClass segment(int o0){ return null; }
	public MyHelperClass removeFirstSegments(int o0){ return null; }
	public MyHelperClass segmentCount(){ return null; }}

class IProject {

public MyHelperClass exists(){ return null; }
	public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass setDescription(IProjectDescription o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass hasNature(String o0){ return null; }
	public MyHelperClass create(IProjectDescription o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass open(SubProgressMonitor o0){ return null; }
	public MyHelperClass getFolder(IPath o0){ return null; }}

class Monitor {

}

class IProgressMonitor {

public MyHelperClass beginTask(String o0, int o1){ return null; }
	public MyHelperClass done(){ return null; }}

class IClasspathEntry {

public MyHelperClass getEntryKind(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class UniqueEList {

}

class IWorkspace {

public MyHelperClass getRoot(){ return null; }}

class URI {

public MyHelperClass appendSegment(String o0){ return null; }}

class IJavaProject {

public MyHelperClass setOutputLocation(Path o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass setRawClasspath(IClasspathEntry[] o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass getRawClasspath(){ return null; }}

class IProjectDescription {

public MyHelperClass setBuildSpec(ICommand[] o0){ return null; }
	public MyHelperClass getNatureIds(){ return null; }
	public MyHelperClass newCommand(){ return null; }
	public MyHelperClass getBuildSpec(){ return null; }
	public MyHelperClass setLocationURI(URI o0){ return null; }
	public MyHelperClass setNatureIds(String[] o0){ return null; }
	public MyHelperClass setReferencedProjects(IProject[] o0){ return null; }}

class SubProgressMonitor {

SubProgressMonitor(IProgressMonitor o0, int o1){}
	SubProgressMonitor(){}}

class ICommand {

public MyHelperClass setBuilderName(String o0){ return null; }
	public MyHelperClass getBuilderName(){ return null; }}

class IContainer {

public MyHelperClass exists(){ return null; }}

class IFolder {

public MyHelperClass create(boolean o0, boolean o1, SubProgressMonitor o2){ return null; }}

class Path {

Path(String o0){}
	Path(){}}
