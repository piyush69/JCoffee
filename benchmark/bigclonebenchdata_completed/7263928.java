


class c7263928 {

    private void copyFile(File src_file, File dest_file) {
        InputStream src_stream = null;
        OutputStream dest_stream = null;
        try {
            int b;
            src_stream =(InputStream)(Object) new BufferedInputStream(new FileInputStream(src_file));
            dest_stream =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(dest_file));
            while ((b =(int)(Object) src_stream.read()) != -1) dest_stream.write(b);
        } catch (Exception e) {
            MyHelperClass XRepository = new MyHelperClass();
            XRepository.getLogger().warning(this, "Error on copying the plugin file!");
//            MyHelperClass XRepository = new MyHelperClass();
            XRepository.getLogger().warning(this, e);
        } finally {
            try {
                src_stream.close();
                dest_stream.close();
            } catch (Exception ex2) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(c7263928 o0, String o1){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass warning(c7263928 o0, Exception o1){ return null; }}

class File {

}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
