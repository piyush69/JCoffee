import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1985677 {
public MyHelperClass addWindowListener(ExitListener o0){ return null; }
public MyHelperClass Color;
	public MyHelperClass TransformerFactory;
	public MyHelperClass BorderLayout;
	public MyHelperClass urlField;
	public MyHelperClass transformers;
	public MyHelperClass htmlPane;
	public MyHelperClass initialURL;
	public MyHelperClass WindowUtilities;
	public MyHelperClass homeButton;
	public MyHelperClass warnUser(String o0){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass getToolkit(){ return null; }
	public MyHelperClass setBounds(int o0, int o1, int o2, int o3){ return null; }
	public MyHelperClass getContentPane(){ return null; }

    public  c1985677(String initialURL)  throws Throwable {
        super("Simple Swing Browser");
        this.initialURL =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) initialURL;
        addWindowListener(new ExitListener());
        WindowUtilities.setNativeLookAndFeel();
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.lightGray);
        homeButton =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new JIconButton("home.gif");
        homeButton.addActionListener(this);
        JLabel urlLabel = new JLabel("URL:");
        urlField =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new JTextField(30);
        urlField.setText(initialURL);
        urlField.addActionListener(this);
        topPanel.add(homeButton);
        topPanel.add(urlLabel);
        topPanel.add(urlField);
        getContentPane().add(topPanel, BorderLayout.NORTH);
        try {
            URL url = new URL(initialURL);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            boolean xml = true;
            String inputLine;
            StringBuffer content = new StringBuffer(), stylesheet = null;
            Transformer transformer = null;
            inputLine = in.readLine();
            if (inputLine == null) {
                System.out.println("No input read from URL: " + initialURL);
                return;
            }
            if (!inputLine.startsWith("<?xml ")) {
                xml = false;
                content.append(inputLine);
            }
            if (xml) {
                inputLine = in.readLine();
                if (inputLine.startsWith("<?xml-stylesheet ")) {
                    int offset = inputLine.indexOf("href=");
                    String href = (inputLine.substring(inputLine.indexOf("href=") + 6));
                    href = href.substring(0, href.indexOf('"'));
                    System.out.println("href=" + href);
                    url = new URL(url, href);
                    String stylesheetURL = url.toString();
                    System.out.println("stylesheet URL=" + url.toString());
                    transformer = (Transformer)(Transformer)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) transformers.get(stylesheetURL);
                    if (transformer == null) {
                        BufferedReader sheetIn = new BufferedReader(new InputStreamReader(url.openStream()));
                        sheetIn.readLine();
                        stylesheet = new StringBuffer();
                        while ((inputLine = sheetIn.readLine()) != null) stylesheet.append(inputLine).append('\n');
                        System.out.println(stylesheet.toString());
                        TransformerFactory tFactory =(TransformerFactory)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) TransformerFactory.newInstance();
                        StreamSource xslSource = new StreamSource(new StringReader(stylesheet.toString()));
                        transformer =(Transformer)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) tFactory.newTransformer(xslSource);
                        transformers.put(stylesheetURL, transformer);
                    }
                }
            }
            while ((inputLine = in.readLine()) != null) content.append(inputLine).append('\n');
            htmlPane =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new JEditorPane();
            if (transformer != null) {
                StringReader stringRecordReader = new StringReader(content.toString());
                StringWriter xmlRecordWriter = new StringWriter();
                StreamSource streamXMLRecord = new StreamSource(stringRecordReader);
                transformer.transform(streamXMLRecord, new StreamResult(xmlRecordWriter));
                String html = xmlRecordWriter.toString();
                int i = html.indexOf('>');
                html = "<html>" + html.substring(html.indexOf('>') + 1);
                System.out.println(html);
                htmlPane.setContentType("text/html");
                htmlPane.setText("<html><head><META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><title>GSAFD Thesaurus</title></head><body><center><h2>GSAFD Thesaurus</h2></center><p>A thesaurus of genre terms to support the \"Guidelines on Subject Access to Individual Works of Fiction , Drama\" (GSAFD)</p><table cellspacing=\"5\" width=\"100%\"><tr><td><h3>Search</h3><p></p></td><td valign=\"top\"><h3>Browse</h3></td></tr></table></body></html>");
            } else htmlPane.setText(content.toString());
            htmlPane.setEditable(false);
            htmlPane.addHyperlinkListener(this);
            JScrollPane scrollPane = new JScrollPane(htmlPane);
            getContentPane().add(scrollPane, BorderLayout.CENTER);
        } catch (IOException ioe) {
            warnUser("Can't build HTML pane for " + initialURL + ": " + ioe);
        } catch (TransformerException e) {
        }
        Dimension screenSize =(Dimension)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getToolkit().getScreenSize();
        int width =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) screenSize.width * 8 / 10;
        int height =(int)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) screenSize.height * 8 / 10;
        setBounds(width / 8, height / 8, width, height);
        setVisible(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NORTH;
	public MyHelperClass lightGray;
	public MyHelperClass CENTER;
public MyHelperClass addActionListener(c1985677 o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setNativeLookAndFeel(){ return null; }
	public MyHelperClass setEditable(boolean o0){ return null; }
	public MyHelperClass put(String o0, Transformer o1){ return null; }
	public MyHelperClass add(JScrollPane o0, MyHelperClass o1){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass addHyperlinkListener(c1985677 o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getScreenSize(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass add(JPanel o0, MyHelperClass o1){ return null; }}

class ExitListener {

}

class JPanel {

public MyHelperClass add(JLabel o0){ return null; }
	public MyHelperClass setBackground(MyHelperClass o0){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class JIconButton {

JIconButton(String o0){}
	JIconButton(){}}

class JLabel {

JLabel(String o0){}
	JLabel(){}}

class JTextField {

JTextField(int o0){}
	JTextField(){}}

class Transformer {

public MyHelperClass transform(StreamSource o0, StreamResult o1){ return null; }}

class TransformerFactory {

public MyHelperClass newTransformer(StreamSource o0){ return null; }}

class StreamSource {

StreamSource(){}
	StreamSource(StringReader o0){}}

class JEditorPane {

}

class StreamResult {

StreamResult(StringWriter o0){}
	StreamResult(){}}

class JScrollPane {

JScrollPane(MyHelperClass o0){}
	JScrollPane(){}}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class Dimension {
public MyHelperClass width;
	public MyHelperClass height;
}

class Object {

Object(String o0){}
	Object(){}}
