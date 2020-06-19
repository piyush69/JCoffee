


class c1725724 {

    public static boolean nioWriteFile(FileInputStream inputStream, FileOutputStream out) {
        if (inputStream == null && out == null) {
            return false;
        }
        try {
            FileChannel fci =(FileChannel)(Object) inputStream.getChannel();
            FileChannel fco =(FileChannel)(Object) out.getChannel();
            fco.transferFrom(fci, 0, fci.size());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            MyHelperClass FileUtil = new MyHelperClass();
            FileUtil.safeClose(inputStream);
//            MyHelperClass FileUtil = new MyHelperClass();
            FileUtil.safeClose(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass safeClose(FileInputStream o0){ return null; }
	public MyHelperClass safeClose(FileOutputStream o0){ return null; }}

class FileInputStream {

public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
