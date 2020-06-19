


class c2391245 {

    public ObjectInputStream sendObject(String sMethod, Serializable obj) {
        String sServlet = System.getProperty("servlet.jstat");
        if (sServlet != null) {
            try {
                URL url = new URL(sServlet);
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                conn.setDoInput(true);
                conn.setDoOutput(true);
                conn.setUseCaches(false);
                conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                ObjectOutputStream out = new ObjectOutputStream(conn.getOutputStream());
                out.writeObject(sMethod);
                out.writeObject(obj);
                out.flush();
                out.close();
                return new ObjectInputStream(conn.getInputStream());
            } catch (Exception exc) {
                System.out.println("Error on SpaceJobRunner::sendObjectPOST() --> " + exc);
            }
        } else {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Serializable {

}

class ObjectInputStream {

ObjectInputStream(MyHelperClass o0){}
	ObjectInputStream(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class ObjectOutputStream {

ObjectOutputStream(){}
	ObjectOutputStream(MyHelperClass o0){}
	public MyHelperClass writeObject(Serializable o0){ return null; }
	public MyHelperClass writeObject(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
