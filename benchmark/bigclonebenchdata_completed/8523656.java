
import java.io.UncheckedIOException;


class c8523656 {
public MyHelperClass log;
	public MyHelperClass extractRssFeedUrl(String o0){ return null; }

    public String getRssFeedUrl(boolean searchWeb) {
        String rssFeedUrl = null;
        MyHelperClass entity = new MyHelperClass();
        if (entity.getNewsFeedUrl() != null & !entity.getUrl().equals("")) {
//            MyHelperClass entity = new MyHelperClass();
            return(String)(Object) entity.getNewsFeedUrl();
//        MyHelperClass entity = new MyHelperClass();
        } else if (entity.getUrl() == null || entity.getUrl().equals("")) {
//            MyHelperClass entity = new MyHelperClass();
            return(String)(Object) entity.getNewsFeedUrl();
        } else if (searchWeb) {
            HttpURLConnection con = null;
            InputStream is = null;
            try {
//                MyHelperClass entity = new MyHelperClass();
                URL url = new URL(entity.getUrl());
                con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                con.connect();
                is =(InputStream)(Object) con.getInputStream();
                InputStreamReader sr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(sr);
                String ln;
                StringBuffer sb = new StringBuffer();
                while ((ln =(String)(Object) br.readLine()) != null) {
                    sb.append(ln + "\n");
                }
                rssFeedUrl =(String)(Object) extractRssFeedUrl(sb.toString());
            } catch (Exception e) {
                log.error(e);
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (UncheckedIOException e) {
                        log.error(e);
                    }
                }
                if (con != null) {
                    con.disconnect();
                }
            }
        }
        return rssFeedUrl;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getNewsFeedUrl(){ return null; }
	public MyHelperClass error(Exception o0){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
