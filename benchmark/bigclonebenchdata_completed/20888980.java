
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20888980 {

    public void run() {
        String s;
        s = "";
        try {
            MyHelperClass word = new MyHelperClass();
            URL url = new URL("http://www.askoxford.com/concise_oed/" + word.toLowerCase() + "?view=uk");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            MyHelperClass stopped = new MyHelperClass();
            while (((str =(String)(Object) in.readLine()) != null) && (!(Boolean)(Object)stopped)) {
                s = s + str;
            }
            in.close();
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        MyHelperClass word = new MyHelperClass();
        Pattern pattern =(Pattern)(Object) Pattern.compile("<h2>" + word.toLowerCase() + "(.+?)<p><a href",(int)(Object) Pattern.CASE_INSENSITIVE | (int)(Object)Pattern.DOTALL);
        Matcher matcher =(Matcher)(Object) pattern.matcher(s);
        java.io.StringWriter wr = new java.io.StringWriter();
        HTMLDocument doc = null;
        MyHelperClass editor = new MyHelperClass();
        HTMLEditorKit kit = (HTMLEditorKit)(HTMLEditorKit)(Object) editor.getEditorKit();
        try {
//            MyHelperClass editor = new MyHelperClass();
            doc = (HTMLDocument)(HTMLDocument)(Object) editor.getDocument();
        } catch (Exception e) {
        }
        System.out.println(wr);
//        MyHelperClass editor = new MyHelperClass();
        editor.setContentType("text/html");
        if ((boolean)(Object)matcher.find()) try {
//            MyHelperClass editor = new MyHelperClass();
            kit.insertHTML(doc, editor.getCaretPosition(), "<HR>" + matcher.group(1) + "<HR>", 0, 0, null);
        } catch (Exception e) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } else try {
//            MyHelperClass editor = new MyHelperClass();
            kit.insertHTML(doc, editor.getCaretPosition(), "<HR><FONT COLOR='RED'>NOT FOUND!!</FONT><HR>", 0, 0, null);
        } catch (Exception e) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        MyHelperClass button = new MyHelperClass();
        button.setEnabled(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass getCaretPosition(){ return null; }
	public MyHelperClass getDocument(){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getEditorKit(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

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

class Pattern {
public static MyHelperClass CASE_INSENSITIVE;
	public static MyHelperClass DOTALL;
public MyHelperClass matcher(String o0){ return null; }
	public static MyHelperClass compile(String o0, int o1){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(int o0){ return null; }}

class HTMLDocument {

}

class HTMLEditorKit {

public MyHelperClass insertHTML(HTMLDocument o0, MyHelperClass o1, String o2, int o3, int o4, Object o5){ return null; }}
