import java.io.*;
import java.lang.*;
import java.util.*;



class c13529502 {

    private Component createLicensePane(String propertyKey) {
        MyHelperClass licesePane = new MyHelperClass();
        if (licesePane == null) {
            String licenseText = "";
            BufferedReader in = null;
            try {
                String filename = "conf/LICENSE.txt";
                MyHelperClass FileUtil = new MyHelperClass();
                java.net.URL url =(java.net.URL)(Object)(URL)(Object) FileUtil.toURL(filename);
                in = new BufferedReader(new InputStreamReader(url.openStream()));
                String line = null;
                while (true) {
                    line = in.readLine();
                    if (line == null) break;
                    licenseText += line;
                }
            } catch (Exception e) {
                MyHelperClass log = new MyHelperClass();
                log.error(e);
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (Exception e) {
                    }
                }
            }
            MyHelperClass StringUtils = new MyHelperClass();
            licenseText =(String)(Object) StringUtils.replace(licenseText, "<br>", "\n");
//            MyHelperClass StringUtils = new MyHelperClass();
            licenseText =(String)(Object) StringUtils.replace(licenseText, "<p>", "\n\n");
            StyleContext context = new StyleContext();
            StyledDocument document =(StyledDocument)(Object) new DefaultStyledDocument(context);
            MyHelperClass StyleContext = new MyHelperClass();
            Style style =(Style)(Object) context.getStyle(StyleContext.DEFAULT_STYLE);
            MyHelperClass StyleConstants = new MyHelperClass();
            StyleConstants.setAlignment(style, StyleConstants.ALIGN_CENTER);
//            MyHelperClass StyleConstants = new MyHelperClass();
            StyleConstants.setSpaceAbove(style, 4);
//            MyHelperClass StyleConstants = new MyHelperClass();
            StyleConstants.setSpaceBelow(style, 4);
//            MyHelperClass StyleConstants = new MyHelperClass();
            StyleConstants.setFontSize(style, 14);
            try {
                document.insertString(document.getLength(), licenseText, style);
            } catch (UncheckedIOException e) {
                MyHelperClass log = new MyHelperClass();
                log.error(e);
            }
            JTextPane textPane = new JTextPane(document);
            textPane.setEditable(false);
//            MyHelperClass licesePane = new MyHelperClass();
            licesePane =(MyHelperClass)(Object) new JScrollPane(textPane);
        }
//        MyHelperClass licesePane = new MyHelperClass();
        return (Component)(Object)licesePane;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_STYLE;
	public MyHelperClass ALIGN_CENTER;
public MyHelperClass setSpaceBelow(Style o0, int o1){ return null; }
	public MyHelperClass replace(String o0, String o1, String o2){ return null; }
	public MyHelperClass setFontSize(Style o0, int o1){ return null; }
	public MyHelperClass setAlignment(Style o0, MyHelperClass o1){ return null; }
	public MyHelperClass error(BadLocationException o0){ return null; }
	public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass toURL(String o0){ return null; }
	public MyHelperClass setSpaceAbove(Style o0, int o1){ return null; }}

class Component {

}

class StyleContext {

public MyHelperClass getStyle(MyHelperClass o0){ return null; }}

class StyledDocument {

public MyHelperClass insertString(MyHelperClass o0, String o1, Style o2){ return null; }
	public MyHelperClass getLength(){ return null; }}

class DefaultStyledDocument {

DefaultStyledDocument(){}
	DefaultStyledDocument(StyleContext o0){}}

class Style {

}

class BadLocationException extends Exception{
	public BadLocationException(String errorMessage) { super(errorMessage); }
}

class JTextPane {

JTextPane(StyledDocument o0){}
	JTextPane(){}
	public MyHelperClass setEditable(boolean o0){ return null; }}

class JScrollPane {

JScrollPane(){}
	JScrollPane(JTextPane o0){}}

class URL {

}
