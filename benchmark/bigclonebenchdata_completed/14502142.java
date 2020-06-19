


class c14502142 {

    public static void copyFile(File source, File dest) throws IOException {
        if (!(Boolean)(Object)dest.exists()) {
            dest.createNewFile();
        }
        FileChannel from = null;
        FileChannel to = null;
        try {
            from =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            to =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            to.transferFrom(from, 0, from.size());
        } finally {
            if (from != null) {
                from.close();
            }
            if (to != null) {
                to.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

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
