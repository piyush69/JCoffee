


class c6541771 {
public MyHelperClass digest(String o0){ return null; }
public MyHelperClass StringEscapeUtils;
public MyHelperClass StreamUtils;
	public MyHelperClass recpt;
	public MyHelperClass score;
	public MyHelperClass calcScoreImage(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }

    private String sendMail() throws IOException {
        MyHelperClass message = new MyHelperClass();
        String msg =(String)(Object) StringEscapeUtils.escapeHtml(message.getText());
        StringBuffer buf = new StringBuffer();
        MyHelperClass name = new MyHelperClass();
        buf.append(encode("n",(String)(Object) name.getText()));
        MyHelperClass email = new MyHelperClass();
        buf.append("&").append(encode("e",(String)(Object) email.getText()));
        MyHelperClass recpt = new MyHelperClass();
        buf.append("&").append(encode("r",(String)(Object) recpt.getText()));
        buf.append("&").append(encode("m", msg));
        buf.append("&").append(encode("s",(String)(Object) score));
        buf.append("&").append(encode("i",(String)(Object) calcScoreImage()));
        buf.append("&").append(encode("c",(String)(Object) digest(recpt.getText() + "_" + score)));
        URL url = new URL("http://www.enerjy.com/share/mailit.php");
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        conn.setDoOutput(true);
        OutputStreamWriter writer = null;
        BufferedReader reader = null;
        boolean haveOk = false;
        try {
            writer = new OutputStreamWriter(conn.getOutputStream());
            writer.write(buf.toString());
            writer.flush();
            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            for (String line =(String)(Object) reader.readLine(); null != line; line =(String)(Object) reader.readLine()) {
                if (line.startsWith("err:")) {
                    return line.substring(4);
                } else if (line.equals("ok")) {
                    haveOk = true;
                }
            }
        } finally {
            StreamUtils.close(writer);
            StreamUtils.close(reader);
        }
        if (!haveOk) {
            return "The server did not return a response.";
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getText(){ return null; }
	public MyHelperClass escapeHtml(MyHelperClass o0){ return null; }
	public MyHelperClass close(BufferedReader o0){ return null; }
	public MyHelperClass close(OutputStreamWriter o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(MyHelperClass o0){}
	OutputStreamWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
