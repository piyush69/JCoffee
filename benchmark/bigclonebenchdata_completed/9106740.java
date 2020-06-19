
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9106740 {

    public String sendXml(URL url, String xmlMessage, boolean isResponseExpected) throws IOException {
        if (url == null) {
            throw new IllegalArgumentException("url == null");
        }
        if (xmlMessage == null) {
            throw new IllegalArgumentException("xmlMessage == null");
        }
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.finer("url = " + url);
//        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.finer("xmlMessage = :" + xmlMessage + ":");
//        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.finer("isResponseExpected = " + isResponseExpected);
        String answer = null;
        try {
            URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
            urlConnection.setRequestProperty("Content-type", "text/xml");
            urlConnection.setDoOutput(true);
            urlConnection.setUseCaches(false);
            Writer writer = null;
            try {
                writer =(Writer)(Object) new OutputStreamWriter(urlConnection.getOutputStream());
                writer.write(xmlMessage);
                writer.flush();
            } finally {
                if (writer != null) {
                    writer.close();
                }
            }
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.finer("message written");
            StringBuilder sb = new StringBuilder();
            BufferedReader in = null;
            try {
                in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                if (isResponseExpected) {
                    String inputLine;
                    while ((inputLine =(String)(Object) in.readLine()) != null) {
                        sb.append(inputLine).append("\n");
                    }
                    answer = sb.toString();
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.finer("response read");
                }
            } catch (UncheckedIOException e) {
                MyHelperClass Level = new MyHelperClass();
                LOGGER.log(Level.SEVERE, "No response",(FileNotFoundException)(Object) e);
            } finally {
                if (in != null) {
                    in.close();
                }
            }
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            LOGGER.log(Level.SEVERE, e.getMessage(),(FileNotFoundException)(Object) e);
        }
//        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.finer("answer = :" + answer + ":");
        return answer;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass finer(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, FileNotFoundException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, ConnectException o2){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }}

class Writer {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}}

class BufferedReader {

BufferedReader(InputStreamReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class ConnectException extends Exception{
	public ConnectException(String errorMessage) { super(errorMessage); }
}
