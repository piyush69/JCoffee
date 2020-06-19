
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12122713 {

    private void readVersion() {
        URL url =(URL)(Object) ClassLoader.getSystemResource("version");
        if (url == null) {
            return;
        }
        BufferedReader reader = null;
        String line = null;
        try {
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((line =(String)(Object) reader.readLine()) != null) {
                if (line.startsWith("Version=")) {
                    String version;// = new String();
                    version = (line.split("="))[1];
                }
                if (line.startsWith("Revision=")) {
                    String revision;// = new String();
                    revision = (line.split("="))[1];
                }
                if (line.startsWith("Date=")) {
                    String sSec = (line.split("="))[1];
                    Long lSec = Long.valueOf(sSec);
                    Date compileDate;// = new Date();
                    compileDate = new Date(lSec);
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Date {

Date(){}
	Date(Long o0){}}
