


class c19476935 {

    public static void copyResource(String src, File dest) throws IOException {
        MyHelperClass ResourceLoader = new MyHelperClass();
        InputStream fin =(InputStream)(Object) ResourceLoader.openResource(src);
        if (fin == null) {
            MyHelperClass LogFactory = new MyHelperClass();
            LogFactory.getLog(ResourceLoader.class).error("Failed to load resource '" + src + "'");
//            MyHelperClass LogFactory = new MyHelperClass();
            LogFactory.getLog(ResourceLoader.class).info("Attempting to open file from from file system");
            fin =(InputStream)(Object) new FileInputStream(src);
        }
        if (fin == null) {
            MyHelperClass LogFactory = new MyHelperClass();
            LogFactory.getLog(ResourceLoader.class).warn("Giving up on copy operation, can't find source '" + src + "'");
            return;
        }
        BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream(dest));
        MyHelperClass COPY_BUFFER_SIZE = new MyHelperClass();
        byte[] buffer = new byte[(int)(Object)COPY_BUFFER_SIZE];
        int readBytes =(int)(Object) fin.read(buffer);
        while (readBytes > -1) {
            fout.write(buffer, 0, readBytes);
            readBytes =(int)(Object) fin.read(buffer);
        }
        fout.close();
        fin.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getLog(Class<ResourceLoader> o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass openResource(String o0){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ResourceLoader {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
