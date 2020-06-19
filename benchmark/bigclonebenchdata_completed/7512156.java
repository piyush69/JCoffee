
import java.io.UncheckedIOException;


class c7512156 {
public MyHelperClass CMD_LINE_DEST_PLUGIN_VERSION_OPTION;
	public MyHelperClass DEFAULT_DEST_VERSION;
	public MyHelperClass CMD_LINE_DEST_DIR_OPTION;
	public MyHelperClass TolvenPlugin;
	public MyHelperClass CMD_LINE_DEST_PLUGIN_ID_OPTION;
	public MyHelperClass CMD_LINE_SRC_PLUGIN_VERSION_OPTION;
	public MyHelperClass IOUtils;
	public MyHelperClass FileUtils;
	public MyHelperClass CMD_LINE_SRC_PLUGIN_ID_OPTION;
	public MyHelperClass TolvenZip;
	public MyHelperClass CMD_LINE_SRC_REPOSITORYURL_OPTION;
	public MyHelperClass RepositoryMetadata;
	public MyHelperClass getPluginTmpDir(){ return null; }
	public MyHelperClass getCommandOptions(){ return null; }

//    @Override
    public void execute(String[] args) throws Exception {
        Options cmdLineOptions =(Options)(Object) getCommandOptions();
        try {
            GnuParser parser = new GnuParser();
            CommandLine commandLine =(CommandLine)(Object) parser.parse(cmdLineOptions, TolvenPlugin.getInitArgs());
            String srcRepositoryURLString =(String)(Object) commandLine.getOptionValue(CMD_LINE_SRC_REPOSITORYURL_OPTION);
            Plugins libraryPlugins =(Plugins)(Object) RepositoryMetadata.getRepositoryPlugins(new URL(srcRepositoryURLString));
            String srcPluginId =(String)(Object) commandLine.getOptionValue(CMD_LINE_SRC_PLUGIN_ID_OPTION);
            PluginDetail plugin =(PluginDetail)(Object) RepositoryMetadata.getPluginDetail(srcPluginId, libraryPlugins);
            if (plugin == null) {
                throw new RuntimeException("Could not locate plugin: " + srcPluginId + " in repository: " + srcRepositoryURLString);
            }
            String srcPluginVersionString =(String)(Object) commandLine.getOptionValue(CMD_LINE_SRC_PLUGIN_VERSION_OPTION);
            PluginVersionDetail srcPluginVersion = null;
            if (srcPluginVersion == null) {
                srcPluginVersion =(PluginVersionDetail)(Object) RepositoryMetadata.getLatestVersion(plugin);
            } else {
                srcPluginVersion =(PluginVersionDetail)(Object) RepositoryMetadata.getPluginVersionDetail(srcPluginVersionString, plugin);
            }
            if (plugin == null) {
                throw new RuntimeException("Could not find a plugin version for: " + srcPluginId + " in repository: " + srcRepositoryURLString);
            }
            String destPluginId =(String)(Object) commandLine.getOptionValue(CMD_LINE_DEST_PLUGIN_ID_OPTION);
            FileUtils.deleteDirectory(getPluginTmpDir());
            URL srcURL = new URL((String)(Object)srcPluginVersion.getUri());
            File newPluginDir = new File(getPluginTmpDir(), destPluginId);
            try {
                InputStream in = null;
                FileOutputStream out = null;
                File tmpZip = new File(getPluginTmpDir(),(String)(Object) new File((String)(Object)srcURL.getFile()).getName());
                try {
                    in =(InputStream)(Object) srcURL.openStream();
                    out = new FileOutputStream(tmpZip);
                    IOUtils.copy(in, out);
                    TolvenZip.unzip(tmpZip, newPluginDir);
                } finally {
                    if (in != null) {
                        in.close();
                    }
                    if (out != null) {
                        out.close();
                    }
                    if (tmpZip != null) {
                        tmpZip.delete();
                    }
                }
                File pluginManifestFile = new File(newPluginDir, "tolven-plugin.xml");
                if (!(Boolean)(Object)pluginManifestFile.exists()) {
                    throw new RuntimeException(srcURL.toExternalForm() + "has no plugin manifest");
                }
                Plugin pluginManifest =(Plugin)(Object) RepositoryMetadata.getPlugin(pluginManifestFile.toURI().toURL());
                pluginManifest.setId(destPluginId);
                String destPluginVersion =(String)(Object) commandLine.getOptionValue(CMD_LINE_DEST_PLUGIN_VERSION_OPTION);
                if (destPluginVersion == null) {
                    destPluginVersion =(String)(Object) DEFAULT_DEST_VERSION;
                }
                pluginManifest.setVersion(destPluginVersion);
                String pluginManifestXML =(String)(Object) RepositoryMetadata.getPluginManifest(pluginManifest);
                FileUtils.writeStringToFile(pluginManifestFile, pluginManifestXML);
                File pluginFragmentManifestFile = new File(newPluginDir, "tolven-plugin-fragment.xml");
                if ((boolean)(Object)pluginFragmentManifestFile.exists()) {
                    PluginFragment pluginManifestFragment =(PluginFragment)(Object) RepositoryMetadata.getPluginFragment(pluginFragmentManifestFile.toURI().toURL());
                    Requires requires =(Requires)(Object) pluginManifestFragment.getRequires();
                    if (requires == null) {
                        throw new RuntimeException("No <requires> detected for plugin fragment in: " + srcURL.toExternalForm());
                    }
                    if ((int)(Object)requires.getImport().size() != 1) {
                        throw new RuntimeException("There should be only one import for plugin fragment in: " + srcURL.toExternalForm());
                    }
                    requires.getImport().get(0).setPluginId(destPluginId);
                    requires.getImport().get(0).setPluginVersion(destPluginVersion);
                    String pluginFragmentManifestXML =(String)(Object) RepositoryMetadata.getPluginFragmentManifest(pluginManifestFragment);
                    FileUtils.writeStringToFile(pluginFragmentManifestFile, pluginFragmentManifestXML);
                }
                String destDirname =(String)(Object) commandLine.getOptionValue(CMD_LINE_DEST_DIR_OPTION);
                File destDir = new File(destDirname);
                File destZip = new File(destDir, destPluginId + "-" + destPluginVersion + ".zip");
                destDir.mkdirs();
                TolvenZip.zip(newPluginDir, destZip);
            } finally {
                if (newPluginDir != null) {
                    FileUtils.deleteDirectory(newPluginDir);
                }
            }
        } catch (UncheckedIOException ex) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp(getClass().getName(), cmdLineOptions);
            throw new RuntimeException("Could not parse command line for: " + getClass().getName(), ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass unzip(File o0, File o1){ return null; }
	public MyHelperClass writeStringToFile(File o0, String o1){ return null; }
	public MyHelperClass getPluginVersionDetail(String o0, PluginDetail o1){ return null; }
	public MyHelperClass setPluginId(String o0){ return null; }
	public MyHelperClass deleteDirectory(File o0){ return null; }
	public MyHelperClass toURL(){ return null; }
	public MyHelperClass getPluginDetail(String o0, Plugins o1){ return null; }
	public MyHelperClass zip(File o0, File o1){ return null; }
	public MyHelperClass setPluginVersion(String o0){ return null; }
	public MyHelperClass getPluginFragmentManifest(PluginFragment o0){ return null; }
	public MyHelperClass deleteDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass getPluginFragment(MyHelperClass o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getRepositoryPlugins(URL o0){ return null; }
	public MyHelperClass getPlugin(MyHelperClass o0){ return null; }
	public MyHelperClass getLatestVersion(PluginDetail o0){ return null; }
	public MyHelperClass getInitArgs(){ return null; }
	public MyHelperClass getPluginManifest(Plugin o0){ return null; }}

class Options {

}

class GnuParser {

public MyHelperClass parse(Options o0, MyHelperClass o1){ return null; }}

class CommandLine {

public MyHelperClass getOptionValue(MyHelperClass o0){ return null; }}

class Plugins {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class PluginDetail {

}

class PluginVersionDetail {

public MyHelperClass getUri(){ return null; }}

class File {

File(){}
	File(String o0){}
	File(MyHelperClass o0, String o1){}
	File(File o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass toURI(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class Plugin {

public MyHelperClass setVersion(String o0){ return null; }
	public MyHelperClass setId(String o0){ return null; }}

class PluginFragment {

public MyHelperClass getRequires(){ return null; }}

class Requires {

public MyHelperClass getImport(){ return null; }}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class HelpFormatter {

public MyHelperClass printHelp(String o0, Options o1){ return null; }}
