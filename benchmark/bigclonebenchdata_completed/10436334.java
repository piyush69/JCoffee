import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10436334 {
public MyHelperClass createBundleURLClassPath(AbstractBundle o0, Version o1, File o2, File o3, boolean o4){ return null; }
	public MyHelperClass storeBundleInfo(BundleInfo o0){ return null; }
	public MyHelperClass createNewCache(long o0, Version o1){ return null; }
public MyHelperClass Constants;
	public MyHelperClass bundlesLock;
	public MyHelperClass bundles;
	public MyHelperClass IOUtil;
	public MyHelperClass Storage;
	public MyHelperClass Version;
	public MyHelperClass ManifestUtil;
	public MyHelperClass BUNDLE_MANIFEST_FILE;
	public MyHelperClass classPathsByBundle;
	public MyHelperClass ArrayUtil;
	public MyHelperClass bundleInfosByBundle;
	public MyHelperClass FrameworkUtil;
	public MyHelperClass framework;
	public MyHelperClass ManifestEntry;
	public MyHelperClass getNextBundleId(){ return null; }
	public MyHelperClass isBundleInstalled(String o0){ return null; }
	public MyHelperClass getTempFolder(){ return null; }
	public MyHelperClass getBundleFolder(long o0){ return null; }

    Bundle install(String location, InputStream is) throws BundleException {
        MyHelperClass bundlesLock = new MyHelperClass();
        synchronized (bundlesLock) {
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                securityManager.checkPermission((Permission)(Object)new AdminPermission(new StringBuilder("(location=").append(location).append(")").toString(), AdminPermission.EXTENSIONLIFECYCLE));
            }
            long bundleId =(long)(Object) getNextBundleId();
            AbstractBundle bundle = null;
            try {
                if (is == null) {
                    URL url = new URL(location);
                    is = url.openStream();
                }
                File temp = new File((String)(Object)getTempFolder(), Long.toString(System.currentTimeMillis()));
                OutputStream os;
                os = new FileOutputStream(temp);
                IOUtil.copy(is, os);
                os.close();
                is.close();
                Manifest manifest =(Manifest)(Object) ManifestUtil.getJarManifest(new FileInputStream(temp));
                Dictionary headers =(Dictionary)(Object) ManifestUtil.toDictionary(manifest);
                Version version =(Version)(Object) Version.parseVersion((String) headers.get(Constants.BUNDLE_VERSION));
                File cache =(File)(Object) createNewCache(bundleId, version);
                File manifestFile = new File((String)(Object)cache,(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) BUNDLE_MANIFEST_FILE);
                os = new FileOutputStream(manifestFile);
                ManifestUtil.storeManifest(headers, os);
                os.close();
                if ((boolean)(Object)isBundleInstalled((String) headers.get(Constants.BUNDLE_SYMBOLICNAME))) {
                    throw new BundleException(new StringBuilder("Bundle(location=").append(location).append(") already installed.").toString());
                }
                ManifestEntry[] entries =(ManifestEntry[])(Object) ManifestEntry.parse(headers.get(Constants.FRAGMENT_HOST));
                if (entries != null) {
                    if ((boolean)(Object)entries[0].hasAttribute("extension")) {
                        String extension =(String)(Object) entries[0].getAttributeValue("extension");
                        if (extension.equals("bootclasspath")) {
                            String symbolicName =(String)(Object) entries[0].getName();
                            if (!symbolicName.equals(framework.getSymbolicName()) && !symbolicName.equals(Constants.SYSTEM_BUNDLE_SYMBOLICNAME)) {
                                throw new BundleException(new StringBuilder("Trying to install a fragment Bundle(location=").append(location).append(") with extension 'bootclasspath' but host is not System Bundle.").toString(), new UnsupportedOperationException());
                            }
                        }
                    }
                }
                String requiredEE = (String) headers.get(Constants.BUNDLE_REQUIREDEXECUTIONENVIRONMENT);
                if (requiredEE != null) {
                    BundleContext context =(BundleContext)(Object) framework.getBundleContext();
                    String ee =(String)(Object) context.getProperty(Constants.FRAMEWORK_EXECUTIONENVIRONMENT);
                    if (!ee.contains(requiredEE)) {
                        throw new BundleException(new StringBuilder("Bundle(location=").append(location).append(")  requires an unsopperted execution environment (=").append(requiredEE).append(").").toString());
                    }
                }
                if ((boolean)(Object)FrameworkUtil.isFragmentHost(headers)) {
                    bundle =(AbstractBundle)(Object) new FragmentBundle(framework);
                } else {
                    bundle =(AbstractBundle)(Object) new HostBundle(framework);
                }
                File bundlefile = new File((String)(Object)cache,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) Storage.BUNDLE_FILE);
                temp.renameTo(bundlefile);
                long lastModified = bundlefile.lastModified();
                BundleInfo info = new BundleInfo(bundleId, location, lastModified, framework.getInitialBundleStartLevel());
                info.setHeaders(headers);
                info.setCache(cache);
                storeBundleInfo(info);
                bundleInfosByBundle.put(bundle, info);
                BundleURLClassPath classPath =(BundleURLClassPath)(Object) createBundleURLClassPath(bundle, version, bundlefile, cache, false);
                classPathsByBundle.put(bundle, new BundleURLClassPath[] { classPath });
                synchronized (bundlesLock) {
                    bundles =(MyHelperClass)(Object) (Bundle[])(Bundle[])(Object) ArrayUtil.add(bundles, bundle);
                }
                return(Bundle)(Object) bundle;
            } catch (Exception e) {
                if (bundle != null) {
                    File bundleFolder =(File)(Object) getBundleFolder(bundleId);
                    try {
                        IOUtil.delete(bundleFolder);
                    } catch (IOException e1) {
                    }
                }
                e.printStackTrace();
                throw new BundleException(e.getMessage(), e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BUNDLE_REQUIREDEXECUTIONENVIRONMENT;
	public MyHelperClass SYSTEM_BUNDLE_SYMBOLICNAME;
	public MyHelperClass BUNDLE_FILE;
	public MyHelperClass BUNDLE_SYMBOLICNAME;
	public MyHelperClass FRAMEWORK_EXECUTIONENVIRONMENT;
	public MyHelperClass FRAGMENT_HOST;
	public MyHelperClass BUNDLE_VERSION;
public MyHelperClass put(AbstractBundle o0, BundleInfo o1){ return null; }
	public MyHelperClass isFragmentHost(Dictionary o0){ return null; }
	public MyHelperClass add(MyHelperClass o0, AbstractBundle o1){ return null; }
	public MyHelperClass parseVersion(String o0){ return null; }
	public MyHelperClass parse(Object o0){ return null; }
	public MyHelperClass getSymbolicName(){ return null; }
	public MyHelperClass getInitialBundleStartLevel(){ return null; }
	public MyHelperClass put(AbstractBundle o0, BundleURLClassPath[] o1){ return null; }
	public MyHelperClass toDictionary(Manifest o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass storeManifest(Dictionary o0, OutputStream o1){ return null; }
	public MyHelperClass getBundleContext(){ return null; }
	public MyHelperClass getJarManifest(FileInputStream o0){ return null; }
	public MyHelperClass delete(File o0){ return null; }}

class Bundle {

}

class BundleException extends Exception{
	public BundleException(String errorMessage) { super(errorMessage); }
	BundleException(String o0, Exception o1){}
	BundleException(){}
	BundleException(String o0, UnsupportedOperationException o1){}
}

class AdminPermission {
public static MyHelperClass EXTENSIONLIFECYCLE;
AdminPermission(String o0, MyHelperClass o1){}
	AdminPermission(){}}

class AbstractBundle {

}

class Manifest {

}

class Version {

}

class ManifestEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass hasAttribute(String o0){ return null; }
	public MyHelperClass getAttributeValue(String o0){ return null; }}

class BundleContext {

public MyHelperClass getProperty(MyHelperClass o0){ return null; }}

class FragmentBundle {

FragmentBundle(MyHelperClass o0){}
	FragmentBundle(){}}

class HostBundle {

HostBundle(MyHelperClass o0){}
	HostBundle(){}}

class BundleInfo {

BundleInfo(long o0, String o1, long o2, MyHelperClass o3){}
	BundleInfo(){}
	public MyHelperClass setCache(File o0){ return null; }
	public MyHelperClass setHeaders(Dictionary o0){ return null; }}

class BundleURLClassPath {

}
