


class c9746855 {

    public static boolean copy(InputStream is, File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, fos);
            is.close();
            fos.close();
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class File {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
