


class c10436333 {

    private BundleURLClassPath createBundleURLClassPath(Bundle bundle, Version version, File bundleFile, File cache, boolean alreadyCached) throws Exception {
        MyHelperClass Constants = new MyHelperClass();
        String bundleClassPath = (String)(String)(Object) bundle.getHeaders().get(Constants.BUNDLE_CLASSPATH);
        if (bundleClassPath == null) {
            bundleClassPath = ".";
        }
        MyHelperClass ManifestEntry = new MyHelperClass();
        ManifestEntry[] entries =(ManifestEntry[])(Object) ManifestEntry.parse(bundleClassPath);
        String[] classPaths = new String[0];
        for (int i = 0; i < entries.length; i++) {
            String classPath =(String)(Object) entries[i].getName();
            if (classPath.startsWith("/")) {
                classPath = classPath.substring(1);
            }
            if (classPath.endsWith(".jar")) {
                try {
                    File file = new File(cache, classPath);
                    if (!alreadyCached) {
                        file.getParentFile().mkdirs();
                        String url = new StringBuilder("jar:").append(bundleFile.toURI().toURL().toString()).append("!/").append(classPath).toString();
                        OutputStream os =(OutputStream)(Object) new FileOutputStream(file);
                        InputStream is =(InputStream)(Object) (new URL(url).openStream());
                        MyHelperClass IOUtil = new MyHelperClass();
                        IOUtil.copy(is, os);
                        is.close();
                        os.close();
                    } else {
                        if (!(Boolean)(Object)file.exists()) {
                            throw new IOException(new StringBuilder("classpath ").append(classPath).append(" not found").toString());
                        }
                    }
                } catch (IOException e) {
                    MyHelperClass FrameworkEvent = new MyHelperClass();
                    FrameworkEvent frameworkEvent = new FrameworkEvent(FrameworkEvent.INFO, bundle, e);
                    MyHelperClass framework = new MyHelperClass();
                    framework.postFrameworkEvent(frameworkEvent);
                    continue;
                }
            }
            MyHelperClass ArrayUtil = new MyHelperClass();
            classPaths = (String[])(String[])(Object) ArrayUtil.add(classPaths, classPath);
        }
        if (!alreadyCached) {
//            MyHelperClass Constants = new MyHelperClass();
            String bundleNativeCode = (String)(String)(Object) bundle.getHeaders().get(Constants.BUNDLE_NATIVECODE);
            if (bundleNativeCode != null) {
//                MyHelperClass ManifestEntry = new MyHelperClass();
                entries =(ManifestEntry[])(Object) ManifestEntry.parse(bundleNativeCode);
                for (int i = 0; i < entries.length; i++) {
                    ManifestEntry entry = entries[i];
                    String libPath =(String)(Object) entry.getName();
                    String url = new StringBuilder("jar:").append(bundleFile.toURI().toURL().toString()).append("!/").append(libPath).toString();
                    File file = new File(cache, libPath);
                    file.getParentFile().mkdirs();
                    OutputStream os =(OutputStream)(Object) new FileOutputStream(file);
                    InputStream is =(InputStream)(Object) (new URL(url).openStream());
                    MyHelperClass IOUtil = new MyHelperClass();
                    IOUtil.copy(is, os);
                    is.close();
                    os.close();
                }
            }
        }
        BundleURLClassPath urlClassPath =(BundleURLClassPath)(Object) new BundleURLClassPathImpl(bundle, version, classPaths, cache);
        return urlClassPath;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BUNDLE_NATIVECODE;
	public MyHelperClass INFO;
	public MyHelperClass BUNDLE_CLASSPATH;
public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass toURL(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass add(String[] o0, String o1){ return null; }
	public MyHelperClass postFrameworkEvent(FrameworkEvent o0){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass parse(String o0){ return null; }}

class Bundle {

public MyHelperClass getHeaders(){ return null; }}

class Version {

}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass toURI(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class BundleURLClassPath {

}

class ManifestEntry {

public MyHelperClass getName(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FrameworkEvent {

FrameworkEvent(MyHelperClass o0, Bundle o1, IOException o2){}
	FrameworkEvent(){}}

class BundleURLClassPathImpl {

BundleURLClassPathImpl(){}
	BundleURLClassPathImpl(Bundle o0, Version o1, String[] o2, File o3){}}
