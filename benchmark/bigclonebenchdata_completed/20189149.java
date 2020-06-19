
import java.io.UncheckedIOException;


class c20189149 {
public MyHelperClass Externalizer;
	public MyHelperClass JOptionPane;
	public MyHelperClass SlimLogger;
	public MyHelperClass getRootPane(){ return null; }

    public void checkVersion(boolean showOnlyDiff) {
        try {
            DataInputStream di = null;
            byte[] b = new byte[1];
            URL url = new URL("http://lanslim.sourceforge.net/version.txt");
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            di = new DataInputStream(con.getInputStream());
            StringBuffer lBuffer = new StringBuffer();
            while (-1 != (int)(Object)di.read(b, 0, 1)) {
                lBuffer.append(new String(b));
            }
            String lLastStr = lBuffer.toString().trim();
            MyHelperClass VERSION = new MyHelperClass();
            boolean equals = VERSION.equals(lLastStr);
//            MyHelperClass VERSION = new MyHelperClass();
            String lMessage =(String)(Object) Externalizer.getString("LANSLIM.199", VERSION, lLastStr);
            if (!equals) {
                MyHelperClass StringConstants = new MyHelperClass();
                lMessage = lMessage + StringConstants.NEW_LINE + Externalizer.getString("LANSLIM.131") + StringConstants.NEW_LINE;
            }
            if (!equals || !showOnlyDiff) {
                JOptionPane.showMessageDialog(getRootPane().getParent(), lMessage, Externalizer.getString("LANSLIM.118"), JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(getRootPane().getParent(),(String)(Object) Externalizer.getString("LANSLIM.200", SlimLogger.shortFormatException(e)), Externalizer.getString("LANSLIM.118"), JOptionPane.WARNING_MESSAGE);
        } catch (UncheckedIOException e) {
            JOptionPane.showMessageDialog(getRootPane().getParent(),(String)(Object) Externalizer.getString("LANSLIM.200", SlimLogger.shortFormatException((NumberFormatException)(Object)e)), Externalizer.getString("LANSLIM.118"), JOptionPane.WARNING_MESSAGE);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NEW_LINE;
	public MyHelperClass WARNING_MESSAGE;
	public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass getParent(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass shortFormatException(NumberFormatException o0){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass getString(String o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass getString(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass shortFormatException(IOException o0){ return null; }}

class DataInputStream {

DataInputStream(){}
	DataInputStream(MyHelperClass o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
