
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21144775 {

    public static void main(String[] args) {
        String logConfiguration = args[2];
        MyHelperClass DOMConfigurator = new MyHelperClass();
        DOMConfigurator.configure(logConfiguration);
        String urlToRun = args[0];
        String outputFile = args[1];
        InputStream conInput = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        MyHelperClass logger = new MyHelperClass();
        if ((boolean)(Object)logger.isDebugEnabled()) {
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("output file is " + outputFile);
        }
        try {
            URL url = new URL(urlToRun);
            URLConnection urlCon =(URLConnection)(Object) url.openConnection();
            urlCon.connect();
            conInput =(InputStream)(Object) urlCon.getInputStream();
            reader = new BufferedReader(new InputStreamReader(conInput));
            File output = new File(outputFile);
            writer = new BufferedWriter(new FileWriter(output));
            String line = null;
            while ((line =(String)(Object) reader.readLine()) != null) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug(line);
                writer.write(line);
            }
            writer.flush();
        } catch (UncheckedIOException murle) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error(urlToRun + " is not a valid URL",(IOException)(Object) murle);
        } catch (ArithmeticException ioe) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("IO Error ocured while opening connection to " + urlToRun,(IOException)(Object) ioe);
        } finally {
            try {
                reader.close();
                conInput.close();
                writer.close();
            } catch (UncheckedIOException ioe) {
                throw new RuntimeException("Cannot close readers or streams", ioe);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass configure(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0, MalformedURLException o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class BufferedWriter {

BufferedWriter(FileWriter o0){}
	BufferedWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class File {

File(String o0){}
	File(){}}

class FileWriter {

FileWriter(){}
	FileWriter(File o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
