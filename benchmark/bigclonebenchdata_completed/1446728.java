


class c1446728 {
public MyHelperClass FileUtils;
	public MyHelperClass IOUtils;
	public MyHelperClass correctFileName(String o0){ return null; }

    private void backupFile(ZipOutputStream out, String base, String fn) throws IOException {
        MyHelperClass FileUtils = new MyHelperClass();
        String f =(String)(Object) FileUtils.getAbsolutePath(fn);
//        MyHelperClass FileUtils = new MyHelperClass();
        base =(String)(Object) FileUtils.getAbsolutePath(base);
        if (!f.startsWith(base)) {
            MyHelperClass Message = new MyHelperClass();
            Message.throwInternalError(f + " does not start with " + base);
        }
        f = f.substring(base.length());
        f =(String)(Object) correctFileName(f);
        out.putNextEntry(new ZipEntry(f));
        InputStream in =(InputStream)(Object) FileUtils.openFileInputStream(fn);
        IOUtils.copyAndCloseInput(in, out);
        out.closeEntry();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openFileInputStream(String o0){ return null; }
	public MyHelperClass throwInternalError(String o0){ return null; }
	public MyHelperClass getAbsolutePath(String o0){ return null; }
	public MyHelperClass copyAndCloseInput(InputStream o0, ZipOutputStream o1){ return null; }}

class ZipOutputStream {

public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class InputStream {

}
