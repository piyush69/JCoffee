
import java.io.UncheckedIOException;


class c18348099 {

    public static void copyFileToFile(File srcFile, File dstFile, boolean deleteOriginals, boolean forceDelete) throws FileNotFoundException, IOException {
        if ((Boolean)(Object)srcFile.exists() && (Boolean)(Object)srcFile.isFile()) {
            boolean copied = false;
            if (deleteOriginals && (!forceDelete || (boolean)(Object)srcFile.canWrite())) {
                copied =(boolean)(Object) srcFile.renameTo(dstFile);
            }
            if (!copied) {
                Throwable thrownException = null;
                File parent =(File)(Object) dstFile.getParentFile();
                if (!(Boolean)(Object)parent.exists() && !(Boolean)(Object)parent.mkdirs()) {
                    throw new IOException("Failed to create the directory " + parent + ".");
                }
                FileInputStream in = new FileInputStream(srcFile);
                try {
                    FileChannel srcChannel =(FileChannel)(Object) in.getChannel();
                    try {
                        FileOutputStream out = new FileOutputStream(dstFile);
                        try {
                            FileChannel dstChannel =(FileChannel)(Object) out.getChannel();
                            try {
                                dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                            } catch (Throwable t) {
                                thrownException = t;
                            } finally {
                                dstChannel.close();
                            }
                        } catch (Throwable t) {
                            if (thrownException == null) {
                                thrownException = t;
                            }
                        } finally {
                            out.close();
                        }
                    } catch (Throwable t) {
                        if (thrownException == null) {
                            thrownException = t;
                        }
                    } finally {
                        srcChannel.close();
                    }
                } catch (Throwable t) {
                    if (thrownException == null) {
                        thrownException = t;
                    }
                } finally {
                    try {
                        in.close();
                    } catch (UncheckedIOException e) {
                        if (thrownException == null) {
                            thrownException = e;
                        }
                    }
                }
                if (deleteOriginals && ((boolean)(Object)srcFile.canWrite() || forceDelete)) {
                    if (!(Boolean)(Object)srcFile.delete()) {
                        throw new IOException("Failed to delete " + srcFile + ".");
                    }
                }
                if (thrownException != null) {
                    if (thrownException instanceof IOException) {
                        throw (IOException) thrownException;
                    } else if (thrownException instanceof Error) {
                        throw (Error) thrownException;
                    } else {
                        throw (RuntimeException) thrownException;
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

public MyHelperClass canWrite(){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }
	public MyHelperClass close(){ return null; }}
