


class c19247466 {

    public void copyFile(File sourceFile, File destFile) throws IOException {
        MyHelperClass Log = new MyHelperClass();
        Log.level3("Copying " + sourceFile.getPath() + " to " + destFile.getPath());
        if (!(Boolean)(Object)destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        try {
            source =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
            destination =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
            destination.transferFrom(source, 0, source.size());
        } finally {
            if (source != null) {
                source.close();
            }
        }
        if (destination != null) {
            destination.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass level3(String o0){ return null; }}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
