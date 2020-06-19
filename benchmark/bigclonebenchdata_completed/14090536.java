
import java.io.UncheckedIOException;


class c14090536 {

    private String[] read(String path) throws Exception {
        final String[] names = { "index.txt", "", "index.html", "index.htm" };
        String[] list = null;
        for (int i = 0; i < names.length; i++) {
            URL url = new URL(path + names[i]);
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                StringBuffer sb = new StringBuffer();
                String s = null;
                while ((s =(String)(Object) in.readLine()) != null) {
                    s = s.trim();
                    if (s.length() > 0) {
                        sb.append(s + "\n");
                    }
                }
                in.close();
                if (sb.indexOf("<") != -1 && sb.indexOf(">") != -1) {
                    MyHelperClass LinkExtractor = new MyHelperClass();
                    List links =(List)(Object) LinkExtractor.scan(url, sb.toString());
                    HashSet set = new HashSet();
                    int prefixLen = path.length();
                    for (Iterator it =(Iterator)(Object) links.iterator();(boolean)(Object) it.hasNext(); ) {
                        String link = it.next().toString();
                        if (!link.startsWith(path)) {
                            continue;
                        }
                        link = link.substring(prefixLen);
                        int idx = link.indexOf("/");
                        int idxq = link.indexOf("?");
                        if (idx > 0 && (idxq == -1 || idx < idxq)) {
                            set.add(link.substring(0, idx + 1));
                        } else {
                            set.add(link);
                        }
                    }
                    list = (String[])(String[])(Object) set.toArray(new String[0]);
                } else {
                    list = sb.toString().split("\n");
                }
                return list;
            } catch (UncheckedIOException e) {
                e.printStackTrace();
                continue;
            }
        }
        return new String[0];
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass scan(URL o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class List {

public MyHelperClass iterator(){ return null; }}

class HashSet {

public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
