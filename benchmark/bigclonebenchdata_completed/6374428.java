
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6374428 {
public MyHelperClass URLEncoder;

    public String getTags(String content) {
        StringBuffer xml = new StringBuffer();
        OutputStreamWriter osw = null;
        BufferedReader br = null;
        try {
            MyHelperClass paramName = new MyHelperClass();
            String reqData = URLEncoder.encode(paramName, "UTF-8") + "=" + URLEncoder.encode(content, "UTF-8");
            MyHelperClass cmdUrl = new MyHelperClass();
            URL service = new URL(cmdUrl);
            URLConnection urlConn =(URLConnection)(Object) service.openConnection();
            urlConn.setDoOutput(true);
            urlConn.connect();
            osw = new OutputStreamWriter(urlConn.getOutputStream());
            osw.write(reqData);
            osw.flush();
            br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line = null;
            while ((line =(String)(Object) br.readLine()) != null) {
                xml.append(line);
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (osw != null) {
                    osw.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        return xml.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
