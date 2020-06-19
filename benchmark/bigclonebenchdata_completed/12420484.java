


class c12420484 {
public static MyHelperClass JOptionPane;
//public MyHelperClass JOptionPane;

    public static void sendData(final HashMap data) {
        MyHelperClass I18N = new MyHelperClass();
        YProgressWindowRepeat y = new YProgressWindowRepeat(I18N.t("Send Data to yaams.de"));
        try {
            final StringBuffer send = new StringBuffer("1=1");
            for (final String key :(String[])(Object) (Object[])(Object)data.keySet()) {
                send.append("&");
                send.append(key);
                send.append("=");
                MyHelperClass URLEncoder = new MyHelperClass();
                send.append(URLEncoder.encode(data.get(key), "UTF-8"));
            }
            final URL url = new URL("http://www.rpg-studio.de/libraries/abttools/yaamsFeedback.php");
            final URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            final OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(send.toString());
            wr.flush();
            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            final StringBuffer erg = new StringBuffer("");
            while ((line =(String)(Object) rd.readLine()) != null) {
                erg.append(line);
            }
//            MyHelperClass I18N = new MyHelperClass();
            JOptionPane.showMessageDialog(null, erg.toString(), I18N.t("Feedback"), JOptionPane.INFORMATION_MESSAGE);
            wr.close();
            rd.close();
        } catch (final Throwable t) {
            MyHelperClass YException = new MyHelperClass();
            YException.error("Can not send feedback to http://www.rpg-studio.de/libraries/abttools/yaamsFeedback.php", t);
        }
        y.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass t(String o0){ return null; }
	public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }}

class HashMap {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class YProgressWindowRepeat {

YProgressWindowRepeat(MyHelperClass o0){}
	YProgressWindowRepeat(){}
	public MyHelperClass close(){ return null; }}

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
