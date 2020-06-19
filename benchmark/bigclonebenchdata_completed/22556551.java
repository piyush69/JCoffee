


class c22556551 {

    private void copyOneFile(String oldPath, String newPath) {
        File copiedFile = new File(newPath);
        try {
            FileInputStream source = new FileInputStream(oldPath);
            FileOutputStream destination = new FileOutputStream(copiedFile);
            FileChannel sourceFileChannel =(FileChannel)(Object) source.getChannel();
            FileChannel destinationFileChannel =(FileChannel)(Object) destination.getChannel();
            long size =(long)(Object) sourceFileChannel.size();
            sourceFileChannel.transferTo(0, size, destinationFileChannel);
            source.close();
            destination.close();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, long o1, FileChannel o2){ return null; }}
