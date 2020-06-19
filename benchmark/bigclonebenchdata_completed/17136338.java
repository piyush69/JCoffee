


class c17136338 {
public MyHelperClass Logger;
	public MyHelperClass IOUtils;
	public MyHelperClass FileLocator;
	public MyHelperClass getBundle(){ return null; }
	public MyHelperClass getWeavingFolder(){ return null; }
	public MyHelperClass getWeavingPath(){ return null; }

    protected void checkWeavingJar() throws IOException {
        OutputStream out = null;
        try {
            final File weaving = new File(getWeavingPath());
            if (!(Boolean)(Object)weaving.exists()) {
                new File(getWeavingFolder()).mkdir();
                weaving.createNewFile();
                final Path src = new Path("weaving/openfrwk-weaving.jar");
                final InputStream in =(InputStream)(Object) FileLocator.openStream(getBundle(), src, false);
                out =(OutputStream)(Object) new FileOutputStream(getWeavingPath(), true);
                IOUtils.copy(in, out);
                Logger.log(Logger.INFO, "Put weaving jar at location " + weaving);
            } else {
                Logger.getLog().info("File openfrwk-weaving.jar already exists at " + weaving);
            }
        } catch (final SecurityException e) {
            Logger.log(Logger.ERROR, "[SECURITY EXCEPTION] Not enough privilegies to create " + "folder and copy NexOpen weaving jar at location " + getWeavingFolder());
            Logger.logException(e);
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
public MyHelperClass ERROR;
	public MyHelperClass INFO;
public MyHelperClass logException(SecurityException o0){ return null; }
	public MyHelperClass getLog(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass openStream(MyHelperClass o0, Path o1, boolean o2){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass exists(){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class InputStream {

}

class FileOutputStream {

FileOutputStream(MyHelperClass o0, boolean o1){}
	FileOutputStream(){}}
