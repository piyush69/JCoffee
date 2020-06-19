
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21511914 {

    public static synchronized String getPageContent(String pageUrl) {
        URL url = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        StringBuilder page = null;
        if (pageUrl == null || pageUrl.trim().length() == 0) {
            return null;
        } else {
            try {
                url = new URL(pageUrl);
                inputStreamReader = new InputStreamReader(url.openStream());
                bufferedReader = new BufferedReader(inputStreamReader);
                page = new StringBuilder();
                while ((line =(String)(Object) bufferedReader.readLine()) != null) {
                    page.append(line);
                    page.append("\n");
                }
            } catch (UncheckedIOException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("IOException", e);
            } catch (Exception e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Exception", e);
            } finally {
                try {
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                } catch (UncheckedIOException e) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.error("IOException", e);
                } catch (Exception e) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.error("Exception", e);
                }
            }
        }
        if (page == null) {
            return null;
        } else {
            return page.toString();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
