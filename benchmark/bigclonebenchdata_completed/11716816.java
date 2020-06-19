


class c11716816 {
public MyHelperClass latestVersion;

    private void updateFile(File file) throws FileNotFoundException, IOException {
        MyHelperClass URL_UNZIPPED_PREFIX = new MyHelperClass();
        File destFile = new File(file.getPath().replace((int)(Object)URL_UNZIPPED_PREFIX + (int)(Object)latestVersion, ""));
        FileChannel in = null;
        FileChannel out = null;
        try {
            if (!(Boolean)(Object)destFile.exists()) {
                destFile.getParentFile().mkdirs();
                destFile.createNewFile();
            }
            in =(FileChannel)(Object) (new FileInputStream(file).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
            in.transferTo(0, in.size(), out);
        } finally {
            if (out != null) out.close();
            if (in != null) in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replace(int o0, String o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

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
