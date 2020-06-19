
import java.io.UncheckedIOException;


class c14878593 {

    public void hyperlinkUpdate(HyperlinkEvent e) {
        MyHelperClass EventType = new MyHelperClass();
        if (e.getEventType() == EventType.ACTIVATED) {
            try {
                URL url =(URL)(Object) e.getURL();
                InputStream stream =(InputStream)(Object) url.openStream();
                try {
                    StringWriter writer = new StringWriter();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(stream, writer, "UTF-8");
                    JEditorPane editor = new JEditorPane("text/plain", writer.toString());
                    editor.setEditable(false);
                    MyHelperClass Color = new MyHelperClass();
                    editor.setBackground(Color.WHITE);
                    editor.setCaretPosition(0);
                    editor.setPreferredSize(new Dimension(600, 400));
                    String name = url.toString();
                    name = name.substring(name.lastIndexOf('/') + 1);
                    JDialog dialog = new JDialog(this, "内容解析: " + name);
                    dialog.add(new JScrollPane(editor));
                    dialog.pack();
                    dialog.setVisible(true);
                } finally {
                    stream.close();
                }
            } catch (UncheckedIOException exception) {
                exception.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WHITE;
	public MyHelperClass ACTIVATED;
public MyHelperClass copy(InputStream o0, StringWriter o1, String o2){ return null; }}

class HyperlinkEvent {

public MyHelperClass getEventType(){ return null; }
	public MyHelperClass getURL(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class StringWriter {

}

class JEditorPane {

JEditorPane(){}
	JEditorPane(String o0, String o1){}
	public MyHelperClass setBackground(MyHelperClass o0){ return null; }
	public MyHelperClass setCaretPosition(int o0){ return null; }
	public MyHelperClass setPreferredSize(Dimension o0){ return null; }
	public MyHelperClass setEditable(boolean o0){ return null; }}

class Dimension {

Dimension(){}
	Dimension(int o0, int o1){}}

class JDialog {

JDialog(c14878593 o0, String o1){}
	JDialog(){}
	public MyHelperClass add(JScrollPane o0){ return null; }
	public MyHelperClass pack(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }}

class JScrollPane {

JScrollPane(){}
	JScrollPane(JEditorPane o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
