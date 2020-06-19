


class c1015744 {

    public static void copyFile(File in, File out) throws IOException {
        FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
        try {
            FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
            try {
                sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
            } finally {
                destinationChannel.close();
            }
        } finally {
            sourceChannel.close();
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
