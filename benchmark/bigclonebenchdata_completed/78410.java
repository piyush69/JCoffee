
import java.io.UncheckedIOException;


class c78410 {
public MyHelperClass URLEncoder;
	public MyHelperClass getMD5Digest(String o0){ return null; }
	public MyHelperClass msg(String o0){ return null; }
	public MyHelperClass getID(){ return null; }

                public void run() {
                    try {
                        int id =(int)(Object) getID() - 1;
                        String file = id + ".dem";
                        String data = URLEncoder.encode("file", "UTF-8") + "=" + URLEncoder.encode(file, "UTF-8");
                        data += "&" + URLEncoder.encode("hash", "UTF-8") + "=" + URLEncoder.encode(getMD5Digest("tf2invite" + file), "UTF-8");
                        URL url = new URL("http://94.23.189.99/ftp.php");
                        final URLConnection conn =(URLConnection)(Object) url.openConnection();
                        conn.setDoOutput(true);
                        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                        wr.write(data);
                        wr.flush();
                        String line;
                        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                        while ((line =(String)(Object) rd.readLine()) != null) {
                            System.out.println(line);
                            if (line.startsWith("demo=")) msg("2The last gather demo has been uploaded successfully: " + line.split("=")[1]);
                        }
                        rd.close();
                        wr.close();
                    } catch (UncheckedIOException e) {
                        e.printStackTrace();
                    }
                }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
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
