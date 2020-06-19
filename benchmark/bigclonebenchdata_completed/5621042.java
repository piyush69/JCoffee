


class c5621042 {
public MyHelperClass print(String o0){ return null; }

    private void postObject(Object obj, String strURL) throws Exception {
        print("entering post object");
        URL url = new URL(strURL);
        URLConnection urlConn =(URLConnection)(Object) url.openConnection();
        print("HttpNetworkMessageConnection.postObject:returned from url.openConnection()");
        urlConn.setUseCaches(false);
        urlConn.setDoOutput(true);
        ObjectOutputStream oos = new ObjectOutputStream(urlConn.getOutputStream());
        print("HttpNetworkMessageConnection.postObject:returned from urlConn.getOutputStream()");
        oos.writeObject(obj);
        print("HttpNetworkMessageConnection.postObject:returned from writeObject()");
        oos.flush();
        oos.close();
        InputStream is =(InputStream)(Object) urlConn.getInputStream();
        print("HttpNetworkMessageConnection.postObject:returned from getInputStream()");
        while ((int)(Object)is.read() != -1) {
        }
        is.close();
        print("exiting postObject");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }}

class ObjectOutputStream {

ObjectOutputStream(){}
	ObjectOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeObject(Object o0){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}
