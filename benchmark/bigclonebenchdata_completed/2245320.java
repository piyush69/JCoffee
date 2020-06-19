


class c2245320 {
public MyHelperClass IOUtils;
	public MyHelperClass makeDirs(String o0){ return null; }

    void writeToFile(String dir, InputStream input, String fileName) throws FileNotFoundException, IOException {
        makeDirs(dir);
        FileOutputStream fo = null;
        try {
            System.out.println(Thread.currentThread().getName() + " : " + "Writing file " + fileName + " to path " + dir);
            File file = new File(dir, fileName);
            fo = new FileOutputStream(file);
            IOUtils.copy(input, fo);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Failed to write " + fileName);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class InputStream {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class File {

File(String o0, String o1){}
	File(){}}
