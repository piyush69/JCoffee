


class c15634393 {
public MyHelperClass getTileFile(int o0, int o1, int o2, MapSource o3){ return null; }

    public boolean copyStoredTileTo(File targetFileName, int x, int y, int zoom, MapSource tileSource) throws IOException {
        File sourceFile =(File)(Object) getTileFile(x, y, zoom, tileSource);
        if (!(Boolean)(Object)sourceFile.exists()) return false;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        long sourceBytes = 0;
        long writtenBytes = 0;
        try {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(targetFileName);
            FileChannel source =(FileChannel)(Object) fis.getChannel();
            FileChannel destination =(FileChannel)(Object) fos.getChannel();
            sourceBytes =(long)(Object) source.size();
            writtenBytes =(long)(Object) destination.transferFrom(source, 0, sourceBytes);
        } finally {
            MyHelperClass Utilities = new MyHelperClass();
            Utilities.closeStream(fis);
//            MyHelperClass Utilities = new MyHelperClass();
            Utilities.closeStream(fos);
        }
        if (writtenBytes != sourceBytes) throw new IOException("Target file's size is not equal to the source file's size!");
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeStream(FileOutputStream o0){ return null; }
	public MyHelperClass closeStream(FileInputStream o0){ return null; }}

class File {

public MyHelperClass exists(){ return null; }}

class MapSource {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, long o2){ return null; }}
