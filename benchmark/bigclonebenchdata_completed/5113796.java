
import java.io.UncheckedIOException;


class c5113796 {
public MyHelperClass Globals;
	public MyHelperClass BibtexParser;
	public MyHelperClass JOptionPane;
	public MyHelperClass getKeyName(){ return null; }
	public MyHelperClass constructUrl(String o0){ return null; }

    private BibtexDatabase importInspireEntries(String key, OutputPrinter frame) {
        String url =(String)(Object) constructUrl(key);
        try {
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) (new URL(url)).openConnection();
            conn.setRequestProperty("User-Agent", "Jabref");
            InputStream inputStream =(InputStream)(Object) conn.getInputStream();
            INSPIREBibtexFilterReader reader = new INSPIREBibtexFilterReader(new InputStreamReader(inputStream));
            ParserResult pr =(ParserResult)(Object) BibtexParser.parse(reader);
            return(BibtexDatabase)(Object) pr.getDatabase();
        } catch (UncheckedIOException e) {
            frame.showMessage(Globals.lang("An Exception ocurred while accessing '%0'", url) + "\n\n" + e.toString(), Globals.lang(getKeyName()), JOptionPane.ERROR_MESSAGE);
        } catch (RuntimeException e) {
            frame.showMessage(Globals.lang("An Error occurred while fetching from INSPIRE source (%0):", new String[] { url }) + "\n\n" + e.getMessage(), Globals.lang(getKeyName()), JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass lang(String o0, String o1){ return null; }
	public MyHelperClass parse(INSPIREBibtexFilterReader o0){ return null; }
	public MyHelperClass lang(String o0, String[] o1){ return null; }
	public MyHelperClass lang(MyHelperClass o0){ return null; }}

class OutputPrinter {

public MyHelperClass showMessage(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class BibtexDatabase {

}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class INSPIREBibtexFilterReader {

INSPIREBibtexFilterReader(){}
	INSPIREBibtexFilterReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class ParserResult {

public MyHelperClass getDatabase(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
