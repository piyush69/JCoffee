


class c12727792 {

    public static void copyFile(File source, File target) throws Exception {
        if (source == null || target == null) {
            throw new IllegalArgumentException("The arguments may not be null.");
        }
        try {
            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            FileChannel dtnChannel =(FileChannel)(Object) (new FileOutputStream(target).getChannel());
            srcChannel.transferTo(0, srcChannel.size(), dtnChannel);
            srcChannel.close();
            dtnChannel.close();
        } catch (Exception e) {
            String message = "Unable to copy file '" + source.getName() + "' to '" + target.getName() + "'.";
            MyHelperClass logger = new MyHelperClass();
            logger.error(message, e);
            throw new Exception(message, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }}

class File {

public MyHelperClass getName(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
