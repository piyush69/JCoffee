
import java.io.UncheckedIOException;


class c8664460 {

    public String getScore(int id) {
        String title = null;
        try {
            MyHelperClass BASE_URL = new MyHelperClass();
            URL url = new URL((int)(Object)BASE_URL + id + ".html");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                if (line.contains("<title>")) {
                    title = line.substring(line.indexOf("<title>") + 7, line.indexOf("</title>"));
                    title = title.substring(0, title.indexOf("|")).trim();
                    break;
                }
            }
            reader.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return title;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
