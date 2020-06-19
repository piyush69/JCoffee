


class c14408302 {

    public static void copyFile(File source, File destination) throws IOException {
        if (!(Boolean)(Object)source.isFile()) {
            throw new IOException(source + " is not a file.");
        }
        if ((boolean)(Object)destination.exists()) {
            throw new IOException("Destination file " + destination + " is already exist.");
        }
        FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
        FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(destination).getChannel());
        try {
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } finally {
            inChannel.close();
            outChannel.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
