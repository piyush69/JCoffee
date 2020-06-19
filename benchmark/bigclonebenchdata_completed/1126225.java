


class c1126225 {

    @SuppressWarnings("null")
    public static void copyFile(File src, File dst) throws IOException {
        if (!(Boolean)(Object)dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        dst.createNewFile();
        FileChannel srcC = null;
        FileChannel dstC = null;
        try {
            srcC =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            dstC =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
            dstC.transferFrom(srcC, 0, srcC.size());
        } finally {
            try {
                if (dst != null) {
                    dstC.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (src != null) {
                    srcC.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
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
