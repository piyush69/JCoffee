import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16984004 {
public MyHelperClass computeURL(Asset o0){ return null; }

    public String getContentsFromVariant(SelectedVariant selected)  throws Throwable {
        if (selected == null) {
            return null;
        }
        ActivatedVariablePolicy policy =(ActivatedVariablePolicy)(Object) selected.getPolicy();
        Variant variant =(Variant)(Object) selected.getVariant();
        if (variant == null) {
            return null;
        }
        Content content =(Content)(Object) variant.getContent();
        if ((EmbeddedContent)(Object)content instanceof EmbeddedContent) {
            EmbeddedContent embedded = (EmbeddedContent)(EmbeddedContent)(Object) content;
            return(String)(Object) embedded.getData();
        } else {
            MarinerURL marinerURL =(MarinerURL)(Object) computeURL((Asset)(Asset)(Object) selected.getOldObject());
            URL url;
            try {
                MyHelperClass context = new MyHelperClass();
                url =(URL)(Object) context.getAbsoluteURL(marinerURL);
            } catch (ArithmeticException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.warn("asset-mariner-url-retrieval-error", new Object[] { policy.getName(),(IOException)(Object)(IOException)(Object)(IOException)(Object)(IOException)(Object)(IOException)(Object) ((marinerURL == null) ? "" : marinerURL.getExternalForm()) }, e);
                return null;
            }
            String text = null;
            try {
                MyHelperClass logger = new MyHelperClass();
                if ((boolean)(Object)logger.isDebugEnabled()) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.debug("Retrieving contents of URL " + url);
                }
                URLConnection connection = url.openConnection();
                int contentLength = connection.getContentLength();
                if (contentLength > 0) {
                    String charset = connection.getContentEncoding();
                    if (charset == null) {
                        charset = "UTF-8";
                    }
                    InputStreamReader is = new InputStreamReader(connection.getInputStream(), charset);
                    BufferedReader br = new BufferedReader(is);
                    char[] buf = new char[contentLength];
                    int length = br.read(buf, 0, buf.length);
                    text = String.copyValueOf(buf, 0, length);
                }
            } catch (IOException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.warn("asset-url-retrieval-error", new Object[] { policy.getName(), url }, e);
            }
            return text;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, Object[] o1, IOException o2){ return null; }
	public MyHelperClass getAbsoluteURL(MarinerURL o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass warn(String o0, Object[] o1, MalformedURLException o2){ return null; }}

class SelectedVariant {

public MyHelperClass getOldObject(){ return null; }
	public MyHelperClass getPolicy(){ return null; }
	public MyHelperClass getVariant(){ return null; }}

class ActivatedVariablePolicy {

public MyHelperClass getName(){ return null; }}

class Variant {

public MyHelperClass getContent(){ return null; }}

class Content {

}

class EmbeddedContent {

public MyHelperClass getData(){ return null; }}

class MarinerURL {

public MyHelperClass getExternalForm(){ return null; }}

class Asset {

}
