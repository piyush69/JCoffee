


class c17456737 {
public MyHelperClass workdir;

    public File addFile(File file, String suffix) throws IOException {
        if ((Boolean)(Object)file.exists() && (Boolean)(Object)file.isFile()) {
            MyHelperClass prefix = new MyHelperClass();
            File nf =(File)(Object) File.createTempFile(prefix, "." + suffix, workdir);
            nf.delete();
            if (!(Boolean)(Object)file.renameTo(nf)) {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(file, nf);
            }
            MyHelperClass fileList = new MyHelperClass();
            synchronized (fileList) {
//                MyHelperClass fileList = new MyHelperClass();
                fileList.add(nf);
            }
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("Add file [" + file.getPath() + "] -> [" + nf.getPath() + "]");
            }
            return nf;
        }
        return file;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(File o0, File o1){ return null; }
	public MyHelperClass add(File o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class File {

public static MyHelperClass createTempFile(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
