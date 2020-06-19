


class c8317691 {

        protected void copyFile(File src, File dest) throws Exception {
            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            FileChannel destChannel =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            long transferred =(long)(Object) destChannel.transferFrom(srcChannel, 0, srcChannel.size());
            if (transferred != (long)(Object)srcChannel.size()) throw new Exception("Could not transfer entire file");
            srcChannel.close();
            destChannel.close();
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

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
