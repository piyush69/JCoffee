


class c8437742 {

    protected void copy(URL url, File file) throws IOException {
        InputStream in = null;
        FileOutputStream out = null;
        try {
            in =(InputStream)(Object) url.openStream();
            out = new FileOutputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
        } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
