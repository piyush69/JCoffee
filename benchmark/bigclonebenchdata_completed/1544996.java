


class c1544996 {
public static MyHelperClass ensureClose(FileChannel o0, FileChannel o1){ return null; }
//public MyHelperClass ensureClose(FileChannel o0, FileChannel o1){ return null; }

    public static void transfer(FileInputStream fileInStream, FileOutputStream fileOutStream) throws IOException {
        FileChannel fileInChannel =(FileChannel)(Object) fileInStream.getChannel();
        FileChannel fileOutChannel =(FileChannel)(Object) fileOutStream.getChannel();
        long fileInSize =(long)(Object) fileInChannel.size();
        try {
            long transferred =(long)(Object) fileInChannel.transferTo(0, fileInSize, fileOutChannel);
            if (transferred != fileInSize) {
                throw new IOException("transfer() did not complete");
            }
        } finally {
            ensureClose(fileInChannel, fileOutChannel);
        }
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

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, long o1, FileChannel o2){ return null; }}
