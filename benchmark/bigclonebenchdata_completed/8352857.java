


class c8352857 {

    public void sendMessage(Message m) throws IOException {
        MyHelperClass strURL = new MyHelperClass();
        URL url = new URL(strURL);
        HttpURLConnection urlcon;// = new HttpURLConnection();
        urlcon = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
//        MyHelperClass urlcon = new MyHelperClass();
        urlcon.setUseCaches(false);
//        MyHelperClass urlcon = new MyHelperClass();
        urlcon.setDefaultUseCaches(false);
//        MyHelperClass urlcon = new MyHelperClass();
        urlcon.setDoOutput(true);
//        MyHelperClass urlcon = new MyHelperClass();
        urlcon.setDoInput(true);
//        MyHelperClass urlcon = new MyHelperClass();
        urlcon.setRequestProperty("Content-type", "application/octet-stream");
//        MyHelperClass urlcon = new MyHelperClass();
        urlcon.setAllowUserInteraction(false);
        MyHelperClass HttpURLConnection = new MyHelperClass();
        HttpURLConnection.setDefaultAllowUserInteraction(false);
//        MyHelperClass urlcon = new MyHelperClass();
        urlcon.setRequestMethod("POST");
//        MyHelperClass urlcon = new MyHelperClass();
        ObjectOutputStream oos = new ObjectOutputStream(urlcon.getOutputStream());
        oos.writeObject(m);
        oos.flush();
        oos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDefaultUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass setDefaultAllowUserInteraction(boolean o0){ return null; }}

class Message {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class ObjectOutputStream {

ObjectOutputStream(){}
	ObjectOutputStream(MyHelperClass o0){}
	public MyHelperClass writeObject(Message o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDefaultUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }}
