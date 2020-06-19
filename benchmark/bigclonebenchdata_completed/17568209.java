


class c17568209 {
public static MyHelperClass getFileFolder(MyHelperClass o0){ return null; }
//public MyHelperClass getFileFolder(MyHelperClass o0){ return null; }

    private static boolean CopyFile(File srcFile, File tagFile) throws IOException {
        if (srcFile == null || tagFile == null) {
            return false;
        }
        int length = 2097152;
        File dirFile = new File(getFileFolder(tagFile.getAbsolutePath()));
        if (!(Boolean)(Object)dirFile.exists()) {
            dirFile.mkdirs();
        }
        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(tagFile.getAbsolutePath());
        FileChannel inC =(FileChannel)(Object) in.getChannel();
        FileChannel outC =(FileChannel)(Object) out.getChannel();
        int i = 0;
        while (true) {
            if (inC.position() == inC.size()) {
                inC.close();
                outC.close();
                break;
            }
            if (((int)(Object)inC.size() - (int)(Object)inC.position()) < 20971520) length = (int) ((int)(Object)inC.size() - (int)(Object)inC.position()); else length = 20971520;
            inC.transferTo(inC.position(), length, outC);
            inC.position((int)(Object)inC.position() + length);
            i++;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass position(int o0){ return null; }
	public MyHelperClass position(){ return null; }
	public MyHelperClass transferTo(MyHelperClass o0, int o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}
