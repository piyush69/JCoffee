


class c23267978 {

    public static boolean copy(InputStream is, File file) {
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, new FileOutputStream(file));
            return true;
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.severe(e.getMessage());
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass severe(String o0){ return null; }}

class InputStream {

}

class File {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
