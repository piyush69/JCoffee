


class c16378626 {

    public static void copy(String pstrFileFrom, String pstrFileTo) {
        try {
            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(pstrFileFrom).getChannel());
            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(pstrFileTo).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            srcChannel.close();
            dstChannel.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
