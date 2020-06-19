


class c21800940 {
public MyHelperClass PUT_METHOD;
	public MyHelperClass DELETE_METHOD;
	public MyHelperClass handleResponse(HttpURLConnection o0){ return null; }
	public MyHelperClass handleResponse(URLConnection o0){ return null; }

    private void makeRequest(String data) {
        try {
            MyHelperClass curLocation = new MyHelperClass();
            MyHelperClass url = new MyHelperClass();
//            URL url = new java.net.URL(curLocation, this.url);
            if ("file".equals(url.getProtocol())) {
                MyHelperClass method = new MyHelperClass();
                if (PUT_METHOD.equals(method)) {
                    String text = "";
                    if (data != null) text = data.toString();
                    FileWriter out = new FileWriter((File)(Object)new java.io.File(new java.net.URI(url.toString())));
                    out.write(text, 0, text.length());
                    out.flush();
                    out.close();
//                MyHelperClass method = new MyHelperClass();
                } else if (DELETE_METHOD.equals(method)) {
                    File file =(File)(Object) new java.io.File(new java.net.URI(url.toString()));
                    file.delete();
                } else {
                    URLConnection connection =(URLConnection)(Object) url.openConnection();
                    connection.connect();
                    handleResponse(connection);
                }
            } else {
                HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                MyHelperClass method = new MyHelperClass();
                connection.setRequestMethod(method);
                MyHelperClass headers = new MyHelperClass();
                for (Iterator iterator =(Iterator)(Object) headers.entrySet().iterator();(boolean)(Object) iterator.hasNext(); ) {
                    Entry entry = (Entry)(Entry)(Object) iterator.next();
                    String property = (String)(String)(Object) entry.getKey();
                    String value = (String)(String)(Object) entry.getValue();
                    connection.addRequestProperty(property, value);
                }
                connection.connect();
                handleResponse(connection);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass entrySet(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class FileWriter {

FileWriter(){}
	FileWriter(File o0){}
	public MyHelperClass write(String o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

public MyHelperClass delete(){ return null; }}

class URLConnection {

public MyHelperClass connect(){ return null; }}

class HttpURLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(MyHelperClass o0){ return null; }
	public MyHelperClass connect(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}
