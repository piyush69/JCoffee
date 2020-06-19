
import java.io.UncheckedIOException;


class c13657103 {
public MyHelperClass pluginAccessor;
	public MyHelperClass File;
	public MyHelperClass TEMPLATES_SYMBOLIC_NAME;
	public MyHelperClass IOUtils;
	public MyHelperClass TEMPLATES_PLUGIN_KEY;
	public MyHelperClass FileUtils;
	public MyHelperClass pluginController;
	public MyHelperClass bundleContext;
	public MyHelperClass getBundle(){ return null; }

    private void forBundle(BundleManipulator manip) {
        ByteArrayOutputStream bout = null;
        try {
            bout = new ByteArrayOutputStream();
            ZipOutputStream zout = new ZipOutputStream(bout);
            Bundle bundle =(Bundle)(Object) getBundle();
            Enumeration files =(Enumeration)(Object) bundle.findEntries("/", "*.vm", false);
            if (files != null) {
                while ((boolean)(Object)files.hasMoreElements()) {
                    URL url =(URL)(Object) files.nextElement();
                    String name =(String)(Object) url.getFile();
                    if (name.startsWith("/")) {
                        name = name.substring(1);
                    }
                    if ((boolean)(Object)manip.includeEntry(name)) {
                        zout.putNextEntry(new ZipEntry(name));
                        IOUtils.copy(url.openStream(), zout);
                    }
                }
            }
            manip.finish(bundle, zout);
            Manifest mf = new Manifest(bundle.getEntry("META-INF/MANIFEST.MF").openStream());
            zout.putNextEntry(new ZipEntry("META-INF/MANIFEST.MF"));
            mf.write(zout);
            zout.close();
            File tmpFile =(File)(Object) File.createTempFile(TEMPLATES_SYMBOLIC_NAME, ".jar");
            FileUtils.writeByteArrayToFile(tmpFile, bout.toByteArray());
            if (pluginAccessor.getPlugin(TEMPLATES_SYMBOLIC_NAME) != null) {
                pluginController.uninstall(pluginAccessor.getPlugin(TEMPLATES_SYMBOLIC_NAME));
            } else if (pluginAccessor.getPlugin(TEMPLATES_PLUGIN_KEY) != null) {
                pluginController.uninstall(pluginAccessor.getPlugin(TEMPLATES_PLUGIN_KEY));
            }
            pluginController.installPlugin(new JarPluginArtifact(tmpFile));
            ServiceReference ref =(ServiceReference)(Object) bundleContext.getServiceReference(PackageAdmin.class.getName());
            ((PackageAdmin)(PackageAdmin)(Object) bundleContext.getService(ref)).refreshPackages(null);
            tmpFile.delete();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(bout);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass installPlugin(JarPluginArtifact o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, ZipOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass uninstall(MyHelperClass o0){ return null; }
	public MyHelperClass writeByteArrayToFile(File o0, MyHelperClass o1){ return null; }
	public MyHelperClass getServiceReference(String o0){ return null; }
	public MyHelperClass createTempFile(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getPlugin(MyHelperClass o0){ return null; }
	public MyHelperClass getService(ServiceReference o0){ return null; }}

class BundleManipulator {

public MyHelperClass finish(Bundle o0, ZipOutputStream o1){ return null; }
	public MyHelperClass includeEntry(String o0){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(ByteArrayOutputStream o0){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Bundle {

public MyHelperClass getEntry(String o0){ return null; }
	public MyHelperClass findEntries(String o0, String o1, boolean o2){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class Manifest {

Manifest(MyHelperClass o0){}
	Manifest(){}
	public MyHelperClass write(ZipOutputStream o0){ return null; }}

class File {

public MyHelperClass delete(){ return null; }}

class JarPluginArtifact {

JarPluginArtifact(File o0){}
	JarPluginArtifact(){}}

class ServiceReference {

}

class PackageAdmin {

public MyHelperClass refreshPackages(Object o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
