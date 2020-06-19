


class c11088622 {

    public static void copyFile(File sourceFile, File destFile) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is =(InputStream)(Object) new FileInputStream(sourceFile);
            os =(OutputStream)(Object) new FileOutputStream(destFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
        } finally {
            try {
                if (os != null) os.close();
            } catch (Exception e) {
            }
            try {
                if (is != null) is.close();
            } catch (Exception e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
