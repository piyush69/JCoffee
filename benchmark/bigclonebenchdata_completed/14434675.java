import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14434675 {
public MyHelperClass Logger;
	public MyHelperClass JOptionPane;

    private void updateDataSetSelected(URL url)  throws Throwable {
        InputStream in = null;
        try {
            in = url.openStream();
            StringBuilder sb = new StringBuilder();
            int by = in.read();
            while (by != -1) {
                sb.append((char) by);
                by = in.read();
            }
            in.close();
            String s = sb.toString();
            final int packetTagLength = 10;
            int contentLength = Integer.parseInt(s.substring(4, packetTagLength));
            String sxml = s.substring(packetTagLength, packetTagLength + contentLength);
            Reader xin = new BufferedReader(new StringReader(sxml));
            DocumentBuilder builder;
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            builder =(DocumentBuilder)(Object) DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource source = new InputSource(xin);
            final Document document =(Document)(Object) builder.parse(source);
            Runnable run = new Runnable() {

                public void run() {
                    try {
                        MyHelperClass XPathFactory = new MyHelperClass();
                        XPathFactory factory =(XPathFactory)(Object) XPathFactory.newInstance();
                        XPath xpath = (XPath)(XPath)(Object) factory.newXPath();
                        String curr = Das2ServerDataSourceEditorPanel.this.timeRangeTextField.getText();
                        MyHelperClass XPathConstants = new MyHelperClass();
                        Node description = (Node)(Node)(Object) xpath.evaluate("/stream/properties/@description", document, XPathConstants.NODE);
                        MyHelperClass descriptionLabel = new MyHelperClass();
                        descriptionLabel.setText(description == null ? "" : description.getNodeValue());
//                        MyHelperClass XPathConstants = new MyHelperClass();
                        Node exampleRange = (Node)(Node)(Object) xpath.evaluate("/stream/properties/@exampleRange", document, XPathConstants.NODE);
                        MyHelperClass DEFAULT_TIMERANGE = new MyHelperClass();
                        if (exampleRange != null && curr.equals(DEFAULT_TIMERANGE)) {
                            Das2ServerDataSourceEditorPanel.this.timeRangeTextField.setText(exampleRange.getNodeValue());
                        }
                        if (exampleRange != null) {
                            DefaultComboBoxModel model = new DefaultComboBoxModel(new String[] { "Example Time Ranges",(String)(Object) exampleRange.getNodeValue() });
                            Das2ServerDataSourceEditorPanel.this.examplesComboBox.setModel(model);
                            Das2ServerDataSourceEditorPanel.this.examplesComboBox.setEnabled(true);
                        } else {
                            DefaultComboBoxModel model = new DefaultComboBoxModel(new String[] { "No example time ranges found..." });
                            Das2ServerDataSourceEditorPanel.this.examplesComboBox.setModel(model);
                            Das2ServerDataSourceEditorPanel.this.examplesComboBox.setEnabled(false);
                        }
                        if (exampleRange == null) {
//                            MyHelperClass XPathConstants = new MyHelperClass();
                            exampleRange = (Node)(Node)(Object) xpath.evaluate("/stream/properties/@x_range", document, XPathConstants.NODE);
//                            MyHelperClass DEFAULT_TIMERANGE = new MyHelperClass();
                            if (exampleRange != null && curr.equals(DEFAULT_TIMERANGE)) {
                                Das2ServerDataSourceEditorPanel.this.timeRangeTextField.setText(exampleRange.getNodeValue());
                            }
                        }
//                        MyHelperClass XPathConstants = new MyHelperClass();
                        Node validRange = (Node)(Node)(Object) xpath.evaluate("/stream/properties/@validRange", document, XPathConstants.NODE);
                        if (validRange != null) {
                            Das2ServerDataSourceEditorPanel.this.validRangeLabel.setText("valid range: " + validRange.getNodeValue());
                        } else {
                            Das2ServerDataSourceEditorPanel.this.validRangeLabel.setText("<html><em>no valid range for dataset provided</em></html>");
                        }
                    } catch (XPathExpressionException ex) {
                        MyHelperClass Level = new MyHelperClass();
                        MyHelperClass Logger = new MyHelperClass();
                        Logger.getLogger(Das2ServerDataSourceEditorPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            };
            MyHelperClass SwingUtilities = new MyHelperClass();
            SwingUtilities.invokeLater(run);
        } catch (SAXException ex) {
            MyHelperClass examplesComboBox = new MyHelperClass();
            JOptionPane.showMessageDialog(examplesComboBox, "Unable to parse dsdf: " + ex.getMessage());
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(Das2ServerDataSourceEditorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            MyHelperClass examplesComboBox = new MyHelperClass();
            JOptionPane.showMessageDialog(examplesComboBox, "Unable to parse dsdf: " + ex.getMessage());
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(Das2ServerDataSourceEditorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            MyHelperClass examplesComboBox = new MyHelperClass();
            JOptionPane.showMessageDialog(examplesComboBox, "Unable to parse dsdf: " + ex.getMessage());
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(Das2ServerDataSourceEditorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            MyHelperClass examplesComboBox = new MyHelperClass();
            JOptionPane.showMessageDialog(examplesComboBox, "Unable to parse dsdf: " + ex.getMessage());
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(Das2ServerDataSourceEditorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (in != null) in.close();
            } catch (IOException ex) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(Das2ServerDataSourceEditorPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass NODE;
public MyHelperClass showMessageDialog(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, SAXException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, XPathExpressionException o2){ return null; }
	public MyHelperClass invokeLater(Runnable o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, ParserConfigurationException o2){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, MalformedURLException o2){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputSource o0){ return null; }}

class InputSource {

InputSource(Reader o0){}
	InputSource(){}}

class Document {

}

class XPathFactory {

public MyHelperClass newXPath(){ return null; }}

class XPath {

public MyHelperClass evaluate(String o0, Document o1, MyHelperClass o2){ return null; }}

class Das2ServerDataSourceEditorPanel {

}

class Node {

public MyHelperClass getNodeValue(){ return null; }}

class DefaultComboBoxModel {

DefaultComboBoxModel(String[] o0){}
	DefaultComboBoxModel(){}}

class XPathExpressionException extends Exception{
	public XPathExpressionException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
