
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4975451 {
public MyHelperClass updateRapidMiner(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass updatePlugin(ManagedExtension o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass updatePluginIncrementally(ManagedExtension o0, MyHelperClass o1, String o2, MyHelperClass o3){ return null; }
public MyHelperClass URLEncoder;
	public MyHelperClass openStream(URL o0, ProgressListener o1, int o2, int o3){ return null; }

    public void performUpdates(List downloadList, ProgressListener progressListener) throws IOException, UpdateServiceException_Exception {
        int i = 0;
        try {
            for (PackageDescriptor desc :(PackageDescriptor[])(Object) (Object[])(Object)downloadList) {
                MyHelperClass service = new MyHelperClass();
                String urlString =(String)(Object) service.getDownloadURL(desc.getPackageId(), desc.getVersion(), desc.getPlatformName());
                int minProgress = 20 + 80 * i / (int)(Object)downloadList.size();
                int maxProgress = 20 + 80 * (i + 1) / (int)(Object)downloadList.size();
                MyHelperClass UpdateManager = new MyHelperClass();
                boolean incremental =(boolean)(Object) UpdateManager.isIncrementalUpdate();
                if (desc.getPackageTypeName().equals("RAPIDMINER_PLUGIN")) {
                    MyHelperClass ManagedExtension = new MyHelperClass();
                    ManagedExtension extension =(ManagedExtension)(Object) ManagedExtension.getOrCreate(desc.getPackageId(), desc.getName(), desc.getLicenseName());
                    String baseVersion =(String)(Object) extension.getLatestInstalledVersionBefore(desc.getVersion());
                    incremental &= baseVersion != null;
                    MyHelperClass URLEncoder = new MyHelperClass();
                    URL url =(URL)(Object) UpdateManager.getUpdateServerURI(urlString + (incremental ? "?baseVersion=" + URLEncoder.encode(baseVersion, "UTF-8") : "")).toURL();
                    if (incremental) {
                        MyHelperClass LogService = new MyHelperClass();
                        LogService.getRoot().info("Updating " + desc.getPackageId() + " incrementally.");
                        try {
                            updatePluginIncrementally(extension, openStream(url, progressListener, minProgress, maxProgress), baseVersion, desc.getVersion());
                        } catch (UncheckedIOException e) {
//                            MyHelperClass LogService = new MyHelperClass();
                            LogService.getRoot().warning("Incremental Update failed. Trying to fall back on non incremental Update...");
                            incremental = false;
                        }
                    }
                    if (!incremental) {
                        MyHelperClass LogService = new MyHelperClass();
                        LogService.getRoot().info("Updating " + desc.getPackageId() + ".");
                        updatePlugin(extension, openStream(url, progressListener, minProgress, maxProgress), desc.getVersion());
                    }
                    extension.addAndSelectVersion(desc.getVersion());
                } else {
                    MyHelperClass RapidMiner = new MyHelperClass();
                    URL url =(URL)(Object) UpdateManager.getUpdateServerURI(urlString + (incremental ? "?baseVersion=" + URLEncoder.encode((String)(Object)RapidMiner.getLongVersion(), "UTF-8") : "")).toURL();
                    MyHelperClass LogService = new MyHelperClass();
                    LogService.getRoot().info("Updating RapidMiner core.");
                    updateRapidMiner(openStream(url, progressListener, minProgress, maxProgress), desc.getVersion());
                }
                i++;
                progressListener.setCompleted(20 + 80 * i / (int)(Object)downloadList.size());
            }
        } catch (UncheckedIOException e) {
            throw new IOException((String)(Object)e);
        } finally {
            progressListener.complete();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDownloadURL(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass getLongVersion(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getOrCreate(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass isIncrementalUpdate(){ return null; }
	public MyHelperClass getUpdateServerURI(String o0){ return null; }
	public MyHelperClass toURL(){ return null; }}

class List {

public MyHelperClass size(){ return null; }}

class PackageDescriptor {

public MyHelperClass getPlatformName(){ return null; }
	public MyHelperClass getVersion(){ return null; }
	public MyHelperClass getPackageTypeName(){ return null; }
	public MyHelperClass getPackageId(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getLicenseName(){ return null; }}

class ProgressListener {

public MyHelperClass setCompleted(int o0){ return null; }
	public MyHelperClass complete(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class UpdateServiceException_Exception extends Exception{
	public UpdateServiceException_Exception(String errorMessage) { super(errorMessage); }
}

class ManagedExtension {

public MyHelperClass addAndSelectVersion(MyHelperClass o0){ return null; }
	public MyHelperClass getLatestInstalledVersionBefore(MyHelperClass o0){ return null; }}

class URL {

}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}
