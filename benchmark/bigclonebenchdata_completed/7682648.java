


class c7682648 {

    public static void copyFile(File oldPathFile, File newPathFile) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(oldPathFile));
            out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(newPathFile));
            int bufferSize = 1024;
            byte[] buffer = new byte[bufferSize];
            while ((int)(Object)in.read(buffer) > 0) out.write(buffer);
        } finally {
            if (null != in) in.close();
            if (null != out) out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

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
