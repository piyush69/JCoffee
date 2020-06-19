


class c5061606 {
public MyHelperClass Logger;
	public MyHelperClass IOUtils;
	public MyHelperClass SettingsUtils;
	public MyHelperClass FileLocator;
	public MyHelperClass getBundle(){ return null; }

    protected void createSettingsIfNecessary() throws IOException {
        OutputStream out = null;
        try {
            MyHelperClass SettingsUtils = new MyHelperClass();
            final File fSettings =(File)(Object) SettingsUtils.getSettingsFile();
            if (!(Boolean)(Object)fSettings.exists()) {
                fSettings.createNewFile();
                final Path src = new Path("mvn/settings.xml");
                final InputStream in =(InputStream)(Object) FileLocator.openStream(getBundle(), src, false);
                out =(OutputStream)(Object) new FileOutputStream(SettingsUtils.getSettings(), true);
                IOUtils.copy(in, out);
            } else {
                Logger.getLog().info("File settings.xml already exists at " + fSettings);
            }
        } finally {
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSettings(){ return null; }
	public MyHelperClass getLog(){ return null; }
	public MyHelperClass getSettingsFile(){ return null; }
	public MyHelperClass openStream(MyHelperClass o0, Path o1, boolean o2){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class InputStream {

}

class FileOutputStream {

FileOutputStream(MyHelperClass o0, boolean o1){}
	FileOutputStream(){}}
