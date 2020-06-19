


class c17907353 {

    public static void resourceToFile(final String resource, final String filePath) throws IOException {
        MyHelperClass log = new MyHelperClass();
        log.debug("Classloader is " + IOCopyUtils.class.getClassLoader());
        InputStream in =(InputStream)(Object) IOCopyUtils.class.getResourceAsStream(resource);
        if (in == null) {
//            MyHelperClass log = new MyHelperClass();
            log.warn("Resource not '" + resource + "' found. Try to prefix with '/'");
            in =(InputStream)(Object) IOCopyUtils.class.getResourceAsStream("/" + resource);
        }
        if (in == null) {
            throw new IOException("Resource not '" + resource + "' found.");
        }
        final File file = new File(filePath);
        MyHelperClass FileUtils = new MyHelperClass();
        final OutputStream out =(OutputStream)(Object) FileUtils.openOutputStream(file);
        MyHelperClass IOUtils = new MyHelperClass();
        final int bytes =(int)(Object) IOUtils.copy(in, out);
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(out);
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(in);
//        MyHelperClass log = new MyHelperClass();
        log.debug("Copied resource '" + resource + "' to file " + filePath + " (" + bytes + " bytes)");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass openOutputStream(File o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class IOCopyUtils {

}

class InputStream {

}

class File {

File(String o0){}
	File(){}}

class OutputStream {

}
