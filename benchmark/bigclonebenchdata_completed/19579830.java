


class c19579830 {

    public static void copy(File toCopy, File dest) throws IOException {
        FileInputStream src = new FileInputStream(toCopy);
        FileOutputStream out = new FileOutputStream(dest);
        try {
            while ((int)(Object)src.available() > 0) {
                out.write(src.read());
            }
        } finally {
            src.close();
            out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}
