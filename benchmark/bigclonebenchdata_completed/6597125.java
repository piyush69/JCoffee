


class c6597125 {

    public static void writeToFile(final File file, final InputStream in) throws IOException {
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.createFile(file);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyStream(in, fos);
        } finally {
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeIO(fos);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyStream(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass createFile(File o0){ return null; }
	public MyHelperClass closeIO(FileOutputStream o0){ return null; }}

class File {

}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
