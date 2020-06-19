import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6644748 {
public static MyHelperClass EclipseUtil;
//public MyHelperClass EclipseUtil;
	public static MyHelperClass Platform;
public static MyHelperClass IResource;
//	public MyHelperClass Platform;
//public MyHelperClass IResource;
	public static MyHelperClass JavaCore;
//public MyHelperClass JavaCore;

        public static void initialize(Monitor monitor, final JETEmitter jetEmitter) throws Throwable, JETException {
            MyHelperClass BasicMonitor = new MyHelperClass();
            IProgressMonitor progressMonitor =(IProgressMonitor)(Object) BasicMonitor.toIProgressMonitor(monitor);
            progressMonitor.beginTask("", 10);
            MyHelperClass CodeGenPlugin = new MyHelperClass();
            progressMonitor.subTask((String)(Object)CodeGenPlugin.getPlugin().getString("_UI_GeneratingJETEmitterFor_message", new Object[] { jetEmitter.templateURI }));
            MyHelperClass ResourcesPlugin = new MyHelperClass();
            final IWorkspace workspace =(IWorkspace)(Object) ResourcesPlugin.getWorkspace();
//            MyHelperClass ResourcesPlugin = new MyHelperClass();
            IJavaModel javaModel =(IJavaModel)(Object) JavaCore.create((IProject)(Object)ResourcesPlugin.getWorkspace().getRoot());
            try {
                final JETCompiler jetCompiler = jetEmitter.templateURIPath == null ? new MyBaseJETCompiler(jetEmitter.templateURI, jetEmitter.encoding, jetEmitter.classLoader) : new MyBaseJETCompiler((MyHelperClass)(Object)jetEmitter.templateURIPath, jetEmitter.templateURI, jetEmitter.encoding, jetEmitter.classLoader);
//                MyHelperClass CodeGenPlugin = new MyHelperClass();
                progressMonitor.subTask((String)(Object)CodeGenPlugin.getPlugin().getString("_UI_JETParsing_message", new Object[] { jetCompiler.getResolvedTemplateURI() }));
                jetCompiler.parse();
                progressMonitor.worked(1);
                String packageName =(String)(Object) jetCompiler.getSkeleton().getPackageName();
                if (jetEmitter.templateURIPath != null) {
                    URI templateURI =(URI)(Object) URI.createURI(jetEmitter.templateURIPath[0]);
                    URLClassLoader theClassLoader = null;
                    if ((boolean)(Object)templateURI.isPlatformResource()) {
                        IProject project =(IProject)(Object) workspace.getRoot().getProject(templateURI.segment(1));
                        MyHelperClass JETNature = new MyHelperClass();
                        if (JETNature.getRuntime(project) != null) {
                            List<URL> urls = new ArrayList<URL>();
                            MyHelperClass JavaCore = new MyHelperClass();
                            IJavaProject javaProject =(IJavaProject)(Object) JavaCore.create(project);
                            urls.add(new File(project.getLocation() + "/" + javaProject.getOutputLocation().removeFirstSegments(1) + "/").toURL());
                            for (IClasspathEntry classpathEntry :(IClasspathEntry[])(Object) (Object[])(Object)javaProject.getResolvedClasspath(true)) {
                                MyHelperClass IClasspathEntry = new MyHelperClass();
                                if (classpathEntry.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
                                    IPath projectPath =(IPath)(Object) classpathEntry.getPath();
                                    IProject otherProject =(IProject)(Object) workspace.getRoot().getProject(projectPath.segment(0));
//                                    MyHelperClass JavaCore = new MyHelperClass();
                                    IJavaProject otherJavaProject =(IJavaProject)(Object) JavaCore.create(otherProject);
                                    urls.add(new File(otherProject.getLocation() + "/" + otherJavaProject.getOutputLocation().removeFirstSegments(1) + "/").toURL());
                                }
                            }
                            theClassLoader = new URLClassLoader(urls.toArray(new URL[0])) {

//                                @Override
                                public Class<?> loadClass(String className) throws ClassNotFoundException {
                                    try {
                                        return super.loadClass(className);
                                    } catch (ClassNotFoundException classNotFoundException) {
                                        return(Class<?>)(Object) jetEmitter.classLoader.loadClass(className);
                                    }
                                }
                            };
                        }
                    } else if ((boolean)(Object)templateURI.isPlatformPlugin()) {
                        MyHelperClass Platform = new MyHelperClass();
                        final Bundle bundle =(Bundle)(Object) Platform.getBundle(templateURI.segment(1));
                        if (bundle != null) {
                            theClassLoader = new URLClassLoader(new URL[0],(ClassLoader)(Object) jetEmitter.classLoader) {

//                                @Override
                                public Class<?> loadClass(String className) throws ClassNotFoundException {
                                    try {
                                        return(Class<?>)(Object) bundle.loadClass(className);
                                    } catch (ClassNotFoundException classNotFoundException) {
                                        return super.loadClass(className);
                                    }
                                }
                            };
                        }
                    }
                    if (theClassLoader != null) {
                        String className = (packageName.length() == 0 ? "" : packageName + ".") + jetCompiler.getSkeleton().getClassName();
                        if (className.endsWith("_")) {
                            className = className.substring(0, className.length() - 1);
                        }
                        try {
                            Class<?> theClass = theClassLoader.loadClass(className);
                            Class<?> theOtherClass = null;
                            try {
                                theOtherClass =(Class<?>)(Object) jetEmitter.classLoader.loadClass(className);
                            } catch (ClassNotFoundException exception) {
                            }
                            if (theClass != theOtherClass) {
                                String methodName =(String)(Object) jetCompiler.getSkeleton().getMethodName();
                                Method[] methods =(Method[])(Object) theClass.getDeclaredMethods();
                                for (int i = 0; i < methods.length; ++i) {
                                    if (methods[i].getName().equals(methodName)) {
                                        jetEmitter.setMethod(methods[i]);
                                        break;
                                    }
                                }
                                return;
                            }
                        } catch (ClassNotFoundException exception) {
                        }
                    }
                }
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                jetCompiler.generate(outputStream);
                final InputStream contents = new ByteArrayInputStream(outputStream.toByteArray());
                if (!(Boolean)(Object)javaModel.isOpen()) {
                    javaModel.open(new SubProgressMonitor(progressMonitor, 1));
                } else {
                    progressMonitor.worked(1);
                }
                final IProject project =(IProject)(Object) workspace.getRoot().getProject(jetEmitter.getProjectName());
//                MyHelperClass CodeGenPlugin = new MyHelperClass();
                progressMonitor.subTask((String)(Object)CodeGenPlugin.getPlugin().getString("_UI_JETPreparingProject_message", new Object[] { project.getName() }));
                IJavaProject javaProject;
                if (!(Boolean)(Object)project.exists()) {
                    progressMonitor.subTask("JET creating project " + project.getName());
                    project.create(new SubProgressMonitor(progressMonitor, 1));
//                    MyHelperClass CodeGenPlugin = new MyHelperClass();
                    progressMonitor.subTask((String)(Object)CodeGenPlugin.getPlugin().getString("_UI_JETCreatingProject_message", new Object[] { project.getName() }));
                    IProjectDescription description =(IProjectDescription)(Object) workspace.newProjectDescription(project.getName());
                    MyHelperClass JavaCore = new MyHelperClass();
                    description.setNatureIds(new String[] {(String)(Object) JavaCore.NATURE_ID });
                    description.setLocation(null);
                    project.open(new SubProgressMonitor(progressMonitor, 1));
                    project.setDescription(description, new SubProgressMonitor(progressMonitor, 1));
//                    MyHelperClass JavaCore = new MyHelperClass();
                    javaProject =(IJavaProject)(Object) JavaCore.create(project);
                    for (Map.Entry<String, String> option :(Entry<String,String>[])(Object)(Object[])(Object)(java.util.Map.Entry<String,String>)(Object)(Entry[])(Object) (Object[])(Object)jetEmitter.getJavaOptions().entrySet()) {
                        javaProject.setOption(option.getKey(), option.getValue());
                    }
                } else {
                    project.open(new SubProgressMonitor(progressMonitor, 5));
                    IProjectDescription description =(IProjectDescription)(Object) project.getDescription();
                    MyHelperClass JavaCore = new MyHelperClass();
                    description.setNatureIds(new String[] {(String)(Object) JavaCore.NATURE_ID });
                    project.setDescription(description, new SubProgressMonitor(progressMonitor, 1));
//                    MyHelperClass JavaCore = new MyHelperClass();
                    javaProject =(IJavaProject)(Object) JavaCore.create(project);
                }
                List<IClasspathEntry> classpath =(List<IClasspathEntry>)(Object) new UniqueEList(Arrays.asList(javaProject.getRawClasspath()));
                for (int i = 0, len = classpath.size(); i < len; i++) {
                    IClasspathEntry entry = classpath.get(i);
                    MyHelperClass IClasspathEntry = new MyHelperClass();
                    if (entry.getEntryKind() == IClasspathEntry.CPE_SOURCE && ("/" + project.getName()).equals(entry.getPath().toString())) {
                        classpath.remove(i);
                    }
                }
//                MyHelperClass CodeGenPlugin = new MyHelperClass();
                progressMonitor.subTask((String)(Object)CodeGenPlugin.getPlugin().getString("_UI_JETInitializingProject_message", new Object[] { project.getName() }));
                MyHelperClass JavaCore = new MyHelperClass();
                IClasspathEntry classpathEntry =(IClasspathEntry)(Object) JavaCore.newSourceEntry(new Path("/" + project.getName() + "/src"));
//                MyHelperClass JavaCore = new MyHelperClass();
                IClasspathEntry jreClasspathEntry =(IClasspathEntry)(Object) JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER"));
                classpath.add(classpathEntry);
                classpath.add(jreClasspathEntry);
                classpath.addAll((Collection<? extends IClasspathEntry>)(Object)jetEmitter.classpathEntries);
                IFolder sourceFolder =(IFolder)(Object) project.getFolder(new Path("src"));
                if (!(Boolean)(Object)sourceFolder.exists()) {
                    sourceFolder.create(false, true, new SubProgressMonitor(progressMonitor, 1));
                }
                IFolder runtimeFolder =(IFolder)(Object) project.getFolder(new Path("bin"));
                if (!(Boolean)(Object)runtimeFolder.exists()) {
                    runtimeFolder.create(false, true, new SubProgressMonitor(progressMonitor, 1));
                }
                javaProject.setRawClasspath(classpath.toArray(new IClasspathEntry[classpath.size()]), new SubProgressMonitor(progressMonitor, 1));
                javaProject.setOutputLocation(new Path("/" + project.getName() + "/bin"), new SubProgressMonitor(progressMonitor, 1));
                javaProject.close();
//                MyHelperClass CodeGenPlugin = new MyHelperClass();
                progressMonitor.subTask((String)(Object)CodeGenPlugin.getPlugin().getString("_UI_JETOpeningJavaProject_message", new Object[] { project.getName() }));
                javaProject.open(new SubProgressMonitor(progressMonitor, 1));
                IPackageFragmentRoot[] packageFragmentRoots =(IPackageFragmentRoot[])(Object) javaProject.getPackageFragmentRoots();
                IPackageFragmentRoot sourcePackageFragmentRoot = null;
                for (int j = 0; j < packageFragmentRoots.length; ++j) {
                    IPackageFragmentRoot packageFragmentRoot = packageFragmentRoots[j];
                    MyHelperClass IPackageFragmentRoot = new MyHelperClass();
                    if (packageFragmentRoot.getKind() == IPackageFragmentRoot.K_SOURCE) {
                        sourcePackageFragmentRoot = packageFragmentRoot;
                        break;
                    }
                }
                StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                IProgressMonitor subProgressMonitor =(IProgressMonitor)(Object) new SubProgressMonitor(progressMonitor, 1);
                subProgressMonitor.beginTask("", stringTokenizer.countTokens() + 4);
//                MyHelperClass CodeGenPlugin = new MyHelperClass();
                subProgressMonitor.subTask((String)(Object)CodeGenPlugin.getPlugin().getString("_UI_CreateTargetFile_message"));
                IContainer sourceContainer = sourcePackageFragmentRoot == null ? project : (IContainer)(IContainer)(Object) sourcePackageFragmentRoot.getCorrespondingResource();
                while (stringTokenizer.hasMoreElements()) {
                    String folderName = stringTokenizer.nextToken();
                    sourceContainer =(IContainer)(Object) sourceContainer.getFolder(new Path(folderName));
                    if (!(Boolean)(Object)sourceContainer.exists()) {
                        ((IFolder)(IFolder)(Object) sourceContainer).create(false, true, new SubProgressMonitor(subProgressMonitor, 1));
                    }
                }
                IFile targetFile =(IFile)(Object) sourceContainer.getFile(new Path(jetCompiler.getSkeleton().getClassName() + ".java"));
                if (!(Boolean)(Object)targetFile.exists()) {
//                    MyHelperClass CodeGenPlugin = new MyHelperClass();
                    subProgressMonitor.subTask((String)(Object)CodeGenPlugin.getPlugin().getString("_UI_JETCreating_message", new Object[] { targetFile.getFullPath() }));
                    targetFile.create(contents, true, new SubProgressMonitor(subProgressMonitor, 1));
                } else {
//                    MyHelperClass CodeGenPlugin = new MyHelperClass();
                    subProgressMonitor.subTask((String)(Object)CodeGenPlugin.getPlugin().getString("_UI_JETUpdating_message", new Object[] { targetFile.getFullPath() }));
                    targetFile.setContents(contents, true, true, new SubProgressMonitor(subProgressMonitor, 1));
                }
//                MyHelperClass CodeGenPlugin = new MyHelperClass();
                subProgressMonitor.subTask((String)(Object)CodeGenPlugin.getPlugin().getString("_UI_JETBuilding_message", new Object[] { project.getName() }));
                MyHelperClass IncrementalProjectBuilder = new MyHelperClass();
                project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, new SubProgressMonitor(subProgressMonitor, 1));
                MyHelperClass IMarker = new MyHelperClass();
                IMarker[] markers =(IMarker[])(Object) targetFile.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
                boolean errors = false;
                for (int i = 0; i < markers.length; ++i) {
                    IMarker marker = markers[i];
//                    MyHelperClass IMarker = new MyHelperClass();
                    if (marker.getAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO) == IMarker.SEVERITY_ERROR) {
                        errors = true;
                        subProgressMonitor.subTask(marker.getAttribute(IMarker.MESSAGE) + " : " + (CodeGenPlugin.getPlugin().getString("jet.mark.file.line", new Object[] { targetFile.getLocation(), marker.getAttribute(IMarker.LINE_NUMBER) })));
                    }
                }
                if (!errors) {
                    subProgressMonitor.subTask((String)(Object)CodeGenPlugin.getPlugin().getString("_UI_JETLoadingClass_message", new Object[] { jetCompiler.getSkeleton().getClassName() + ".class" }));
                    List<URL> urls = new ArrayList<URL>();
                    urls.add(new File(project.getLocation() + "/" + javaProject.getOutputLocation().removeFirstSegments(1) + "/").toURL());
                    final Set<Bundle> bundles = new HashSet<Bundle>();
                    LOOP: for (IClasspathEntry jetEmitterClasspathEntry :(IClasspathEntry[])(Object) (Object[])(Object)jetEmitter.getClasspathEntries()) {
                        IClasspathAttribute[] classpathAttributes =(IClasspathAttribute[])(Object) jetEmitterClasspathEntry.getExtraAttributes();
                        if (classpathAttributes != null) {
                            for (IClasspathAttribute classpathAttribute : classpathAttributes) {
                                if (classpathAttribute.getName().equals(EclipseUtil.PLUGIN_ID_CLASSPATH_ATTRIBUTE_NAME)) {
                                    Bundle bundle =(Bundle)(Object) Platform.getBundle(classpathAttribute.getValue());
                                    if (bundle != null) {
                                        bundles.add(bundle);
                                        continue LOOP;
                                    }
                                }
                            }
                        }
                        urls.add(new URL("platform:/resource" + jetEmitterClasspathEntry.getPath() + "/"));
                    }
                    URLClassLoader theClassLoader = new URLClassLoader(urls.toArray(new URL[0]),(ClassLoader)(Object) jetEmitter.classLoader) {

//                        @Override
                        public Class<?> loadClass(String className) throws ClassNotFoundException {
                            try {
                                return super.loadClass(className);
                            } catch (ClassNotFoundException exception) {
                                for (Bundle bundle : bundles) {
                                    try {
                                        return(Class<?>)(Object) bundle.loadClass(className);
                                    } catch (ClassNotFoundException exception2) {
                                    }
                                }
                                throw exception;
                            }
                        }
                    };
                    Class<?> theClass = theClassLoader.loadClass((packageName.length() == 0 ? "" : packageName + ".") + jetCompiler.getSkeleton().getClassName());
                    String methodName =(String)(Object) jetCompiler.getSkeleton().getMethodName();
                    Method[] methods =(Method[])(Object) theClass.getDeclaredMethods();
                    for (int i = 0; i < methods.length; ++i) {
                        if (methods[i].getName().equals(methodName)) {
                            jetEmitter.setMethod(methods[i]);
                            break;
                        }
                    }
                }
                subProgressMonitor.done();
            } catch (CoreException exception) {
                throw new JETException((String)(Object)exception);
            } catch (Exception exception) {
                throw new JETException((String)(Object)exception);
            } finally {
                progressMonitor.done();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CPE_SOURCE;
	public MyHelperClass MESSAGE;
	public MyHelperClass PROBLEM;
	public MyHelperClass SEVERITY_INFO;
	public MyHelperClass LINE_NUMBER;
	public MyHelperClass CPE_PROJECT;
	public MyHelperClass SEVERITY;
	public MyHelperClass NATURE_ID;
	public MyHelperClass PLUGIN_ID_CLASSPATH_ATTRIBUTE_NAME;
	public MyHelperClass K_SOURCE;
	public MyHelperClass SEVERITY_ERROR;
	public MyHelperClass DEPTH_INFINITE;
	public MyHelperClass INCREMENTAL_BUILD;
public MyHelperClass getProject(MyHelperClass o0){ return null; }
	public MyHelperClass getMethodName(){ return null; }
	public MyHelperClass newContainerEntry(Path o0){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass loadClass(String o0){ return null; }
	public MyHelperClass getBundle(MyHelperClass o0){ return null; }
	public MyHelperClass getPackageName(){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass getString(String o0, Object[] o1){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass create(IProject o0){ return null; }
	public MyHelperClass getRuntime(IProject o0){ return null; }
	public MyHelperClass getClassName(){ return null; }
	public MyHelperClass getPlugin(){ return null; }
	public MyHelperClass removeFirstSegments(int o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass toIProgressMonitor(Monitor o0){ return null; }
	public MyHelperClass newSourceEntry(Path o0){ return null; }}

class Monitor {

}

class JETEmitter {
public MyHelperClass encoding;
	public MyHelperClass[] templateURIPath;
	public MyHelperClass templateURI;
	public MyHelperClass classLoader;
	public MyHelperClass classpathEntries;
public MyHelperClass getProjectName(){ return null; }
	public MyHelperClass getClasspathEntries(){ return null; }
	public MyHelperClass getJavaOptions(){ return null; }
	public MyHelperClass setMethod(Method o0){ return null; }}

class JETException extends Exception{
	public JETException(String errorMessage) { super(errorMessage); }
}

class IProgressMonitor {

public MyHelperClass subTask(String o0){ return null; }
	public MyHelperClass beginTask(String o0, int o1){ return null; }
	public MyHelperClass worked(int o0){ return null; }
	public MyHelperClass done(){ return null; }}

class IWorkspace {

public MyHelperClass getRoot(){ return null; }
	public MyHelperClass newProjectDescription(MyHelperClass o0){ return null; }}

class IJavaModel {

public MyHelperClass open(SubProgressMonitor o0){ return null; }
	public MyHelperClass isOpen(){ return null; }}

class JETCompiler {

public MyHelperClass getResolvedTemplateURI(){ return null; }
	public MyHelperClass generate(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass parse(){ return null; }
	public MyHelperClass getSkeleton(){ return null; }}

class MyBaseJETCompiler {

MyBaseJETCompiler(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){}
	MyBaseJETCompiler(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	MyBaseJETCompiler(){}}

class URI {

public MyHelperClass isPlatformResource(){ return null; }
	public MyHelperClass isPlatformPlugin(){ return null; }
	public MyHelperClass segment(int o0){ return null; }
	public static MyHelperClass createURI(MyHelperClass o0){ return null; }}

class IProject {

public MyHelperClass exists(){ return null; }
	public MyHelperClass create(SubProgressMonitor o0){ return null; }
	public MyHelperClass build(MyHelperClass o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass getFolder(Path o0){ return null; }
	public MyHelperClass getLocation(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setDescription(IProjectDescription o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass open(SubProgressMonitor o0){ return null; }}

class IJavaProject {

public MyHelperClass open(SubProgressMonitor o0){ return null; }
	public MyHelperClass setRawClasspath(IClasspathEntry[] o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass setOption(String o0, String o1){ return null; }
	public MyHelperClass getOutputLocation(){ return null; }
	public MyHelperClass getPackageFragmentRoots(){ return null; }
	public MyHelperClass getResolvedClasspath(boolean o0){ return null; }
	public MyHelperClass setOutputLocation(Path o0, SubProgressMonitor o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getRawClasspath(){ return null; }}

class IClasspathEntry {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass getEntryKind(){ return null; }
	public MyHelperClass getExtraAttributes(){ return null; }}

class IPath {

public MyHelperClass segment(int o0){ return null; }}

class Bundle {

public MyHelperClass loadClass(String o0){ return null; }}

class Method {

public MyHelperClass getName(){ return null; }}

class SubProgressMonitor {

SubProgressMonitor(IProgressMonitor o0, int o1){}
	SubProgressMonitor(){}}

class IProjectDescription {

public MyHelperClass setLocation(Object o0){ return null; }
	public MyHelperClass setNatureIds(String[] o0){ return null; }}

class UniqueEList {

UniqueEList(List<MyHelperClass> o0){}
	UniqueEList(){}}

class Path {

Path(String o0){}
	Path(){}}

class IFolder {

public MyHelperClass exists(){ return null; }
	public MyHelperClass create(boolean o0, boolean o1, SubProgressMonitor o2){ return null; }}

class IPackageFragmentRoot {

public MyHelperClass getCorrespondingResource(){ return null; }
	public MyHelperClass getKind(){ return null; }}

class IContainer {

public MyHelperClass getFile(Path o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getFolder(Path o0){ return null; }}

class IFile {

public MyHelperClass create(InputStream o0, boolean o1, SubProgressMonitor o2){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass findMarkers(MyHelperClass o0, boolean o1, MyHelperClass o2){ return null; }
	public MyHelperClass getLocation(){ return null; }
	public MyHelperClass setContents(InputStream o0, boolean o1, boolean o2, SubProgressMonitor o3){ return null; }}

class IMarker {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass getAttribute(MyHelperClass o0, MyHelperClass o1){ return null; }}

class IClasspathAttribute {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class Entry {

}
