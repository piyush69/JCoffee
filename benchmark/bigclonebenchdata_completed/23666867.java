


class c23666867 {

    public static void copyFile(File in, File out) {
        try {
            FileChannel inChannel = null, outChannel = null;
            try {
                out.getParentFile().mkdirs();
                inChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
                outChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
                outChannel.transferFrom(inChannel, 0, inChannel.size());
            } finally {
                if (inChannel != null) {
                    inChannel.close();
                }
                if (outChannel != null) {
                    outChannel.close();
                }
            }
        } catch (Exception e) {
            MyHelperClass ObjectUtils = new MyHelperClass();
            ObjectUtils.throwAsError(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass throwAsError(Exception o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }}

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
