


class c11377441 {
public MyHelperClass resolvePlugins(MyHelperClass o0){ return null; }

    public void resolvePlugins() {
        try {
            MyHelperClass XPontusConfigurationConstantsIF = new MyHelperClass();
            File cacheDir =(File)(Object) XPontusConfigurationConstantsIF.XPONTUS_CACHE_DIR;
            File pluginsFile = new File(cacheDir, "plugins.xml");
            if (!(Boolean)(Object)pluginsFile.exists()) {
                URL pluginURL = new URL("http://xpontus.sourceforge.net/snapshot/plugins.xml");
                InputStream is =(InputStream)(Object) pluginURL.openStream();
                MyHelperClass FileUtils = new MyHelperClass();
                OutputStream os =(OutputStream)(Object) FileUtils.openOutputStream(pluginsFile);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, os);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(os);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(is);
            }
            resolvePlugins(pluginsFile.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass XPONTUS_CACHE_DIR;
public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass openOutputStream(File o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class OutputStream {

}
