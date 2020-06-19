import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12764163 {
public MyHelperClass ARTICLE_BODY;
	public MyHelperClass Deploy;
	public MyHelperClass User;
	public MyHelperClass conn;
	public MyHelperClass find(String o0, String o1, String o2){ return null; }

        public  void Out(Article article) throws Throwable, Exception {
            String body =(String)(Object) article.meta(ARTICLE_BODY).getString();
            String url =(String)(Object) find("a", "href", body);
            while (url.length() > 0 && url.startsWith("http://")) {
                System.out.println(url);
                conn =(MyHelperClass)(Object) (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("POST");
                int code =(int)(Object) conn.getResponseCode();
                String ping =(String)(Object) conn.getHeaderField("X-Pingback");
                System.out.println(ping);
                if (ping != null) {
                    conn =(MyHelperClass)(Object) (HttpURLConnection) new URL(ping).openConnection();
                    conn.setDoOutput(true);
                    StringBuffer buffer = new StringBuffer();
                    buffer.append("<?xml version=\"1.0\"?>\n");
                    buffer.append("<methodCall>\n");
                    buffer.append("  <methodName>pingback.ping</methodName>\n");
                    buffer.append("  <params>\n");
                    buffer.append("    <param><value><string>http://" + User.host + "/article?id=" + article.getId() + "</string></value></param>\n");
                    buffer.append("    <param><value><string>" + url + "</string></value></param>\n");
                    buffer.append("  </params>\n");
                    buffer.append("</methodCall>\n");
                    System.out.println(buffer.toString());
                    OutputStream out =(OutputStream)(Object) conn.getOutputStream();
                    out.write(buffer.toString().getBytes("UTF-8"));
                    code =(int)(Object) conn.getResponseCode();
                    InputStream in = null;
                    if (code == 200) {
                        in =(InputStream)(Object) conn.getInputStream();
                    } else if (code < 0) {
                        throw new IOException("HTTP response unreadable.");
                    } else {
                        in =(InputStream)(Object) conn.getErrorStream();
                    }
                    Deploy.pipe(in, System.out);
                    in.close();
                }
                url =(String)(Object) find("a", "href", body);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass host;
public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getErrorStream(){ return null; }
	public MyHelperClass getString(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass pipe(InputStream o0, PrintStream o1){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }}

class Article {

public MyHelperClass getId(){ return null; }
	public MyHelperClass meta(MyHelperClass o0){ return null; }}
