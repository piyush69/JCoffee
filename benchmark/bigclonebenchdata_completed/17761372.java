
import java.io.UncheckedIOException;


class c17761372 {
public MyHelperClass comment;
	public MyHelperClass email;
	public MyHelperClass rate;
	public MyHelperClass name;
public MyHelperClass Level;
	public MyHelperClass Logger;
	public MyHelperClass hide(){ return null; }

            public void run() {
                try {
                    MyHelperClass URLEncoder = new MyHelperClass();
                    String data = URLEncoder.encode("send_id", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8");
//                    MyHelperClass URLEncoder = new MyHelperClass();
                    data += "&" + URLEncoder.encode("author", "UTF-8") + "=" + URLEncoder.encode((String)(Object)name.getText(), "UTF-8");
//                    MyHelperClass URLEncoder = new MyHelperClass();
                    data += "&" + URLEncoder.encode("location", "UTF-8") + "=" + URLEncoder.encode(System.getProperty("user.language"), "UTF-8");
//                    MyHelperClass URLEncoder = new MyHelperClass();
                    data += "&" + URLEncoder.encode("contact", "UTF-8") + "=" + URLEncoder.encode((String)(Object)email.getText(), "UTF-8");
//                    MyHelperClass URLEncoder = new MyHelperClass();
                    data += "&" + URLEncoder.encode("content", "UTF-8") + "=" + URLEncoder.encode((String)(Object)comment.getText(), "UTF-8");
//                    MyHelperClass URLEncoder = new MyHelperClass();
                    data += "&" + URLEncoder.encode("rate", "UTF-8") + "=" + URLEncoder.encode(rate.getSelectedItem().toString(), "UTF-8");
                    System.out.println(data);
                    URL url = new URL("http://javablock.sourceforge.net/book/index.php");
                    URLConnection conn =(URLConnection)(Object) url.openConnection();
                    conn.setDoOutput(true);
                    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                    wr.write(data);
                    wr.flush();
                    BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String address =(String)(Object) rd.readLine();
                    JPanel panel = new JPanel();
                    panel.add(new JLabel("Comment added"));
                    panel.add(new JTextArea("visit: http://javablock.sourceforge.net/"));
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, new JLabel("Comment sended correctly!"));
                    wr.close();
                    rd.close();
                    hide();
                } catch (UncheckedIOException ex) {
                    Logger.getLogger(guestBook.class.getName()).log(Level.SEVERE, null,(IOException)(Object) ex);
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass showMessageDialog(Object o0, JLabel o1){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass getSelectedItem(){ return null; }
	public MyHelperClass getText(){ return null; }}

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

class JPanel {

public MyHelperClass add(JLabel o0){ return null; }
	public MyHelperClass add(JTextArea o0){ return null; }}

class JLabel {

JLabel(String o0){}
	JLabel(){}}

class JTextArea {

JTextArea(String o0){}
	JTextArea(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class guestBook {

}
