import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12074282 {
public MyHelperClass solrUrl;
	public MyHelperClass pipe(Reader o0, Writer o1){ return null; }
	public MyHelperClass fatal(String o0){ return null; }

    public void postData(Reader data, Writer output)  throws Throwable {
        HttpURLConnection urlc = null;
        try {
            MyHelperClass solrUrl = new MyHelperClass();
            urlc = (HttpURLConnection)(HttpURLConnection)(Object) solrUrl.openConnection();
            try {
                urlc.setRequestMethod("POST");
            } catch (ProtocolException e) {
                throw new PostException("Shouldn't happen: HttpURLConnection doesn't support POST??", e);
            }
            urlc.setDoOutput(true);
            urlc.setDoInput(true);
            urlc.setUseCaches(false);
            urlc.setAllowUserInteraction(false);
            MyHelperClass POST_ENCODING = new MyHelperClass();
            urlc.setRequestProperty("Content-type", "text/xml; charset=" + POST_ENCODING);
            OutputStream out = urlc.getOutputStream();
            try {
//                MyHelperClass POST_ENCODING = new MyHelperClass();
                Writer writer = new OutputStreamWriter(out,(String)(Object) POST_ENCODING);
                pipe(data, writer);
                writer.close();
            } catch (IOException e) {
                throw new PostException("IOException while posting data", e);
            } finally {
                if (out != null) out.close();
            }
            InputStream in = urlc.getInputStream();
            try {
                Reader reader = new InputStreamReader(in);
                pipe(reader, output);
                reader.close();
            } catch (IOException e) {
                throw new PostException("IOException while reading response", e);
            } finally {
                if (in != null) in.close();
            }
        } catch (IOException e) {
            try {
                fatal("Solr returned an error: " + urlc.getResponseMessage());
            } catch (IOException f) {
            }
            fatal("Connection error (is Solr running at " + solrUrl + " ?): " + e);
        } finally {
            if (urlc != null) urlc.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}

class PostException extends Exception{
	public PostException(String errorMessage) { super(errorMessage); }
	PostException(){}
	PostException(String o0, IOException o1){}
	PostException(String o0, ProtocolException o1){}
}
