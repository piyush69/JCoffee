


class c21527239 {
public MyHelperClass factory;

    private final Node openConnection(String connection) throws JTweetException {
        try {
            URL url = new URL(connection);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.connect();
            BufferedInputStream reader = new BufferedInputStream(conn.getInputStream());
            MyHelperClass builder = new MyHelperClass();
            if (builder == null) {
//                MyHelperClass builder = new MyHelperClass();
                builder = factory.newDocumentBuilder();
            }
            MyHelperClass document = new MyHelperClass();
            document = builder.parse(reader);
            reader.close();
            conn.disconnect();
        } catch (Exception e) {
            throw new JTweetException((String)(Object)e);
        }
        MyHelperClass document = new MyHelperClass();
        return(Node)(Object) document.getFirstChild();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass getFirstChild(){ return null; }
	public MyHelperClass parse(BufferedInputStream o0){ return null; }}

class Node {

}

class JTweetException extends Exception{
	public JTweetException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }}
