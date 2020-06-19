
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13192161 {
public MyHelperClass checkURISyntax(String o0){ return null; }
	public MyHelperClass getURI(String o0){ return null; }

    protected List execute(String queryString, String sVar1, String sVar2, String filter) throws Exception {
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
            String sURI1 = null;
            String sURI2 = null;
            boolean b1 = false;
            boolean b2 = false;
            while ((line =(String)(Object) br.readLine()) != null) {
                if (line.indexOf("</result>") != -1) {
                    if (sURI1 != null && sURI2 != null) {
                        String pair[] = { sURI1, sURI2 };
                        values.add(pair);
                    }
                    sURI1 = null;
                    sURI2 = null;
                    b1 = false;
                    b2 = false;
                }
                if (line.indexOf("binding name=\"" + sVar1 + "\"") != -1) {
                    b1 = true;
                    continue;
                } else if (b1) {
                    String s1 =(String)(Object) getURI(line);
                    if (s1 != null) {
                        s1 =(String)(Object) checkURISyntax(s1);
                        if (filter == null || s1.startsWith(filter)) {
                            sURI1 = s1;
                        }
                    }
                    b1 = false;
                    continue;
                }
                if (line.indexOf("binding name=\"" + sVar2 + "\"") != -1) {
                    b2 = true;
                    continue;
                } else if (b2) {
                    String s2 =(String)(Object) getURI(line);
                    if (s2 != null) {
                        s2 =(String)(Object) checkURISyntax(s2);
                        if (filter == null || s2.startsWith(filter)) {
                            sURI2 = s2;
                        }
                    }
                    b2 = false;
                    continue;
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

public MyHelperClass add(String[] o0){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
