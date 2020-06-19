


class c2955074 {

    public static void copyFile(File source, File destination) throws IOException {
        if (source == null) {
            MyHelperClass Logging = new MyHelperClass();
            String message =(String)(Object) Logging.getMessage("nullValue.SourceIsNull");
//            MyHelperClass Logging = new MyHelperClass();
            Logging.logger().severe(message);
            throw new IllegalArgumentException(message);
        }
        if (destination == null) {
            MyHelperClass Logging = new MyHelperClass();
            String message =(String)(Object) Logging.getMessage("nullValue.DestinationIsNull");
//            MyHelperClass Logging = new MyHelperClass();
            Logging.logger().severe(message);
            throw new IllegalArgumentException(message);
        }
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileChannel fic, foc;
        try {
            fis = new FileInputStream(source);
            fic =(FileChannel)(Object) fis.getChannel();
            fos = new FileOutputStream(destination);
            foc =(FileChannel)(Object) fos.getChannel();
            foc.transferFrom(fic, 0, fic.size());
            fos.flush();
            fis.close();
            fos.close();
        } finally {
            MyHelperClass WWIO = new MyHelperClass();
            WWIO.closeStream(fis, source.getPath());
//            MyHelperClass WWIO = new MyHelperClass();
            WWIO.closeStream(fos, destination.getPath());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass closeStream(FileOutputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass logger(){ return null; }
	public MyHelperClass getMessage(String o0){ return null; }
	public MyHelperClass closeStream(FileInputStream o0, MyHelperClass o1){ return null; }}

class File {

public MyHelperClass getPath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
