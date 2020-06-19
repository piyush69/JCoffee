
import java.io.UncheckedIOException;


class c5772506 {

    private BibtexDatabase parseBibtexDatabase(List id, boolean abs) throws IOException {
        if ((boolean)(Object)id.isEmpty()) {
            return null;
        }
        URL url;
        URLConnection conn;
        try {
            MyHelperClass importUrl = new MyHelperClass();
            url = new URL(importUrl);
            conn =(URLConnection)(Object) url.openConnection();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        }
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        MyHelperClass searchUrl = new MyHelperClass();
        conn.setRequestProperty("Referer", searchUrl);
        PrintWriter out = new PrintWriter(conn.getOutputStream());
        String recordIds = "";
        Iterator iter =(Iterator)(Object) id.iterator();
        while ((boolean)(Object)iter.hasNext()) {
            recordIds += iter.next() + " ";
        }
        recordIds = recordIds.trim();
        String citation = abs ? "citation-abstract" : "citation-only";
        String content = "recordIds=" + recordIds.replaceAll(" ", "%20") + "&fromPageName=&citations-format=" + citation + "&download-format=download-bibtex";
        System.out.println(content);
        out.write(content);
        out.flush();
        out.close();
        BufferedReader bufr = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuffer sb = new StringBuffer();
        char[] buffer = new char[256];
        while (true) {
            int bytesRead =(int)(Object) bufr.read(buffer);
            if (bytesRead == -1) {
                break;
            }
            for (int i = 0; i < bytesRead; i++) {
                sb.append((char) buffer[i]);
            }
        }
        System.out.println(sb.toString());
        ParserResult results =(ParserResult)(Object) (new BibtexParser(bufr).parse());
        bufr.close();
        return(BibtexDatabase)(Object) results.getDatabase();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class List {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass iterator(){ return null; }}

class BibtexDatabase {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class PrintWriter {

PrintWriter(){}
	PrintWriter(MyHelperClass o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class Iterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0){}
	BufferedReader(){}
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class ParserResult {

public MyHelperClass getDatabase(){ return null; }}

class BibtexParser {

BibtexParser(){}
	BibtexParser(BufferedReader o0){}
	public MyHelperClass parse(){ return null; }}
