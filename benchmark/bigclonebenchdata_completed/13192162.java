
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13192162 {
public MyHelperClass checkURISyntax(String o0){ return null; }
	public MyHelperClass getURI(String o0){ return null; }

    protected List execute(String queryString, String sVar, String filter) throws UnsupportedEncodingException, IOException {
        MyHelperClass URLEncoder = new MyHelperClass();
        String query =(String)(Object) URLEncoder.encode(queryString, "UTF-8");
        String urlString = "http://sparql.bibleontology.com/sparql.jsp?sparql=" + query + "&type1=xml";
        URL url;
        BufferedReader br = null;
        ArrayList values = new ArrayList();
        try {
            url = new URL(urlString);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line =(String)(Object) br.readLine()) != null) {
                String sURI =(String)(Object) getURI(line);
                if (sURI != null) {
                    sURI =(String)(Object) checkURISyntax(sURI);
                    if (filter == null || sURI.startsWith(filter)) {
                        values.add(sURI);
                    }
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        return (List)(Object)values;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class List {

}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class ArrayList {

public MyHelperClass add(String o0){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
