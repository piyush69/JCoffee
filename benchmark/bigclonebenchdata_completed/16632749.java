import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16632749 {
public MyHelperClass postData(URLConnection o0, MyHelperClass o1){ return null; }
public MyHelperClass Document;
	public MyHelperClass in;
	public MyHelperClass newDoc;
	public MyHelperClass hdoc;
	public MyHelperClass XRendererSupport;
	public MyHelperClass data;
	public MyHelperClass SwingUtilities;
	public MyHelperClass getAction(){ return null; }
	public MyHelperClass getContainer(){ return null; }
	public MyHelperClass getMethod(){ return null; }
	public MyHelperClass loadDocument(){ return null; }

        public void run()  throws Throwable {
            MyHelperClass data = new MyHelperClass();
            if ((int)(Object)data.length() > 0) {
                String method =(String)(Object) getMethod();
                String action =(String)(Object) getAction();
                URL url;
                try {
                    URL actionURL;
                    URL baseURL =(URL)(Object) hdoc.getBase();
                    if (action == null) {
                        String file = baseURL.getFile();
                        actionURL = new URL(baseURL.getProtocol(), baseURL.getHost(), baseURL.getPort(), file);
                    } else actionURL = new URL(baseURL, action);
                    URLConnection connection;
                    if ("post".equalsIgnoreCase(method)) {
                        url = actionURL;
                        connection = url.openConnection();
                        ((HttpURLConnection) connection).setFollowRedirects(false);
                        XRendererSupport.setCookies(url, connection);
                        connection.setRequestProperty("Accept-Language", "en-us");
                        connection.setRequestProperty("User-Agent", XRendererSupport.getContext().getUserAgent());
                        postData(connection, data);
                        XRendererSupport.getContext().getLogger().message(this, "Posted data: {" + data + "}");
                    } else {
                        url = new URL(actionURL + "?" + data);
                        connection = url.openConnection();
                        XRendererSupport.setCookies(url, connection);
                    }
                    connection.connect();
                    in =(MyHelperClass)(Object) connection.getInputStream();
                    URL base = connection.getURL();
                    XRendererSupport.getCookies(base, connection);
                    XRendererSupport.getContext().getLogger().message(this, "Stream got ok.");
                    JEditorPane c = (JEditorPane)(JEditorPane)(Object) getContainer();
                    HTMLEditorKit kit = (HTMLEditorKit)(HTMLEditorKit)(Object) c.getEditorKit();
                    newDoc =(MyHelperClass)(Object) (HTMLDocument)(HTMLDocument)(Object) kit.createDefaultDocument();
                    newDoc.putProperty(Document.StreamDescriptionProperty, base);
                    SwingUtilities.invokeLater(new Runnable() {

                        public void run() {
                            MyHelperClass XRendererSupport = new MyHelperClass();
                            XRendererSupport.getContext().getLogger().message(this, "loading...");
                            loadDocument();
//                            MyHelperClass XRendererSupport = new MyHelperClass();
                            XRendererSupport.getContext().getLogger().message(this, "document loaded...");
                        }
                    });
                } catch (MalformedURLException m) {
                } catch (IOException e) {
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass StreamDescriptionProperty;
public MyHelperClass setCookies(URL o0, URLConnection o1){ return null; }
	public MyHelperClass getCookies(URL o0, URLConnection o1){ return null; }
	public MyHelperClass getContext(){ return null; }
	public MyHelperClass getUserAgent(){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass getBase(){ return null; }
	public MyHelperClass invokeLater(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass invokeLater(<anonymous Runnable> o0){ return null; }
	public MyHelperClass putProperty(MyHelperClass o0, URL o1){ return null; }}

class JEditorPane {

public MyHelperClass getEditorKit(){ return null; }}

class HTMLEditorKit {

public MyHelperClass createDefaultDocument(){ return null; }}

class HTMLDocument {

}
