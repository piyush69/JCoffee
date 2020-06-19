


class c7128553 {
public MyHelperClass URL_YAHOO_QUOTE;
	public MyHelperClass FORMAT;
	public MyHelperClass ParseYahooData(String o0){ return null; }
	public MyHelperClass BuildYahooQueryString(){ return null; }

    public Vector Get() throws Exception {
        String query_str =(String)(Object) BuildYahooQueryString();
        if (query_str == null) return null;
        Vector result = new Vector();
        HttpURLConnection urlc = null;
        try {
            URL url = new URL(URL_YAHOO_QUOTE + "?" + query_str + "&" + FORMAT);
            urlc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlc.setRequestMethod("GET");
            urlc.setDoOutput(true);
            urlc.setDoInput(true);
            urlc.setUseCaches(false);
            urlc.setAllowUserInteraction(false);
            urlc.setRequestProperty("Content-type", "text/html;charset=UTF-8");
            if ((int)(Object)urlc.getResponseCode() == 200) {
                InputStream in =(InputStream)(Object) urlc.getInputStream();
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
                    String msg = null;
                    while ((msg =(String)(Object) reader.readLine()) != null) {
                        ExchangeRate rate =(ExchangeRate)(Object) ParseYahooData(msg);
                        if (rate != null) result.add(rate);
                    }
                } finally {
                    if (reader != null) try {
                        reader.close();
                    } catch (Exception e1) {
                    }
                    if (in != null) try {
                        in.close();
                    } catch (Exception e1) {
                    }
                }
                return result;
            }
        } finally {
            if (urlc != null) try {
                urlc.disconnect();
            } catch (Exception e) {
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Vector {

public MyHelperClass add(ExchangeRate o0){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class ExchangeRate {

}
