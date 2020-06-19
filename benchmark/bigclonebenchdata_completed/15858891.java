
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15858891 {
public MyHelperClass logger;
	public MyHelperClass getUrl(){ return null; }

//    @Override
    public void send() {
        BufferedReader in = null;
        StringBuffer result = new StringBuffer();
        try {
            URL url = new URL(getUrl());
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            while ((str =(String)(Object) in.readLine()) != null) {
                result.append(str);
            }
        } catch (UncheckedIOException ce) {
            logger.error("MockupExecutableCommand excute fail: " + ce.getMessage());
        } catch (Exception e) {
            logger.error("MockupExecutableCommand excute fail: " + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                    logger.error("BufferedReader could not be closed",(IOException)(Object) e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0){ return null; }}

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

class ConnectException extends Exception{
	public ConnectException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
