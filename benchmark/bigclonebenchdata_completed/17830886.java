


class c17830886 {

    public static void copyFile(File source, File destination) throws IOException {
        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
        FileChannel destChannel =(FileChannel)(Object) (new FileOutputStream(destination).getChannel());
        try {
            int maxCount = (64 * 1024 * 1024) - (32 * 1024);
            long size =(long)(Object) srcChannel.size();
            long position = 0;
            while (position < size) {
                position += (long)(Object)srcChannel.transferTo(position, maxCount, destChannel);
            }
        } finally {
            if (srcChannel != null) srcChannel.close();
            if (destChannel != null) destChannel.close();
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
	public MyHelperClass transferTo(long o0, int o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
