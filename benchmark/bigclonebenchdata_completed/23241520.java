import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23241520 {
public MyHelperClass httpHeaders;
	public MyHelperClass getTimeToExpire(ChannelIF o0){ return null; }
public MyHelperClass timeToExpire;
	public MyHelperClass feedUri;
	public MyHelperClass feed;
	public MyHelperClass FeedParser;
	public MyHelperClass logger;
	public MyHelperClass getChannelBuilder(){ return null; }

    private FeedIF retrieveFeed(String uri) throws FeedManagerException {
        try {
            URL urlToRetrieve = new URL(uri);
            URLConnection conn = null;
            try {
                conn = urlToRetrieve.openConnection();
                if (conn instanceof HttpURLConnection) {
                    HttpURLConnection httpConn = (HttpURLConnection) conn;
                    httpConn.setInstanceFollowRedirects(true);
                    MyHelperClass HttpHeaderUtils = new MyHelperClass();
                    HttpHeaderUtils.setUserAgent(httpConn, "Informa Java API");
//                    MyHelperClass HttpHeaderUtils = new MyHelperClass();
                    logger.debug("retr feed at url " + uri + ": ETag" + HttpHeaderUtils.getETagValue(httpConn) + " if-modified :" + HttpHeaderUtils.getLastModified(httpConn));
//                    MyHelperClass HttpHeaderUtils = new MyHelperClass();
                    this.httpHeaders.setETag(HttpHeaderUtils.getETagValue(httpConn));
//                    MyHelperClass HttpHeaderUtils = new MyHelperClass();
                    this.httpHeaders.setIfModifiedSince(HttpHeaderUtils.getLastModified(httpConn));
                }
            } catch (java.lang.ClassCastException e) {
                conn = null;
                MyHelperClass logger = new MyHelperClass();
                logger.warn("problem cast to HttpURLConnection " + uri, e);
                throw new FeedManagerException((String)(Object)e);
            } catch (NullPointerException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("problem NPE " + uri + " conn=" + conn, e);
                conn = null;
                throw new FeedManagerException((String)(Object)e);
            }
            ChannelIF channel = null;
            channel =(ChannelIF)(Object) FeedParser.parse(getChannelBuilder(), conn.getInputStream());
            this.timeToExpire = getTimeToExpire(channel);
            this.feed =(MyHelperClass)(Object) new Feed(channel);
            Date currDate = new Date();
            this.feed.setLastUpdated(currDate);
            this.feed.setDateFound(currDate);
            this.feed.setLocation(urlToRetrieve);
            logger.info("feed retrieved " + uri);
        } catch (IOException e) {
            logger.error("IOException " + feedUri + " e=" + e);
            e.printStackTrace();
            throw new FeedManagerException((String)(Object)e);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            throw new FeedManagerException((String)(Object)e);
        }
        return(FeedIF)(Object) this.feed;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setUserAgent(HttpURLConnection o0, String o1){ return null; }
	public MyHelperClass warn(String o0, ClassCastException o1){ return null; }
	public MyHelperClass parse(MyHelperClass o0, InputStream o1){ return null; }
	public MyHelperClass setDateFound(Date o0){ return null; }
	public MyHelperClass setLocation(URL o0){ return null; }
	public MyHelperClass setLastUpdated(Date o0){ return null; }
	public MyHelperClass setIfModifiedSince(MyHelperClass o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, NullPointerException o1){ return null; }
	public MyHelperClass setETag(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getLastModified(HttpURLConnection o0){ return null; }
	public MyHelperClass getETagValue(HttpURLConnection o0){ return null; }}

class FeedIF {

}

class FeedManagerException extends Exception{
	public FeedManagerException(String errorMessage) { super(errorMessage); }
}

class ChannelIF {

}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class Feed {

Feed(ChannelIF o0){}
	Feed(){}}
