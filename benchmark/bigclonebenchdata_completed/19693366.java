
import java.io.UncheckedIOException;


class c19693366 {
public MyHelperClass logger;
	public MyHelperClass getUrl(){ return null; }

//    @Override
    public void exec() {
        BufferedReader in = null;
        try {
            URL url = new URL(getUrl());
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer result = new StringBuffer();
            String str;
            while ((str =(String)(Object) in.readLine()) != null) {
                result.append(str);
            }
            logger.info("received message: " + result);
        } catch (Exception e) {
            logger.error("HttpGetEvent could not execute", e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                    logger.error("BufferedReader could not be closed", e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
