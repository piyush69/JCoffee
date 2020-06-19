


class c20209162 {

    public java.io.File gzip(java.io.File file) throws Exception {
        java.io.File tmp = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            tmp = java.io.File.createTempFile(file.getName(), ".gz");
            tmp.deleteOnExit();
            is =(InputStream)(Object) new BufferedInputStream(new FileInputStream((File)(Object)file));
            os =(OutputStream)(Object) new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream((File)(Object)tmp)));
            byte[] buf = new byte[4096];
            int nread = -1;
            while ((nread =(int)(Object) is.read(buf)) != -1) {
                os.write(buf, 0, nread);
            }
            os.flush();
        } finally {
            os.close();
            is.close();
        }
        return tmp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class GZIPOutputStream {

GZIPOutputStream(){}
	GZIPOutputStream(BufferedOutputStream o0){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class File {

}
