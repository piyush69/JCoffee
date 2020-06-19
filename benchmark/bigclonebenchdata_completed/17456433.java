
import java.io.UncheckedIOException;


class c17456433 {
public static MyHelperClass createHttpClient(UsernamePasswordCredentials o0){ return null; }
//public MyHelperClass createHttpClient(UsernamePasswordCredentials o0){ return null; }

    public static boolean isSameHttpContent(final String url, final File localFile, UsernamePasswordCredentials creds) throws IOException {
        if ((boolean)(Object)localFile.isFile()) {
            long localContentLength =(long)(Object) localFile.length();
            long localLastModified =(int)(Object) localFile.lastModified() / 1000;
            long contentLength = -1;
            long lastModified = -1;
            HttpClient httpclient =(HttpClient)(Object) createHttpClient(creds);
            try {
                HttpHead httphead = new HttpHead(url);
                HttpResponse response =(HttpResponse)(Object) httpclient.execute(httphead);
                if (response != null) {
                    StatusLine statusLine =(StatusLine)(Object) response.getStatusLine();
                    int status =(int)(Object) statusLine.getStatusCode() / 100;
                    if (status == 2) {
                        Header lastModifiedHeader =(Header)(Object) response.getFirstHeader("Last-Modified");
                        Header contentLengthHeader =(Header)(Object) response.getFirstHeader("Content-Length");
                        if (contentLengthHeader != null) {
                            contentLength = Integer.parseInt((String)(Object)contentLengthHeader.getValue());
                        }
                        if (lastModifiedHeader != null) {
                            SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
                            MyHelperClass Locale = new MyHelperClass();
                            formatter.setDateFormatSymbols(new DateFormatSymbols(Locale.US));
                            try {
                                lastModified =(int)(Object) formatter.parse(lastModifiedHeader.getValue()).getTime() / 1000;
                            } catch (UncheckedIOException e) {
                                MyHelperClass logger = new MyHelperClass();
                                logger.error((ParseException)(Object)e);
                            }
                        }
                    } else {
                        return true;
                    }
                }
            } finally {
                httpclient.getConnectionManager().shutdown();
            }
            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("local:" + localContentLength + " " + localLastModified);
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("remote:" + contentLength + " " + lastModified);
            }
            if (contentLength != -1 && localContentLength != contentLength) return false;
            if (lastModified != -1 && lastModified != localLastModified) return false;
            if (contentLength == -1 && lastModified == -1) return false;
            return true;
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass US;
public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(ParseException o0){ return null; }}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass length(){ return null; }}

class UsernamePasswordCredentials {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpHead o0){ return null; }
	public MyHelperClass getConnectionManager(){ return null; }}

class HttpHead {

HttpHead(String o0){}
	HttpHead(){}}

class HttpResponse {

public MyHelperClass getFirstHeader(String o0){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class StatusLine {

public MyHelperClass getStatusCode(){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass parse(MyHelperClass o0){ return null; }
	public MyHelperClass setDateFormatSymbols(DateFormatSymbols o0){ return null; }}

class DateFormatSymbols {

DateFormatSymbols(MyHelperClass o0){}
	DateFormatSymbols(){}}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
