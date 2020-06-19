


class c6305269 {
public MyHelperClass verifyOrCreateParentPath(MyHelperClass o0){ return null; }

    protected void copyFile(File sourceFile, File destFile) {
        FileChannel in = null;
        FileChannel out = null;
        try {
            if (!(Boolean)(Object)verifyOrCreateParentPath(destFile.getParentFile())) {
                throw new IOException("Parent directory path " + destFile.getAbsolutePath() + " did not exist and could not be created");
            }
            if ((Boolean)(Object)destFile.exists() || (Boolean)(Object)destFile.createNewFile()) {
                in =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
                out =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
                in.transferTo(0, in.size(), out);
            } else {
                throw new IOException("Couldn't create file for " + destFile.getAbsolutePath());
            }
        } catch (IOException ioe) {
            if ((boolean)(Object)destFile.exists() &&(int)(Object) destFile.length() < (int)(Object)sourceFile.length()) {
                destFile.delete();
            }
            ioe.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Throwable t) {
            }
            try {
                out.close();
            } catch (Throwable t) {
            }
            destFile.setLastModified(sourceFile.lastModified());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
