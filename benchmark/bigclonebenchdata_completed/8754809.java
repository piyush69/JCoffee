import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8754809 {
public MyHelperClass handleBusinessProfile(Document o0, ILaunchConfiguration o1, IProject o2){ return null; }
	public MyHelperClass handleRootProfile(Document o0){ return null; }
public MyHelperClass JavaCore;

    @SuppressWarnings("unchecked")
    public void launch(final ILaunchConfiguration configuration, final String mode, final ILaunch launch, final IProgressMonitor monitor) throws Throwable, CoreException {
        {
            MyHelperClass Assert = new MyHelperClass();
            Assert.notNull(configuration);
//            MyHelperClass Assert = new MyHelperClass();
            Assert.notNull(monitor);
        }
        MyHelperClass INexOpenLaunchConfigurationConstants = new MyHelperClass();
        final String projectName =(String)(Object) configuration.getAttribute(INexOpenLaunchConfigurationConstants.NEXOPEN_PROJECT_NAME, "");
        MyHelperClass ResourcesPlugin = new MyHelperClass();
        final IProject prj =(IProject)(Object) JavaCore.create(ResourcesPlugin.getWorkspace().getRoot()).getJavaProject(projectName).getProject();
        MyHelperClass NexOpenProjectUtils = new MyHelperClass();
        if ((boolean)(Object)NexOpenProjectUtils.isNexOpenProject(prj)) {
            final IFile pom =(IFile)(Object) prj.getFile("pom.xml");
            if (!(Boolean)(Object)pom.exists()) {
                throw new IllegalStateException("Not a NexOpen project. Not Maven2 root pom.xml available");
            }
            MyHelperClass ContentHandlerTemplate = new MyHelperClass();
            ContentHandlerTemplate.handle(pom, new ContentHandlerCallback() {

                public void processHandle(final Document doc) {
                    handleRootProfile(doc);
                }
            });
            final IFile bpom =(IFile)(Object) prj.getFile("business/pom.xml");
            if (!(Boolean)(Object)bpom.exists()) {
                throw new IllegalStateException("Not a NexOpen project. Not Maven2 business pom.xml available");
            }
//            MyHelperClass ContentHandlerTemplate = new MyHelperClass();
            ContentHandlerTemplate.handle(bpom, new ContentHandlerCallback() {

                public void processHandle(final Document doc) {
                    try {
                        handleBusinessProfile(doc, configuration, prj);
                    } catch (final ArithmeticException e) {
                        MyHelperClass Logger = new MyHelperClass();
                        if ((boolean)(Object)Logger.getLog().isInfoEnabled()) {
//                            MyHelperClass Logger = new MyHelperClass();
                            Logger.getLog().info("CoreException",(CoreException)(Object) e);
                        }
                        throw new RuntimeException(e);
                    }
                }
            });
            final ByteArrayOutputStream output = new ByteArrayOutputStream();
            try {
                final Properties props = new Properties();
//                MyHelperClass INexOpenLaunchConfigurationConstants = new MyHelperClass();
                final String dialectName =(String)(Object) configuration.getAttribute(INexOpenLaunchConfigurationConstants.HIBERNATE_DIALECT, "MySQL5InnoDB");
                MyHelperClass support = new MyHelperClass();
                props.setProperty("hibernate.dialect",(String)(Object) support.getDialectClass(dialectName));
//                MyHelperClass INexOpenLaunchConfigurationConstants = new MyHelperClass();
                props.setProperty("hibernate.connection.driver_class",(String)(Object) configuration.getAttribute(INexOpenLaunchConfigurationConstants.JDBC_DRIVER, "com.mysql.jdbc.Driver"));
//                MyHelperClass INexOpenLaunchConfigurationConstants = new MyHelperClass();
                props.setProperty("hibernate.connection.url",(String)(Object) configuration.getAttribute(INexOpenLaunchConfigurationConstants.JDBC_URL, "jdbc:mysql://<host><:port>/<database>"));
//                MyHelperClass INexOpenLaunchConfigurationConstants = new MyHelperClass();
                props.setProperty("hibernate.connection.username",(String)(Object) configuration.getAttribute(INexOpenLaunchConfigurationConstants.JDBC_USERNAME, "sa"));
//                MyHelperClass INexOpenLaunchConfigurationConstants = new MyHelperClass();
                props.setProperty("hibernate.connection.password",(String)(Object) configuration.getAttribute(INexOpenLaunchConfigurationConstants.JDBC_PASSWORD, ""));
                props.store(output, "hibernate properties for code generation using NexOpen Tools 1.0.0");
                final IFile props_file =(IFile)(Object) prj.getFile("business/src/test/resources/hibernate.properties");
                if (!(Boolean)(Object)props_file.exists()) {
                    props_file.create(new ByteArrayInputStream(output.toByteArray()), true, monitor);
                } else {
                    props_file.setContents(new ByteArrayInputStream(output.toByteArray()), true, false, monitor);
                }
            } catch (final IOException e) {
                MyHelperClass Logger = new MyHelperClass();
                Logger.getLog().error("I/O exception ", e);
                throw new RuntimeException(e);
            } finally {
                try {
                    output.flush();
                    output.close();
                } catch (IOException e) {
                }
            }
//            MyHelperClass NexOpenProjectUtils = new MyHelperClass();
            if ((boolean)(Object)NexOpenProjectUtils.is04xProject(prj)) {
                final IFile appContext =(IFile)(Object) prj.getFile("web/src/main/webapp/WEB-INF/applicationContext.xml");
                if (!(Boolean)(Object)appContext.exists()) {
                    throw new IllegalStateException("It no exists applicationContext.xml under web/src/main/webapp/WEB-INF, not a NexOpen project");
                }
//                MyHelperClass ContentHandlerTemplate = new MyHelperClass();
                ContentHandlerTemplate.handle(appContext, new ContentHandlerCallback() {

                    public void processHandle(final Document doc) {
                        final Element root =(Element)(Object) doc.getDocumentElement();
                        MyHelperClass XMLUtils = new MyHelperClass();
                        final List<Element> beans =(List<Element>)(Object) XMLUtils.getChildElementsByTagName(root, "bean");
                        for (final Element bean : beans) {
                            final String id =(String)(Object) bean.getAttribute("id");
                            if ("valueListAdapterResolver".equals(id)) {
                                try {
                                    final String pkgName =(String)(Object) configuration.getAttribute(INexOpenLaunchConfigurationConstants.NEXOPEN_PACKAGE, "");
                                    final String className = new StringBuilder(pkgName).append(".vlh.support.AnnotationValueListAdapterResolver").toString();
                                    bean.setAttribute("class", className);
                                    break;
                                } catch (final ArrayIndexOutOfBoundsException e) {
                                    MyHelperClass Logger = new MyHelperClass();
                                    if ((boolean)(Object)Logger.getLog().isInfoEnabled()) {
//                                        MyHelperClass Logger = new MyHelperClass();
                                        Logger.getLog().info("CoreException",(CoreException)(Object) e);
                                    }
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                });
            }
            {
//                MyHelperClass INexOpenLaunchConfigurationConstants = new MyHelperClass();
                final String dialectName =(String)(Object) configuration.getAttribute(INexOpenLaunchConfigurationConstants.HIBERNATE_DIALECT, "MySQL5InnoDB");
                MyHelperClass support = new MyHelperClass();
                if ((boolean)(Object)support.isReverseEngineeringFileNeeded(dialectName)) {
                    try {
//                        MyHelperClass support = new MyHelperClass();
                        final IFile revengFile =(IFile)(Object) prj.getFile("business/src/test/resources/" + support.getReversEngineeringFile(dialectName));
                        if (!(Boolean)(Object)revengFile.exists()) {
                            MyHelperClass HibernateActivator = new MyHelperClass();
                            final Bundle bundle =(Bundle)(Object) HibernateActivator.getDefault().getBundle();
//                            MyHelperClass support = new MyHelperClass();
                            final Path src = new Path("resources/" + support.getReversEngineeringFile(dialectName));
                            MyHelperClass FileLocator = new MyHelperClass();
                            final InputStream in =(InputStream)(Object) FileLocator.openStream(bundle, src, false);
                            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.copy(in, baos);
                            String str = baos.toString();
//                            MyHelperClass INexOpenLaunchConfigurationConstants = new MyHelperClass();
                            str = str.replace((char)(Object)"${schema}",(char)(Object) configuration.getAttribute(INexOpenLaunchConfigurationConstants.JDBC_USERNAME, "sa"));
                            revengFile.create(new ByteArrayInputStream(str.getBytes()), true, null);
                        }
                    } catch (final ArrayStoreException e) {
                        MyHelperClass Logger = new MyHelperClass();
                        if ((boolean)(Object)Logger.getLog().isInfoEnabled()) {
//                            MyHelperClass Logger = new MyHelperClass();
                            Logger.getLog().info("CoreException",(CoreException)(Object) e);
                        }
                        throw new RuntimeException(e);
                    }
                }
            }
            final IResource resource = (IResource)(IResource)(Object) prj.getAdapter((IResource)(Object)IResource.class);
            final QualifiedName qn = new QualifiedName("org.nexopenframework.ide.eclipse.ui", "default.profile");
            final String profile =(String)(Object) resource.getPersistentProperty(qn);
            resource.setPersistentProperty(qn, "reverse-engineering");
            try {
                final InstallProjectAction action = new InstallProjectAction();
                action.scheduleJob(prj, monitor);
                prj.refreshLocal(2, monitor);
            } finally {
                prj.setPersistentProperty(qn, profile);
            }
        } else {
            MyHelperClass Logger = new MyHelperClass();
            Logger.getLog().info("Not a NexOpen project :: " + prj);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NEXOPEN_PACKAGE;
	public MyHelperClass HIBERNATE_DIALECT;
	public MyHelperClass JDBC_URL;
	public MyHelperClass NEXOPEN_PROJECT_NAME;
	public MyHelperClass JDBC_PASSWORD;
	public MyHelperClass JDBC_USERNAME;
	public MyHelperClass JDBC_DRIVER;
public MyHelperClass getBundle(){ return null; }
	public MyHelperClass notNull(IProgressMonitor o0){ return null; }
	public MyHelperClass handle(IFile o0){ return null; }
	public MyHelperClass getDialectClass(String o0){ return null; }
	public MyHelperClass info(String o0, CoreException o1){ return null; }
	public MyHelperClass notNull(ILaunchConfiguration o0){ return null; }
	public MyHelperClass getJavaProject(String o0){ return null; }
	public MyHelperClass isInfoEnabled(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass getReversEngineeringFile(String o0){ return null; }
	public MyHelperClass info(String o0, IOException o1){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass handle(IFile o0,  ContentHandlerCallback o1){ return null; }
	public MyHelperClass getChildElementsByTagName(Element o0, String o1){ return null; }
	public MyHelperClass isNexOpenProject(IProject o0){ return null; }
	public MyHelperClass getProject(){ return null; }
	public MyHelperClass isReverseEngineeringFileNeeded(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass is04xProject(IProject o0){ return null; }
	public MyHelperClass create(MyHelperClass o0){ return null; }
	public MyHelperClass openStream(Bundle o0, Path o1, boolean o2){ return null; }
	public MyHelperClass getLog(){ return null; }}

class ILaunchConfiguration {

public MyHelperClass getAttribute(MyHelperClass o0, String o1){ return null; }}

class ILaunch {

}

class IProgressMonitor {

}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class IProject {

public MyHelperClass getAdapter(IResource o0){ return null; }
	public MyHelperClass refreshLocal(int o0, IProgressMonitor o1){ return null; }
	public MyHelperClass getFile(String o0){ return null; }
	public MyHelperClass setPersistentProperty(QualifiedName o0, String o1){ return null; }}

class IFile {

public MyHelperClass exists(){ return null; }
	public MyHelperClass create(ByteArrayInputStream o0, boolean o1, Object o2){ return null; }
	public MyHelperClass create(ByteArrayInputStream o0, boolean o1, IProgressMonitor o2){ return null; }
	public MyHelperClass setContents(ByteArrayInputStream o0, boolean o1, boolean o2, IProgressMonitor o3){ return null; }}

class ContentHandlerCallback {

}

class Bundle {

}

class Path {

Path(String o0){}
	Path(){}}

class IResource {

public MyHelperClass setPersistentProperty(QualifiedName o0, String o1){ return null; }
	public MyHelperClass getPersistentProperty(QualifiedName o0){ return null; }}

class QualifiedName {

QualifiedName(String o0, String o1){}
	QualifiedName(){}}

class InstallProjectAction {

public MyHelperClass scheduleJob(IProject o0, IProgressMonitor o1){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class Element {

public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }}
