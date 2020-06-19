


class c1665765 {
public MyHelperClass trace(String o0, String o1, FileInputStream o2){ return null; }
public MyHelperClass translateFileName(String o0){ return null; }

    public InputStream openFileInputStream(String fileName) throws IOException {
        if (fileName.indexOf(':') > 1) {
            URL url = new URL(fileName);
            InputStream in =(InputStream)(Object) url.openStream();
            return in;
        }
        fileName =(String)(Object) translateFileName(fileName);
        FileInputStream in = new FileInputStream(fileName);
        trace("openFileInputStream", fileName, in);
        return (InputStream)(Object)in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
