import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10161744 {
public MyHelperClass sitesToCheck;
	public MyHelperClass Log;

        private void checkSites()  throws Throwable {
            MyHelperClass LOG_TAG = new MyHelperClass();
            Log.d(LOG_TAG, "Updating sites: " + sitesToCheck.keySet().toString());
            MyHelperClass sitesToCheck = new MyHelperClass();
            for (Map.Entry<Site, Item> entry :(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (Object[])(Object)sitesToCheck.entrySet()) {
                final Site site = entry.getKey();
                final Item oldItem = entry.getValue();
                try {
                    final HttpGet req = new HttpGet(site.getUrl().toURI());
                    req.addHeader("Cache-Control", "no-cache");
                    req.addHeader("Pragma", "no-cache");
                    if (oldItem != null) {
                        final Date lastModified =(Date)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) oldItem.getTimestamp();
                        if (lastModified != null) {
                            MyHelperClass Utils = new MyHelperClass();
                            req.addHeader("If-Modified-Since",(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) Utils.formatRFC822Date(lastModified));
                        }
                    }
                    MyHelperClass httpClient = new MyHelperClass();
                    final HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(req);
                    MyHelperClass HttpStatus = new MyHelperClass();
                    if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                        final FeedHandler handler =(FeedHandler)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) site.getHandler().newInstance();
                        final InputStream in =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getEntity().getContent();
                        MyHelperClass Xml = new MyHelperClass();
                        Xml.parse(in, site.getEncoding(), handler);
                        in.close();
                        notify(site, handler.getCurrentItem());
                    } else if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)response.getStatusLine().getStatusCode() != 304) {
//                        MyHelperClass LOG_TAG = new MyHelperClass();
                        Log.e(LOG_TAG, "HTTP request for " + site.name() + " failed: " + response.getStatusLine().toString());
                    }
                } catch (Throwable e) {
//                    MyHelperClass LOG_TAG = new MyHelperClass();
                    Log.e(LOG_TAG, e.getMessage(), e);
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass formatRFC822Date(Date o0){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass d(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1, Throwable o2){ return null; }
	public MyHelperClass parse(InputStream o0, MyHelperClass o1, FeedHandler o2){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass keySet(){ return null; }
	public MyHelperClass toURI(){ return null; }}

class Site {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass name(){ return null; }
	public MyHelperClass getEncoding(){ return null; }
	public MyHelperClass getHandler(){ return null; }}

class Item {

public MyHelperClass getTimestamp(){ return null; }}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class FeedHandler {

public MyHelperClass getCurrentItem(){ return null; }}

class Object {

public MyHelperClass notify(Site o0, MyHelperClass o1){ return null; }}
