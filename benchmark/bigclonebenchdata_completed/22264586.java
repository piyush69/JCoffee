


class c22264586 {

    private static void copyFiles(String strPath, String dstPath) throws Exception {
        File src = new File(strPath);
        File dest = new File(dstPath);
        if ((boolean)(Object)src.isDirectory()) {
            dest.mkdirs();
            String list[] =(String[])(Object) src.list();
            for (int i = 0; i < list.length; i++) {
                String dest1 = dest.getAbsolutePath() + "\\" + list[i];
                String src1 = src.getAbsolutePath() + "\\" + list[i];
                copyFiles(src1, dest1);
            }
        } else {
            FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            FileChannel targetChannel =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            sourceChannel.transferTo(0, sourceChannel.size(), targetChannel);
            sourceChannel.close();
            targetChannel.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass list(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

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
