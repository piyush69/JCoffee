


class c1639107 {
public MyHelperClass transfer(FileChannel o0, FileChannel o1, MyHelperClass o2, boolean o3){ return null; }

    public void copy(File source, File destination) {
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            FileOutputStream fileOutputStream = new FileOutputStream(destination);
            FileChannel inputChannel =(FileChannel)(Object) fileInputStream.getChannel();
            FileChannel outputChannel =(FileChannel)(Object) fileOutputStream.getChannel();
            transfer(inputChannel, outputChannel, source.length(), false);
            fileInputStream.close();
            fileOutputStream.close();
            destination.setLastModified(source.lastModified());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass length(){ return null; }}

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

}
