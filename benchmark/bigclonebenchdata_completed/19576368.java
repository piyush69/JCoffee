
import java.io.UncheckedIOException;


class c19576368 {
public MyHelperClass Logger;

    public String setContent(URL url, String inputdata) {
        String content = "";
        try {
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.connect();
            OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
            out.write(inputdata);
            out.flush();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String strLine = "";
            while ((strLine =(String)(Object) in.readLine()) != null) {
                content = content + strLine;
            }
            in.close();
            out.close();
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Problem writing to " + url + " content " + inputdata,(IOException)(Object) e);
        }
        return content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

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

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
