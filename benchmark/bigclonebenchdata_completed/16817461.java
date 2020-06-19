
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16817461 {
public MyHelperClass cmbServer;
	public MyHelperClass getServers(){ return null; }

    private void loadServers() {
        try {
            MyHelperClass VirtualDeckConfig = new MyHelperClass();
            URL url = new URL(VirtualDeckConfig.SERVERS_URL);
            MyHelperClass cmbServer = new MyHelperClass();
            cmbServer.addItem("Local");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            if (in.readLine().equals("[list]")) {
                while ((str =(String)(Object) in.readLine()) != null) {
                    String[] host_line = str.split(";");
                    Host h = new Host();
                    h.setIp(host_line[0]);
                    h.setPort(Integer.parseInt(host_line[1]));
                    h.setName(host_line[2]);
                    getServers().add(h);
                    cmbServer.addItem((String)(Object)h.getName());
                }
            }
            in.close();
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SERVERS_URL;
public MyHelperClass addItem(String o0){ return null; }
	public MyHelperClass add(Host o0){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class Host {

public MyHelperClass setPort(int o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setIp(String o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
