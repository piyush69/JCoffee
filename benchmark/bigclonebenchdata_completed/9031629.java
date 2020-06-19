


class c9031629 {
public static MyHelperClass readWholeFile(URI o0){ return null; }
//public MyHelperClass readWholeFile(URI o0){ return null; }

    public static byte[] readFromURI(URI uri) throws IOException {
        if (uri.toString().contains("http:")) {
            URL url =(URL)(Object) uri.toURL();
            URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
            int length =(int)(Object) urlConnection.getContentLength();
            System.out.println("length of content in URL = " + length);
            if (length > -1) {
                byte[] pureContent = new byte[length];
                DataInputStream dis = new DataInputStream(urlConnection.getInputStream());
                dis.readFully(pureContent, 0, length);
                dis.close();
                return pureContent;
            } else {
                throw new IOException("Unable to determine the content-length of the document pointed at " + url.toString());
            }
        } else {
            return(byte[])(Object) readWholeFile(uri).getBytes("UTF-8");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(String o0){ return null; }}

class URI {

public MyHelperClass toURL(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataInputStream {

DataInputStream(MyHelperClass o0){}
	DataInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readFully(byte[] o0, int o1, int o2){ return null; }}
