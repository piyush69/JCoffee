
import java.io.UncheckedIOException;


class c17542340 {
public MyHelperClass parse(String o0){ return null; }

    public GEItem lookup(final int itemID) {
        try {
            MyHelperClass GrandExchange = new MyHelperClass();
            URL url = new URL((int)(Object)GrandExchange.HOST + (int)(Object)GrandExchange.GET + itemID);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String input;
            boolean exists = false;
            int i = 0;
            double[] values = new double[4];
            String name = "", examine = "";
            while ((input =(String)(Object) br.readLine()) != null) {
                if (input.contains("<div class=\"brown_box main_ge_page") && !exists) {
                    if (!input.contains("vertically_spaced")) {
                        return null;
                    }
                    exists = true;
                    br.readLine();
                    br.readLine();
                    name =(String)(Object) br.readLine();
                } else if (input.contains("<img id=\"item_image\" src=\"")) {
                    examine =(String)(Object) br.readLine();
                } else if (input.matches("(?i).+ (price|days):</b> .+")) {
                    values[i] =(double)(Object) parse(input);
                    i++;
                } else if (input.matches("<div id=\"legend\">")) break;
            }
            return new GEItem(name, examine, itemID, values);
        } catch (UncheckedIOException ignore) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HOST;
	public MyHelperClass GET;
}

class GEItem {

GEItem(){}
	GEItem(String o0, String o1, int o2, double[] o3){}}

class URL {

URL(int o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
