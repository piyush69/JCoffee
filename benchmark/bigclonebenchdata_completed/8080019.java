
import java.io.UncheckedIOException;


class c8080019 {

    public static String getInstanceUserdata() throws IOException {
        int retries = 0;
        while (true) {
            try {
                URL url = new URL("http://169.254.169.254/latest/user-data/");
                InputStreamReader rdr = new InputStreamReader(url.openStream());
                StringWriter wtr = new StringWriter();
                char[] buf = new char[1024];
                int bytes;
                while ((bytes =(int)(Object) rdr.read(buf)) > -1) {
                    if (bytes > 0) {
                        wtr.write(buf, 0, bytes);
                    }
                }
                rdr.close();
                return wtr.toString();
            } catch (UncheckedIOException ex) {
                if (retries == 5) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.debug("Problem getting user data, retries exhausted...");
                    return null;
                } else {
                    MyHelperClass logger = new MyHelperClass();
                    logger.debug("Problem getting user data, retrying...");
                    try {
                        Thread.sleep((int) Math.pow(2.0, retries) * 1000);
                    } catch (InterruptedException e) {
                    }
                    retries++;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class StringWriter {

public MyHelperClass write(char[] o0, int o1, int o2){ return null; }}
