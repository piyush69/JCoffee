


class c10432997 {

    private static void copy(File source, File dest) throws FileNotFoundException, IOException {
        FileInputStream input = new FileInputStream(source);
        FileOutputStream output = new FileOutputStream(dest);
        System.out.println("Copying " + source + " to " + dest);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(input, output);
        output.close();
        input.close();
        dest.setLastModified(source.lastModified());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
