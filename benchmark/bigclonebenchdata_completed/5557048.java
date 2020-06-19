


class c5557048 {

    private void copyDirContent(String fromDir, String toDir) throws Exception {
        String fs = System.getProperty("file.separator");
        File[] files =(File[])(Object) (new File(fromDir).listFiles());
        if (files == null) {
            throw new FileNotFoundException("Sourcepath: " + fromDir + " not found!");
        }
        for (int i = 0; i < files.length; i++) {
            File dir = new File(toDir);
            dir.mkdirs();
            if ((boolean)(Object)files[i].isFile()) {
                try {
                    FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(files[i]).getChannel());
                    FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(toDir + fs + files[i].getName()).getChannel());
                    dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                    srcChannel.close();
                    dstChannel.close();
                } catch (Exception e) {
                    MyHelperClass Logger = new MyHelperClass();
                    Logger.ERROR("Error during file copy: " + e.getMessage());
                    throw e;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass ERROR(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
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

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
