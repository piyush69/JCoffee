


class c22415294 {

    private String getRenderedBody(String spec) throws Exception {
        MyHelperClass log = new MyHelperClass();
        log.entering(Rss2MailTask.class.getName(), "getRenderedBody");
        final URL url = new URL(spec);
        final HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.connect();
        final InputStream inputStream =(InputStream)(Object) connection.getInputStream();
        final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        final StringBuffer bf = new StringBuffer();
        while (line != null) {
            line =(String)(Object) reader.readLine();
            if (line != null) {
                bf.append(line);
            }
        }
//        MyHelperClass log = new MyHelperClass();
        log.exiting(Rss2MailTask.class.getName(), "getRenderedBody");
        return bf.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass entering(String o0, String o1){ return null; }
	public MyHelperClass exiting(String o0, String o1){ return null; }}

class Rss2MailTask {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
