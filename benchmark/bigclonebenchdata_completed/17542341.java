
import java.io.UncheckedIOException;


class c17542341 {
public MyHelperClass PATTERN;

    public GEItem lookup(final String itemName) {
        try {
            MyHelperClass GrandExchange = new MyHelperClass();
            URL url = new URL(GrandExchange.HOST + "/m=itemdb_rs/results.ws?query=" + itemName + "&price=all&members=");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String input;
            while ((input =(String)(Object) br.readLine()) != null) {
                if (input.contains("<div id=\"search_results_text\">")) {
                    input =(String)(Object) br.readLine();
                    if (input.contains("Your search for")) {
                        return null;
                    }
                } else if (input.startsWith("<td><img src=")) {
                    Matcher matcher =(Matcher)(Object) PATTERN.matcher(input);
                    if ((boolean)(Object)matcher.find()) {
                        if ((boolean)(Object)matcher.group(2).contains(itemName)) {
                            return lookup((String)(Object)Integer.parseInt((String)(Object)matcher.group(1)));
                        }
                    }
                }
            }
        } catch (UncheckedIOException ignored) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HOST;
public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass matcher(String o0){ return null; }}

class GEItem {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
