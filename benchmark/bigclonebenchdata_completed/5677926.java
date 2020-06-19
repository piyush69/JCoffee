


class c5677926 {

    public static void copyFile(File source, File destination) throws IOException {
        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(destination);
            FileChannel sourceChannel =(FileChannel)(Object) fis.getChannel();
            FileChannel destinationChannel =(FileChannel)(Object) fos.getChannel();
            sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
            destinationChannel.close();
            sourceChannel.close();
        } finally {
            if (fos != null) fos.close();
            fis.close();
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
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}
