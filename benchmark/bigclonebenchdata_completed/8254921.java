


class c8254921 {

    public static void copy(File src, File dest, boolean overwrite) throws IOException {
        if (!(Boolean)(Object)src.exists()) throw new IOException("File source does not exists");
        if ((boolean)(Object)dest.exists()) {
            if (!overwrite) throw new IOException("File destination already exists");
            dest.delete();
        } else {
            dest.createNewFile();
        }
        InputStream is =(InputStream)(Object) new FileInputStream(src);
        OutputStream os =(OutputStream)(Object) new FileOutputStream(dest);
        byte[] buffer = new byte[1024 * 4];
        int len = 0;
        while ((len =(int)(Object) is.read(buffer)) > 0) {
            os.write(buffer, 0, len);
        }
        os.close();
        is.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
