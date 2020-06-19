
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3054600 {
public MyHelperClass Maven2Plugin;
	public MyHelperClass performMavenInstall(IProgressMonitor o0, IProject o1, boolean o2){ return null; }
	public MyHelperClass addProxySettings(Properties o0){ return null; }
	public MyHelperClass convertPropertiesToList(Properties o0){ return null; }
	public MyHelperClass getArchetypeArtifactId(IDataModel o0){ return null; }
	public MyHelperClass getArchetypeGroupId(IDataModel o0){ return null; }
	public MyHelperClass getArchetypeVersion(IDataModel o0){ return null; }
public MyHelperClass ATTR_PROPERTIES;
	public MyHelperClass Logger;
	public MyHelperClass FileUtils;
	public MyHelperClass DebugPlugin;
	public MyHelperClass ArchetypePOMHelper;
	public MyHelperClass SiteManager;
	public MyHelperClass ATTR_GOALS;
	public MyHelperClass ATTR_POM_DIR;
	public MyHelperClass LAUNCH_CONFIGURATION_TYPE_ID;
	public MyHelperClass IOUtils;
	public MyHelperClass TimeoutLaunchConfiguration;
	public MyHelperClass getDefaultArchetypePomDirectory(){ return null; }
	public MyHelperClass updateGoal(String o0){ return null; }
	public MyHelperClass getPomFile(String o0, String o1){ return null; }
	public MyHelperClass getRepositories(){ return null; }

    private void generateArchetype(final IProject project, final IDataModel model, final IProgressMonitor monitor, final boolean offline) throws CoreException, InterruptedException, IOException {
        if (getArchetypeArtifactId(model) != null) {
            final Properties properties = new Properties();
            properties.put("archetypeArtifactId",(String)(Object) getArchetypeArtifactId(model));
            properties.put("archetypeGroupId",(String)(Object) getArchetypeGroupId(model));
            properties.put("archetypeVersion",(String)(Object) getArchetypeVersion(model));
            MyHelperClass IMavenFacetInstallDataModelProperties = new MyHelperClass();
            String artifact = (String)(String)(Object) model.getProperty(IMavenFacetInstallDataModelProperties.PROJECT_ARTIFACT_ID);
            if (artifact == null || artifact.trim().length() == 0) {
                artifact =(String)(Object) project.getName();
            }
            properties.put("artifactId", artifact);
//            MyHelperClass IMavenFacetInstallDataModelProperties = new MyHelperClass();
            String group = (String)(String)(Object) model.getProperty(IMavenFacetInstallDataModelProperties.PROJECT_GROUP_ID);
            if (group == null || group.trim().length() == 0) {
                group =(String)(Object) project.getName();
            }
            properties.put("groupId", group);
//            MyHelperClass IMavenFacetInstallDataModelProperties = new MyHelperClass();
            properties.put("version",(String)(Object) model.getProperty(IMavenFacetInstallDataModelProperties.PROJECT_VERSION));
            MyHelperClass File = new MyHelperClass();
            final StringBuffer sb = new StringBuffer(System.getProperty("user.home")).append(File.separator);
//            MyHelperClass File = new MyHelperClass();
            sb.append(".m2").append(File.separator).append("repository");
            final String local = sb.toString();
            MyHelperClass Logger = new MyHelperClass();
            Logger.getLog().debug("Local Maven2 repository :: " + local);
            properties.put("localRepository", local);
            if (!offline) {
                final String sbRepos =(String)(Object) getRepositories();
                properties.put("remoteRepositories", sbRepos);
            }
            final ILaunchManager launchManager =(ILaunchManager)(Object) DebugPlugin.getDefault().getLaunchManager();
            final ILaunchConfigurationType launchConfigurationType =(ILaunchConfigurationType)(Object) launchManager.getLaunchConfigurationType(LAUNCH_CONFIGURATION_TYPE_ID);
            final ILaunchConfigurationWorkingCopy workingCopy =(ILaunchConfigurationWorkingCopy)(Object) launchConfigurationType.newInstance(null, "Creating project using Apache Maven archetype");
            File archetypePomDirectory =(File)(Object) getDefaultArchetypePomDirectory();
            try {
                String dfPom =(String)(Object) getPomFile(group, artifact);
                ByteArrayInputStream bais = new ByteArrayInputStream(dfPom.getBytes());
                File f = new File(archetypePomDirectory, "pom.xml");
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
                    } catch (UncheckedIOException e) {
                    }
                }
                if ((boolean)(Object)SiteManager.isHttpProxyEnable()) {
                    addProxySettings(properties);
                }
                workingCopy.setAttribute(ATTR_POM_DIR,(String)(Object) archetypePomDirectory.getAbsolutePath());
                workingCopy.setAttribute(ATTR_PROPERTIES,(String)(Object) convertPropertiesToList(properties));
                String goalName = "archetype:create";
                if (offline) {
                    goalName = new StringBuffer(goalName).append(" -o").toString();
                }
                goalName =(String)(Object) updateGoal(goalName);
                workingCopy.setAttribute(ATTR_GOALS, goalName);
                final long timeout =(long)(Object) Maven2Plugin.getTimeout();
                TimeoutLaunchConfiguration.launchWithTimeout(monitor, workingCopy, project, timeout);
                monitor.setTaskName("Moving to workspace");
                FileUtils.copyDirectoryStructure(new File(archetypePomDirectory,(String)(Object) project.getName()), ArchetypePOMHelper.getProjectDirectory(project));
                monitor.worked(1);
                performMavenInstall(monitor, project, offline);
                project.refreshLocal(2, monitor);
            } catch (final UncheckedIOException ioe) {
                Logger.log(Logger.ERROR, "I/O exception. One probably solution is absence " + "of mvn2 archetypes or not the correct version, " + "in your local repository. Please, check existence " + "of this archetype.");
                Logger.getLog().error("I/O Exception arised creating mvn2 archetype",(IOException)(Object) ioe);
                throw ioe;
            } finally {
                FileUtils.deleteDirectory(archetypePomDirectory);
                Logger.log(Logger.INFO, "Invoked removing of archetype POM directory");
            }
        }
        monitor.worked(1);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROJECT_VERSION;
	public MyHelperClass separator;
	public MyHelperClass PROJECT_GROUP_ID;
	public MyHelperClass ERROR;
	public MyHelperClass INFO;
	public MyHelperClass PROJECT_ARTIFACT_ID;
public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass copy(ByteArrayInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass deleteDirectory(File o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass getProjectDirectory(IProject o0){ return null; }
	public MyHelperClass getTimeout(){ return null; }
	public MyHelperClass isHttpProxyEnable(){ return null; }
	public MyHelperClass launchWithTimeout(IProgressMonitor o0, ILaunchConfigurationWorkingCopy o1, IProject o2, long o3){ return null; }
	public MyHelperClass getLaunchManager(){ return null; }
	public MyHelperClass getLog(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass copyDirectoryStructure(File o0, MyHelperClass o1){ return null; }}

class IProject {

public MyHelperClass refreshLocal(int o0, IProgressMonitor o1){ return null; }
	public MyHelperClass getName(){ return null; }}

class IDataModel {

public MyHelperClass getProperty(MyHelperClass o0){ return null; }}

class IProgressMonitor {

public MyHelperClass worked(int o0){ return null; }
	public MyHelperClass setTaskName(String o0){ return null; }}

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

File(File o0, String o1){}
	File(){}
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
