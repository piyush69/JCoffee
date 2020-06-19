


class c4507906 {
public MyHelperClass copyDocument(InputStream o0, OutputStream o1){ return null; }

    private void sendToURL(String URL, String file) throws Exception {
        URL url = new URL(URL);
        InputStream is =(InputStream)(Object) new BufferedInputStream(new FileInputStream(file));
        OutputStream os =(OutputStream)(Object) url.openConnection().getOutputStream();
        copyDocument(is, os);
        is.close();
        os.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getOutputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass close(){ return null; }}
