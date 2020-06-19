
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8620255 {
public MyHelperClass JOptionPane;
	public MyHelperClass Result;

    private void sendMessages() {
        MyHelperClass Configuration = new MyHelperClass();
        Configuration conf =(Configuration)(Object) Configuration.getInstance();
        MyHelperClass errors = new MyHelperClass();
        for (int i = 0; i < (int)(Object)errors.size(); i++) {
            String msg = null;
            synchronized (this) {
//                MyHelperClass errors = new MyHelperClass();
                msg =(String)(Object) errors.get(i);
                MyHelperClass DEBUG = new MyHelperClass();
                if ((boolean)(Object)DEBUG) System.out.println(msg);
//                MyHelperClass errors = new MyHelperClass();
                errors.remove(i);
            }
            if (!(Boolean)(Object)conf.getCustomerFeedback()) continue;
            if ((boolean)(Object)conf.getApproveCustomerFeedback()) {
                MyHelperClass SqlTablet = new MyHelperClass();
                ConfirmCustomerFeedback dialog = new ConfirmCustomerFeedback(JOptionPane.getFrameForComponent(SqlTablet.getInstance()), msg);
                if (dialog.getResult() == Result.NO) continue;
            }
            try {
                URL url = new URL("http://www.sqltablet.com/beta/bug.php");
                URLConnection urlc =(URLConnection)(Object) url.openConnection();
                urlc.setDoOutput(true);
                urlc.setDoOutput(true);
                urlc.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                DataOutputStream out = new DataOutputStream(urlc.getOutputStream());
                String lines[] = msg.split("\n");
                for (int l = 0; l < lines.length; l++) {
                    String line = (l > 0 ? "&line" : "line") + l + "=";
                    MyHelperClass URLEncoder = new MyHelperClass();
                    line += URLEncoder.encode(lines[l], "UTF-8");
                    out.write(line.getBytes());
                }
                out.flush();
                out.close();
                BufferedReader in = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
                String line;
                while ((line =(String)(Object) in.readLine()) != null) {
                    MyHelperClass DEBUG = new MyHelperClass();
                    if ((boolean)(Object)DEBUG) System.out.println("RemoteLogger : " + line + "\n");
                }
                in.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NO;
public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass getFrameForComponent(MyHelperClass o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass remove(int o0){ return null; }}

class Configuration {

public MyHelperClass getApproveCustomerFeedback(){ return null; }
	public MyHelperClass getCustomerFeedback(){ return null; }}

class ConfirmCustomerFeedback {

ConfirmCustomerFeedback(){}
	ConfirmCustomerFeedback(MyHelperClass o0, String o1){}
	public MyHelperClass getResult(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
