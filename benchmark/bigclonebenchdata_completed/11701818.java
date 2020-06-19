


class c11701818 {

    private static void copyFile(File source, File destination) throws IOException, SecurityException {
        if (!(Boolean)(Object)destination.exists()) destination.createNewFile();
        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;
        try {
            sourceChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            destinationChannel =(FileChannel)(Object) (new FileOutputStream(destination).getChannel());
            long count = 0;
            long size =(long)(Object) sourceChannel.size();
            while ((count += (long)(Object)destinationChannel.transferFrom(sourceChannel, 0, size - count)) < size) ;
        } finally {
            if (sourceChannel != null) sourceChannel.close();
            if (destinationChannel != null) destinationChannel.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, long o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
