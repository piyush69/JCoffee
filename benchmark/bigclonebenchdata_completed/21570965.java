


class c21570965 {
public static MyHelperClass getLongProperty(FileInputStream o0, MyHelperClass o1){ return null; }
//public MyHelperClass getLongProperty(FileInputStream o0, MyHelperClass o1){ return null; }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filePath = "/Users/francisbaril/Downloads/test-1.pdf";
        String testFilePath = "/Users/francisbaril/Desktop/testpdfbox/test.pdf";
        File file = new File(filePath);
        final File testFile = new File(testFilePath);
        if ((boolean)(Object)testFile.exists()) {
            testFile.delete();
        }
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(new FileInputStream(file), new FileOutputStream(testFile));
        MyHelperClass PROPRIETE_ID_IGID = new MyHelperClass();
        System.out.println(getLongProperty(new FileInputStream(testFile), PROPRIETE_ID_IGID));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
