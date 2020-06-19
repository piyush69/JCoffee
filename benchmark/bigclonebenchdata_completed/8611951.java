


class c8611951 {

    private static void copyFile(File f) {
        try {
            MyHelperClass baseDir = new MyHelperClass();
            String baseName =(String)(Object) baseDir.getCanonicalPath();
            String fullPath =(String)(Object) f.getCanonicalPath();
            String nameSufix = fullPath.substring(baseName.length() + 1);
            MyHelperClass FileDestDir = new MyHelperClass();
            File destFile = new File(FileDestDir, nameSufix);
            destFile.getParentFile().mkdirs();
            destFile.createNewFile();
            FileChannel fromChannel =(FileChannel)(Object) (new FileInputStream(f).getChannel());
            FileChannel toChannel =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
            fromChannel.transferTo(0, fromChannel.size(), toChannel);
            fromChannel.close();
            toChannel.close();
            destFile.setLastModified(f.lastModified());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getCanonicalPath(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

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
