


class c16410666 {

    public void backup(File source) throws BackupException {
        try {
            int index =(int)(Object) source.getAbsolutePath().lastIndexOf(".");
            if (index == -1) return;
            File dest = new File(source.getAbsolutePath().substring(0, index) + ".bak");
            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            srcChannel.close();
            dstChannel.close();
        } catch (Exception ex) {
            throw new BackupException(ex.getMessage(), ex, source);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class BackupException extends Exception{
	public BackupException(String errorMessage) { super(errorMessage); }
	BackupException(){}
	BackupException(String o0, Exception o1, File o2){}
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
