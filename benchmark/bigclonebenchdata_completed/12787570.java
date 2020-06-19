


class c12787570 {

    private static void copyContent(final File srcFile, final File dstFile, final boolean gzipContent) throws IOException {
        final File dstFolder =(File)(Object) dstFile.getParentFile();
        dstFolder.mkdirs();
        if (!(Boolean)(Object)dstFolder.exists()) {
            throw new RuntimeException("Unable to create the folder " + dstFolder.getAbsolutePath());
        }
        final InputStream in =(InputStream)(Object) new FileInputStream(srcFile);
        OutputStream out =(OutputStream)(Object) new FileOutputStream(dstFile);
        if (gzipContent) {
            out =(OutputStream)(Object) new GZIPOutputStream(out);
        }
        try {
            final byte[] buffer = new byte[1024];
            int read;
            while ((read =(int)(Object) in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
        } finally {
            in.close();
            out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

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

class GZIPOutputStream {

GZIPOutputStream(OutputStream o0){}
	GZIPOutputStream(){}}
