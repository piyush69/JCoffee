


class c5951961 {

    public static void main(String[] args) {
        try {
            URL url = new URL(args[0]);
            HttpURLConnection httpCon = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            httpCon.setDoOutput(true);
            httpCon.setRequestMethod("PUT");
            OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
            out.write("fatal error");
            out.close();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(MyHelperClass o0){}
	OutputStreamWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}
