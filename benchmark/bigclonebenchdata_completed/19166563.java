import java.io.*;
import java.lang.*;
import java.util.*;



class c19166563 {
public MyHelperClass log;
	public MyHelperClass safeParseXml(String o0){ return null; }

    private String doSearch(String query) {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("http://boss.yahooapis.com/ysearch/web/v1/").append(query).append("?appid=wGsFV_DV34EwXnC.2Bt_Ql8Kcir_HmrxMzWUF2fv64CA8ha7e4zgudqXFA8K_J4-&format=xml&filter=-porn");
        try {
            URL url = new URL(queryBuilder.toString());
            BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            String line;
            StringBuffer buffer = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            reader.close();
            return(String)(Object) safeParseXml(buffer.toString());
        } catch (UncheckedIOException e) {
            log.error("The used url is not right : " + queryBuilder.toString(),(IOException)(Object) e);
            return "The used url is not right.";
        } catch (IOException e) {
            log.error("Problem obtaining search results, connection maybe?", e);
            return "Problem obtaining search results, connection maybe?";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0, MalformedURLException o1){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
