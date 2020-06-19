
import java.io.UncheckedIOException;


class c8255076 {
public static MyHelperClass printUsage(){ return null; }
//public MyHelperClass printUsage(){ return null; }

    public static void main(String args[]) {
        if (args.length < 1) {
            printUsage();
        }
        URL url;
        BufferedReader in = null;
        try {
            url = new URL(args[0]);
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            int responseCode =(int)(Object) connection.getResponseCode();
            if (responseCode == 200) {
                in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line = null;
                while ((line =(String)(Object) in.readLine()) != null) {
                    System.out.println(line);
                }
            } else {
                System.out.println("Response code " + responseCode + " means there was an error reading url " + args[0]);
            }
        } catch (UncheckedIOException e) {
            System.err.println("IOException attempting to read url " + args[0]);
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception ignore) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
