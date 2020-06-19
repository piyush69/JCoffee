
import java.io.UncheckedIOException;


class c20991673 {
public MyHelperClass getNodeId(){ return null; }

    public NodeId generateTopicId(String topicName) {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            System.err.println("No SHA support!");
        }
        MyHelperClass m_ready = new MyHelperClass();
        if ((boolean)(Object)m_ready) System.out.println("Scribe is ready at" + getNodeId() + " , topic is " + topicName);
        md.update(topicName.getBytes());
        byte[] digest =(byte[])(Object) md.digest();
        NodeId newId = new NodeId(digest);
        return newId;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NodeId {

NodeId(){}
	NodeId(byte[] o0){}}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
