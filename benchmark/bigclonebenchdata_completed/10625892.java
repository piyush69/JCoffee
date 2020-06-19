
import java.io.UncheckedIOException;


class c10625892 {

    public static String getTextFromUrl(final String url) {
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        try {
            final StringBuilder result = new StringBuilder();
            inputStreamReader = new InputStreamReader(new URL(url).openStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line =(String)(Object) bufferedReader.readLine()) != null) {
                MyHelperClass HtmlUtil = new MyHelperClass();
                result.append(HtmlUtil.quoteHtml(line)).append("\r");
            }
            return result.toString();
        } catch (final UncheckedIOException exception) {
            return exception.getMessage();
        } finally {
            MyHelperClass InputOutputUtil = new MyHelperClass();
            InputOutputUtil.close(bufferedReader);
//            MyHelperClass InputOutputUtil = new MyHelperClass();
            InputOutputUtil.close(inputStreamReader);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(BufferedReader o0){ return null; }
	public MyHelperClass quoteHtml(String o0){ return null; }
	public MyHelperClass close(InputStreamReader o0){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
