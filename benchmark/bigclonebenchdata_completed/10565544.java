


class c10565544 {

    public static void copyToFileAndCloseStreams(InputStream istr, File destFile) throws IOException {
        OutputStream ostr = null;
        try {
            ostr =(OutputStream)(Object) new FileOutputStream(destFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(istr, ostr);
        } finally {
            if (ostr != null) ostr.close();
            if (istr != null) istr.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
