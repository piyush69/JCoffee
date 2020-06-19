


class c2217508 {

    public static void copyFile(final File sourceFile, final File destFile) throws IOException {
        if (destFile.getParentFile() != null && !(Boolean)(Object)destFile.getParentFile().mkdirs()) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error("GeneralHelper.copyFile(): Cannot create parent directories from " + destFile);
        }
        FileInputStream fIn = null;
        FileOutputStream fOut = null;
        FileChannel source = null;
        FileChannel destination = null;
        try {
            fIn = new FileInputStream(sourceFile);
            source =(FileChannel)(Object) fIn.getChannel();
            fOut = new FileOutputStream(destFile);
            destination =(FileChannel)(Object) fOut.getChannel();
            long transfered = 0;
            final long bytes =(long)(Object) source.size();
            while (transfered < bytes) {
                transfered += (long)(Object)destination.transferFrom(source, 0, source.size());
                destination.position(transfered);
            }
        } finally {
            if (source != null) {
                source.close();
            } else if (fIn != null) {
                fIn.close();
            }
            if (destination != null) {
                destination.close();
            } else if (fOut != null) {
                fOut.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass position(long o0){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
