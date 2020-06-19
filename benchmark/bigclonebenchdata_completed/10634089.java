
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10634089 {

    public static String checkPublicIP() {
        String ipAddress = null;
        try {
            URL url;
            url = new URL("http://checkip.dyndns.org/");
            InputStreamReader in = new InputStreamReader(url.openStream());
            BufferedReader buffer = new BufferedReader(in);
            String line;
            MyHelperClass Pattern = new MyHelperClass();
            Pattern p =(Pattern)(Object) Pattern.compile("\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b");
            while ((line =(String)(Object) buffer.readLine()) != null) {
                if (line.indexOf("IP Address:") != -1) {
                    Matcher m =(Matcher)(Object) p.matcher(line);
                    if ((boolean)(Object)m.find()) {
                        ipAddress =(String)(Object) m.group();
                        break;
                    }
                }
            }
            buffer.close();
            in.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return ipAddress;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
