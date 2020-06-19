
import java.io.UncheckedIOException;


class c14617443 {

    public void reademi(Vector descriptions, Vector links, String linkaddress, String idmap) {
        InputStream is = null;
        URL url;
        ArrayList keys = new ArrayList();
        ArrayList names = new ArrayList();
        try {
            url = new URL(idmap);
            is =(InputStream)(Object) url.openStream();
            Scanner scanner = new Scanner(is);
            scanner.nextLine();
            String line = "";
            String id = "";
            while ((boolean)(Object)scanner.hasNextLine()) {
                line =(String)(Object) scanner.nextLine();
                Scanner linescanner = new Scanner(line);
                linescanner.useDelimiter("\t");
                id =(String)(Object) linescanner.next();
                id = id.substring(0, id.length() - 2);
                keys.add(id);
                linescanner.next();
                linescanner.next();
                linescanner.next();
                linescanner.useDelimiter("\n");
                names.add(linescanner.next());
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(linkaddress).openStream()));
            String link = "";
            String key = "";
            String name = "";
            int counter = 0;
            while ((line =(String)(Object) reader.readLine()) != null) {
                if (line.indexOf("style=raw") != -1) {
                    int linkstart = line.indexOf("http://www.ebi.ac.uk/cgi-bin/dbfetch?db");
                    int idstart = line.indexOf("id=") + 3;
                    int linkend = line.substring(linkstart).indexOf("\"") + linkstart;
                    link = line.substring(linkstart, linkend);
                    key = line.substring(idstart, linkend);
                    if ((int)(Object)keys.indexOf(key) != -1) {
                        name =(String)(Object) names.get(keys.indexOf(key));
                        counter++;
                        descriptions.add(counter + " " + key + " " + name);
                        links.add(link);
                    }
                }
            }
        } catch (UncheckedIOException e) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Vector {

public MyHelperClass add(String o0){ return null; }}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class ArrayList {

public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class Scanner {

Scanner(InputStream o0){}
	Scanner(){}
	Scanner(String o0){}
	public MyHelperClass next(){ return null; }
	public MyHelperClass useDelimiter(String o0){ return null; }
	public MyHelperClass hasNextLine(){ return null; }
	public MyHelperClass nextLine(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
