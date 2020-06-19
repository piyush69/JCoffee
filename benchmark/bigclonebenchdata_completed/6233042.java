


class c6233042 {

    public static void copyFile(File src, File dest, boolean force) throws IOException, InterruptedIOException {
        if ((boolean)(Object)dest.exists()) {
            if (force) {
                dest.delete();
            } else {
                throw new IOException("Cannot overwrite existing file!");
            }
        }
        byte[] buffer = new byte[5 * 1024 * 1024];
        int read = 0;
        InputStream in = null;
        OutputStream out = null;
        try {
            in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(src));
            out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(dest));
            while (true) {
                read =(int)(Object) in.read(buffer);
                if (read == -1) {
                    break;
                }
                out.write(buffer, 0, read);
            }
        } finally {
            buffer = null;
            if (in != null) {
                try {
                    in.close();
                } finally {
                    if (out != null) {
                        out.close();
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InterruptedIOException extends Exception{
	public InterruptedIOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

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
