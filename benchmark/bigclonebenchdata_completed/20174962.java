


class c20174962 {

    protected void invoke(String path, Object request, Callback callback) throws IOException, ClassNotFoundException {
        MyHelperClass Assert = new MyHelperClass();
        Assert.notNull(callback, "callback cant be null");
        URL url = new URL(path);
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setDefaultUseCaches(false);
        connection.setRequestMethod("POST");
        connection.connect();
        try {
            ObjectOutputStream output = new ObjectOutputStream(connection.getOutputStream());
            try {
                output.writeObject(request);
                output.flush();
            } finally {
                output.close();
            }
            ObjectInputStream input = new ObjectInputStream(connection.getInputStream());
            try {
                for (; ; ) {
                    Object result = input.readObject();
                    if (result == null) {
                        break;
                    }
                    callback.onSuccess(result);
                }
            } finally {
                input.close();
            }
        } finally {
            connection.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass notNull(Callback o0, String o1){ return null; }}

class Callback {

public MyHelperClass onSuccess(Object o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setDefaultUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class ObjectOutputStream {

ObjectOutputStream(){}
	ObjectOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeObject(Object o0){ return null; }}

class ObjectInputStream {

ObjectInputStream(MyHelperClass o0){}
	ObjectInputStream(){}
	public MyHelperClass readObject(){ return null; }
	public MyHelperClass close(){ return null; }}
