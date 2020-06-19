
import java.io.UncheckedIOException;


class c18318816 {
public static MyHelperClass getPomFile(MyHelperClass o0, MyHelperClass o1){ return null; }
public static MyHelperClass convertPropertiesToList(Properties o0){ return null; }
//	public MyHelperClass getPomFile(MyHelperClass o0, MyHelperClass o1){ return null; }
public static MyHelperClass Maven2PreferenceConstants;
	public static MyHelperClass Logger;
	public static MyHelperClass TimeoutLaunchConfiguration;
	public static MyHelperClass Maven2Plugin;
	public static MyHelperClass ATTR_GOALS;
	public static MyHelperClass FileUtils;
	public static MyHelperClass ATTR_POM_DIR;
	public static MyHelperClass IResource;
	public static MyHelperClass ATTR_PROPERTIES;
	public static MyHelperClass IOUtils;
	public static MyHelperClass getDefaultArchetypePomDirectory(){ return null; }
//	public MyHelperClass convertPropertiesToList(Properties o0){ return null; }
//public MyHelperClass ATTR_PROPERTIES;
//	public MyHelperClass IResource;
//	public MyHelperClass Logger;
//	public MyHelperClass Maven2PreferenceConstants;
//	public MyHelperClass ATTR_GOALS;
//	public MyHelperClass ATTR_POM_DIR;
//	public MyHelperClass IOUtils;
//	public MyHelperClass Maven2Plugin;
//	public MyHelperClass FileUtils;
//	public MyHelperClass TimeoutLaunchConfiguration;
//	public MyHelperClass getDefaultArchetypePomDirectory(){ return null; }

    public static void invokeMvnArtifact(final IProject project, final IModuleExtension moduleExtension, final String location) throws CoreException, InterruptedException, IOException {
        final Properties properties = new Properties();
        properties.put("archetypeGroupId", "org.nexopenframework.plugins");
        properties.put("archetypeArtifactId", "openfrwk-archetype-webmodule");
        final String version =(String)(Object) Maven2Plugin.getArchetypeVersion();
        properties.put("archetypeVersion", version);
        properties.put("artifactId",(String)(Object) moduleExtension.getArtifact());
        properties.put("groupId",(String)(Object) moduleExtension.getGroup());
        properties.put("version",(String)(Object) moduleExtension.getVersion());
        MyHelperClass DebugPlugin = new MyHelperClass();
        final ILaunchManager launchManager =(ILaunchManager)(Object) DebugPlugin.getDefault().getLaunchManager();
        MyHelperClass LAUNCH_CONFIGURATION_TYPE_ID = new MyHelperClass();
        final ILaunchConfigurationType launchConfigurationType =(ILaunchConfigurationType)(Object) launchManager.getLaunchConfigurationType(LAUNCH_CONFIGURATION_TYPE_ID);
        final ILaunchConfigurationWorkingCopy workingCopy =(ILaunchConfigurationWorkingCopy)(Object) launchConfigurationType.newInstance(null, "Creating WEB module using Apache Maven archetype");
        File archetypePomDirectory =(File)(Object) getDefaultArchetypePomDirectory();
        try {
            final String dfPom =(String)(Object) getPomFile(moduleExtension.getGroup(), moduleExtension.getArtifact());
            final ByteArrayInputStream bais = new ByteArrayInputStream(dfPom.getBytes());
            final File f = new File(archetypePomDirectory, "pom.xml");
            OutputStream fous = null;
            try {
                fous =(OutputStream)(Object) new FileOutputStream(f);
                IOUtils.copy(bais, fous);
            } finally {
                try {
                    if (fous != null) {
                        fous.close();
                    }
                    if (bais != null) {
                        bais.close();
                    }
                } catch (final UncheckedIOException e) {
                }
            }
            String goalName = "archetype:create";
            boolean offline = false;
            try {
                final Class clazz = Thread.currentThread().getContextClassLoader().loadClass("org.maven.ide.eclipse.Maven2Plugin");
                final Maven2Plugin plugin = (Maven2Plugin) clazz.getMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
                offline =(boolean)(Object) plugin.getPreferenceStore().getBoolean("eclipse.m2.offline");
            } catch (final ClassNotFoundException e) {
                Logger.logException("No class [org.maven.ide.eclipse.ext.Maven2Plugin] in classpath", e);
            } catch (final NoSuchMethodException e) {
                Logger.logException("No method getDefault", e);
            } catch (final Throwable e) {
                Logger.logException(e);
            }
            if (offline) {
                goalName = new StringBuffer(goalName).append(" -o").toString();
            }
            if (!offline) {
                final IPreferenceStore ps =(IPreferenceStore)(Object) Maven2Plugin.getDefault().getPreferenceStore();
                final String repositories =(String)(Object) ps.getString(Maven2PreferenceConstants.P_M2_REPOSITORIES);
                final String[] repos = repositories.split((String)(Object)Maven2Plugin.REPO_SEPARATOR);
                final StringBuffer sbRepos = new StringBuffer();
                for (int k = 0; k < repos.length; k++) {
                    sbRepos.append(repos[k]);
                    if (k != repos.length - 1) {
                        sbRepos.append(",");
                    }
                }
                properties.put("remoteRepositories", sbRepos.toString());
            }
            workingCopy.setAttribute(ATTR_GOALS, goalName);
            workingCopy.setAttribute(ATTR_POM_DIR,(String)(Object) archetypePomDirectory.getAbsolutePath());
            workingCopy.setAttribute(ATTR_PROPERTIES,(String)(Object) convertPropertiesToList(properties));
            final long timeout =(long)(Object) Maven2Plugin.getTimeout();
            TimeoutLaunchConfiguration.launchWithTimeout(new NullProgressMonitor(), workingCopy, project, timeout);
            FileUtils.copyDirectoryStructure(new File((String)(Object)archetypePomDirectory,(String)(Object) project.getName()), new File(location));
            FileUtils.deleteDirectory(new File(location + "/src"));
            FileUtils.forceDelete(new File(location, "pom.xml"));
            project.refreshLocal(IResource.DEPTH_INFINITE, null);
        } finally {
            FileUtils.deleteDirectory(archetypePomDirectory);
            Logger.log(Logger.INFO, "Invoked removing of archetype POM directory");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass REPO_SEPARATOR;
	public MyHelperClass P_M2_REPOSITORIES;
	public MyHelperClass INFO;
	public MyHelperClass DEPTH_INFINITE;
public MyHelperClass getPreferenceStore(){ return null; }
	public MyHelperClass launchWithTimeout(NullProgressMonitor o0, ILaunchConfigurationWorkingCopy o1, IProject o2, long o3){ return null; }
	public MyHelperClass getArchetypeVersion(){ return null; }
	public MyHelperClass copy(ByteArrayInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass deleteDirectory(File o0){ return null; }
	public MyHelperClass forceDelete(File o0){ return null; }
	public MyHelperClass getTimeout(){ return null; }
	public MyHelperClass logException(Throwable o0){ return null; }
	public MyHelperClass logException(String o0, NoSuchMethodException o1){ return null; }
	public MyHelperClass logException(String o0, ClassNotFoundException o1){ return null; }
	public MyHelperClass getLaunchManager(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass copyDirectoryStructure(File o0, File o1){ return null; }
	public MyHelperClass getBoolean(String o0){ return null; }}

class IProject {

public MyHelperClass refreshLocal(MyHelperClass o0, Object o1){ return null; }
	public MyHelperClass getName(){ return null; }}

class IModuleExtension {

public MyHelperClass getVersion(){ return null; }
	public MyHelperClass getGroup(){ return null; }
	public MyHelperClass getArtifact(){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Properties {

public MyHelperClass put(String o0, String o1){ return null; }}

class ILaunchManager {

public MyHelperClass getLaunchConfigurationType(MyHelperClass o0){ return null; }}

class ILaunchConfigurationType {

public MyHelperClass newInstance(Object o0, String o1){ return null; }}

class ILaunchConfigurationWorkingCopy {

public MyHelperClass setAttribute(MyHelperClass o0, String o1){ return null; }}

class File {

File(){}
	File(String o0, String o1){}
	File(String o0){}
	File(File o0, String o1){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class Maven2Plugin {

public MyHelperClass getPreferenceStore(){ return null; }}

class IPreferenceStore {

public MyHelperClass getString(MyHelperClass o0){ return null; }}

class NullProgressMonitor {

}
