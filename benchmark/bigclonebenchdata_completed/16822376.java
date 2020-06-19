


class c16822376 {
public MyHelperClass Conf;

    public String login(String nUsuario, String contrasena) {
        String responce = "";
        String request =(String)(Object) Conf.login;
        OutputStreamWriter wr = null;
        BufferedReader rd = null;
        try {
            URL url = new URL(request);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write("nUsuario=" + nUsuario + "&contrasena=" + contrasena);
            wr.flush();
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
                responce += line;
            }
        } catch (Exception e) {
        }
        return responce;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass login;
}

class OutputStreamWriter {

OutputStreamWriter(MyHelperClass o0){}
	OutputStreamWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
