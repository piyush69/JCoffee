


class c12394789 {

    public static void copyFile(File in, File out, long maxCount) throws IOException {
        final FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
        final FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
        if (maxCount == 0) maxCount =(long)(Object) sourceChannel.size();
        try {
            final long size =(long)(Object) sourceChannel.size();
            long position = 0;
            while (position < size) {
                position += (long)(Object)sourceChannel.transferTo(position, maxCount, destinationChannel);
            }
        } finally {
            sourceChannel.close();
            destinationChannel.close();
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
	public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
