


class c2399802 {

    public static InputStream getInputStream(String fileName) throws IOException {
        InputStream input;
        if (fileName.startsWith("http:")) {
            URL url = new URL(fileName);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            input =(InputStream)(Object) connection.getInputStream();
        } else {
            input =(InputStream)(Object) new FileInputStream(fileName);
        }
        return input;
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
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
