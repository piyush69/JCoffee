


class c5414796 {

    public static void upper() throws Exception {
        File input = new File("dateiname");
        PostMethod post = new PostMethod("url");
        post.setRequestBody(new FileInputStream(input));
        MyHelperClass EntityEnclosingMethod = new MyHelperClass();
        if ((int)(Object)input.length() < Integer.MAX_VALUE) post.setRequestContentLength((int)(int)(Object) input.length()); else post.setRequestContentLength((int)(Object)EntityEnclosingMethod.CONTENT_LENGTH_CHUNKED);
        post.setRequestHeader("Content-type", "text/xml; charset=ISO-8859�1");
        HttpClient httpclient = new HttpClient();
        httpclient.executeMethod(post);
        post.releaseConnection();
        URL url = new URL("https://www.amazon.de/");
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line =(String)(Object) rd.readLine()) != null) {
            System.out.println(line);
        }
        rd.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONTENT_LENGTH_CHUNKED;
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass length(){ return null; }}

class PostMethod {

PostMethod(){}
	PostMethod(String o0){}
	public MyHelperClass setRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass setRequestContentLength(int o0){ return null; }
	public MyHelperClass setRequestBody(FileInputStream o0){ return null; }
	public MyHelperClass releaseConnection(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class HttpClient {

public MyHelperClass executeMethod(PostMethod o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
