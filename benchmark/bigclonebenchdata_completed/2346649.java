


class c2346649 {

    private static TreeViewTreeNode newInstance(String className, String urlString) {
        try {
            URL url = new URL(urlString);
            InputStream is =(InputStream)(Object) url.openStream();
            XMLDecoder xd = new XMLDecoder(is);
            Object userObject = xd.readObject();
            xd.close();
            return newInstance(className,(String)(Object)(String[])(Object) userObject);
        } catch (Exception e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.println(e);
            throw (RuntimeException) new IllegalStateException().initCause(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass println(Exception o0){ return null; }}

class TreeViewTreeNode {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class XMLDecoder {

XMLDecoder(InputStream o0){}
	XMLDecoder(){}
	public MyHelperClass readObject(){ return null; }
	public MyHelperClass close(){ return null; }}
