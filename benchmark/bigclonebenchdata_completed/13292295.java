


class c13292295 {
public static MyHelperClass openOutputStream(File o0){ return null; }
//public MyHelperClass openOutputStream(File o0){ return null; }

    public static void copyURLToFile(URL source, File destination) throws IOException {
        InputStream input =(InputStream)(Object) source.openStream();
        try {
            FileOutputStream output =(FileOutputStream)(Object) openOutputStream(destination);
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(input, output);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(output);
            }
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class FileOutputStream {

}
