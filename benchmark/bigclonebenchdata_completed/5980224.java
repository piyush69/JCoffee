
import java.io.UncheckedIOException;


class c5980224 {

    public static final TreeSet getValues(String baseurl, String rftId, String svcId) {
        TreeSet values = new TreeSet();
        String[] fragments = rftId.split("/");
        String e_repoUri = null;
        String e_svcId = null;
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            e_repoUri =(String)(Object) URLEncoder.encode(rftId, "UTF-8");
//            MyHelperClass URLEncoder = new MyHelperClass();
            e_svcId =(String)(Object) URLEncoder.encode(svcId, "UTF-8");
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("UnsupportedEncodingException resulted attempting to encode " + rftId);
        }
        String openurl = baseurl + "/" + fragments[2] + "/openurl-aDORe7" + "?rft_id=" + e_repoUri + "&svc_id=" + e_svcId + "&url_ver=Z39.88-2004";
        MyHelperClass log = new MyHelperClass();
        log.info("Obtaining Content Values from: " + openurl);
        try {
            URL url = new URL(openurl);
            long s = System.currentTimeMillis();
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            int timeoutMs = 1000 * 60 * 30;
            conn.setConnectTimeout(timeoutMs);
            conn.setReadTimeout(timeoutMs);
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            MyHelperClass log = new MyHelperClass();
            log.info("Query Time: " + (System.currentTimeMillis() - s) + "ms");
            String line;
            while ((line =(String)(Object) in.readLine()) != null) {
                values.add(line);
            }
            in.close();
        } catch (Exception ex) {
//            MyHelperClass log = new MyHelperClass();
            log.error("problem with openurl:" + openurl + ex.getMessage());
            throw new RuntimeException(ex);
        }
        return values;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class TreeSet {

public MyHelperClass add(String o0){ return null; }}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
