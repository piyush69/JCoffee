


class c19663 {

    public String getProxy(String userName, String password) throws Exception {
        MyHelperClass httpURL = new MyHelperClass();
        URL url = new URL(httpURL);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        ObjectOutputStream outputToServlet = new ObjectOutputStream(conn.getOutputStream());
        outputToServlet.writeObject(userName);
        outputToServlet.writeObject(password);
        outputToServlet.flush();
        outputToServlet.close();
        ObjectInputStream inputFromServlet = new ObjectInputStream(conn.getInputStream());
        return inputFromServlet.readObject() + "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class ObjectOutputStream {

ObjectOutputStream(){}
	ObjectOutputStream(MyHelperClass o0){}
	public MyHelperClass writeObject(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class ObjectInputStream {

ObjectInputStream(MyHelperClass o0){}
	ObjectInputStream(){}
	public MyHelperClass readObject(){ return null; }}
