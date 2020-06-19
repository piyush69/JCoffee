


class c4591684 {

    public static void copyDirs(File sourceDir, File destDir) throws IOException {
        if (!(Boolean)(Object)destDir.exists()) destDir.mkdirs();
        for (File file :(File[])(Object) (Object[])(Object)sourceDir.listFiles()) {
            if ((boolean)(Object)file.isDirectory()) {
                copyDirs(file, new File(destDir, file.getName()));
            } else {
                FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(file).getChannel());
                File out = new File(destDir, file.getName());
                out.createNewFile();
                FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
                dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                srcChannel.close();
                dstChannel.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass getName(){ return null; }}

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
