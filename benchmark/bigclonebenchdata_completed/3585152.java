


class c3585152 {

    public static void copy(FileInputStream from, FileOutputStream to) throws IOException {
        FileChannel fromChannel =(FileChannel)(Object) from.getChannel();
        FileChannel toChannel =(FileChannel)(Object) to.getChannel();
        copy((FileInputStream)(Object)fromChannel,(FileOutputStream)(Object) toChannel);
        fromChannel.close();
        toChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }}
